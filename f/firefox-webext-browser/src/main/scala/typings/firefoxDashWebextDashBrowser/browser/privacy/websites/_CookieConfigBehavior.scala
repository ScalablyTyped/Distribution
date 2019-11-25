package typings.firefoxDashWebextDashBrowser.browser.privacy.websites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of cookies to allow. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.allow_all
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.reject_all
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.reject_third_party
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.allow_visited
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.reject_trackers
*/
trait _CookieConfigBehavior extends js.Object

object _CookieConfigBehavior {
  @scala.inline
  def allow_all: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.allow_all = this.cast("allow_all")
  @scala.inline
  def allow_visited: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.allow_visited = this.cast("allow_visited")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def reject_all: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.reject_all = this.cast("reject_all")
  @scala.inline
  def reject_third_party: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.reject_third_party = this.cast("reject_third_party")
  @scala.inline
  def reject_trackers: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.reject_trackers = this.cast("reject_trackers")
}

