package typings.firefoxDashWebextDashBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * How the extension was installed. One of
  * `development`: The extension was loaded unpacked in developer mode,
  * `normal`: The extension was installed normally via an .xpi file,
  * `sideload`: The extension was installed by other software on the machine,
  * `other`: The extension was installed by other means.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.development
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.sideload
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.other
*/
trait ExtensionInstallType extends js.Object

object ExtensionInstallType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def development: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.development = this.cast("development")
  @scala.inline
  def normal: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def other: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.other = this.cast("other")
  @scala.inline
  def sideload: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.sideload = this.cast("sideload")
}

