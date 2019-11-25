package typings.firefoxDashWebextDashBrowser.browser.browserSettings

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* browserSettings types */
/** How images should be animated in the browser. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.none
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.once
*/
trait ImageAnimationBehavior extends js.Object

object ImageAnimationBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.none = this.cast("none")
  @scala.inline
  def normal: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def once: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.once = this.cast("once")
}

/**
  * Controls the behaviour of image animation in the browser. This setting's value is of type
  * ImageAnimationBehavior, defaulting to `normal`.
  */
@JSGlobal("browser.browserSettings.imageAnimationBehavior")
@js.native
object imageAnimationBehavior extends TopLevel[Setting]

