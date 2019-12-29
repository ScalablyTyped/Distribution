package typings.googleDashDdns.googleDashDdnsMod

import typings.googleDashDdns.googleDashDdnsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions extends DynamicDNSOptions {
  /**
    * The number of seconds between updates.
    */
  var checkInterval: js.UndefOr[Double] = js.undefined
  /**
    * Whether to stop the service if the maximum number of consecutive
    * errors is reached.
    */
  var exitOnMaxErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * The path of the log file to output to. Set to `false` to disable
    * logging to file.
    */
  var logPath: js.UndefOr[String | `false`] = js.undefined
  /**
    * Whether to log output to the console.
    */
  var logToConsole: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of consecutive errors before stopping the service
    * if `exitOnMaxErrors` is `true`.
    */
  var maxConsecutiveErrors: js.UndefOr[Double] = js.undefined
}

object ServiceOptions {
  @scala.inline
  def apply(
    hostname: String,
    password: String,
    username: String,
    checkInterval: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    exitOnMaxErrors: js.UndefOr[Boolean] = js.undefined,
    failOnUnresolvedHostName: js.UndefOr[Boolean] = js.undefined,
    hostIPAddressCacheExpires: Int | Double = null,
    logPath: String | `false` = null,
    logToConsole: js.UndefOr[Boolean] = js.undefined,
    maxConsecutiveErrors: Int | Double = null,
    maxUnresolvedHostNameFail: Int | Double = null,
    publicIpUrl: String = null,
    updateIpUrl: String = null,
    useHostIPAddressCache: js.UndefOr[Boolean] = js.undefined,
    userAgent: String = null
  ): ServiceOptions = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(exitOnMaxErrors)) __obj.updateDynamic("exitOnMaxErrors")(exitOnMaxErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnUnresolvedHostName)) __obj.updateDynamic("failOnUnresolvedHostName")(failOnUnresolvedHostName.asInstanceOf[js.Any])
    if (hostIPAddressCacheExpires != null) __obj.updateDynamic("hostIPAddressCacheExpires")(hostIPAddressCacheExpires.asInstanceOf[js.Any])
    if (logPath != null) __obj.updateDynamic("logPath")(logPath.asInstanceOf[js.Any])
    if (!js.isUndefined(logToConsole)) __obj.updateDynamic("logToConsole")(logToConsole.asInstanceOf[js.Any])
    if (maxConsecutiveErrors != null) __obj.updateDynamic("maxConsecutiveErrors")(maxConsecutiveErrors.asInstanceOf[js.Any])
    if (maxUnresolvedHostNameFail != null) __obj.updateDynamic("maxUnresolvedHostNameFail")(maxUnresolvedHostNameFail.asInstanceOf[js.Any])
    if (publicIpUrl != null) __obj.updateDynamic("publicIpUrl")(publicIpUrl.asInstanceOf[js.Any])
    if (updateIpUrl != null) __obj.updateDynamic("updateIpUrl")(updateIpUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(useHostIPAddressCache)) __obj.updateDynamic("useHostIPAddressCache")(useHostIPAddressCache.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOptions]
  }
}

