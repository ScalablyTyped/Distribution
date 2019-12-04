package typings.atFirebaseFirestore.distSrcCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.pending
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.acknowledged
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.rejected
*/
trait MutationBatchState extends js.Object

object MutationBatchState {
  @scala.inline
  def acknowledged: typings.atFirebaseFirestore.atFirebaseFirestoreStrings.acknowledged = this.cast("acknowledged")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typings.atFirebaseFirestore.atFirebaseFirestoreStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typings.atFirebaseFirestore.atFirebaseFirestoreStrings.rejected = this.cast("rejected")
}

