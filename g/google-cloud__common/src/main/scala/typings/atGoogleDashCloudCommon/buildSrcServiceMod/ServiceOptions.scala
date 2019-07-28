package typings.atGoogleDashCloudCommon.buildSrcServiceMod

import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Interceptor
import typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typings.googleDashAuthDashLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.OAuth2ClientOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions extends GoogleAuthOptions {
  var email: js.UndefOr[String] = js.undefined
  var interceptors_ : js.UndefOr[js.Array[Interceptor]] = js.undefined
  var promise: js.UndefOr[PromiseConstructor] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object ServiceOptions {
  @scala.inline
  def apply(
    clientOptions: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions = null,
    credentials: CredentialBody = null,
    email: String = null,
    interceptors_ : js.Array[Interceptor] = null,
    keyFile: String = null,
    keyFilename: String = null,
    projectId: String = null,
    promise: PromiseConstructor = null,
    scopes: String | js.Array[String] = null,
    token: String = null
  ): ServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (email != null) __obj.updateDynamic("email")(email)
    if (interceptors_ != null) __obj.updateDynamic("interceptors_")(interceptors_)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[ServiceOptions]
  }
}

