package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypesListResponse extends js.Object {
  /** A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Output only. A list of resource types supported by Deployment Manager. */
  var types: js.UndefOr[js.Array[Type]] = js.undefined
}

object TypesListResponse {
  @scala.inline
  def apply(nextPageToken: String = null, types: js.Array[Type] = null): TypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[TypesListResponse]
  }
}

