package typings.firefoxWebextBrowser.browser.menus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of menu item. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator
*/
trait ItemType extends js.Object

object ItemType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def radio: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.radio = this.cast("radio")
  @scala.inline
  def separator: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.separator = this.cast("separator")
}

