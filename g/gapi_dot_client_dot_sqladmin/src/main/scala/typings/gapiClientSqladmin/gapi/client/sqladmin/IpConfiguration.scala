package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpConfiguration extends js.Object {
  /**
    * The list of external networks that are allowed to connect to the instance using the IP. In CIDR notation, also known as 'slash' notation (e.g.
    * 192.168.100.0/24).
    */
  var authorizedNetworks: js.UndefOr[js.Array[AclEntry]] = js.undefined
  /** Whether the instance should be assigned an IP address or not. */
  var ipv4Enabled: js.UndefOr[Boolean] = js.undefined
  /** Whether SSL connections over IP should be enforced or not. */
  var requireSsl: js.UndefOr[Boolean] = js.undefined
}

object IpConfiguration {
  @scala.inline
  def apply(
    authorizedNetworks: js.Array[AclEntry] = null,
    ipv4Enabled: js.UndefOr[Boolean] = js.undefined,
    requireSsl: js.UndefOr[Boolean] = js.undefined
  ): IpConfiguration = {
    val __obj = js.Dynamic.literal()
    if (authorizedNetworks != null) __obj.updateDynamic("authorizedNetworks")(authorizedNetworks.asInstanceOf[js.Any])
    if (!js.isUndefined(ipv4Enabled)) __obj.updateDynamic("ipv4Enabled")(ipv4Enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireSsl)) __obj.updateDynamic("requireSsl")(requireSsl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpConfiguration]
  }
}

