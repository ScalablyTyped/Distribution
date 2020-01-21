package typings.firefoxWebextBrowser.browser.management

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
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.development
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sideload
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.other
*/
trait ExtensionInstallType extends js.Object

object ExtensionInstallType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def development: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.development = this.cast("development")
  @scala.inline
  def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def other: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.other = this.cast("other")
  @scala.inline
  def sideload: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sideload = this.cast("sideload")
}

