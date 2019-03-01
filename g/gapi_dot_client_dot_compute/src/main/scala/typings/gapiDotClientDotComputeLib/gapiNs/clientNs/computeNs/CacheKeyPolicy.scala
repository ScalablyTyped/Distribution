package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheKeyPolicy extends js.Object {
  /** If true, requests to different hosts will be cached separately. */
  var includeHost: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, http and https requests will be cached separately. */
  var includeProtocol: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire
    * query string will be included. If false, the query string will be excluded from the cache key entirely.
    */
  var includeQueryString: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or
    * query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
    */
  var queryStringBlacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or
    * query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
    */
  var queryStringWhitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CacheKeyPolicy {
  @scala.inline
  def apply(
    includeHost: js.UndefOr[scala.Boolean] = js.undefined,
    includeProtocol: js.UndefOr[scala.Boolean] = js.undefined,
    includeQueryString: js.UndefOr[scala.Boolean] = js.undefined,
    queryStringBlacklist: js.Array[java.lang.String] = null,
    queryStringWhitelist: js.Array[java.lang.String] = null
  ): CacheKeyPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeHost)) __obj.updateDynamic("includeHost")(includeHost)
    if (!js.isUndefined(includeProtocol)) __obj.updateDynamic("includeProtocol")(includeProtocol)
    if (!js.isUndefined(includeQueryString)) __obj.updateDynamic("includeQueryString")(includeQueryString)
    if (queryStringBlacklist != null) __obj.updateDynamic("queryStringBlacklist")(queryStringBlacklist)
    if (queryStringWhitelist != null) __obj.updateDynamic("queryStringWhitelist")(queryStringWhitelist)
    __obj.asInstanceOf[CacheKeyPolicy]
  }
}

