package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1UploadPolicyFileResponse extends StObject {
  
  /**
    * The uri for end user to download the file.
    */
  var downloadUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1UploadPolicyFileResponse {
  
  inline def apply(): SchemaGoogleChromePolicyV1UploadPolicyFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1UploadPolicyFileResponse]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1UploadPolicyFileResponse](x: Self) {
    
    inline def setDownloadUri(value: String): Self = StObject.set(x, "downloadUri", value.asInstanceOf[js.Any])
    
    inline def setDownloadUriNull: Self = StObject.set(x, "downloadUri", null)
    
    inline def setDownloadUriUndefined: Self = StObject.set(x, "downloadUri", js.undefined)
  }
}
