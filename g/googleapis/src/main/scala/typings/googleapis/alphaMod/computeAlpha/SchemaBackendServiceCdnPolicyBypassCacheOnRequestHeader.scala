package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceCdnPolicyBypassCacheOnRequestHeader extends StObject {
  
  /**
    * The header field name to match on when bypassing cache. Values are case-insensitive.
    */
  var headerName: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackendServiceCdnPolicyBypassCacheOnRequestHeader {
  
  inline def apply(): SchemaBackendServiceCdnPolicyBypassCacheOnRequestHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceCdnPolicyBypassCacheOnRequestHeader]
  }
  
  extension [Self <: SchemaBackendServiceCdnPolicyBypassCacheOnRequestHeader](x: Self) {
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameNull: Self = StObject.set(x, "headerName", null)
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
  }
}
