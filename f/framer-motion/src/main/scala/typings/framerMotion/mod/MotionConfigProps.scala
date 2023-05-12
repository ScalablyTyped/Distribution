package typings.framerMotion.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<framer-motion.framer-motion.MotionConfigContext> */
trait MotionConfigProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var isStatic: js.UndefOr[Boolean] = js.undefined
  
  var isValidProp: js.UndefOr[IsValidProp] = js.undefined
  
  var reducedMotion: js.UndefOr[ReducedMotionConfig] = js.undefined
  
  var transformPagePoint: js.UndefOr[TransformPoint] = js.undefined
  
  var transition: js.UndefOr[Transition1] = js.undefined
}
object MotionConfigProps {
  
  inline def apply(): MotionConfigProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionConfigProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionConfigProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
    
    inline def setIsValidProp(value: /* key */ String => Boolean): Self = StObject.set(x, "isValidProp", js.Any.fromFunction1(value))
    
    inline def setIsValidPropUndefined: Self = StObject.set(x, "isValidProp", js.undefined)
    
    inline def setReducedMotion(value: ReducedMotionConfig): Self = StObject.set(x, "reducedMotion", value.asInstanceOf[js.Any])
    
    inline def setReducedMotionUndefined: Self = StObject.set(x, "reducedMotion", js.undefined)
    
    inline def setTransformPagePoint(value: /* point */ Point => Point): Self = StObject.set(x, "transformPagePoint", js.Any.fromFunction1(value))
    
    inline def setTransformPagePointUndefined: Self = StObject.set(x, "transformPagePoint", js.undefined)
    
    inline def setTransition(value: Transition1): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
