package typings
package atGoogleDashCloudCommonLib.buildSrcServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfig extends js.Object {
  /**
    * Reuse an existing GoogleAuth client instead of creating a new one.
    */
  var authClient: js.UndefOr[googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth] = js.undefined
  /**
    * The base URL to make API requests to.
    */
  var baseUrl: java.lang.String
  var packageJson: atGoogleDashCloudCommonLib.buildSrcUtilMod.PackageJson
  var projectIdRequired: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The scopes required for the request.
    */
  var scopes: js.Array[java.lang.String]
}

object ServiceConfig {
  @scala.inline
  def apply(
    baseUrl: java.lang.String,
    packageJson: atGoogleDashCloudCommonLib.buildSrcUtilMod.PackageJson,
    scopes: js.Array[java.lang.String],
    authClient: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth = null,
    projectIdRequired: js.UndefOr[scala.Boolean] = js.undefined
  ): ServiceConfig = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl, packageJson = packageJson, scopes = scopes)
    if (authClient != null) __obj.updateDynamic("authClient")(authClient)
    if (!js.isUndefined(projectIdRequired)) __obj.updateDynamic("projectIdRequired")(projectIdRequired)
    __obj.asInstanceOf[ServiceConfig]
  }
}

