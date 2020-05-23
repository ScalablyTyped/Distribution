package typings.googleGax.grpcMod

import org.scalablytyped.runtime.Instantiable0
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleGax.anon.Encode
import typings.googleGax.gaxMod.ClientConfig
import typings.grpcGrpcJs.makeClientMod.GrpcObject
import typings.grpcProtoLoader.mod.Options
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/grpc", "GrpcClient")
@js.native
/**
  * A class which keeps the context of gRPC and auth for the gRPC.
  *
  * @param {Object=} options - The optional parameters. It will be directly
  *   passed to google-auth-library library, so parameters like keyFile or
  *   credentials will be valid.
  * @param {Object=} options.auth - An instance of google-auth-library.
  *   When specified, this auth instance will be used instead of creating
  *   a new one.
  * @param {Object=} options.grpc - When specified, this will be used
  *   for the 'grpc' module in this context. By default, it will load the grpc
  *   module in the standard way.
  * @param {Function=} options.promise - A constructor for a promise that
  * implements the ES6 specification of promise. If not provided, native
  * promises will be used.
  * @constructor
  */
class GrpcClient () extends js.Object {
  def this(options: GrpcClientOptions) = this()
  var auth: GoogleAuth = js.native
  var fallback: Boolean = js.native
  var grpc: GrpcModule = js.native
  var grpcVersion: String = js.native
  var promise: PromiseConstructor = js.native
  /**
    * Creates a gRPC credentials. It asks the auth data if necessary.
    * @private
    * @param {Object} opts - options values for configuring credentials.
    * @param {Object=} opts.sslCreds - when specified, this is used instead
    *   of default channel credentials.
    * @return {Promise} The promise which will be resolved to the gRPC credential.
    */
  def _getCredentials(opts: ClientStubOptions): js.Promise[_] = js.native
  /**
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
    * Creates a gRPC stub with current gRPC and auth.
    * @param {function} CreateStub - The constructor function of the stub.
    * @param {Object} options - The optional arguments to customize
    *   gRPC connection. This options will be passed to the constructor of
    *   gRPC client too.
    * @param {string} options.servicePath - The name of the server of the service.
    * @param {number} options.port - The port of the service.
    * @param {grpcTypes.ClientCredentials=} options.sslCreds - The credentials to be used
    *   to set up gRPC connection.
    * @return {Promise} A promise which resolves to a gRPC stub instance.
    */
  def createStub(CreateStub: Instantiable0[ClientStub], options: ClientStubOptions): js.Promise[ClientStub] = js.native
  /**
    * Loads the gRPC service from the proto file(s) at the given path and with the
    * given options.
    * @param filename The path to the proto file(s).
    * @param options Options for loading the proto file.
    */
  def loadFromProto(filename: String, options: Options): GrpcObject = js.native
  def loadFromProto(filename: js.Array[String], options: Options): GrpcObject = js.native
  /**
    * Load grpc proto service from a filename hooking in googleapis common protos
    * when necessary.
    * @param {String} protoPath - The directory to search for the protofile.
    * @param {String|String[]} filename - The filename(s) of the proto(s) to be loaded.
    *   If omitted, protoPath will be treated as a file path to load.
    * @return {Object<string, *>} The gRPC loaded result (the toplevel namespace
    *   object).
    */
  def loadProto(protoPath: String): GrpcObject = js.native
  def loadProto(protoPath: String, filename: String): GrpcObject = js.native
  def loadProto(protoPath: String, filename: js.Array[String]): GrpcObject = js.native
  def metadataBuilder(headers: OutgoingHttpHeaders): js.Function2[
    /* abTests */ js.UndefOr[js.Object], 
    /* moreHeaders */ js.UndefOr[OutgoingHttpHeaders], 
    typings.grpcGrpcJs.mod.Metadata
  ] = js.native
}

/* static members */
@JSImport("google-gax/build/src/grpc", "GrpcClient")
@js.native
object GrpcClient extends js.Object {
  def _resolveFile(protoPath: String, filename: String): String = js.native
  /**
    * Creates a 'bytelength' function for a given proto message class.
    *
    * See {@link BundleDescriptor} about the meaning of the return value.
    *
    * @param {function} message - a constructor function that is generated by
    *   protobuf.js. Assumes 'encoder' field in the message.
    * @return {function(Object):number} - a function to compute the byte length
    *   for an object.
    */
  def createByteLengthFunction(message: Encode): js.Function1[/* obj */ js.Object, Double] = js.native
}

