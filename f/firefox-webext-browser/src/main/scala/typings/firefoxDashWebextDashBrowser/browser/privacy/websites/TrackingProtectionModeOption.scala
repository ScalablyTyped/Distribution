package typings.firefoxDashWebextDashBrowser.browser.privacy.websites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* privacy.websites types */
/** The mode for tracking protection. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.always
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.never
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.private_browsing
*/
trait TrackingProtectionModeOption extends js.Object

object TrackingProtectionModeOption {
  @scala.inline
  def always: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.never = this.cast("never")
  @scala.inline
  def private_browsing: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.private_browsing = this.cast("private_browsing")
}

