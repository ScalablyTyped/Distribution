package typings.atFirebaseFunctionsDashTypes.atFirebaseFunctionsDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/functions-types", "FirebaseFunctions")
@js.native
class FirebaseFunctions protected () extends js.Object {
  /**
    * Gets an `HttpsCallable` instance that refers to the function with the given
    * name.
    *
    * @param name The name of the https callable function.
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
  def useFunctionsEmulator(origin: String): Unit = js.native
}

