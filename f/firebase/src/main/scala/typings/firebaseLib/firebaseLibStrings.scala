package typings
package firebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object firebaseLibStrings {
  @js.native
  sealed trait `<`
    extends firebaseLib.firebaseMod.firestoreNs.WhereFilterOp
  
  @js.native
  sealed trait `<=`
    extends firebaseLib.firebaseMod.firestoreNs.WhereFilterOp
  
  @js.native
  sealed trait `==`
    extends firebaseLib.firebaseMod.firestoreNs.WhereFilterOp
  
  @js.native
  sealed trait `>`
    extends firebaseLib.firebaseMod.firestoreNs.WhereFilterOp
  
  @js.native
  sealed trait `>=`
    extends firebaseLib.firebaseMod.firestoreNs.WhereFilterOp
  
  @js.native
  sealed trait aborted
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait added
    extends firebaseLib.firebaseMod.firestoreNs.DocumentChangeType
  
  @js.native
  sealed trait `already-exists`
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait `array-contains`
    extends firebaseLib.firebaseMod.firestoreNs.WhereFilterOp
  
  @js.native
  sealed trait asc
    extends firebaseLib.firebaseMod.firestoreNs.OrderByDirection
  
  @js.native
  sealed trait cache extends js.Object
  
  @js.native
  sealed trait cancelled
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait child_added
    extends firebaseLib.firebaseMod.databaseNs.EventType
  
  @js.native
  sealed trait child_changed
    extends firebaseLib.firebaseMod.databaseNs.EventType
  
  @js.native
  sealed trait child_moved
    extends firebaseLib.firebaseMod.databaseNs.EventType
  
  @js.native
  sealed trait child_removed
    extends firebaseLib.firebaseMod.databaseNs.EventType
  
  @js.native
  sealed trait `data-loss`
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait `deadline-exceeded`
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait debug
    extends firebaseLib.firebaseMod.firestoreNs.LogLevel
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait desc
    extends firebaseLib.firebaseMod.firestoreNs.OrderByDirection
  
  @js.native
  sealed trait error
    extends firebaseLib.firebaseMod.firestoreNs.LogLevel
  
  @js.native
  sealed trait estimate extends js.Object
  
  @js.native
  sealed trait `failed-precondition`
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait internal
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait `invalid-argument`
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait modified
    extends firebaseLib.firebaseMod.firestoreNs.DocumentChangeType
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait `not-found`
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait ok
    extends firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait `out-of-range`
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait `permission-denied`
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait previous extends js.Object
  
  @js.native
  sealed trait removed
    extends firebaseLib.firebaseMod.firestoreNs.DocumentChangeType
  
  @js.native
  sealed trait `resource-exhausted`
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait server extends js.Object
  
  @js.native
  sealed trait silent
    extends firebaseLib.firebaseMod.firestoreNs.LogLevel
  
  @js.native
  sealed trait unauthenticated
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait unavailable
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait unimplemented
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait unknown
    extends firebaseLib.firebaseMod.firestoreNs.FirestoreErrorCode
       with firebaseLib.firebaseMod.functionsNs.FunctionsErrorCode
  
  @js.native
  sealed trait value
    extends firebaseLib.firebaseMod.databaseNs.EventType
  
  @scala.inline
  def `<`: `<` = "<".asInstanceOf[`<`]
  @scala.inline
  def `<=`: `<=` = "<=".asInstanceOf[`<=`]
  @scala.inline
  def `==`: `==` = "==".asInstanceOf[`==`]
  @scala.inline
  def `>`: `>` = ">".asInstanceOf[`>`]
  @scala.inline
  def `>=`: `>=` = ">=".asInstanceOf[`>=`]
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  @scala.inline
  def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  @scala.inline
  def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def cache: cache = "cache".asInstanceOf[cache]
  @scala.inline
  def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  @scala.inline
  def child_added: child_added = "child_added".asInstanceOf[child_added]
  @scala.inline
  def child_changed: child_changed = "child_changed".asInstanceOf[child_changed]
  @scala.inline
  def child_moved: child_moved = "child_moved".asInstanceOf[child_moved]
  @scala.inline
  def child_removed: child_removed = "child_removed".asInstanceOf[child_removed]
  @scala.inline
  def `data-loss`: `data-loss` = "data-loss".asInstanceOf[`data-loss`]
  @scala.inline
  def `deadline-exceeded`: `deadline-exceeded` = "deadline-exceeded".asInstanceOf[`deadline-exceeded`]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def estimate: estimate = "estimate".asInstanceOf[estimate]
  @scala.inline
  def `failed-precondition`: `failed-precondition` = "failed-precondition".asInstanceOf[`failed-precondition`]
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  @scala.inline
  def `invalid-argument`: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  @scala.inline
  def `out-of-range`: `out-of-range` = "out-of-range".asInstanceOf[`out-of-range`]
  @scala.inline
  def `permission-denied`: `permission-denied` = "permission-denied".asInstanceOf[`permission-denied`]
  @scala.inline
  def previous: previous = "previous".asInstanceOf[previous]
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  @scala.inline
  def `resource-exhausted`: `resource-exhausted` = "resource-exhausted".asInstanceOf[`resource-exhausted`]
  @scala.inline
  def server: server = "server".asInstanceOf[server]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  @scala.inline
  def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  @scala.inline
  def unimplemented: unimplemented = "unimplemented".asInstanceOf[unimplemented]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def value: value = "value".asInstanceOf[value]
}

