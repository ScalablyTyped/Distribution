package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMediaUpload
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The customer for which the file upload will apply.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleChromePolicyV1UploadPolicyFileRequest] = js.undefined
}
object ParamsResourceMediaUpload {
  
  inline def apply(): ParamsResourceMediaUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMediaUpload]
  }
  
  extension [Self <: ParamsResourceMediaUpload](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleChromePolicyV1UploadPolicyFileRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
