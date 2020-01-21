package typings.firefoxWebextBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of this extension, 'extension' or 'theme'. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.extension
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.theme
*/
trait ExtensionType extends js.Object

object ExtensionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extension: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.extension = this.cast("extension")
  @scala.inline
  def theme: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.theme = this.cast("theme")
}

