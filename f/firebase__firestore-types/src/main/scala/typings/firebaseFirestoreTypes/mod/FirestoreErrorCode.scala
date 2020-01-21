package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.cancelled
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.unknown
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`invalid-argument`
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`deadline-exceeded`
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`not-found`
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`already-exists`
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`permission-denied`
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`resource-exhausted`
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`failed-precondition`
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.aborted
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`out-of-range`
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.unimplemented
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.internal
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.unavailable
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`data-loss`
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.unauthenticated
*/
trait FirestoreErrorCode extends js.Object

object FirestoreErrorCode {
  @scala.inline
  def aborted: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.aborted = this.cast("aborted")
  @scala.inline
  def `already-exists`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`already-exists` = this.cast("already-exists")
  @scala.inline
  def cancelled: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `data-loss`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`data-loss` = this.cast("data-loss")
  @scala.inline
  def `deadline-exceeded`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`deadline-exceeded` = this.cast("deadline-exceeded")
  @scala.inline
  def `failed-precondition`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`failed-precondition` = this.cast("failed-precondition")
  @scala.inline
  def internal: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.internal = this.cast("internal")
  @scala.inline
  def `invalid-argument`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`invalid-argument` = this.cast("invalid-argument")
  @scala.inline
  def `not-found`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`not-found` = this.cast("not-found")
  @scala.inline
  def `out-of-range`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`out-of-range` = this.cast("out-of-range")
  @scala.inline
  def `permission-denied`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`permission-denied` = this.cast("permission-denied")
  @scala.inline
  def `resource-exhausted`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`resource-exhausted` = this.cast("resource-exhausted")
  @scala.inline
  def unauthenticated: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.unauthenticated = this.cast("unauthenticated")
  @scala.inline
  def unavailable: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unimplemented: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.unimplemented = this.cast("unimplemented")
  @scala.inline
  def unknown: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.unknown = this.cast("unknown")
}

