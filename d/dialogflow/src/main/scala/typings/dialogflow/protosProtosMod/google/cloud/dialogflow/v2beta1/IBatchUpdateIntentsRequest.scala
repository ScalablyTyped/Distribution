package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.protobuf.IFieldMask
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
  var intentView: js.UndefOr[IntentView | Null] = js.undefined
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
    intentView: IntentView = null,
    languageCode: String = null,
    parent: String = null,
    updateMask: IFieldMask = null
  ): IBatchUpdateIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (intentBatchInline != null) __obj.updateDynamic("intentBatchInline")(intentBatchInline)
    if (intentBatchUri != null) __obj.updateDynamic("intentBatchUri")(intentBatchUri)
    if (intentView != null) __obj.updateDynamic("intentView")(intentView)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask)
    __obj.asInstanceOf[IBatchUpdateIntentsRequest]
  }
}

