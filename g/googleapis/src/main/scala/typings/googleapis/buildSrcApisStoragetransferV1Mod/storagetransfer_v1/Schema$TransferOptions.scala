package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TransferOptions uses three boolean parameters to define the actions to be
  * performed on objects in a transfer.
  */
@js.native
trait Schema$TransferOptions extends js.Object {
  /**
    * Whether objects should be deleted from the source after they are
    * transferred to the sink.  Note that this option and
    * `deleteObjectsUniqueInSink` are mutually exclusive.
    */
  var deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.native
  /**
    * Whether objects that exist only in the sink should be deleted.  Note that
    * this option and `deleteObjectsFromSourceAfterTransfer` are mutually
    * exclusive.
    */
  var deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.native
  /**
    * Whether overwriting objects that already exist in the sink is allowed.
    */
  var overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.native
}

object Schema$TransferOptions {
  @scala.inline
  def apply(
    deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.undefined,
    deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.undefined,
    overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.undefined
  ): Schema$TransferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteObjectsFromSourceAfterTransfer)) __obj.updateDynamic("deleteObjectsFromSourceAfterTransfer")(deleteObjectsFromSourceAfterTransfer.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteObjectsUniqueInSink)) __obj.updateDynamic("deleteObjectsUniqueInSink")(deleteObjectsUniqueInSink.asInstanceOf[js.Any])
    if (!js.isUndefined(overwriteObjectsAlreadyExistingInSink)) __obj.updateDynamic("overwriteObjectsAlreadyExistingInSink")(overwriteObjectsAlreadyExistingInSink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransferOptions]
  }
}

