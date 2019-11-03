package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  def apply(knowledgeBases: js.Array[IKnowledgeBase] = null, nextPageToken: String = null): IListKnowledgeBasesResponse = {
    val __obj = js.Dynamic.literal()
    if (knowledgeBases != null) __obj.updateDynamic("knowledgeBases")(knowledgeBases)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[IListKnowledgeBasesResponse]
  }
}

