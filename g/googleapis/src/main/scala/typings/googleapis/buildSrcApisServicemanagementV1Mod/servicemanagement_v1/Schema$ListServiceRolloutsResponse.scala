package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListServiceRollouts method.
  */
@js.native
trait Schema$ListServiceRolloutsResponse extends js.Object {
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of rollout resources.
    */
  var rollouts: js.UndefOr[js.Array[Schema$Rollout]] = js.native
}

object Schema$ListServiceRolloutsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, rollouts: js.Array[Schema$Rollout] = null): Schema$ListServiceRolloutsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (rollouts != null) __obj.updateDynamic("rollouts")(rollouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListServiceRolloutsResponse]
  }
}

