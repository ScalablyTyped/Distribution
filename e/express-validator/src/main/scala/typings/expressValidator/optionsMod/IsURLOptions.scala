package typings.expressValidator.optionsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsURLOptions extends js.Object {
  var allow_protocol_relative_urls: js.UndefOr[Boolean] = js.undefined
  var allow_trailing_dot: js.UndefOr[Boolean] = js.undefined
  var allow_underscores: js.UndefOr[Boolean] = js.undefined
  var disallow_auth: js.UndefOr[Boolean] = js.undefined
  var host_blacklist: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  var host_whitelist: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  var protocols: js.UndefOr[js.Array[URLProtocol]] = js.undefined
  var require_host: js.UndefOr[Boolean] = js.undefined
  var require_protocol: js.UndefOr[Boolean] = js.undefined
  var require_tld: js.UndefOr[Boolean] = js.undefined
  var require_valid_protocol: js.UndefOr[Boolean] = js.undefined
}

object IsURLOptions {
  @scala.inline
  def apply(
    allow_protocol_relative_urls: js.UndefOr[Boolean] = js.undefined,
    allow_trailing_dot: js.UndefOr[Boolean] = js.undefined,
    allow_underscores: js.UndefOr[Boolean] = js.undefined,
    disallow_auth: js.UndefOr[Boolean] = js.undefined,
    host_blacklist: js.Array[String | RegExp] = null,
    host_whitelist: js.Array[String | RegExp] = null,
    protocols: js.Array[URLProtocol] = null,
    require_host: js.UndefOr[Boolean] = js.undefined,
    require_protocol: js.UndefOr[Boolean] = js.undefined,
    require_tld: js.UndefOr[Boolean] = js.undefined,
    require_valid_protocol: js.UndefOr[Boolean] = js.undefined
  ): IsURLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_protocol_relative_urls)) __obj.updateDynamic("allow_protocol_relative_urls")(allow_protocol_relative_urls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_trailing_dot)) __obj.updateDynamic("allow_trailing_dot")(allow_trailing_dot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_underscores)) __obj.updateDynamic("allow_underscores")(allow_underscores.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disallow_auth)) __obj.updateDynamic("disallow_auth")(disallow_auth.get.asInstanceOf[js.Any])
    if (host_blacklist != null) __obj.updateDynamic("host_blacklist")(host_blacklist.asInstanceOf[js.Any])
    if (host_whitelist != null) __obj.updateDynamic("host_whitelist")(host_whitelist.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(require_host)) __obj.updateDynamic("require_host")(require_host.get.asInstanceOf[js.Any])
    if (!js.isUndefined(require_protocol)) __obj.updateDynamic("require_protocol")(require_protocol.get.asInstanceOf[js.Any])
    if (!js.isUndefined(require_tld)) __obj.updateDynamic("require_tld")(require_tld.get.asInstanceOf[js.Any])
    if (!js.isUndefined(require_valid_protocol)) __obj.updateDynamic("require_valid_protocol")(require_valid_protocol.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsURLOptions]
  }
}

