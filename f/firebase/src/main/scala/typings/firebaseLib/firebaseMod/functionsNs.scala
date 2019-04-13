package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "functions")
@js.native
object functionsNs extends js.Object {
  @js.native
  class Functions protected () extends js.Object {
    /**
      * Gets an `HttpsCallable` instance that refers to the function with the given
      * name.
      *
      * @param name The name of the https callable function.
      * @param options The options for this HttpsCallable instance.
      * @return The `HttpsCallable` instance.
      */
    def httpsCallable(name: java.lang.String): HttpsCallable = js.native
    def httpsCallable(name: java.lang.String, options: HttpsCallableOptions): HttpsCallable = js.native
    /**
      * Changes this instance to point to a Cloud Functions emulator running
      * locally. See https://firebase.google.com/docs/functions/local-emulator
      *
      * @param origin The origin of the local emulator, such as
      * "http://localhost:5005".
      */
    def useFunctionsEmulator(url: java.lang.String): scala.Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - firebaseLib.firebaseLibStrings.ok
    - firebaseLib.firebaseLibStrings.cancelled
    - firebaseLib.firebaseLibStrings.unknown
    - firebaseLib.firebaseLibStrings.`invalid-argument`
    - firebaseLib.firebaseLibStrings.`deadline-exceeded`
    - firebaseLib.firebaseLibStrings.`not-found`
    - firebaseLib.firebaseLibStrings.`already-exists`
    - firebaseLib.firebaseLibStrings.`permission-denied`
    - firebaseLib.firebaseLibStrings.`resource-exhausted`
    - firebaseLib.firebaseLibStrings.`failed-precondition`
    - firebaseLib.firebaseLibStrings.aborted
    - firebaseLib.firebaseLibStrings.`out-of-range`
    - firebaseLib.firebaseLibStrings.unimplemented
    - firebaseLib.firebaseLibStrings.internal
    - firebaseLib.firebaseLibStrings.unavailable
    - firebaseLib.firebaseLibStrings.`data-loss`
    - firebaseLib.firebaseLibStrings.unauthenticated
  */
  trait FunctionsErrorCode extends js.Object
  
  trait HttpsCallableOptions extends js.Object {
    var timeout: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait HttpsCallableResult extends js.Object {
    val data: js.Any
  }
  
  trait HttpsError
    extends stdLib.Error {
    /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    val code: FunctionsErrorCode
    /**
      * Extra data to be converted to JSON and included in the error response.
      */
    val details: js.UndefOr[js.Any] = js.undefined
  }
  
  type HttpsCallable = js.Function1[/* data */ js.UndefOr[js.Any], js.Promise[HttpsCallableResult]]
}

