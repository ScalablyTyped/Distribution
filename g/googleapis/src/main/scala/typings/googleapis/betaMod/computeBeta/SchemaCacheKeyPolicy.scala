package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message containing what to include in the cache key for a request for Cloud
  * CDN.
  */
trait SchemaCacheKeyPolicy extends StObject {
  
  /**
    * If true, requests to different hosts will be cached separately.
    */
  var includeHost: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, http and https requests will be cached separately.
    */
  var includeProtocol: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, include query string parameters in the cache key according to
    * query_string_whitelist and query_string_blacklist. If neither is set, the
    * entire query string will be included. If false, the query string will be
    * excluded from the cache key entirely.
    */
  var includeQueryString: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Names of query string parameters to exclude in cache keys. All other
    * parameters will be included. Either specify query_string_whitelist or
    * query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be
    * percent encoded and not treated as delimiters.
    */
  var queryStringBlacklist: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Names of query string parameters to include in cache keys. All other
    * parameters will be excluded. Either specify query_string_whitelist or
    * query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be
    * percent encoded and not treated as delimiters.
    */
  var queryStringWhitelist: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCacheKeyPolicy {
  
  inline def apply(): SchemaCacheKeyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCacheKeyPolicy]
  }
  
  extension [Self <: SchemaCacheKeyPolicy](x: Self) {
    
    inline def setIncludeHost(value: Boolean): Self = StObject.set(x, "includeHost", value.asInstanceOf[js.Any])
    
    inline def setIncludeHostUndefined: Self = StObject.set(x, "includeHost", js.undefined)
    
    inline def setIncludeProtocol(value: Boolean): Self = StObject.set(x, "includeProtocol", value.asInstanceOf[js.Any])
    
    inline def setIncludeProtocolUndefined: Self = StObject.set(x, "includeProtocol", js.undefined)
    
    inline def setIncludeQueryString(value: Boolean): Self = StObject.set(x, "includeQueryString", value.asInstanceOf[js.Any])
    
    inline def setIncludeQueryStringUndefined: Self = StObject.set(x, "includeQueryString", js.undefined)
    
    inline def setQueryStringBlacklist(value: js.Array[String]): Self = StObject.set(x, "queryStringBlacklist", value.asInstanceOf[js.Any])
    
    inline def setQueryStringBlacklistUndefined: Self = StObject.set(x, "queryStringBlacklist", js.undefined)
    
    inline def setQueryStringBlacklistVarargs(value: String*): Self = StObject.set(x, "queryStringBlacklist", js.Array(value :_*))
    
    inline def setQueryStringWhitelist(value: js.Array[String]): Self = StObject.set(x, "queryStringWhitelist", value.asInstanceOf[js.Any])
    
    inline def setQueryStringWhitelistUndefined: Self = StObject.set(x, "queryStringWhitelist", js.undefined)
    
    inline def setQueryStringWhitelistVarargs(value: String*): Self = StObject.set(x, "queryStringWhitelist", js.Array(value :_*))
  }
}
