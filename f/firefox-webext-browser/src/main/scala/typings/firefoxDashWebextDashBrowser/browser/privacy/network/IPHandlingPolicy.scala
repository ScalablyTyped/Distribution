package typings.firefoxDashWebextDashBrowser.browser.privacy.network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* privacy.network types */
/** The IP handling policy of WebRTC. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.default
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.default_public_and_private_interfaces
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.default_public_interface_only
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.disable_non_proxied_udp
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.proxy_only
*/
trait IPHandlingPolicy extends js.Object

object IPHandlingPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.default = this.cast("default")
  @scala.inline
  def default_public_and_private_interfaces: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.default_public_and_private_interfaces = this.cast("default_public_and_private_interfaces")
  @scala.inline
  def default_public_interface_only: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.default_public_interface_only = this.cast("default_public_interface_only")
  @scala.inline
  def disable_non_proxied_udp: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.disable_non_proxied_udp = this.cast("disable_non_proxied_udp")
  @scala.inline
  def proxy_only: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.proxy_only = this.cast("proxy_only")
}

