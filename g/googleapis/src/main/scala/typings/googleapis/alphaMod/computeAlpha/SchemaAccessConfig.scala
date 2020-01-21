package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An access configuration attached to an instance&#39;s network interface.
  * Only one access config per instance is supported.
  */
@js.native
trait SchemaAccessConfig extends js.Object {
  /**
    * [Output Only] Type of the resource. Always compute#accessConfig for
    * access configs.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of this access configuration. The default and recommended name
    * is External NAT but you can use any arbitrary string you would like. For
    * example, My external IP or Network Access.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An external IP address associated with this instance. Specify an unused
    * static external IP address available to the project or leave this field
    * undefined to use an IP from a shared ephemeral IP address pool. If you
    * specify a static external IP address, it must live in the same region as
    * the zone of the instance.
    */
  var natIP: js.UndefOr[String] = js.native
  /**
    * This signifies the networking tier used for configuring this access
    * configuration and can only take the following values: PREMIUM, STANDARD.
    * If an AccessConfig is specified without a valid external IP address, an
    * ephemeral IP will be created with this networkTier.  If an AccessConfig
    * with a valid external IP address is specified, it must match that of the
    * networkTier associated with the Address resource owning that IP.
    */
  var networkTier: js.UndefOr[String] = js.native
  /**
    * [Output Only] The public DNS domain name for the instance.
    */
  var publicDnsName: js.UndefOr[String] = js.native
  /**
    * The DNS domain name for the public PTR record. This field can only be set
    * when the set_public_ptr field is enabled.
    */
  var publicPtrDomainName: js.UndefOr[String] = js.native
  /**
    * Specifies whether a public DNS ?A? record should be created for the
    * external IP address of this access configuration.
    */
  var setPublicDns: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether a public DNS ?PTR? record should be created to map the
    * external IP address of the instance to a DNS domain name.
    */
  var setPublicPtr: js.UndefOr[Boolean] = js.native
  /**
    * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAccessConfig {
  @scala.inline
  def apply(
    kind: String = null,
    name: String = null,
    natIP: String = null,
    networkTier: String = null,
    publicDnsName: String = null,
    publicPtrDomainName: String = null,
    setPublicDns: js.UndefOr[Boolean] = js.undefined,
    setPublicPtr: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): SchemaAccessConfig = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (natIP != null) __obj.updateDynamic("natIP")(natIP.asInstanceOf[js.Any])
    if (networkTier != null) __obj.updateDynamic("networkTier")(networkTier.asInstanceOf[js.Any])
    if (publicDnsName != null) __obj.updateDynamic("publicDnsName")(publicDnsName.asInstanceOf[js.Any])
    if (publicPtrDomainName != null) __obj.updateDynamic("publicPtrDomainName")(publicPtrDomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(setPublicDns)) __obj.updateDynamic("setPublicDns")(setPublicDns.asInstanceOf[js.Any])
    if (!js.isUndefined(setPublicPtr)) __obj.updateDynamic("setPublicPtr")(setPublicPtr.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccessConfig]
  }
}

