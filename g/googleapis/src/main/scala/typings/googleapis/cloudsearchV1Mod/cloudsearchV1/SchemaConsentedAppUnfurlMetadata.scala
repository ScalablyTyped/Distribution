package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsentedAppUnfurlMetadata extends StObject {
  
  /**
    * Client specified AppId, which will not be sanitized and is untrusted.
    */
  var clientSpecifiedAppId: js.UndefOr[SchemaUserId] = js.undefined
}
object SchemaConsentedAppUnfurlMetadata {
  
  inline def apply(): SchemaConsentedAppUnfurlMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsentedAppUnfurlMetadata]
  }
  
  extension [Self <: SchemaConsentedAppUnfurlMetadata](x: Self) {
    
    inline def setClientSpecifiedAppId(value: SchemaUserId): Self = StObject.set(x, "clientSpecifiedAppId", value.asInstanceOf[js.Any])
    
    inline def setClientSpecifiedAppIdUndefined: Self = StObject.set(x, "clientSpecifiedAppId", js.undefined)
  }
}
