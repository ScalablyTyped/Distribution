package typings
package atGoogleDashCloudCommonLib.buildSrcServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions
  extends googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod.GoogleAuthOptions {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var `interceptors_`: js.UndefOr[js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Interceptor]] = js.undefined
  var promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceOptions {
  @scala.inline
  def apply(
    clientOptions: googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWTOptions | googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2ClientOptions | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClientOptions = null,
    credentials: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody = null,
    email: java.lang.String = null,
    `interceptors_`: js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Interceptor] = null,
    keyFile: java.lang.String = null,
    keyFilename: java.lang.String = null,
    projectId: java.lang.String = null,
    promise: stdLib.PromiseConstructor = null,
    scopes: java.lang.String | js.Array[java.lang.String] = null,
    token: java.lang.String = null
  ): ServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (email != null) __obj.updateDynamic("email")(email)
    if (`interceptors_` != null) __obj.updateDynamic("interceptors_")(`interceptors_`)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[ServiceOptions]
  }
}

