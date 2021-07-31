package typings.googleGax.fallbackMod

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleGax.anon.Auth
import typings.googleGax.gaxMod.ClientConfig
import typings.googleGax.grpcMod.ClientStubOptions
import typings.googleGax.grpcMod.GrpcClientOptions
import typings.node.httpMod.OutgoingHttpHeaders
import typings.protobufjs.mod.Root
import typings.protobufjs.mod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "GrpcClient")
@js.native
/**
  * gRPC-fallback version of GrpcClient
  * Implements GrpcClient API for a browser using grpc-fallback protocol (sends serialized protobuf to HTTP/1 $rpc endpoint).
  *
  * @param {Object=} options.auth - An instance of OAuth2Client to use in browser, or an instance of GoogleAuth from google-auth-library
  *  to use in Node.js. Required for browser, optional for Node.js.
  * @constructor
  */
class GrpcClient () extends StObject {
  def this(options: Auth) = this()
  def this(options: GrpcClientOptions) = this()
  
  var auth: js.UndefOr[OAuth2Client | GoogleAuth] = js.native
  
  var authClient: js.UndefOr[OAuth2Client | Compute | JWT | UserRefreshClient] = js.native
  
  /**
    * gRPC-fallback version of constructSettings
    * A wrapper of {@link constructSettings} function under the gRPC context.
    *
    * Most of parameters are common among constructSettings, please take a look.
    * @param {string} serviceName - The fullly-qualified name of the service.
    * @param {Object} clientConfig - A dictionary of the client config.
    * @param {Object} configOverrides - A dictionary of overriding configs.
    * @param {Object} headers - A dictionary of additional HTTP header name to
    *   its value.
    * @return {Object} A mapping of method names to CallSettings.
    */
  def constructSettings(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    headers: OutgoingHttpHeaders
  ): js.Any = js.native
  
  /**
    * gRPC-fallback version of createStub
    * Creates a gRPC-fallback stub with authentication headers built from supplied OAuth2Client instance
    *
    * @param {function} CreateStub - The constructor function of the stub.
    * @param {Object} service - A protobufjs Service object (as returned by lookupService)
    * @param {Object} opts - Connection options, as described below.
    * @param {string} opts.servicePath - The hostname of the API endpoint service.
    * @param {number} opts.port - The port of the service.
    * @return {Promise} A promise which resolves to a gRPC-fallback service stub, which is a protobuf.js service stub instance modified to match the gRPC stub API
    */
  def createStub(service: Service, opts: ClientStubOptions): js.Promise[FallbackServiceStub] = js.native
  
  var fallback: Boolean = js.native
  
  var getServiceMethods: js.Any = js.native
  
  var grpcVersion: String = js.native
  
  /**
    * gRPC-fallback version of loadProto
    * Loads the protobuf root object from a JSON object created from a proto file
    * @param {Object} jsonObject - A JSON version of a protofile created usin protobuf.js
    * @returns {Object} Root namespace of proto JSON
    */
  def loadProto(jsonObject: js.Object): Root = js.native
}
