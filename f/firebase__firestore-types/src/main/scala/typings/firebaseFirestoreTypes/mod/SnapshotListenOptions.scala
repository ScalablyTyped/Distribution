package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotListenOptions extends js.Object {
  val includeMetadataChanges: js.UndefOr[Boolean] = js.undefined
}

object SnapshotListenOptions {
  @scala.inline
  def apply(includeMetadataChanges: js.UndefOr[Boolean] = js.undefined): SnapshotListenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeMetadataChanges)) __obj.updateDynamic("includeMetadataChanges")(includeMetadataChanges.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotListenOptions]
  }
}

