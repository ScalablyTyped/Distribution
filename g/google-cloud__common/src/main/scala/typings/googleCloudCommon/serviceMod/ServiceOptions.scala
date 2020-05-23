package typings.googleCloudCommon.serviceMod

import typings.googleAuthLibrary.credentialsMod.CredentialBody
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import typings.googleCloudCommon.serviceObjectMod.Interceptor
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions extends GoogleAuthOptions {
  var email: js.UndefOr[String] = js.undefined
  var interceptors_ : js.UndefOr[js.Array[Interceptor]] = js.undefined
  var promise: js.UndefOr[PromiseConstructor] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
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
    timeout: js.UndefOr[Double] = js.undefined,
    token: String = null
  ): ServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (interceptors_ != null) __obj.updateDynamic("interceptors_")(interceptors_.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOptions]
  }
}

