package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteKnowledgeBaseRequest. */
trait IDeleteKnowledgeBaseRequest extends js.Object {
  /** DeleteKnowledgeBaseRequest force */
  var force: js.UndefOr[Boolean | Null] = js.undefined
  /** DeleteKnowledgeBaseRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IDeleteKnowledgeBaseRequest {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined, name: String = null): IDeleteKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteKnowledgeBaseRequest]
  }
}

