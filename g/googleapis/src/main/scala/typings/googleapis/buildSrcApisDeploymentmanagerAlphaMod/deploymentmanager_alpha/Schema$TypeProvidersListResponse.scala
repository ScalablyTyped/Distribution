package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response that returns all Type Providers supported by Deployment Manager
  */
@js.native
trait Schema$TypeProvidersListResponse extends js.Object {
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. A list of resource type providers supported by Deployment
    * Manager.
    */
  var typeProviders: js.UndefOr[js.Array[Schema$TypeProvider]] = js.native
}

object Schema$TypeProvidersListResponse {
  @scala.inline
  def apply(nextPageToken: String = null, typeProviders: js.Array[Schema$TypeProvider] = null): Schema$TypeProvidersListResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (typeProviders != null) __obj.updateDynamic("typeProviders")(typeProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TypeProvidersListResponse]
  }
}

