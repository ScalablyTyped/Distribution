package typings
package firebaseLib.firebaseMod.firebaseNs.functionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functions extends js.Object {
  def httpsCallable(name: java.lang.String): HttpsCallable
  def useFunctionsEmulator(url: java.lang.String): scala.Unit
}

object Functions {
  @scala.inline
  def apply(
    httpsCallable: js.Function1[java.lang.String, HttpsCallable],
    useFunctionsEmulator: js.Function1[java.lang.String, scala.Unit]
  ): Functions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("httpsCallable")(httpsCallable)
    __obj.updateDynamic("useFunctionsEmulator")(useFunctionsEmulator)
    __obj.asInstanceOf[Functions]
  }
}

