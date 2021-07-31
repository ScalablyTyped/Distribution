package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeyringsCryptokeysCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. It must be unique within a KeyRing and match the regular
    * expression `[a-zA-Z0-9_-]{1,63}`
    */
  var cryptoKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the KeyRing associated with the CryptoKeys.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCryptoKey] = js.undefined
}
object ParamsResourceProjectsLocationsKeyringsCryptokeysCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsKeyringsCryptokeysCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsCryptokeysCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsKeyringsCryptokeysCreateMutableBuilder[Self <: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCryptoKeyId(value: String): Self = StObject.set(x, "cryptoKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeyIdUndefined: Self = StObject.set(x, "cryptoKeyId", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCryptoKey): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
