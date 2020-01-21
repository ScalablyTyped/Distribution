package typings.firebaseFirestore.coreViewMod

import typings.firebaseFirestore.coreViewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewChange extends js.Object {
  var limboChanges: js.Array[LimboDocumentChange]
  var snapshot: js.UndefOr[ViewSnapshot] = js.undefined
}

object ViewChange {
  @scala.inline
  def apply(limboChanges: js.Array[LimboDocumentChange], snapshot: ViewSnapshot = null): ViewChange = {
    val __obj = js.Dynamic.literal(limboChanges = limboChanges.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewChange]
  }
}

