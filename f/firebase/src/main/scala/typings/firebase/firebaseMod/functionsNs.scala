package typings.firebase.firebaseMod

import typings.firebase.firebaseMod.functionsNs.FunctionsErrorCode
import typings.firebase.firebaseMod.functionsNs.HttpsCallable
import typings.firebase.firebaseMod.functionsNs.HttpsCallableOptions
import typings.firebase.firebaseMod.functionsNs.HttpsCallableResult
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @webonly
  */
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
    def httpsCallable(name: String): HttpsCallable = js.native
    def httpsCallable(name: String, options: HttpsCallableOptions): HttpsCallable = js.native
    /**
      * Changes this instance to point to a Cloud Functions emulator running
      * locally. See https://firebase.google.com/docs/functions/local-emulator
      *
      * @param origin The origin of the local emulator, such as
      * "http://localhost:5005".
      */
    def useFunctionsEmulator(url: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebase.firebaseStrings.ok
    - typings.firebase.firebaseStrings.cancelled
    - typings.firebase.firebaseStrings.unknown
    - typings.firebase.firebaseStrings.`invalid-argument`
    - typings.firebase.firebaseStrings.`deadline-exceeded`
    - typings.firebase.firebaseStrings.`not-found`
    - typings.firebase.firebaseStrings.`already-exists`
    - typings.firebase.firebaseStrings.`permission-denied`
    - typings.firebase.firebaseStrings.`resource-exhausted`
    - typings.firebase.firebaseStrings.`failed-precondition`
    - typings.firebase.firebaseStrings.aborted
    - typings.firebase.firebaseStrings.`out-of-range`
    - typings.firebase.firebaseStrings.unimplemented
    - typings.firebase.firebaseStrings.internal
    - typings.firebase.firebaseStrings.unavailable
    - typings.firebase.firebaseStrings.`data-loss`
    - typings.firebase.firebaseStrings.unauthenticated
  */
  trait FunctionsErrorCode extends js.Object
  
  trait HttpsCallableOptions extends js.Object {
    var timeout: js.UndefOr[Double] = js.undefined
  }
  
  trait HttpsCallableResult extends js.Object {
    val data: js.Any
  }
  
  trait HttpsError extends Error {
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

