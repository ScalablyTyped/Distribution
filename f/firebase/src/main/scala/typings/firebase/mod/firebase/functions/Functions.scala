package typings.firebase.mod.firebase.functions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Functions extends js.Object {
  
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
    * Modify this instance to communicate with the Cloud Functions emulator.
    *
    * Note: this must be called before this instance has been used to do any operations.
    *
    * @param host The emulator host (ex: localhost)
    * @param port The emulator port (ex: 5001)
    */
  def useEmulator(host: String, port: Double): Unit = js.native
  
  /**
    * Changes this instance to point to a Cloud Functions emulator running
    * locally. See https://firebase.google.com/docs/functions/local-emulator
    *
    * @deprecated Prefer the useEmulator(host, port) method.
    * @param origin The origin of the local emulator, such as
    * "http://localhost:5005".
    */
  def useFunctionsEmulator(url: String): Unit = js.native
}
