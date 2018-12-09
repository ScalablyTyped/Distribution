package typings
package firebaseLib.firebaseMod.firebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object functionsNs {
  type ErrorStatus = firebaseLib.firebaseLibStrings.ok | firebaseLib.firebaseLibStrings.cancelled | firebaseLib.firebaseLibStrings.unknown | firebaseLib.firebaseLibStrings.`invalid-argument` | firebaseLib.firebaseLibStrings.`deadline-exceeded` | firebaseLib.firebaseLibStrings.`not-found` | firebaseLib.firebaseLibStrings.`already-exists` | firebaseLib.firebaseLibStrings.`permission-denied` | firebaseLib.firebaseLibStrings.`resource-exhausted` | firebaseLib.firebaseLibStrings.`failed-precondition` | firebaseLib.firebaseLibStrings.aborted | firebaseLib.firebaseLibStrings.`out-of-range` | firebaseLib.firebaseLibStrings.unimplemented | firebaseLib.firebaseLibStrings.internal | firebaseLib.firebaseLibStrings.unavailable | firebaseLib.firebaseLibStrings.`data-loss` | firebaseLib.firebaseLibStrings.unauthenticated
  type HttpsCallable = js.Function1[/* data */ js.UndefOr[js.Any], js.Promise[HttpsCallableResult]]
}
