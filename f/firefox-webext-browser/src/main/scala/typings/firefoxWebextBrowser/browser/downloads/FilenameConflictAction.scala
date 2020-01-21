package typings.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* downloads types */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.uniquify
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.prompt
*/
trait FilenameConflictAction extends js.Object

object FilenameConflictAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def overwrite: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.overwrite = this.cast("overwrite")
  @scala.inline
  def prompt: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.prompt = this.cast("prompt")
  @scala.inline
  def uniquify: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.uniquify = this.cast("uniquify")
}

