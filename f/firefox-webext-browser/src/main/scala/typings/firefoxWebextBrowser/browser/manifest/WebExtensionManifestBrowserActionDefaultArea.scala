package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the location the browserAction will appear by default. The default location is navbar. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.navbar
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.menupanel
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabstrip
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.personaltoolbar
*/
trait WebExtensionManifestBrowserActionDefaultArea extends js.Object

object WebExtensionManifestBrowserActionDefaultArea {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def menupanel: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.menupanel = this.cast("menupanel")
  @scala.inline
  def navbar: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.navbar = this.cast("navbar")
  @scala.inline
  def personaltoolbar: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.personaltoolbar = this.cast("personaltoolbar")
  @scala.inline
  def tabstrip: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabstrip = this.cast("tabstrip")
}

