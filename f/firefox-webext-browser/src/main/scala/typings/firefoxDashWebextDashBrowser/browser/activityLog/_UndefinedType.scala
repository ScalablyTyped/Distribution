package typings.firefoxDashWebextDashBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of log entry. api_call is a function call made by the extension and api_event is an event callback to
  * the extension. content_script is logged when a content script is injected.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.api_call
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.api_event
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.content_script
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.user_script
*/
trait _UndefinedType extends js.Object

object _UndefinedType {
  @scala.inline
  def api_call: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.api_call = this.cast("api_call")
  @scala.inline
  def api_event: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.api_event = this.cast("api_event")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def content_script: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.content_script = this.cast("content_script")
  @scala.inline
  def user_script: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.user_script = this.cast("user_script")
}

