package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchUpdateIntentsRequest. */
trait IBatchUpdateIntentsRequest extends js.Object {
  /** BatchUpdateIntentsRequest intentBatchInline */
  var intentBatchInline: js.UndefOr[IIntentBatch | Null] = js.undefined
  /** BatchUpdateIntentsRequest intentBatchUri */
  var intentBatchUri: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateIntentsRequest intentView */
  var intentView: js.UndefOr[IntentView | String | Null] = js.undefined
  /** BatchUpdateIntentsRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateIntentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateIntentsRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IBatchUpdateIntentsRequest {
  @scala.inline
  def apply(
    intentBatchInline: IIntentBatch = null,
    intentBatchUri: String = null,
    intentView: IntentView | String = null,
    languageCode: String = null,
    parent: String = null,
    updateMask: IFieldMask = null
  ): IBatchUpdateIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (intentBatchInline != null) __obj.updateDynamic("intentBatchInline")(intentBatchInline.asInstanceOf[js.Any])
    if (intentBatchUri != null) __obj.updateDynamic("intentBatchUri")(intentBatchUri.asInstanceOf[js.Any])
    if (intentView != null) __obj.updateDynamic("intentView")(intentView.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchUpdateIntentsRequest]
  }
}

