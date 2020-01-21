package typings.firebaseFirestore.coreEventManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenOptions extends js.Object {
  /** Raise events even when only the metadata changes */
  val includeMetadataChanges: js.UndefOr[Boolean] = js.undefined
  /**
    * Wait for a sync with the server when online, but still raise events while
    * offline.
    */
  val waitForSyncWhenOnline: js.UndefOr[Boolean] = js.undefined
}

object ListenOptions {
  @scala.inline
  def apply(
    includeMetadataChanges: js.UndefOr[Boolean] = js.undefined,
    waitForSyncWhenOnline: js.UndefOr[Boolean] = js.undefined
  ): ListenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeMetadataChanges)) __obj.updateDynamic("includeMetadataChanges")(includeMetadataChanges.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSyncWhenOnline)) __obj.updateDynamic("waitForSyncWhenOnline")(waitForSyncWhenOnline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenOptions]
  }
}

