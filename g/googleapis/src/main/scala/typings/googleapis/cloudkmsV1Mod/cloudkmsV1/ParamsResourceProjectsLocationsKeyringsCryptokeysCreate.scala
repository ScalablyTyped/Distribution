package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeyringsCryptokeysCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. It must be unique within a KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63\}`
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
  
  /**
    * If set to true, the request will create a CryptoKey without any CryptoKeyVersions. You must manually call CreateCryptoKeyVersion or ImportCryptoKeyVersion before you can use this CryptoKey.
    */
  var skipInitialVersionCreation: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsKeyringsCryptokeysCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsKeyringsCryptokeysCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeyringsCryptokeysCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKeyringsCryptokeysCreate](x: Self) {
    
    inline def setCryptoKeyId(value: String): Self = StObject.set(x, "cryptoKeyId", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyIdUndefined: Self = StObject.set(x, "cryptoKeyId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaCryptoKey): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSkipInitialVersionCreation(value: Boolean): Self = StObject.set(x, "skipInitialVersionCreation", value.asInstanceOf[js.Any])
    
    inline def setSkipInitialVersionCreationUndefined: Self = StObject.set(x, "skipInitialVersionCreation", js.undefined)
  }
}
