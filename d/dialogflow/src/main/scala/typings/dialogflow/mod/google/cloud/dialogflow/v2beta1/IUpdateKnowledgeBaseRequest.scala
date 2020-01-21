package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateKnowledgeBaseRequest. */
trait IUpdateKnowledgeBaseRequest extends js.Object {
  /** UpdateKnowledgeBaseRequest knowledgeBase */
  var knowledgeBase: js.UndefOr[IKnowledgeBase | Null] = js.undefined
  /** UpdateKnowledgeBaseRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateKnowledgeBaseRequest {
  @scala.inline
  def apply(knowledgeBase: IKnowledgeBase = null, updateMask: IFieldMask = null): IUpdateKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    if (knowledgeBase != null) __obj.updateDynamic("knowledgeBase")(knowledgeBase.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateKnowledgeBaseRequest]
  }
}

