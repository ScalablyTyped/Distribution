package typings.firefoxWebextBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The soonest that the JavaScript or CSS will be injected into the tab. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_start
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_end
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_idle
*/
trait RunAt extends js.Object

object RunAt {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document_end: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_end = this.cast("document_end")
  @scala.inline
  def document_idle: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_idle = this.cast("document_idle")
  @scala.inline
  def document_start: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.document_start = this.cast("document_start")
}

