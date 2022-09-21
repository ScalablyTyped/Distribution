package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Key Management Service (Cloud KMS) settings for a CMEK-protected cluster.
  */
trait SchemaEncryptionConfig extends StObject {
  
  /**
    * Describes the Cloud KMS encryption key that will be used to protect the destination Bigtable cluster. The requirements for this key are: 1) The Cloud Bigtable service account associated with the project that contains this cluster must be granted the `cloudkms.cryptoKeyEncrypterDecrypter` role on the CMEK key. 2) Only regional keys can be used and the region of the CMEK key must match the region of the cluster. 3) All clusters within an instance must use the same CMEK key. Values are of the form `projects/{project\}/locations/{location\}/keyRings/{keyring\}/cryptoKeys/{key\}`
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object SchemaEncryptionConfig {
  
  inline def apply(): SchemaEncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionConfig]
  }
  
  extension [Self <: SchemaEncryptionConfig](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
