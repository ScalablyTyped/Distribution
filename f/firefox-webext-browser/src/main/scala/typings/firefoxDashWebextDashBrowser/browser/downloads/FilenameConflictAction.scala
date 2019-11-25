package typings.firefoxDashWebextDashBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* downloads types */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.uniquify
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.overwrite
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.prompt
*/
trait FilenameConflictAction extends js.Object

object FilenameConflictAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def overwrite: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.overwrite = this.cast("overwrite")
  @scala.inline
  def prompt: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.prompt = this.cast("prompt")
  @scala.inline
  def uniquify: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.uniquify = this.cast("uniquify")
}

