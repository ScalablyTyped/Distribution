package typings
package gapiDotClientDotDeploymentmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCreatePolicy extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the policy to use for creating new resources. */
  var createPolicy: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the policy to use for deleting resources. */
  var deletePolicy: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the deployment for this request. */
  var deployment: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, updates the deployment and creates and updates the "shell" resources but does not actually alter or instantiate these resources. This
    * allows you to preview what your deployment will look like. You can use this intent to preview how an update would affect your deployment. You must
    * provide a target.config with a configuration if this is set to true. After previewing a deployment, you can deploy your resources by making a request
    * with the update() or you can cancelPreview() to remove the preview altogether. Note that the deployment will still exist after you cancel the preview
    * and you must separately delete this deployment if you want to remove it.
    */
  var preview: js.UndefOr[scala.Boolean] = js.undefined
  /** The project ID for this request. */
  var project: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltCreatePolicy {
  @scala.inline
  def apply(
    deployment: java.lang.String,
    project: java.lang.String,
    alt: java.lang.String = null,
    createPolicy: java.lang.String = null,
    deletePolicy: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    preview: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltCreatePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deployment")(deployment)
    __obj.updateDynamic("project")(project)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (createPolicy != null) __obj.updateDynamic("createPolicy")(createPolicy)
    if (deletePolicy != null) __obj.updateDynamic("deletePolicy")(deletePolicy)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCreatePolicy]
  }
}

