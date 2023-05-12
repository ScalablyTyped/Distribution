package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait MotionConfigContext extends StObject {
  
  /**
    * Internal. Determines whether this is a static context ie the Framer canvas. If so,
    * it'll disable all dynamic functionality.
    */
  var isStatic: Boolean
  
  /**
    * If true, will respect the device prefersReducedMotion setting by switching
    * transform animations off.
    *
    * @public
    */
  var reducedMotion: js.UndefOr[ReducedMotionConfig] = js.undefined
  
  /**
    * Internal, exported only for usage in Framer
    */
  var transformPagePoint: TransformPoint
  
  /**
    * Defines a new default transition for the entire tree.
    *
    * @public
    */
  var transition: js.UndefOr[Transition1] = js.undefined
}
object MotionConfigContext {
  
  inline def apply(isStatic: Boolean, transformPagePoint: /* point */ Point => Point): MotionConfigContext = {
    val __obj = js.Dynamic.literal(isStatic = isStatic.asInstanceOf[js.Any], transformPagePoint = js.Any.fromFunction1(transformPagePoint))
    __obj.asInstanceOf[MotionConfigContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionConfigContext] (val x: Self) extends AnyVal {
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setReducedMotion(value: ReducedMotionConfig): Self = StObject.set(x, "reducedMotion", value.asInstanceOf[js.Any])
    
    inline def setReducedMotionUndefined: Self = StObject.set(x, "reducedMotion", js.undefined)
    
    inline def setTransformPagePoint(value: /* point */ Point => Point): Self = StObject.set(x, "transformPagePoint", js.Any.fromFunction1(value))
    
    inline def setTransition(value: Transition1): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
