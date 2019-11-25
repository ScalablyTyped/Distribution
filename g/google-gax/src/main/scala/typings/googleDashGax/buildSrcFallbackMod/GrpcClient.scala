package typings.googleDashGax.buildSrcFallbackMod

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import typings.googleDashGax.Anon_Auth
import typings.googleDashGax.buildSrcGaxMod.ClientConfig
import typings.googleDashGax.buildSrcGrpcMod.ClientStubOptions
import typings.googleDashGax.buildSrcGrpcMod.GrpcClientOptions
import typings.node.httpMod.OutgoingHttpHeaders
import typings.protobufjs.protobufjsMod.Root
import typings.protobufjs.protobufjsMod.Service
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "GrpcClient")
@js.native
/**
  * gRPC-fallback version of GrpcClient
  * Implements GrpcClient API for a browser using grpc-fallback protocol (sends serialized protobuf to HTTP/1 $rpc endpoint).
  *
  * @param {Object=} options.auth - An instance of OAuth2Client to use in browser, or an instance of GoogleAuth from google-auth-library
  *  to use in Node.js. Required for browser, optional for Node.js.
  * @param {Function=} options.promise - A constructor for a promise that
  * implements the ES6 specification of promise.
  * @constructor
  */
class GrpcClient () extends js.Object {
  def this(options: Anon_Auth) = this()
  def this(options: GrpcClientOptions) = this()
  var auth: js.UndefOr[OAuth2Client | GoogleAuth] = js.native
  var authClient: js.UndefOr[OAuth2Client | Compute | JWT | UserRefreshClient] = js.native
  var fallback: Boolean = js.native
  var getServiceMethods: js.Any = js.native
  var grpcVersion: String = js.native
  var promise: js.UndefOr[PromiseConstructor] = js.native
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
  def createStub(service: Service, opts: ClientStubOptions): js.Promise[typings.protobufjs.protobufjsMod.rpc.Service] = js.native
  /**
    * gRPC-fallback version of loadProto
    * Loads the protobuf root object from a JSON object created from a proto file
    * @param {Object} jsonObject - A JSON version of a protofile created usin protobuf.js
    * @returns {Object} Root namespace of proto JSON
    */
  def loadProto(jsonObject: js.Any): Root = js.native
}

