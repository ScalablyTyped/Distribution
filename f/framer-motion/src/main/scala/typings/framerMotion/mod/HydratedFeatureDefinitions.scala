package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydratedFeatureDefinitions extends StObject {
  
  var animation: js.UndefOr[HydratedFeatureDefinition] = js.undefined
  
  var drag: js.UndefOr[HydratedFeatureDefinition] = js.undefined
  
  var exit: js.UndefOr[HydratedFeatureDefinition] = js.undefined
  
  var focus: js.UndefOr[HydratedFeatureDefinition] = js.undefined
  
  var hover: js.UndefOr[HydratedFeatureDefinition] = js.undefined
  
  var inView: js.UndefOr[HydratedFeatureDefinition] = js.undefined
  
  var layout: js.UndefOr[HydratedFeatureDefinition] = js.undefined
  
  var pan: js.UndefOr[HydratedFeatureDefinition] = js.undefined
  
  var tap: js.UndefOr[HydratedFeatureDefinition] = js.undefined
}
object HydratedFeatureDefinitions {
  
  inline def apply(): HydratedFeatureDefinitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HydratedFeatureDefinitions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HydratedFeatureDefinitions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: HydratedFeatureDefinition): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setDrag(value: HydratedFeatureDefinition): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setExit(value: HydratedFeatureDefinition): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setFocus(value: HydratedFeatureDefinition): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setHover(value: HydratedFeatureDefinition): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setInView(value: HydratedFeatureDefinition): Self = StObject.set(x, "inView", value.asInstanceOf[js.Any])
    
    inline def setInViewUndefined: Self = StObject.set(x, "inView", js.undefined)
    
    inline def setLayout(value: HydratedFeatureDefinition): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPan(value: HydratedFeatureDefinition): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setTap(value: HydratedFeatureDefinition): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
    
    inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
  }
}
