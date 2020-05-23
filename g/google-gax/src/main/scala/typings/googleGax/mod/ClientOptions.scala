package typings.googleGax.mod

import typings.googleAuthLibrary.credentialsMod.CredentialBody
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import typings.googleGax.gaxMod.ClientConfig
import typings.googleGax.grpcMod.ClientStubOptions
import typings.googleGax.grpcMod.GrpcClientOptions
import typings.googleGax.grpcMod.GrpcModule
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions
  extends GrpcClientOptions
     with ClientStubOptions {
  var apiEndpoint: js.UndefOr[String] = js.undefined
  var clientConfig: js.UndefOr[ClientConfig] = js.undefined
  var fallback: js.UndefOr[Boolean] = js.undefined
  var libName: js.UndefOr[String] = js.undefined
  var libVersion: js.UndefOr[String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    apiEndpoint: String = null,
    auth: typings.googleAuthLibrary.mod.GoogleAuth = null,
    clientConfig: ClientConfig = null,
    clientOptions: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions = null,
    credentials: CredentialBody = null,
    fallback: js.UndefOr[Boolean] = js.undefined,
    grpc: GrpcModule = null,
    keyFile: String = null,
    keyFilename: String = null,
    libName: String = null,
    libVersion: String = null,
    port: js.UndefOr[Double] = js.undefined,
    projectId: String = null,
    promise: PromiseConstructor = null,
    protocol: String = null,
    scopes: String | js.Array[String] = null,
    servicePath: String = null,
    sslCreds: js.Any = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (clientConfig != null) __obj.updateDynamic("clientConfig")(clientConfig.asInstanceOf[js.Any])
    if (clientOptions != null) __obj.updateDynamic("clientOptions")(clientOptions.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback.get.asInstanceOf[js.Any])
    if (grpc != null) __obj.updateDynamic("grpc")(grpc.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename.asInstanceOf[js.Any])
    if (libName != null) __obj.updateDynamic("libName")(libName.asInstanceOf[js.Any])
    if (libVersion != null) __obj.updateDynamic("libVersion")(libVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath.asInstanceOf[js.Any])
    if (sslCreds != null) __obj.updateDynamic("sslCreds")(sslCreds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

