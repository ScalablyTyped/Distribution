package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeneratedApksPerSigningKey extends StObject {
  
  /**
    * SHA256 hash of the APK signing public key certificate.
    */
  var certificateSha256Hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of asset pack slices which will be served for this app bundle, signed with a key corresponding to certificate_sha256_hash.
    */
  var generatedAssetPackSlices: js.UndefOr[js.Array[SchemaGeneratedAssetPackSlice]] = js.undefined
  
  /**
    * List of generated split APKs, signed with a key corresponding to certificate_sha256_hash.
    */
  var generatedSplitApks: js.UndefOr[js.Array[SchemaGeneratedSplitApk]] = js.undefined
  
  /**
    * List of generated standalone APKs, signed with a key corresponding to certificate_sha256_hash.
    */
  var generatedStandaloneApks: js.UndefOr[js.Array[SchemaGeneratedStandaloneApk]] = js.undefined
  
  /**
    * Generated universal APK, signed with a key corresponding to certificate_sha256_hash. This field is not set if no universal APK was generated for this signing key.
    */
  var generatedUniversalApk: js.UndefOr[SchemaGeneratedUniversalApk] = js.undefined
}
object SchemaGeneratedApksPerSigningKey {
  
  inline def apply(): SchemaGeneratedApksPerSigningKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedApksPerSigningKey]
  }
  
  extension [Self <: SchemaGeneratedApksPerSigningKey](x: Self) {
    
    inline def setCertificateSha256Hash(value: String): Self = StObject.set(x, "certificateSha256Hash", value.asInstanceOf[js.Any])
    
    inline def setCertificateSha256HashNull: Self = StObject.set(x, "certificateSha256Hash", null)
    
    inline def setCertificateSha256HashUndefined: Self = StObject.set(x, "certificateSha256Hash", js.undefined)
    
    inline def setGeneratedAssetPackSlices(value: js.Array[SchemaGeneratedAssetPackSlice]): Self = StObject.set(x, "generatedAssetPackSlices", value.asInstanceOf[js.Any])
    
    inline def setGeneratedAssetPackSlicesUndefined: Self = StObject.set(x, "generatedAssetPackSlices", js.undefined)
    
    inline def setGeneratedAssetPackSlicesVarargs(value: SchemaGeneratedAssetPackSlice*): Self = StObject.set(x, "generatedAssetPackSlices", js.Array(value*))
    
    inline def setGeneratedSplitApks(value: js.Array[SchemaGeneratedSplitApk]): Self = StObject.set(x, "generatedSplitApks", value.asInstanceOf[js.Any])
    
    inline def setGeneratedSplitApksUndefined: Self = StObject.set(x, "generatedSplitApks", js.undefined)
    
    inline def setGeneratedSplitApksVarargs(value: SchemaGeneratedSplitApk*): Self = StObject.set(x, "generatedSplitApks", js.Array(value*))
    
    inline def setGeneratedStandaloneApks(value: js.Array[SchemaGeneratedStandaloneApk]): Self = StObject.set(x, "generatedStandaloneApks", value.asInstanceOf[js.Any])
    
    inline def setGeneratedStandaloneApksUndefined: Self = StObject.set(x, "generatedStandaloneApks", js.undefined)
    
    inline def setGeneratedStandaloneApksVarargs(value: SchemaGeneratedStandaloneApk*): Self = StObject.set(x, "generatedStandaloneApks", js.Array(value*))
    
    inline def setGeneratedUniversalApk(value: SchemaGeneratedUniversalApk): Self = StObject.set(x, "generatedUniversalApk", value.asInstanceOf[js.Any])
    
    inline def setGeneratedUniversalApkUndefined: Self = StObject.set(x, "generatedUniversalApk", js.undefined)
  }
}
