package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendBucketCdnPolicyBypassCacheOnRequestHeader extends StObject {
  
  /**
    * The header field name to match on when bypassing cache. Values are case-insensitive.
    */
  var headerName: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackendBucketCdnPolicyBypassCacheOnRequestHeader {
  
  inline def apply(): SchemaBackendBucketCdnPolicyBypassCacheOnRequestHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendBucketCdnPolicyBypassCacheOnRequestHeader]
  }
  
  extension [Self <: SchemaBackendBucketCdnPolicyBypassCacheOnRequestHeader](x: Self) {
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameNull: Self = StObject.set(x, "headerName", null)
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
  }
}
