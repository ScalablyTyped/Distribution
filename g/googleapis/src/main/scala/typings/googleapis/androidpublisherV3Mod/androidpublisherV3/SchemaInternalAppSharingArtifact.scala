package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInternalAppSharingArtifact extends StObject {
  
  /**
    * The sha256 fingerprint of the certificate used to sign the generated artifact.
    */
  var certificateFingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The download URL generated for the uploaded artifact. Users that are authorized to download can follow the link to the Play Store app to install it.
    */
  var downloadUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sha256 hash of the artifact represented as a lowercase hexadecimal number, matching the output of the sha256sum command.
    */
  var sha256: js.UndefOr[String | Null] = js.undefined
}
object SchemaInternalAppSharingArtifact {
  
  inline def apply(): SchemaInternalAppSharingArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalAppSharingArtifact]
  }
  
  extension [Self <: SchemaInternalAppSharingArtifact](x: Self) {
    
    inline def setCertificateFingerprint(value: String): Self = StObject.set(x, "certificateFingerprint", value.asInstanceOf[js.Any])
    
    inline def setCertificateFingerprintNull: Self = StObject.set(x, "certificateFingerprint", null)
    
    inline def setCertificateFingerprintUndefined: Self = StObject.set(x, "certificateFingerprint", js.undefined)
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlNull: Self = StObject.set(x, "downloadUrl", null)
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Null: Self = StObject.set(x, "sha256", null)
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
