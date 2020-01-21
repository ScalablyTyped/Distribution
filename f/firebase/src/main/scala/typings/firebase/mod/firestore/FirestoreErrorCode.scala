package typings.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
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
trait FirestoreErrorCode extends js.Object

object FirestoreErrorCode {
  @scala.inline
  def aborted: typings.firebase.firebaseStrings.aborted = this.cast("aborted")
  @scala.inline
  def `already-exists`: typings.firebase.firebaseStrings.`already-exists` = this.cast("already-exists")
  @scala.inline
  def cancelled: typings.firebase.firebaseStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `data-loss`: typings.firebase.firebaseStrings.`data-loss` = this.cast("data-loss")
  @scala.inline
  def `deadline-exceeded`: typings.firebase.firebaseStrings.`deadline-exceeded` = this.cast("deadline-exceeded")
  @scala.inline
  def `failed-precondition`: typings.firebase.firebaseStrings.`failed-precondition` = this.cast("failed-precondition")
  @scala.inline
  def internal: typings.firebase.firebaseStrings.internal = this.cast("internal")
  @scala.inline
  def `invalid-argument`: typings.firebase.firebaseStrings.`invalid-argument` = this.cast("invalid-argument")
  @scala.inline
  def `not-found`: typings.firebase.firebaseStrings.`not-found` = this.cast("not-found")
  @scala.inline
  def `out-of-range`: typings.firebase.firebaseStrings.`out-of-range` = this.cast("out-of-range")
  @scala.inline
  def `permission-denied`: typings.firebase.firebaseStrings.`permission-denied` = this.cast("permission-denied")
  @scala.inline
  def `resource-exhausted`: typings.firebase.firebaseStrings.`resource-exhausted` = this.cast("resource-exhausted")
  @scala.inline
  def unauthenticated: typings.firebase.firebaseStrings.unauthenticated = this.cast("unauthenticated")
  @scala.inline
  def unavailable: typings.firebase.firebaseStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unimplemented: typings.firebase.firebaseStrings.unimplemented = this.cast("unimplemented")
  @scala.inline
  def unknown: typings.firebase.firebaseStrings.unknown = this.cast("unknown")
}

