package typings.atGoogleDashCloudPubsub.buildSrcPubsubMod

import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.ChannelCredentials
import typings.googleDashAuthDashLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.OAuth2ClientOptions
import typings.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth
import typings.googleDashGax.buildSrcGrpcMod.GrpcClientOptions
import typings.googleDashGax.buildSrcGrpcMod.GrpcModule
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends GrpcClientOptions {
  var apiEndpoint: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String | Double] = js.undefined
  var servicePath: js.UndefOr[String] = js.undefined
  var sslCreds: js.UndefOr[ChannelCredentials] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    apiEndpoint: String = null,
    auth: GoogleAuth = null,
    clientOptions: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions = null,
    credentials: CredentialBody = null,
    grpc: GrpcModule = null,
    keyFile: String = null,
    keyFilename: String = null,
    port: String | Double = null,
    projectId: String = null,
    promise: PromiseConstructor = null,
    scopes: String | js.Array[String] = null,
    servicePath: String = null,
    sslCreds: ChannelCredentials = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (grpc != null) __obj.updateDynamic("grpc")(grpc.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath.asInstanceOf[js.Any])
    if (sslCreds != null) __obj.updateDynamic("sslCreds")(sslCreds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}

