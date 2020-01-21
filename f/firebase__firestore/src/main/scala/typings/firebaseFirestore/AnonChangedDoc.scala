package typings.firebaseFirestore

import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangedDoc extends js.Object {
  var changedDoc: js.UndefOr[MaybeDocument] = js.undefined
  var readTime: SnapshotVersion
}

object AnonChangedDoc {
  @scala.inline
  def apply(readTime: SnapshotVersion, changedDoc: MaybeDocument = null): AnonChangedDoc = {
    val __obj = js.Dynamic.literal(readTime = readTime.asInstanceOf[js.Any])
    if (changedDoc != null) __obj.updateDynamic("changedDoc")(changedDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangedDoc]
  }
}

