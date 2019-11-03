package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListKnowledgeBasesRequest. */
trait IListKnowledgeBasesRequest extends js.Object {
  /** ListKnowledgeBasesRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListKnowledgeBasesRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListKnowledgeBasesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IListKnowledgeBasesRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null, parent: String = null): IListKnowledgeBasesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[IListKnowledgeBasesRequest]
  }
}

