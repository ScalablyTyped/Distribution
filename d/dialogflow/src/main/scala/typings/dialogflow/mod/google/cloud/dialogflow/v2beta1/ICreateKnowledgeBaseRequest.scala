package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateKnowledgeBaseRequest. */
trait ICreateKnowledgeBaseRequest extends js.Object {
  /** CreateKnowledgeBaseRequest knowledgeBase */
  var knowledgeBase: js.UndefOr[IKnowledgeBase | Null] = js.undefined
  /** CreateKnowledgeBaseRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object ICreateKnowledgeBaseRequest {
  @scala.inline
  def apply(
    knowledgeBase: js.UndefOr[Null | IKnowledgeBase] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): ICreateKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(knowledgeBase)) __obj.updateDynamic("knowledgeBase")(knowledgeBase.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateKnowledgeBaseRequest]
  }
}

