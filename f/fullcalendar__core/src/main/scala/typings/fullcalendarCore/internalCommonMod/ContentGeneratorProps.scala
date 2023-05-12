package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.fullcalendarCoreBooleans.`true`
import typings.preact.mod.ComponentChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentGeneratorProps[RenderProps] extends StObject {
  
  var customGenerator: js.UndefOr[CustomContentGenerator[RenderProps]] = js.undefined
  
  var defaultGenerator: js.UndefOr[js.Function1[/* renderProps */ RenderProps, ComponentChild]] = js.undefined
  
  var generatorName: js.UndefOr[String] = js.undefined
  
  var renderProps: RenderProps
}
object ContentGeneratorProps {
  
  inline def apply[RenderProps](renderProps: RenderProps): ContentGeneratorProps[RenderProps] = {
    val __obj = js.Dynamic.literal(renderProps = renderProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentGeneratorProps[RenderProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentGeneratorProps[?], RenderProps] (val x: Self & ContentGeneratorProps[RenderProps]) extends AnyVal {
    
    inline def setCustomGenerator(value: CustomContentGenerator[RenderProps]): Self = StObject.set(x, "customGenerator", value.asInstanceOf[js.Any])
    
    inline def setCustomGeneratorFunction2(value: (RenderProps, /* createElement */ Any) => CustomContent | `true`): Self = StObject.set(x, "customGenerator", js.Any.fromFunction2(value))
    
    inline def setCustomGeneratorNull: Self = StObject.set(x, "customGenerator", null)
    
    inline def setCustomGeneratorUndefined: Self = StObject.set(x, "customGenerator", js.undefined)
    
    inline def setCustomGeneratorVarargs(value: ComponentChild*): Self = StObject.set(x, "customGenerator", js.Array(value*))
    
    inline def setDefaultGenerator(value: /* renderProps */ RenderProps => ComponentChild): Self = StObject.set(x, "defaultGenerator", js.Any.fromFunction1(value))
    
    inline def setDefaultGeneratorUndefined: Self = StObject.set(x, "defaultGenerator", js.undefined)
    
    inline def setGeneratorName(value: String): Self = StObject.set(x, "generatorName", value.asInstanceOf[js.Any])
    
    inline def setGeneratorNameUndefined: Self = StObject.set(x, "generatorName", js.undefined)
    
    inline def setRenderProps(value: RenderProps): Self = StObject.set(x, "renderProps", value.asInstanceOf[js.Any])
  }
}
