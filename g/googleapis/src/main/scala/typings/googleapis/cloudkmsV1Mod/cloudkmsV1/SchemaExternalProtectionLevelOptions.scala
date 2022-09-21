package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExternalProtectionLevelOptions extends StObject {
  
  /**
    * The path to the external key material on the EKM when using EkmConnection e.g., "v0/my/key". Set this field instead of external_key_uri when using an EkmConnection.
    */
  var ekmConnectionKeyPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI for an external resource that this CryptoKeyVersion represents.
    */
  var externalKeyUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaExternalProtectionLevelOptions {
  
  inline def apply(): SchemaExternalProtectionLevelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternalProtectionLevelOptions]
  }
  
  extension [Self <: SchemaExternalProtectionLevelOptions](x: Self) {
    
    inline def setEkmConnectionKeyPath(value: String): Self = StObject.set(x, "ekmConnectionKeyPath", value.asInstanceOf[js.Any])
    
    inline def setEkmConnectionKeyPathNull: Self = StObject.set(x, "ekmConnectionKeyPath", null)
    
    inline def setEkmConnectionKeyPathUndefined: Self = StObject.set(x, "ekmConnectionKeyPath", js.undefined)
    
    inline def setExternalKeyUri(value: String): Self = StObject.set(x, "externalKeyUri", value.asInstanceOf[js.Any])
    
    inline def setExternalKeyUriNull: Self = StObject.set(x, "externalKeyUri", null)
    
    inline def setExternalKeyUriUndefined: Self = StObject.set(x, "externalKeyUri", js.undefined)
  }
}
