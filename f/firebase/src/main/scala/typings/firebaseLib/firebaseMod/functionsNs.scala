package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "functions")
@js.native
object functionsNs extends js.Object {
  trait ErrorStatus extends js.Object
  
  @js.native
  class Functions protected () extends js.Object {
    def httpsCallable(name: java.lang.String): firebaseLib.firebaseMod.firebaseNs.functionsNs.HttpsCallable = js.native
    def httpsCallable(
      name: java.lang.String,
      options: firebaseLib.firebaseMod.firebaseNs.functionsNs.HttpsCallableOptions
    ): firebaseLib.firebaseMod.firebaseNs.functionsNs.HttpsCallable = js.native
    def useFunctionsEmulator(url: java.lang.String): scala.Unit = js.native
  }
  
  trait HttpsCallableOptions extends js.Object {
    var timeout: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait HttpsCallableResult extends js.Object {
    val data: js.Any
  }
  
  trait HttpsError
    extends nodeLib.Error {
    val code: firebaseLib.firebaseMod.firebaseNs.functionsNs.ErrorStatus
    val details: js.UndefOr[js.Any] = js.undefined
  }
  
  type HttpsCallable = js.Function1[
    /* data */ js.UndefOr[js.Any], 
    js.Promise[firebaseLib.firebaseMod.firebaseNs.functionsNs.HttpsCallableResult]
  ]
}

