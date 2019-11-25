package typings.firefoxDashWebextDashBrowser.browser.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of menu item. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.checkbox
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.radio
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.separator
*/
trait ItemType extends js.Object

object ItemType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def normal: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def radio: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.radio = this.cast("radio")
  @scala.inline
  def separator: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.separator = this.cast("separator")
}

