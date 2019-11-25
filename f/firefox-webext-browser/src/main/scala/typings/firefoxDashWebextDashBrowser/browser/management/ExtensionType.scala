package typings.firefoxDashWebextDashBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of this extension, 'extension' or 'theme'. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.extension
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.theme
*/
trait ExtensionType extends js.Object

object ExtensionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extension: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.extension = this.cast("extension")
  @scala.inline
  def theme: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.theme = this.cast("theme")
}

