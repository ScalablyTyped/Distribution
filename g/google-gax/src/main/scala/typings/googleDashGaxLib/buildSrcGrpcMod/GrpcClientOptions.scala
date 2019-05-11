package typings
package googleDashGaxLib.buildSrcGrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrpcClientOptions
  extends googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod.GoogleAuthOptions {
  var auth: js.UndefOr[googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth] = js.undefined
  var grpc: js.UndefOr[GrpcModule] = js.undefined
  var promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
}

object GrpcClientOptions {
  @scala.inline
  def apply(
    auth: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth = null,
    clientOptions: googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWTOptions | googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2ClientOptions | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClientOptions = null,
    credentials: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody = null,
    grpc: GrpcModule = null,
    keyFile: java.lang.String = null,
    keyFilename: java.lang.String = null,
    projectId: java.lang.String = null,
    promise: stdLib.PromiseConstructor = null,
    scopes: java.lang.String | js.Array[java.lang.String] = null
  ): GrpcClientOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (grpc != null) __obj.updateDynamic("grpc")(grpc)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcClientOptions]
  }
}

