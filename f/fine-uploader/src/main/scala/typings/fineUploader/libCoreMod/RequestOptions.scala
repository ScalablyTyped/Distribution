package typings.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions extends StObject {
  
  /**
    * Additional headers sent along with each upload request
    */
  var customHeaders: js.UndefOr[Any] = js.undefined
  
  /**
    * The endpoint to send upload requests to
    *
    * @default `'/server/upload'`
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter passed if the original filename has been edited or a `Blob` is being sent
    *
    * @default `'qqfilename'`
    */
  var filenameParam: js.UndefOr[String] = js.undefined
  
  /**
    * Force all uploads to use multipart encoding
    *
    * @default `true`
    */
  var forceMultipart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The attribute of the input element which will contain the file name.
    *
    * For non-multipart-encoded upload requests, this will be included as a parameter in the query string of the URI with a value equal to the file name
    *
    * @default `'qqfile'`
    */
  var inputName: js.UndefOr[String] = js.undefined
  
  /**
    * Specify a method to use when sending files to a traditional endpoint. This option is ignored in older browsers (such as IE 9 and older)
    *
    * @default `'POST'`
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, any Fine Uploader created parameters (qq*) will not be sent with the upload request
    * 
    * @default `false`
    */
  var omitDefaultParams: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The parameters that shall be sent with each upload request
    */
  var params: js.UndefOr[Any] = js.undefined
  
  /**
    * Enable or disable sending parameters in the request body.
    *
    * If `false`, parameters are sent in the URL.
    * Otherwise, parameters are sent in the request body
    *
    * @default `true`
    */
  var paramsInBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, each upload response MUST contain a JSON message-body with `{success: true}` in order to be considered a success.
    * 
    * If set to false, the success of the request is determined by examining the response status code
    * 
    * @default `true`
    */
  var requireSuccessJson: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the parameter passed that specifies the total file size in bytes
    *
    * @default `'qqtotalfilesize'`
    */
  var totalFileSizeName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter the uniquely identifies each associated item. The value is a Level 4 UUID
    *
    * @default `'qquuid'`
    */
  var uuidName: js.UndefOr[String] = js.undefined
}
object RequestOptions {
  
  inline def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setCustomHeaders(value: Any): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setFilenameParam(value: String): Self = StObject.set(x, "filenameParam", value.asInstanceOf[js.Any])
    
    inline def setFilenameParamUndefined: Self = StObject.set(x, "filenameParam", js.undefined)
    
    inline def setForceMultipart(value: Boolean): Self = StObject.set(x, "forceMultipart", value.asInstanceOf[js.Any])
    
    inline def setForceMultipartUndefined: Self = StObject.set(x, "forceMultipart", js.undefined)
    
    inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOmitDefaultParams(value: Boolean): Self = StObject.set(x, "omitDefaultParams", value.asInstanceOf[js.Any])
    
    inline def setOmitDefaultParamsUndefined: Self = StObject.set(x, "omitDefaultParams", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsInBody(value: Boolean): Self = StObject.set(x, "paramsInBody", value.asInstanceOf[js.Any])
    
    inline def setParamsInBodyUndefined: Self = StObject.set(x, "paramsInBody", js.undefined)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRequireSuccessJson(value: Boolean): Self = StObject.set(x, "requireSuccessJson", value.asInstanceOf[js.Any])
    
    inline def setRequireSuccessJsonUndefined: Self = StObject.set(x, "requireSuccessJson", js.undefined)
    
    inline def setTotalFileSizeName(value: String): Self = StObject.set(x, "totalFileSizeName", value.asInstanceOf[js.Any])
    
    inline def setTotalFileSizeNameUndefined: Self = StObject.set(x, "totalFileSizeName", js.undefined)
    
    inline def setUuidName(value: String): Self = StObject.set(x, "uuidName", value.asInstanceOf[js.Any])
    
    inline def setUuidNameUndefined: Self = StObject.set(x, "uuidName", js.undefined)
  }
}
