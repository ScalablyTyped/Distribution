package typings.googleCloudCommon.serviceMod

import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleCloudCommon.utilMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfig extends js.Object {
  /**
    * The API Endpoint to use when connecting to the service.
    * Example:  storage.googleapis.com
    */
  var apiEndpoint: String
  /**
    * Reuse an existing GoogleAuth client instead of creating a new one.
    */
  var authClient: js.UndefOr[GoogleAuth] = js.undefined
  /**
    * The base URL to make API requests to.
    */
  var baseUrl: String
  var packageJson: PackageJson
  var projectIdRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * The scopes required for the request.
    */
  var scopes: js.Array[String]
}

object ServiceConfig {
  @scala.inline
  def apply(
    apiEndpoint: String,
    baseUrl: String,
    packageJson: PackageJson,
    scopes: js.Array[String],
    authClient: GoogleAuth = null,
    projectIdRequired: js.UndefOr[Boolean] = js.undefined
  ): ServiceConfig = {
    val __obj = js.Dynamic.literal(apiEndpoint = apiEndpoint.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    if (authClient != null) __obj.updateDynamic("authClient")(authClient.asInstanceOf[js.Any])
    if (!js.isUndefined(projectIdRequired)) __obj.updateDynamic("projectIdRequired")(projectIdRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
}

