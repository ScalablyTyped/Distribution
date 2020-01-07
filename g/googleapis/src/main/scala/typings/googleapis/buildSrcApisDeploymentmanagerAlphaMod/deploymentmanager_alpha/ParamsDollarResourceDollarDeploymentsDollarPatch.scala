package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarDeploymentsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Sets the policy to use for creating new resources.
    */
  var createPolicy: js.UndefOr[String] = js.native
  /**
    * Sets the policy to use for deleting resources.
    */
  var deletePolicy: js.UndefOr[String] = js.native
  /**
    * The name of the deployment for this request.
    */
  var deployment: js.UndefOr[String] = js.native
  /**
    * If set to true, updates the deployment and creates and updates the
    * "shell" resources but does not actually alter or instantiate these
    * resources. This allows you to preview what your deployment will look
    * like. You can use this intent to preview how an update would affect your
    * deployment. You must provide a target.config with a configuration if this
    * is set to true. After previewing a deployment, you can deploy your
    * resources by making a request with the update() or you can
    * cancelPreview() to remove the preview altogether. Note that the
    * deployment will still exist after you cancel the preview and you must
    * separately delete this deployment if you want to remove it.
    */
  var preview: js.UndefOr[Boolean] = js.native
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Deployment] = js.native
}

object ParamsDollarResourceDollarDeploymentsDollarPatch {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    createPolicy: String = null,
    deletePolicy: String = null,
    deployment: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    preview: js.UndefOr[Boolean] = js.undefined,
    project: String = null,
    quotaUser: String = null,
    requestBody: Schema$Deployment = null,
    userIp: String = null
  ): ParamsDollarResourceDollarDeploymentsDollarPatch = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (createPolicy != null) __obj.updateDynamic("createPolicy")(createPolicy.asInstanceOf[js.Any])
    if (deletePolicy != null) __obj.updateDynamic("deletePolicy")(deletePolicy.asInstanceOf[js.Any])
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarDeploymentsDollarPatch]
  }
}

