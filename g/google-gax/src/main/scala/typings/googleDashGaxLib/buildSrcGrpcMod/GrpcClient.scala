package typings
package googleDashGaxLib.buildSrcGrpcMod

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
  var auth: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth = js.native
  var grpc: GrpcModule = js.native
  var grpcProtoLoader: googleDashGaxLib.Anon_Filename = js.native
  var grpcVersion: java.lang.String = js.native
  var promise: stdLib.PromiseConstructor = js.native
  /**
    * Creates a gRPC credentials. It asks the auth data if necessary.
    * @private
    * @param {Object} opts - options values for configuring credentials.
    * @param {Object=} opts.sslCreds - when specified, this is used instead
    *   of default channel credentials.
    * @return {Promise} The promise which will be resolved to the gRPC credential.
    */
  def _getCredentials(opts: ClientStubOptions): js.Promise[grpcLib.grpcMod.ChannelCredentials] = js.native
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
    serviceName: java.lang.String,
    clientConfig: googleDashGaxLib.buildSrcGaxMod.ClientConfig,
    configOverrides: googleDashGaxLib.buildSrcGaxMod.ClientConfig,
    headers: nodeLib.httpMod.OutgoingHttpHeaders
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
    * @return {Promise} A promse which resolves to a gRPC stub instance.
    */
  def createStub(CreateStub: org.scalablytyped.runtime.Instantiable0[ClientStub], options: ClientStubOptions): js.Promise[ClientStub] = js.native
  /**
    * Loads the gRPC service from the proto file at the given path and with the
    * given options.
    * @param filename The path to the proto file.
    * @param options Options for loading the proto file.
    */
  def loadFromProto(filename: java.lang.String, options: atGrpcProtoDashLoaderLib.atGrpcProtoDashLoaderMod.Options): grpcLib.grpcMod.GrpcObject = js.native
  /**
    * Load grpc proto service from a filename hooking in googleapis common protos
    * when necessary. Can use either legacy grpc.loadProto, or new
    * @grpc/proto-loader, depending on which gRPC backend is used.
    * @param {String} protoPath - The directory to search for the protofile.
    * @param {String} filename - The filename of the proto to be loaded.
    * @return {Object<string, *>} The gRPC loaded result (the toplevel namespace
    *   object).
    */
  def loadProto(protoPath: java.lang.String, filename: java.lang.String): grpcLib.grpcMod.GrpcObject = js.native
  /**
    * Load grpc proto service from a filename hooking in googleapis common protos
    * when necessary. Uses the new shiny @grpc/proto-loader.
    * @param {String} protoPath - The directory to search for the protofile.
    * @param {String} filename - The filename of the proto to be loaded.
    * @return {Object<string, *>} The gRPC loaded result (the toplevel namespace
    *   object).
    */
  /* protected */ def loadProtoGrpcJs(protoPath: java.lang.String, filename: java.lang.String): grpcLib.grpcMod.GrpcObject = js.native
  /**
    * Load grpc proto service from a filename hooking in googleapis common protos
    * when necessary. Uses legacy grpc.loadObject.
    * @param {String} protoPath - The directory to search for the protofile.
    * @param {String} filename - The filename of the proto to be loaded.
    * @return {Object<string, *>} The gRPC loaded result (the toplevel namespace
    *   object).
    */
  /* protected */ def loadProtoLegacy(protoPath: java.lang.String, filename: java.lang.String): grpcLib.grpcMod.GrpcObject = js.native
  def metadataBuilder(headers: nodeLib.httpMod.OutgoingHttpHeaders): js.Function2[
    /* abTests */ js.UndefOr[js.Object], 
    /* moreHeaders */ js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders], 
    grpcLib.grpcMod.Metadata
  ] = js.native
}

/* static members */
@JSImport("google-gax/build/src/grpc", "GrpcClient")
@js.native
object GrpcClient extends js.Object {
  def _resolveFile(protoPath: java.lang.String, filename: java.lang.String): java.lang.String = js.native
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
  def createByteLengthFunction(message: googleDashGaxLib.Anon_Encode): js.Function1[/* obj */ js.Object, scala.Double] = js.native
}

