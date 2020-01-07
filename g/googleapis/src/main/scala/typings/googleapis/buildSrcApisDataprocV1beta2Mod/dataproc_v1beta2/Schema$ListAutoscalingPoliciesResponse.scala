package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to a request to list autoscaling policies in a project.
  */
@js.native
trait Schema$ListAutoscalingPoliciesResponse extends js.Object {
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. Autoscaling policies list.
    */
  var policies: js.UndefOr[js.Array[Schema$AutoscalingPolicy]] = js.native
}

object Schema$ListAutoscalingPoliciesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, policies: js.Array[Schema$AutoscalingPolicy] = null): Schema$ListAutoscalingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAutoscalingPoliciesResponse]
  }
}

