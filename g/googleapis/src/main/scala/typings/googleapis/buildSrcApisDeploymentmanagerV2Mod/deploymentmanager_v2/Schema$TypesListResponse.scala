package typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response that returns all Types supported by Deployment Manager
  */
@js.native
trait Schema$TypesListResponse extends js.Object {
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. A list of resource types supported by Deployment Manager.
    */
  var types: js.UndefOr[js.Array[Schema$Type]] = js.native
}

object Schema$TypesListResponse {
  @scala.inline
  def apply(nextPageToken: String = null, types: js.Array[Schema$Type] = null): Schema$TypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TypesListResponse]
  }
}

