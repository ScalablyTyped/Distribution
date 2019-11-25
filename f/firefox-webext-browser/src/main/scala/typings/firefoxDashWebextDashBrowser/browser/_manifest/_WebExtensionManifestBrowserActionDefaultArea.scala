package typings.firefoxDashWebextDashBrowser.browser._manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the location the browserAction will appear by default. The default location is navbar. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.navbar
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.menupanel
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tabstrip
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.personaltoolbar
*/
trait _WebExtensionManifestBrowserActionDefaultArea extends js.Object

object _WebExtensionManifestBrowserActionDefaultArea {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def menupanel: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.menupanel = this.cast("menupanel")
  @scala.inline
  def navbar: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.navbar = this.cast("navbar")
  @scala.inline
  def personaltoolbar: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.personaltoolbar = this.cast("personaltoolbar")
  @scala.inline
  def tabstrip: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tabstrip = this.cast("tabstrip")
}

