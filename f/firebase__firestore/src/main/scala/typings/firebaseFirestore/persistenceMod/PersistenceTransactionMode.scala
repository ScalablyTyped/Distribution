package typings.firebaseFirestore.persistenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.readonly
  - typings.firebaseFirestore.firebaseFirestoreStrings.readwrite
  - typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary`
*/
trait PersistenceTransactionMode extends js.Object

object PersistenceTransactionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def readonly: typings.firebaseFirestore.firebaseFirestoreStrings.readonly = this.cast("readonly")
  @scala.inline
  def readwrite: typings.firebaseFirestore.firebaseFirestoreStrings.readwrite = this.cast("readwrite")
  @scala.inline
  def `readwrite-primary`: typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary` = this.cast("readwrite-primary")
}

