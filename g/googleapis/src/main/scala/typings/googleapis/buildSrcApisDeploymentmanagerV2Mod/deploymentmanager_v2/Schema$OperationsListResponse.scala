package typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing a partial list of operations and a page token used to
  * build the next request if the request has been truncated.
  */
@js.native
trait Schema$OperationsListResponse extends js.Object {
  /**
    * Output only. A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. Operations contained in this list response.
    */
  var operations: js.UndefOr[js.Array[Schema$Operation]] = js.native
}

object Schema$OperationsListResponse {
  @scala.inline
  def apply(nextPageToken: String = null, operations: js.Array[Schema$Operation] = null): Schema$OperationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationsListResponse]
  }
}

