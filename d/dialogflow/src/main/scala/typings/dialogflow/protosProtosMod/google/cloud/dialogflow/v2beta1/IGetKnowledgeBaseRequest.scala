package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetKnowledgeBaseRequest. */
trait IGetKnowledgeBaseRequest extends js.Object {
  /** GetKnowledgeBaseRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetKnowledgeBaseRequest {
  @scala.inline
  def apply(name: String = null): IGetKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IGetKnowledgeBaseRequest]
  }
}

