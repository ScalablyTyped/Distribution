package typings.firebaseStorage.storageMod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a fully specified request.
  *
  * @param I - the type of the backend's network response.
  * @param O - the output response type used by the rest of the SDK.
  */
trait RequestInfo2[I /* <: ConnectionType */, O] extends StObject {
  
  var additionalRetryCodes: js.Array[Double]
  
  var body: Blob | String | js.typedarray.Uint8Array | Null
  
  var errorHandler: ErrorHandler | Null
  
  /**
    * Returns the value with which to resolve the request's promise. Only called
    * if the request is successful. Throw from this function to reject the
    * returned Request's promise with the thrown error.
    * Note: The XhrIo passed to this function may be reused after this callback
    * returns. Do not keep a reference to it in any way.
    */
  def handler(connection: Connection[I], response: I): O
  /**
    * Returns the value with which to resolve the request's promise. Only called
    * if the request is successful. Throw from this function to reject the
    * returned Request's promise with the thrown error.
    * Note: The XhrIo passed to this function may be reused after this callback
    * returns. Do not keep a reference to it in any way.
    */
  @JSName("handler")
  var handler_Original: RequestHandler[I, O]
  
  var headers: Headers2
  
  var method: String
  
  /**
    * Called with the current number of bytes uploaded and total size (-1 if not
    * computable) of the request body (i.e. used to report upload progress).
    */
  var progressCallback: (js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]) | Null
  
  var successCodes: js.Array[Double]
  
  var timeout: Double
  
  var url: String
  
  var urlParams: UrlParams
}
object RequestInfo2 {
  
  inline def apply[I /* <: ConnectionType */, O](
    additionalRetryCodes: js.Array[Double],
    handler: (/* connection */ Connection[I], I) => O,
    headers: Headers2,
    method: String,
    successCodes: js.Array[Double],
    timeout: Double,
    url: String,
    urlParams: UrlParams
  ): RequestInfo2[I, O] = {
    val __obj = js.Dynamic.literal(additionalRetryCodes = additionalRetryCodes.asInstanceOf[js.Any], handler = js.Any.fromFunction2(handler), headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], successCodes = successCodes.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlParams = urlParams.asInstanceOf[js.Any], body = null, errorHandler = null, progressCallback = null)
    __obj.asInstanceOf[RequestInfo2[I, O]]
  }
  
  extension [Self <: RequestInfo2[?, ?], I /* <: ConnectionType */, O](x: Self & (RequestInfo2[I, O])) {
    
    inline def setAdditionalRetryCodes(value: js.Array[Double]): Self = StObject.set(x, "additionalRetryCodes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalRetryCodesVarargs(value: Double*): Self = StObject.set(x, "additionalRetryCodes", js.Array(value*))
    
    inline def setBody(value: Blob | String | js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setErrorHandler(
      value: (/* connection */ Connection[ConnectionType], /* response */ StorageError2) => StorageError2
    ): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
    
    inline def setErrorHandlerNull: Self = StObject.set(x, "errorHandler", null)
    
    inline def setHandler(value: (/* connection */ Connection[I], I) => O): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setHeaders(value: Headers2): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setProgressCallback(value: (/* p1 */ Double, /* p2 */ Double) => Unit): Self = StObject.set(x, "progressCallback", js.Any.fromFunction2(value))
    
    inline def setProgressCallbackNull: Self = StObject.set(x, "progressCallback", null)
    
    inline def setSuccessCodes(value: js.Array[Double]): Self = StObject.set(x, "successCodes", value.asInstanceOf[js.Any])
    
    inline def setSuccessCodesVarargs(value: Double*): Self = StObject.set(x, "successCodes", js.Array(value*))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlParams(value: UrlParams): Self = StObject.set(x, "urlParams", value.asInstanceOf[js.Any])
  }
}
