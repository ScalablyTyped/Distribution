package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with the list of deployments for the specified Apps Script
  * project.
  */
@js.native
trait Schema$ListDeploymentsResponse extends js.Object {
  /**
    * The list of deployments.
    */
  var deployments: js.UndefOr[js.Array[Schema$Deployment]] = js.native
  /**
    * The token that can be used in the next call to get the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDeploymentsResponse {
  @scala.inline
  def apply(deployments: js.Array[Schema$Deployment] = null, nextPageToken: String = null): Schema$ListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    if (deployments != null) __obj.updateDynamic("deployments")(deployments.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDeploymentsResponse]
  }
}

