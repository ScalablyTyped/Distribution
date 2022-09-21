package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1UploadPolicyFileRequest extends StObject {
  
  /**
    * Required. The fully qualified policy schema and field name this file is uploaded for. This information will be used to validate the content type of the file.
    */
  var policyField: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1UploadPolicyFileRequest {
  
  inline def apply(): SchemaGoogleChromePolicyV1UploadPolicyFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1UploadPolicyFileRequest]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1UploadPolicyFileRequest](x: Self) {
    
    inline def setPolicyField(value: String): Self = StObject.set(x, "policyField", value.asInstanceOf[js.Any])
    
    inline def setPolicyFieldNull: Self = StObject.set(x, "policyField", null)
    
    inline def setPolicyFieldUndefined: Self = StObject.set(x, "policyField", js.undefined)
  }
}
