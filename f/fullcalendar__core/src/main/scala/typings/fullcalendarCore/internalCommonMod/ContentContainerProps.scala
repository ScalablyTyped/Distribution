package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.anon.El
import typings.preact.mod.ComponentChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentContainerProps[RenderProps]
  extends StObject
     with ElAttrsProps
     with ContentGeneratorProps[RenderProps] {
  
  var children: js.UndefOr[InnerContainerFunc[RenderProps]] = js.undefined
  
  var classNameGenerator: js.UndefOr[ClassNamesGenerator[RenderProps]] = js.undefined
  
  var didMount: js.UndefOr[js.Function1[/* renderProps */ RenderProps & El, Unit]] = js.undefined
  
  var elTag: js.UndefOr[String] = js.undefined
  
  var willUnmount: js.UndefOr[js.Function1[/* renderProps */ RenderProps & El, Unit]] = js.undefined
}
object ContentContainerProps {
  
  inline def apply[RenderProps](renderProps: RenderProps): ContentContainerProps[RenderProps] = {
    val __obj = js.Dynamic.literal(renderProps = renderProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentContainerProps[RenderProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentContainerProps[?], RenderProps] (val x: Self & ContentContainerProps[RenderProps]) extends AnyVal {
    
    inline def setChildren(
      value: (/* InnerContainer */ InnerContainerComponent, RenderProps, /* elAttrs */ ElAttrs) => ComponentChildren
    ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassNameGenerator(value: ClassNamesGenerator[RenderProps]): Self = StObject.set(x, "classNameGenerator", value.asInstanceOf[js.Any])
    
    inline def setClassNameGeneratorFunction1(value: RenderProps => ClassNamesInput): Self = StObject.set(x, "classNameGenerator", js.Any.fromFunction1(value))
    
    inline def setClassNameGeneratorUndefined: Self = StObject.set(x, "classNameGenerator", js.undefined)
    
    inline def setClassNameGeneratorVarargs(value: String*): Self = StObject.set(x, "classNameGenerator", js.Array(value*))
    
    inline def setDidMount(value: /* renderProps */ RenderProps & El => Unit): Self = StObject.set(x, "didMount", js.Any.fromFunction1(value))
    
    inline def setDidMountUndefined: Self = StObject.set(x, "didMount", js.undefined)
    
    inline def setElTag(value: String): Self = StObject.set(x, "elTag", value.asInstanceOf[js.Any])
    
    inline def setElTagUndefined: Self = StObject.set(x, "elTag", js.undefined)
    
    inline def setWillUnmount(value: /* renderProps */ RenderProps & El => Unit): Self = StObject.set(x, "willUnmount", js.Any.fromFunction1(value))
    
    inline def setWillUnmountUndefined: Self = StObject.set(x, "willUnmount", js.undefined)
  }
}
