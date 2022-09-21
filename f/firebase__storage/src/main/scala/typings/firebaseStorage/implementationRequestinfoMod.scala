package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseStorage.implementationConnectionMod.Connection
import typings.firebaseStorage.implementationConnectionMod.ConnectionType
import typings.firebaseStorage.implementationConnectionMod.Headers
import typings.firebaseStorage.implementationErrorMod.StorageError
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationRequestinfoMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/requestinfo", "RequestInfo")
  @js.native
  open class RequestInfo[I /* <: ConnectionType */, O] protected () extends StObject {
    def this(
      url: String,
      method: String,
      /**
      * Returns the value with which to resolve the request's promise. Only called
      * if the request is successful. Throw from this function to reject the
      * returned Request's promise with the thrown error.
      * Note: The XhrIo passed to this function may be reused after this callback
      * returns. Do not keep a reference to it in any way.
      */
    handler: RequestHandler[I, O],
      timeout: Double
    ) = this()
    
    var additionalRetryCodes: js.Array[Double] = js.native
    
    var body: Blob | String | js.typedarray.Uint8Array | Null = js.native
    
    var errorHandler: ErrorHandler | Null = js.native
    
    /**
      * Returns the value with which to resolve the request's promise. Only called
      * if the request is successful. Throw from this function to reject the
      * returned Request's promise with the thrown error.
      * Note: The XhrIo passed to this function may be reused after this callback
      * returns. Do not keep a reference to it in any way.
      */
    def handler(connection: Connection[I], response: I): O = js.native
    /**
      * Returns the value with which to resolve the request's promise. Only called
      * if the request is successful. Throw from this function to reject the
      * returned Request's promise with the thrown error.
      * Note: The XhrIo passed to this function may be reused after this callback
      * returns. Do not keep a reference to it in any way.
      */
    @JSName("handler")
    var handler_Original: RequestHandler[I, O] = js.native
    
    var headers: Headers = js.native
    
    var method: String = js.native
    
    /**
      * Called with the current number of bytes uploaded and total size (-1 if not
      * computable) of the request body (i.e. used to report upload progress).
      */
    var progressCallback: (js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]) | Null = js.native
    
    var successCodes: js.Array[Double] = js.native
    
    var timeout: Double = js.native
    
    var url: String = js.native
    
    var urlParams: UrlParams = js.native
  }
  
  type ErrorHandler = js.Function2[
    /* connection */ Connection[ConnectionType], 
    /* response */ StorageError, 
    StorageError
  ]
  
  type RequestHandler[I /* <: ConnectionType */, O] = js.Function2[/* connection */ Connection[I], /* response */ I, O]
  
  type UrlParams = StringDictionary[String | Double]
}
