package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
@js.native
trait AnimationControls extends StObject {
  
  def mount(): js.Function0[Unit] = js.native
  
  /**
    * Instantly set to a set of properties or a variant.
    *
    * ```jsx
    * // With properties
    * controls.set({ opacity: 0 })
    *
    * // With variants
    * controls.set("hidden")
    * ```
    *
    * @privateRemarks
    * We could perform a similar trick to `.start` where this can be called before mount
    * and we maintain a list of of pending actions that get applied on mount. But the
    * expectation of `set` is that it happens synchronously and this would be difficult
    * to do before any children have even attached themselves. It's also poor practise
    * and we should discourage render-synchronous `.start` calls rather than lean into this.
    *
    * @public
    */
  def set(definition: AnimationDefinition): Unit = js.native
  
  /**
    * Starts an animation on all linked components.
    *
    * @remarks
    *
    * ```jsx
    * controls.start("variantLabel")
    * controls.start({
    *   x: 0,
    *   transition: { duration: 1 }
    * })
    * ```
    *
    * @param definition - Properties or variant label to animate to
    * @param transition - Optional `transtion` to apply to a variant
    * @returns - A `Promise` that resolves when all animations have completed.
    *
    * @public
    */
  def start(definition: AnimationDefinition): js.Promise[Any] = js.native
  def start(definition: AnimationDefinition, transitionOverride: Transition): js.Promise[Any] = js.native
  
  /**
    * Stops animations on all linked components.
    *
    * ```jsx
    * controls.stop()
    * ```
    *
    * @public
    */
  def stop(): Unit = js.native
}
