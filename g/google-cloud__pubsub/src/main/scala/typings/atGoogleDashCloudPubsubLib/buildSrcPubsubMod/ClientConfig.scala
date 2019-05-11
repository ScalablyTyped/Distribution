package typings
package atGoogleDashCloudPubsubLib.buildSrcPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig
  extends googleDashGaxLib.buildSrcGrpcMod.GrpcClientOptions {
  var apiEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var servicePath: js.UndefOr[java.lang.String] = js.undefined
  var sslCreds: js.UndefOr[grpcLib.grpcMod.ChannelCredentials] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    apiEndpoint: java.lang.String = null,
    auth: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth = null,
    clientOptions: googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod.JWTOptions | googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2ClientOptions | googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod.UserRefreshClientOptions = null,
    credentials: googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod.CredentialBody = null,
    grpc: googleDashGaxLib.buildSrcGrpcMod.GrpcModule = null,
    keyFile: java.lang.String = null,
    keyFilename: java.lang.String = null,
    port: java.lang.String | scala.Double = null,
    projectId: java.lang.String = null,
    promise: stdLib.PromiseConstructor = null,
    scopes: java.lang.String | js.Array[java.lang.String] = null,
    servicePath: java.lang.String = null,
    sslCreds: grpcLib.grpcMod.ChannelCredentials = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (grpc != null) __obj.updateDynamic("grpc")(grpc)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath)
    if (sslCreds != null) __obj.updateDynamic("sslCreds")(sslCreds)
    __obj.asInstanceOf[ClientConfig]
  }
}

