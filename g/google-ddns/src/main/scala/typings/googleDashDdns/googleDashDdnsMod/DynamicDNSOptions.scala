package typings.googleDashDdns.googleDashDdnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicDNSOptions extends js.Object {
  /**
    * If debug mode is enabled, debug and status information will be
    * written to the console.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to fail or continue synchronizing if the current hostname
    * was not resolved. This typically happens if the domain was created
    * and has not yet been applied or propagated. See TTL (Time-to-Live)
    * for more information. Even if this fails, the update can still be
    * successful.
    */
  var failOnUnresolvedHostName: js.UndefOr[Boolean] = js.undefined
  /**
    * If `useHostIPAddressCache` is `true`, this option is used to force a
    * DNS request every once in a while. This is the number of seconds
    * until the cache expires.
    */
  var hostIPAddressCacheExpires: js.UndefOr[Double] = js.undefined
  /**
    * The dynamic DNS hostname.
    */
  var hostname: String
  /**
    * The maximum number of times to attempt synchronization despite the
    * hostname not being resolved. Applies if `failOnUnresolvedHostName`
    * is `false`.
    */
  var maxUnresolvedHostNameFail: js.UndefOr[Double] = js.undefined
  /**
    * The dynamic DNS password.
    */
  var password: String
  /**
    * The URL used to check the current public IP of the device.
    */
  var publicIpUrl: js.UndefOr[String] = js.undefined
  /**
    * The URL of the Google Dynamic DNS API. Must include the text `%HOSTNAME%` and `%IPADDRESS%` as placeholders for the hostname and IP
    * address.
    */
  var updateIpUrl: js.UndefOr[String] = js.undefined
  /**
    * Whether to cache the IP address of the DNS record or make a DNS
    * request every time. This can usually be left enabled since this
    * client is the only one responsible for updating the DNS record.
    */
  var useHostIPAddressCache: js.UndefOr[Boolean] = js.undefined
  /**
    * The HTTP header User-Agent to send when updating the IP address.
    * This is required by the Google Dynamic DNS API.
    */
  var userAgent: js.UndefOr[String] = js.undefined
  /**
    * The dynamic DNS username.
    */
  var username: String
}

object DynamicDNSOptions {
  @scala.inline
  def apply(
    hostname: String,
    password: String,
    username: String,
    debug: js.UndefOr[Boolean] = js.undefined,
    failOnUnresolvedHostName: js.UndefOr[Boolean] = js.undefined,
    hostIPAddressCacheExpires: Int | Double = null,
    maxUnresolvedHostNameFail: Int | Double = null,
    publicIpUrl: String = null,
    updateIpUrl: String = null,
    useHostIPAddressCache: js.UndefOr[Boolean] = js.undefined,
    userAgent: String = null
  ): DynamicDNSOptions = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnUnresolvedHostName)) __obj.updateDynamic("failOnUnresolvedHostName")(failOnUnresolvedHostName.asInstanceOf[js.Any])
    if (hostIPAddressCacheExpires != null) __obj.updateDynamic("hostIPAddressCacheExpires")(hostIPAddressCacheExpires.asInstanceOf[js.Any])
    if (maxUnresolvedHostNameFail != null) __obj.updateDynamic("maxUnresolvedHostNameFail")(maxUnresolvedHostNameFail.asInstanceOf[js.Any])
    if (publicIpUrl != null) __obj.updateDynamic("publicIpUrl")(publicIpUrl.asInstanceOf[js.Any])
    if (updateIpUrl != null) __obj.updateDynamic("updateIpUrl")(updateIpUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(useHostIPAddressCache)) __obj.updateDynamic("useHostIPAddressCache")(useHostIPAddressCache.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicDNSOptions]
  }
}

