package typings.atFirebaseFirestore.distSrcLocalLocalUnderscoreStoreMod

import typings.atFirebaseFirestore.distSrcCoreTypesMod.BatchId
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.MaybeDocumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalWriteResult extends js.Object {
  var batchId: BatchId
  var changes: MaybeDocumentMap
}

object LocalWriteResult {
  @scala.inline
  def apply(batchId: BatchId, changes: MaybeDocumentMap): LocalWriteResult = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocalWriteResult]
  }
}

