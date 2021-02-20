package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationSettings extends StObject {
  
  /**
    * Determines whether the user desires reduced motion based on platform APIs.
    */
  var prefersReducedMotion: Boolean = js.native
  
  /**
    * Determines on a per-platform basis whether scroll animations (e.g. produced by
    * home/end key) should be enabled.
    */
  var scrollAnimationsEnabledBySystem: Boolean = js.native
  
  /**
    * Returns true if rich animations should be rendered. Looks at session type (e.g.
    * remote desktop) and accessibility settings to give guidance for heavy
    * animations.
    */
  var shouldRenderRichAnimation: Boolean = js.native
}
object AnimationSettings {
  
  @scala.inline
  def apply(
    prefersReducedMotion: Boolean,
    scrollAnimationsEnabledBySystem: Boolean,
    shouldRenderRichAnimation: Boolean
  ): AnimationSettings = {
    val __obj = js.Dynamic.literal(prefersReducedMotion = prefersReducedMotion.asInstanceOf[js.Any], scrollAnimationsEnabledBySystem = scrollAnimationsEnabledBySystem.asInstanceOf[js.Any], shouldRenderRichAnimation = shouldRenderRichAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationSettings]
  }
  
  @scala.inline
  implicit class AnimationSettingsMutableBuilder[Self <: AnimationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefersReducedMotion(value: Boolean): Self = StObject.set(x, "prefersReducedMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollAnimationsEnabledBySystem(value: Boolean): Self = StObject.set(x, "scrollAnimationsEnabledBySystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRenderRichAnimation(value: Boolean): Self = StObject.set(x, "shouldRenderRichAnimation", value.asInstanceOf[js.Any])
  }
}
