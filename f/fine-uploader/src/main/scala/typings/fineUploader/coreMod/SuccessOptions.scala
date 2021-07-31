package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessOptions extends StObject {
  
  /**
    * Endpoint to send a POST after all chunks have been successfully uploaded for each file.
    *
    * Required if the `concurrent.enabled` option is set.
    * 
    * If a function value is provided, the file's ID will be passed when invoking the function
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Headers to send to with chunking success request. The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return null }`
    */
  var headers: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Send all parameters in the request body JSON-encoded. Otherwise params will be sent application/x-www-form-urlencoded
    * 
    * @default `false`
    */
  var jsonPayload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTTP method used when sending the success request
    * 
    * @default `POST`
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * Parameters to send in the message body of the success request.  The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return null }`
    */
  var params: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Fine Uploader will reset the file such that a retry will start at chunk 0 if the success response status matches any of the provided status codes
    * 
    * @default `[]`
    */
  var resetOnStatus: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object SuccessOptions {
  
  @scala.inline
  def apply(): SuccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessOptions]
  }
  
  @scala.inline
  implicit class SuccessOptionsMutableBuilder[Self <: SuccessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: String | js.Function): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Function): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setJsonPayload(value: Boolean): Self = StObject.set(x, "jsonPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonPayloadUndefined: Self = StObject.set(x, "jsonPayload", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setParams(value: js.Function): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setResetOnStatus(value: js.Array[js.Any]): Self = StObject.set(x, "resetOnStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnStatusUndefined: Self = StObject.set(x, "resetOnStatus", js.undefined)
    
    @scala.inline
    def setResetOnStatusVarargs(value: js.Any*): Self = StObject.set(x, "resetOnStatus", js.Array(value :_*))
  }
}
