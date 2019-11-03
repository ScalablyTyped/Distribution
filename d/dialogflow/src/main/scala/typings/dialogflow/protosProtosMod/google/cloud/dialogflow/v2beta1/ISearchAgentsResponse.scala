package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SearchAgentsResponse. */
trait ISearchAgentsResponse extends js.Object {
  /** SearchAgentsResponse agents */
  var agents: js.UndefOr[js.Array[IAgent] | Null] = js.undefined
  /** SearchAgentsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}

object ISearchAgentsResponse {
  @scala.inline
  def apply(agents: js.Array[IAgent] = null, nextPageToken: String = null): ISearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    if (agents != null) __obj.updateDynamic("agents")(agents)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ISearchAgentsResponse]
  }
}

