package typings.atFirebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseStorage.distSrcImplementationErrorMod.FirebaseStorageError
import typings.atFirebaseStorage.distSrcImplementationRequestinfoMod.UrlParams
import typings.atFirebaseStorage.distSrcImplementationXhrioMod.Headers
import typings.atFirebaseStorage.distSrcImplementationXhrioMod.XhrIo
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/requestinfo", JSImport.Namespace)
@js.native
object distSrcImplementationRequestinfoMod extends js.Object {
  @js.native
  class RequestInfo[T] protected () extends js.Object {
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
    handler: js.Function2[/* p1 */ XhrIo, /* p2 */ String, T],
      timeout: Double
    ) = this()
    var additionalRetryCodes: js.Array[Double] = js.native
    var body: Blob | String | Uint8Array | Null = js.native
    var errorHandler: (js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError]) | Null = js.native
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
    /**
      * Returns the value with which to resolve the request's promise. Only called
      * if the request is successful. Throw from this function to reject the
      * returned Request's promise with the thrown error.
      * Note: The XhrIo passed to this function may be reused after this callback
      * returns. Do not keep a reference to it in any way.
      */
    def handler(p1: XhrIo, p2: String): T = js.native
  }
  
  type UrlParams = StringDictionary[String | Double]
}

