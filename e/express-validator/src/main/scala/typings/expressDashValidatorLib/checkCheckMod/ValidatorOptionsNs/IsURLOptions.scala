package typings
package expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defaults to
  * {
  *    protocols: ['http','https','ftp'],
  *    require_tld: true,
  *    require_protocol: false,
  *    require_host: true,
  *    require_valid_protocol: true,
  *    allow_underscores: false,
  *    host_whitelist: false,
  *    host_blacklist: false,
  *    allow_trailing_dot: false,
  *    allow_protocol_relative_urls: false
  * }
  */
trait IsURLOptions extends js.Object {
  var allow_protocol_relative_urls: js.UndefOr[scala.Boolean] = js.undefined
  var allow_trailing_dot: js.UndefOr[scala.Boolean] = js.undefined
  var allow_underscores: js.UndefOr[scala.Boolean] = js.undefined
  var host_blacklist: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var host_whitelist: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var protocols: js.UndefOr[js.Array[expressDashValidatorLib.checkCheckMod.URLProtocol]] = js.undefined
  var require_host: js.UndefOr[scala.Boolean] = js.undefined
  var require_protocol: js.UndefOr[scala.Boolean] = js.undefined
  var require_tld: js.UndefOr[scala.Boolean] = js.undefined
  var require_valid_protocol: js.UndefOr[scala.Boolean] = js.undefined
}

object IsURLOptions {
  @scala.inline
  def apply(
    allow_protocol_relative_urls: js.UndefOr[scala.Boolean] = js.undefined,
    allow_trailing_dot: js.UndefOr[scala.Boolean] = js.undefined,
    allow_underscores: js.UndefOr[scala.Boolean] = js.undefined,
    host_blacklist: js.Array[java.lang.String | stdLib.RegExp] = null,
    host_whitelist: js.Array[java.lang.String | stdLib.RegExp] = null,
    protocols: js.Array[expressDashValidatorLib.checkCheckMod.URLProtocol] = null,
    require_host: js.UndefOr[scala.Boolean] = js.undefined,
    require_protocol: js.UndefOr[scala.Boolean] = js.undefined,
    require_tld: js.UndefOr[scala.Boolean] = js.undefined,
    require_valid_protocol: js.UndefOr[scala.Boolean] = js.undefined
  ): IsURLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_protocol_relative_urls)) __obj.updateDynamic("allow_protocol_relative_urls")(allow_protocol_relative_urls)
    if (!js.isUndefined(allow_trailing_dot)) __obj.updateDynamic("allow_trailing_dot")(allow_trailing_dot)
    if (!js.isUndefined(allow_underscores)) __obj.updateDynamic("allow_underscores")(allow_underscores)
    if (host_blacklist != null) __obj.updateDynamic("host_blacklist")(host_blacklist)
    if (host_whitelist != null) __obj.updateDynamic("host_whitelist")(host_whitelist)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (!js.isUndefined(require_host)) __obj.updateDynamic("require_host")(require_host)
    if (!js.isUndefined(require_protocol)) __obj.updateDynamic("require_protocol")(require_protocol)
    if (!js.isUndefined(require_tld)) __obj.updateDynamic("require_tld")(require_tld)
    if (!js.isUndefined(require_valid_protocol)) __obj.updateDynamic("require_valid_protocol")(require_valid_protocol)
    __obj.asInstanceOf[IsURLOptions]
  }
}

