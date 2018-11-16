package typings
package firebaseLib.firebaseMod.firebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object firestoreNs {
  type DocumentChangeType = firebaseLib.firebaseLibStrings.added | firebaseLib.firebaseLibStrings.removed | firebaseLib.firebaseLibStrings.modified
  type FirestoreErrorCode = firebaseLib.firebaseLibStrings.cancelled | firebaseLib.firebaseLibStrings.unknown | firebaseLib.firebaseLibStrings.`invalid-argument` | firebaseLib.firebaseLibStrings.`deadline-exceeded` | firebaseLib.firebaseLibStrings.`not-found` | firebaseLib.firebaseLibStrings.`already-exists` | firebaseLib.firebaseLibStrings.`permission-denied` | firebaseLib.firebaseLibStrings.`resource-exhausted` | firebaseLib.firebaseLibStrings.`failed-precondition` | firebaseLib.firebaseLibStrings.aborted | firebaseLib.firebaseLibStrings.`out-of-range` | firebaseLib.firebaseLibStrings.unimplemented | firebaseLib.firebaseLibStrings.internal | firebaseLib.firebaseLibStrings.unavailable | firebaseLib.firebaseLibStrings.`data-loss` | firebaseLib.firebaseLibStrings.unauthenticated
  type LogLevel = firebaseLib.firebaseLibStrings.debug | firebaseLib.firebaseLibStrings.error | firebaseLib.firebaseLibStrings.silent
  type OrderByDirection = firebaseLib.firebaseLibStrings.desc | firebaseLib.firebaseLibStrings.asc
  type WhereFilterOp = firebaseLib.firebaseLibStrings.`<` | firebaseLib.firebaseLibStrings.`<=` | firebaseLib.firebaseLibStrings.`==` | firebaseLib.firebaseLibStrings.`>=` | firebaseLib.firebaseLibStrings.`>` | firebaseLib.firebaseLibStrings.`array-contains`
}
