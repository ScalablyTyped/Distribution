package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendBucketCdnPolicyCacheKeyPolicy extends StObject {
  
  /**
    * Allows HTTP request headers (by name) to be used in the cache key.
    */
  var includeHttpHeaders: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Names of query string parameters to include in cache keys. Default parameters are always included. '&' and '=' will be percent encoded and not treated as delimiters.
    */
  var queryStringWhitelist: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBackendBucketCdnPolicyCacheKeyPolicy {
  
  inline def apply(): SchemaBackendBucketCdnPolicyCacheKeyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendBucketCdnPolicyCacheKeyPolicy]
  }
  
  extension [Self <: SchemaBackendBucketCdnPolicyCacheKeyPolicy](x: Self) {
    
    inline def setIncludeHttpHeaders(value: js.Array[String]): Self = StObject.set(x, "includeHttpHeaders", value.asInstanceOf[js.Any])
    
    inline def setIncludeHttpHeadersNull: Self = StObject.set(x, "includeHttpHeaders", null)
    
    inline def setIncludeHttpHeadersUndefined: Self = StObject.set(x, "includeHttpHeaders", js.undefined)
    
    inline def setIncludeHttpHeadersVarargs(value: String*): Self = StObject.set(x, "includeHttpHeaders", js.Array(value*))
    
    inline def setQueryStringWhitelist(value: js.Array[String]): Self = StObject.set(x, "queryStringWhitelist", value.asInstanceOf[js.Any])
    
    inline def setQueryStringWhitelistNull: Self = StObject.set(x, "queryStringWhitelist", null)
    
    inline def setQueryStringWhitelistUndefined: Self = StObject.set(x, "queryStringWhitelist", js.undefined)
    
    inline def setQueryStringWhitelistVarargs(value: String*): Self = StObject.set(x, "queryStringWhitelist", js.Array(value*))
  }
}
