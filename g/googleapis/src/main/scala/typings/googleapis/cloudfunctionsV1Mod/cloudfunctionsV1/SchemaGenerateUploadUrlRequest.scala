package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateUploadUrlRequest extends StObject {
  
  /**
    * Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function source code objects in staging Cloud Storage buckets. When you generate an upload url and upload your source code, it gets copied to a staging Cloud Storage bucket in an internal regional project. The source code is then copied to a versioned directory in the sources bucket in the consumer project during the function deployment. It must match the pattern `projects/{project\}/locations/{location\}/keyRings/{key_ring\}/cryptoKeys/{crypto_key\}`. The Google Cloud Functions service account (service-{project_number\}@gcf-admin-robot.iam.gserviceaccount.com) must be granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the Key/KeyRing/Project/Organization (least access preferred). GCF will delegate access to the Google Storage service account in the internal project.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenerateUploadUrlRequest {
  
  inline def apply(): SchemaGenerateUploadUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateUploadUrlRequest]
  }
  
  extension [Self <: SchemaGenerateUploadUrlRequest](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
