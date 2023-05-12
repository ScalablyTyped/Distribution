package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof framer-motion.framer-motion.HydratedFeatureDefinitions ]: framer-motion.framer-motion.FeaturePackage} */
trait FeaturePackages extends StObject {
  
  var animation: js.UndefOr[FeaturePackage] = js.undefined
  
  var drag: js.UndefOr[FeaturePackage] = js.undefined
  
  var exit: js.UndefOr[FeaturePackage] = js.undefined
  
  var focus: js.UndefOr[FeaturePackage] = js.undefined
  
  var hover: js.UndefOr[FeaturePackage] = js.undefined
  
  var inView: js.UndefOr[FeaturePackage] = js.undefined
  
  var layout: js.UndefOr[FeaturePackage] = js.undefined
  
  var pan: js.UndefOr[FeaturePackage] = js.undefined
  
  var tap: js.UndefOr[FeaturePackage] = js.undefined
}
object FeaturePackages {
  
  inline def apply(): FeaturePackages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturePackages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturePackages] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: FeaturePackage): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setDrag(value: FeaturePackage): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setExit(value: FeaturePackage): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setFocus(value: FeaturePackage): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setHover(value: FeaturePackage): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setInView(value: FeaturePackage): Self = StObject.set(x, "inView", value.asInstanceOf[js.Any])
    
    inline def setInViewUndefined: Self = StObject.set(x, "inView", js.undefined)
    
    inline def setLayout(value: FeaturePackage): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPan(value: FeaturePackage): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setTap(value: FeaturePackage): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
    
    inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
  }
}
