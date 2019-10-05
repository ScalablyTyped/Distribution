package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentsListResponse extends js.Object {
  /** Output only. The deployments contained in this response. */
  var deployments: js.UndefOr[js.Array[Deployment]] = js.undefined
  /** Output only. A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object DeploymentsListResponse {
  @scala.inline
  def apply(deployments: js.Array[Deployment] = null, nextPageToken: String = null): DeploymentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (deployments != null) __obj.updateDynamic("deployments")(deployments)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[DeploymentsListResponse]
  }
}

