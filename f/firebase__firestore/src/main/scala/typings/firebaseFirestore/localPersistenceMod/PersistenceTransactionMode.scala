package typings.firebaseFirestore.localPersistenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.readonly
  - typings.firebaseFirestore.firebaseFirestoreStrings.readwrite
  - typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary`
  - typings.firebaseFirestore.firebaseFirestoreStrings.`readonly-idempotent`
  - typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-idempotent`
  - typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary-idempotent`
*/
trait PersistenceTransactionMode extends js.Object

object PersistenceTransactionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def readonly: typings.firebaseFirestore.firebaseFirestoreStrings.readonly = this.cast("readonly")
  @scala.inline
  def `readonly-idempotent`: typings.firebaseFirestore.firebaseFirestoreStrings.`readonly-idempotent` = this.cast("readonly-idempotent")
  @scala.inline
  def readwrite: typings.firebaseFirestore.firebaseFirestoreStrings.readwrite = this.cast("readwrite")
  @scala.inline
  def `readwrite-idempotent`: typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-idempotent` = this.cast("readwrite-idempotent")
  @scala.inline
  def `readwrite-primary`: typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary` = this.cast("readwrite-primary")
  @scala.inline
  def `readwrite-primary-idempotent`: typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary-idempotent` = this.cast("readwrite-primary-idempotent")
}

