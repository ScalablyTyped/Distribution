package typings.firebaseFirestore

import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.modelDocumentMod.MaybeDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangedDocReadTime extends js.Object {
  var changedDoc: js.UndefOr[MaybeDocument] = js.undefined
  var readTime: SnapshotVersion
}

object AnonChangedDocReadTime {
  @scala.inline
  def apply(readTime: SnapshotVersion, changedDoc: MaybeDocument = null): AnonChangedDocReadTime = {
    val __obj = js.Dynamic.literal(readTime = readTime.asInstanceOf[js.Any])
    if (changedDoc != null) __obj.updateDynamic("changedDoc")(changedDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangedDocReadTime]
  }
}

