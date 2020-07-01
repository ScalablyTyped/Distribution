package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing what to include in the cache key for a request for Cloud
  * CDN.
  */
@js.native
trait SchemaCacheKeyPolicy extends js.Object {
  /**
    * If true, requests to different hosts will be cached separately.
    */
  var includeHost: js.UndefOr[Boolean] = js.native
  /**
    * If true, http and https requests will be cached separately.
    */
  var includeProtocol: js.UndefOr[Boolean] = js.native
  /**
    * If true, include query string parameters in the cache key according to
    * query_string_whitelist and query_string_blacklist. If neither is set, the
    * entire query string will be included. If false, the query string will be
    * excluded from the cache key entirely.
    */
  var includeQueryString: js.UndefOr[Boolean] = js.native
  /**
    * Names of query string parameters to exclude in cache keys. All other
    * parameters will be included. Either specify query_string_whitelist or
    * query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be
    * percent encoded and not treated as delimiters.
    */
  var queryStringBlacklist: js.UndefOr[js.Array[String]] = js.native
  /**
    * Names of query string parameters to include in cache keys. All other
    * parameters will be excluded. Either specify query_string_whitelist or
    * query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be
    * percent encoded and not treated as delimiters.
    */
  var queryStringWhitelist: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCacheKeyPolicy {
  @scala.inline
  def apply(
    includeHost: js.UndefOr[Boolean] = js.undefined,
    includeProtocol: js.UndefOr[Boolean] = js.undefined,
    includeQueryString: js.UndefOr[Boolean] = js.undefined,
    queryStringBlacklist: js.Array[String] = null,
    queryStringWhitelist: js.Array[String] = null
  ): SchemaCacheKeyPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeHost)) __obj.updateDynamic("includeHost")(includeHost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeProtocol)) __obj.updateDynamic("includeProtocol")(includeProtocol.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeQueryString)) __obj.updateDynamic("includeQueryString")(includeQueryString.get.asInstanceOf[js.Any])
    if (queryStringBlacklist != null) __obj.updateDynamic("queryStringBlacklist")(queryStringBlacklist.asInstanceOf[js.Any])
    if (queryStringWhitelist != null) __obj.updateDynamic("queryStringWhitelist")(queryStringWhitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCacheKeyPolicy]
  }
}

