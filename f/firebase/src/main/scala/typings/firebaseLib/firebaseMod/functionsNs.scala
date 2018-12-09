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
    def httpsCallable(name: java.lang.String): firebaseLib.firebaseMod.firebaseNs.functionsNs.HttpsCallable = js.native
    def useFunctionsEmulator(url: java.lang.String): scala.Unit = js.native
  }
  
  
  trait HttpsCallableResult extends js.Object {
    val data: js.Any
  }
  
  
  trait HttpsError
    extends nodeLib.Error {
    val code: firebaseLib.firebaseMod.firebaseNs.functionsNs.ErrorStatus
    val details: js.UndefOr[js.Any] = js.undefined
  }
  
  type ErrorStatus = firebaseLib.firebaseLibStrings.ok | firebaseLib.firebaseLibStrings.cancelled | firebaseLib.firebaseLibStrings.unknown | firebaseLib.firebaseLibStrings.`invalid-argument` | firebaseLib.firebaseLibStrings.`deadline-exceeded` | firebaseLib.firebaseLibStrings.`not-found` | firebaseLib.firebaseLibStrings.`already-exists` | firebaseLib.firebaseLibStrings.`permission-denied` | firebaseLib.firebaseLibStrings.`resource-exhausted` | firebaseLib.firebaseLibStrings.`failed-precondition` | firebaseLib.firebaseLibStrings.aborted | firebaseLib.firebaseLibStrings.`out-of-range` | firebaseLib.firebaseLibStrings.unimplemented | firebaseLib.firebaseLibStrings.internal | firebaseLib.firebaseLibStrings.unavailable | firebaseLib.firebaseLibStrings.`data-loss` | firebaseLib.firebaseLibStrings.unauthenticated
  type HttpsCallable = js.Function1[
    /* data */ js.UndefOr[js.Any], 
    js.Promise[firebaseLib.firebaseMod.firebaseNs.functionsNs.HttpsCallableResult]
  ]
}

