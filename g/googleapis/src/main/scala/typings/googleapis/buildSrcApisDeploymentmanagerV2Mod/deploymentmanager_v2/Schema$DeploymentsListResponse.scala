package typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing a partial list of deployments and a page token used
  * to build the next request if the request has been truncated.
  */
@js.native
trait Schema$DeploymentsListResponse extends js.Object {
  /**
    * Output only. The deployments contained in this response.
    */
  var deployments: js.UndefOr[js.Array[Schema$Deployment]] = js.native
  /**
    * Output only. A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$DeploymentsListResponse {
  @scala.inline
  def apply(deployments: js.Array[Schema$Deployment] = null, nextPageToken: String = null): Schema$DeploymentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (deployments != null) __obj.updateDynamic("deployments")(deployments.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeploymentsListResponse]
  }
}

