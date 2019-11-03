package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  def apply(knowledgeBase: IKnowledgeBase = null, parent: String = null): ICreateKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    if (knowledgeBase != null) __obj.updateDynamic("knowledgeBase")(knowledgeBase)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ICreateKnowledgeBaseRequest]
  }
}

