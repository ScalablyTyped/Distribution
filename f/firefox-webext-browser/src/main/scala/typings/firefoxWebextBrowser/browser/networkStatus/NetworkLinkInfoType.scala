package typings.firefoxWebextBrowser.browser.networkStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** If known, the type of network connection that is avialable. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`2g`
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`3g`
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`4g`
*/
trait NetworkLinkInfoType extends js.Object

object NetworkLinkInfoType {
  @scala.inline
  def `2g`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ethernet: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet = this.cast("ethernet")
  @scala.inline
  def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = this.cast("unknown")
  @scala.inline
  def usb: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb = this.cast("usb")
  @scala.inline
  def wifi: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi = this.cast("wifi")
  @scala.inline
  def wimax: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax = this.cast("wimax")
}

