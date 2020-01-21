package typings.firefoxWebextBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of log entry. api_call is a function call made by the extension and api_event is an event callback to
  * the extension. content_script is logged when a content script is injected.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_call
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_event
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_script
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.user_script
*/
trait UndefinedType extends js.Object

object UndefinedType {
  @scala.inline
  def api_call: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_call = this.cast("api_call")
  @scala.inline
  def api_event: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.api_event = this.cast("api_event")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def content_script: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.content_script = this.cast("content_script")
  @scala.inline
  def user_script: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.user_script = this.cast("user_script")
}

