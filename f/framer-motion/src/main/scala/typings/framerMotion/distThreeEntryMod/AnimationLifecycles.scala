package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationLifecycles extends StObject {
  
  /**
    * Callback when animation defined in `animate` is complete.
    *
    * The provided callback will be called with the triggering animation definition.
    * If this is a variant, it'll be the variant name, and if a target object
    * then it'll be the target object.
    *
    * This way, it's possible to figure out which animation has completed.
    *
    * ```jsx
    * function onComplete() {
    *   console.log("Animation completed")
    * }
    *
    * <motion.div
    *   animate={{ x: 100 }}
    *   onAnimationComplete={definition => {
    *     console.log('Completed animating', definition)
    *   }}
    * />
    * ```
    */
  var onAnimationComplete: js.UndefOr[js.Function1[/* definition */ AnimationDefinition, Unit]] = js.undefined
  
  /**
    * Callback when animation defined in `animate` begins.
    *
    * The provided callback will be called with the triggering animation definition.
    * If this is a variant, it'll be the variant name, and if a target object
    * then it'll be the target object.
    *
    * This way, it's possible to figure out which animation has started.
    *
    * ```jsx
    * function onStart() {
    *   console.log("Animation started")
    * }
    *
    * <motion.div animate={{ x: 100 }} onAnimationStart={onStart} />
    * ```
    */
  var onAnimationStart: js.UndefOr[js.Function1[/* definition */ AnimationDefinition, Unit]] = js.undefined
  
  /**
    * Callback with latest motion values, fired max once per frame.
    *
    * ```jsx
    * function onUpdate(latest) {
    *   console.log(latest.x, latest.opacity)
    * }
    *
    * <motion.div animate={{ x: 100, opacity: 0 }} onUpdate={onUpdate} />
    * ```
    */
  var onUpdate: js.UndefOr[js.Function1[/* latest */ ResolvedValues, Unit]] = js.undefined
}
object AnimationLifecycles {
  
  inline def apply(): AnimationLifecycles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationLifecycles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationLifecycles] (val x: Self) extends AnyVal {
    
    inline def setOnAnimationComplete(value: /* definition */ AnimationDefinition => Unit): Self = StObject.set(x, "onAnimationComplete", js.Any.fromFunction1(value))
    
    inline def setOnAnimationCompleteUndefined: Self = StObject.set(x, "onAnimationComplete", js.undefined)
    
    inline def setOnAnimationStart(value: /* definition */ AnimationDefinition => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnUpdate(value: /* latest */ ResolvedValues => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
  }
}
