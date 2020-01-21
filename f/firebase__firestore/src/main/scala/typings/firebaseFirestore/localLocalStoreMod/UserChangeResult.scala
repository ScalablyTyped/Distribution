package typings.firebaseFirestore.localLocalStoreMod

import typings.firebaseFirestore.coreTypesMod.BatchId
import typings.firebaseFirestore.modelCollectionsMod.MaybeDocumentMap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserChangeResult extends js.Object {
  val addedBatchIds: js.Array[BatchId]
  val affectedDocuments: MaybeDocumentMap_
  val removedBatchIds: js.Array[BatchId]
}

object UserChangeResult {
  @scala.inline
  def apply(
    addedBatchIds: js.Array[BatchId],
    affectedDocuments: MaybeDocumentMap_,
    removedBatchIds: js.Array[BatchId]
  ): UserChangeResult = {
    val __obj = js.Dynamic.literal(addedBatchIds = addedBatchIds.asInstanceOf[js.Any], affectedDocuments = affectedDocuments.asInstanceOf[js.Any], removedBatchIds = removedBatchIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserChangeResult]
  }
}

