package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListKnowledgeBasesResponse. */
trait IListKnowledgeBasesResponse extends js.Object {
  /** ListKnowledgeBasesResponse knowledgeBases */
  var knowledgeBases: js.UndefOr[js.Array[IKnowledgeBase] | Null] = js.undefined
  /** ListKnowledgeBasesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}

object IListKnowledgeBasesResponse {
  @scala.inline
  def apply(
    knowledgeBases: js.UndefOr[Null | js.Array[IKnowledgeBase]] = js.undefined,
    nextPageToken: js.UndefOr[Null | String] = js.undefined
  ): IListKnowledgeBasesResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(knowledgeBases)) __obj.updateDynamic("knowledgeBases")(knowledgeBases.asInstanceOf[js.Any])
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListKnowledgeBasesResponse]
  }
}

