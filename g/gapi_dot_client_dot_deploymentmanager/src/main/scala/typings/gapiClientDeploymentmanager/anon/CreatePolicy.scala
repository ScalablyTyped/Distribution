package typings.gapiClientDeploymentmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicy extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Sets the policy to use for creating new resources. */
  var createPolicy: js.UndefOr[String] = js.undefined
  /** Sets the policy to use for deleting resources. */
  var deletePolicy: js.UndefOr[String] = js.undefined
  /** The name of the deployment for this request. */
  var deployment: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, updates the deployment and creates and updates the "shell" resources but does not actually alter or instantiate these resources. This
    * allows you to preview what your deployment will look like. You can use this intent to preview how an update would affect your deployment. You must
    * provide a target.config with a configuration if this is set to true. After previewing a deployment, you can deploy your resources by making a request
    * with the update() or you can cancelPreview() to remove the preview altogether. Note that the deployment will still exist after you cancel the preview
    * and you must separately delete this deployment if you want to remove it.
    */
  var preview: js.UndefOr[Boolean] = js.undefined
  /** The project ID for this request. */
  var project: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object CreatePolicy {
  @scala.inline
  def apply(
    deployment: String,
    project: String,
    alt: String = null,
    createPolicy: String = null,
    deletePolicy: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    preview: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): CreatePolicy = {
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (createPolicy != null) __obj.updateDynamic("createPolicy")(createPolicy.asInstanceOf[js.Any])
    if (deletePolicy != null) __obj.updateDynamic("deletePolicy")(deletePolicy.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicy]
  }
}

