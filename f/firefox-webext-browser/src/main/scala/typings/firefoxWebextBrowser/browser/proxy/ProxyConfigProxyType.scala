package typings.firefoxWebextBrowser.browser.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of proxy to use. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.none
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoDetect
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.system
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoConfig
*/
trait ProxyConfigProxyType extends js.Object

object ProxyConfigProxyType {
  @scala.inline
  def autoConfig: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoConfig = this.cast("autoConfig")
  @scala.inline
  def autoDetect: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoDetect = this.cast("autoDetect")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual = this.cast("manual")
  @scala.inline
  def none: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.none = this.cast("none")
  @scala.inline
  def system: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.system = this.cast("system")
}

