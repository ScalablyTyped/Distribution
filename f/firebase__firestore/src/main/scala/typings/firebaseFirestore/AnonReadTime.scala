package typings.firebaseFirestore

import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.modelCollectionsMod.MaybeDocumentMap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadTime extends js.Object {
  var changedDocs: MaybeDocumentMap_
  var readTime: SnapshotVersion
}

object AnonReadTime {
  @scala.inline
  def apply(changedDocs: MaybeDocumentMap_, readTime: SnapshotVersion): AnonReadTime = {
    val __obj = js.Dynamic.literal(changedDocs = changedDocs.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReadTime]
  }
}

