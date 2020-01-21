package typings.firebaseFirestore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.pending
  - typings.firebaseFirestore.firebaseFirestoreStrings.acknowledged
  - typings.firebaseFirestore.firebaseFirestoreStrings.rejected
*/
trait MutationBatchState extends js.Object

object MutationBatchState {
  @scala.inline
  def acknowledged: typings.firebaseFirestore.firebaseFirestoreStrings.acknowledged = this.cast("acknowledged")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typings.firebaseFirestore.firebaseFirestoreStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typings.firebaseFirestore.firebaseFirestoreStrings.rejected = this.cast("rejected")
}

