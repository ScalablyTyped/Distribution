package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOptions extends js.Object {
  /**
    * Whether objects should be deleted from the source after they are
    * transferred to the sink.  Note that this option and
    * `deleteObjectsUniqueInSink` are mutually exclusive.
    */
  var deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether objects that exist only in the sink should be deleted.  Note that
    * this option and `deleteObjectsFromSourceAfterTransfer` are mutually
    * exclusive.
    */
  var deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.undefined
  /** Whether overwriting objects that already exist in the sink is allowed. */
  var overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.undefined
}

object TransferOptions {
  @scala.inline
  def apply(
    deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.undefined,
    deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.undefined,
    overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.undefined
  ): TransferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteObjectsFromSourceAfterTransfer)) __obj.updateDynamic("deleteObjectsFromSourceAfterTransfer")(deleteObjectsFromSourceAfterTransfer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteObjectsUniqueInSink)) __obj.updateDynamic("deleteObjectsUniqueInSink")(deleteObjectsUniqueInSink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overwriteObjectsAlreadyExistingInSink)) __obj.updateDynamic("overwriteObjectsAlreadyExistingInSink")(overwriteObjectsAlreadyExistingInSink.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferOptions]
  }
}

