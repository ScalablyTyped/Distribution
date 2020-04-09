package typings.firebaseFirestore.simpleDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.readonly
  - typings.firebaseFirestore.firebaseFirestoreStrings.readwrite
*/
trait SimpleDbTransactionMode extends js.Object

object SimpleDbTransactionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def readonly: typings.firebaseFirestore.firebaseFirestoreStrings.readonly = this.cast("readonly")
  @scala.inline
  def readwrite: typings.firebaseFirestore.firebaseFirestoreStrings.readwrite = this.cast("readwrite")
}

