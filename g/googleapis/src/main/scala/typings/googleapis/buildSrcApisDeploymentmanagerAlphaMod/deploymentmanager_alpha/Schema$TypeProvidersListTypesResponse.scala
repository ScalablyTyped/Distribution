package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TypeProvidersListTypesResponse extends js.Object {
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. A list of resource type info.
    */
  var types: js.UndefOr[js.Array[Schema$TypeInfo]] = js.native
}

object Schema$TypeProvidersListTypesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, types: js.Array[Schema$TypeInfo] = null): Schema$TypeProvidersListTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TypeProvidersListTypesResponse]
  }
}

