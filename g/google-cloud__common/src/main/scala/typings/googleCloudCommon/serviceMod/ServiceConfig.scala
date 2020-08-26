package typings.googleCloudCommon.serviceMod

import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleCloudCommon.utilMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfig extends js.Object {
  /**
    * The API Endpoint to use when connecting to the service.
    * Example:  storage.googleapis.com
    */
  var apiEndpoint: String = js.native
  /**
    * Reuse an existing GoogleAuth client instead of creating a new one.
    */
  var authClient: js.UndefOr[GoogleAuth] = js.native
  /**
    * The base URL to make API requests to.
    */
  var baseUrl: String = js.native
  var packageJson: PackageJson = js.native
  var projectIdRequired: js.UndefOr[Boolean] = js.native
  /**
    * The scopes required for the request.
    */
  var scopes: js.Array[String] = js.native
}

object ServiceConfig {
  @scala.inline
  def apply(apiEndpoint: String, baseUrl: String, packageJson: PackageJson, scopes: js.Array[String]): ServiceConfig = {
    val __obj = js.Dynamic.literal(apiEndpoint = apiEndpoint.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
  @scala.inline
  implicit class ServiceConfigOps[Self <: ServiceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiEndpoint(value: String): Self = this.set("apiEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageJson(value: PackageJson): Self = this.set("packageJson", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthClient(value: GoogleAuth): Self = this.set("authClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthClient: Self = this.set("authClient", js.undefined)
    @scala.inline
    def setProjectIdRequired(value: Boolean): Self = this.set("projectIdRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectIdRequired: Self = this.set("projectIdRequired", js.undefined)
  }
  
}

