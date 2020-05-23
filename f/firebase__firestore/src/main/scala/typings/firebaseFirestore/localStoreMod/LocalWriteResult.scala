package typings.firebaseFirestore.localStoreMod

import typings.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typings.firebaseFirestore.typesMod.BatchId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalWriteResult extends js.Object {
  var batchId: BatchId
  var changes: MaybeDocumentMap_
}

object LocalWriteResult {
  @scala.inline
  def apply(batchId: BatchId, changes: MaybeDocumentMap_): LocalWriteResult = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalWriteResult]
  }
}

