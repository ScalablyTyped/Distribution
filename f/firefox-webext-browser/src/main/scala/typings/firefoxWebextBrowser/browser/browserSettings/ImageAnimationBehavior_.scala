package typings.firefoxWebextBrowser.browser.browserSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* browserSettings types */
/** How images should be animated in the browser. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.none
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.once
*/
trait ImageAnimationBehavior_ extends js.Object

object ImageAnimationBehavior_ {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.none = this.cast("none")
  @scala.inline
  def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def once: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.once = this.cast("once")
}

