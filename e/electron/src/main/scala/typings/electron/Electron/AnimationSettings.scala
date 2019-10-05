package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationSettings extends js.Object {
  /**
    * Determines whether the user desires reduced motion based on platform APIs.
    */
  var prefersReducedMotion: Boolean
  /**
    * Determines on a per-platform basis whether scroll animations (e.g. produced by
    * home/end key) should be enabled.
    */
  var scrollAnimationsEnabledBySystem: Boolean
  /**
    * Returns true if rich animations should be rendered. Looks at session type (e.g.
    * remote desktop) and accessibility settings to give guidance for heavy
    * animations.
    */
  var shouldRenderRichAnimation: Boolean
}

object AnimationSettings {
  @scala.inline
  def apply(
    prefersReducedMotion: Boolean,
    scrollAnimationsEnabledBySystem: Boolean,
    shouldRenderRichAnimation: Boolean
  ): AnimationSettings = {
    val __obj = js.Dynamic.literal(prefersReducedMotion = prefersReducedMotion, scrollAnimationsEnabledBySystem = scrollAnimationsEnabledBySystem, shouldRenderRichAnimation = shouldRenderRichAnimation)
  
    __obj.asInstanceOf[AnimationSettings]
  }
}

