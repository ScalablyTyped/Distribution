package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateIntentsRequest extends js.Object {
  var intentBatchInline: js.UndefOr[IntentBatch] = js.undefined
  // Union field intent_batch can be only one of the following:
  var intentBatchUri: js.UndefOr[java.lang.String] = js.undefined
  var intentView: js.UndefOr[IntentView] = js.undefined
  // End of list of possible types for union field intent_batch.
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var parent: java.lang.String
  var updateMask: js.UndefOr[js.Any] = js.undefined
}

object BatchUpdateIntentsRequest {
  @scala.inline
  def apply(
    parent: java.lang.String,
    intentBatchInline: IntentBatch = null,
    intentBatchUri: java.lang.String = null,
    intentView: IntentView = null,
    languageCode: java.lang.String = null,
    updateMask: js.Any = null
  ): BatchUpdateIntentsRequest = {
    val __obj = js.Dynamic.literal(parent = parent)
    if (intentBatchInline != null) __obj.updateDynamic("intentBatchInline")(intentBatchInline)
    if (intentBatchUri != null) __obj.updateDynamic("intentBatchUri")(intentBatchUri)
    if (intentView != null) __obj.updateDynamic("intentView")(intentView)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask)
    __obj.asInstanceOf[BatchUpdateIntentsRequest]
  }
}

