package typings
package gapiDotClientDotDeploymentmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_DeploymentProjectPrettyPrintPreview extends js.Object {
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

