package typings.dialogflow.mod.google.cloud.dialogflow.v2

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
  def apply(
    agents: js.UndefOr[Null | js.Array[IAgent]] = js.undefined,
    nextPageToken: js.UndefOr[Null | String] = js.undefined
  ): ISearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agents)) __obj.updateDynamic("agents")(agents.asInstanceOf[js.Any])
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchAgentsResponse]
  }
}

