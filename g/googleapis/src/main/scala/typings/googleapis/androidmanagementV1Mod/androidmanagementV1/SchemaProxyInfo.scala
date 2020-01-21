package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration info for an HTTP proxy. For a direct proxy, set the host,
  * port, and excluded_hosts fields. For a PAC script proxy, set the pac_uri
  * field.
  */
@js.native
trait SchemaProxyInfo extends js.Object {
  /**
    * For a direct proxy, the hosts for which the proxy is bypassed. The host
    * names may contain wildcards such as *.example.com.
    */
  var excludedHosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The host of the direct proxy.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The URI of the PAC script used to configure the proxy.
    */
  var pacUri: js.UndefOr[String] = js.native
  /**
    * The port of the direct proxy.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaProxyInfo {
  @scala.inline
  def apply(
    excludedHosts: js.Array[String] = null,
    host: String = null,
    pacUri: String = null,
    port: Int | Double = null
  ): SchemaProxyInfo = {
    val __obj = js.Dynamic.literal()
    if (excludedHosts != null) __obj.updateDynamic("excludedHosts")(excludedHosts.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (pacUri != null) __obj.updateDynamic("pacUri")(pacUri.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProxyInfo]
  }
}

