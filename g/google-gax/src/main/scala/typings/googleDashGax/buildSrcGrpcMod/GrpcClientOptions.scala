package typings.googleDashGax.buildSrcGrpcMod

import typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typings.googleDashAuthDashLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.OAuth2ClientOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrpcClientOptions extends GoogleAuthOptions {
  var auth: js.UndefOr[GoogleAuth] = js.undefined
  var grpc: js.UndefOr[GrpcModule] = js.undefined
  var promise: js.UndefOr[PromiseConstructor] = js.undefined
}

object GrpcClientOptions {
  @scala.inline
  def apply(
    auth: GoogleAuth = null,
    clientOptions: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions = null,
    credentials: CredentialBody = null,
    grpc: GrpcModule = null,
    keyFile: String = null,
    keyFilename: String = null,
    projectId: String = null,
    promise: PromiseConstructor = null,
    scopes: String | js.Array[String] = null
  ): GrpcClientOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (grpc != null) __obj.updateDynamic("grpc")(grpc.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcClientOptions]
  }
}

