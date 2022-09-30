package typings.googleGax

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleGax.anon.TypeofCallCredentials
import typings.googleGax.anon.TypeofChannelCredentials
import typings.googleGax.anon.TypeofMessage
import typings.googleGax.anon.TypeofMetadata
import typings.googleGax.anon.TypeofServerCredentials
import typings.googleGax.anon.Typeofcredentials
import typings.googleGax.anon.Typeofexperimental
import typings.googleGax.gaxMod.ClientConfig
import typings.googleGax.googleGaxStrings.proto
import typings.googleGax.googleGaxStrings.rest
import typings.googleGax.httpMod.google.api.IHttpRule
import typings.grpcGrpcJs.anon.PartialConsole
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.clientInterceptorsMod.InterceptingCallInterface
import typings.grpcGrpcJs.clientMod.ClientOptions
import typings.grpcGrpcJs.constantsMod.LogVerbosity
import typings.grpcGrpcJs.makeClientMod.GrpcObject
import typings.grpcGrpcJs.makeClientMod.PackageDefinition
import typings.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typings.grpcGrpcJs.mod.Client
import typings.grpcGrpcJs.srcServerMod.Server
import typings.grpcGrpcJs.v1ChannelzMod.ChannelzDefinition
import typings.grpcGrpcJs.v1ChannelzMod.ChannelzHandlers
import typings.grpcProtoLoader.utilMod.Options
import typings.node.httpMod.OutgoingHttpHeaders
import typings.protobufjs.mod.INamespace
import typings.protobufjs.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grpcMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @JSImport("google-gax/build/src/grpc", "ClientStub")
  @js.native
  open class ClientStub protected () extends Client {
    def this(address: String, credentials: ChannelCredentials) = this()
    def this(address: String, credentials: ChannelCredentials, options: ClientOptions) = this()
  }
  
  @JSImport("google-gax/build/src/grpc", "GoogleProtoFilesRoot")
  @js.native
  open class GoogleProtoFilesRoot protected () extends Root {
    def this(args: js.Object*) = this()
  }
  /* static members */
  object GoogleProtoFilesRoot {
    
    @JSImport("google-gax/build/src/grpc", "GoogleProtoFilesRoot")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _findIncludePath(originPath: String, includePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_findIncludePath")(originPath.asInstanceOf[js.Any], includePath.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
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
    * @constructor
    */
  open class GrpcClient () extends StObject {
    def this(options: GrpcClientOptions) = this()
    
    /**
      * Detect mTLS client certificate based on logic described in
      * https://google.aip.dev/auth/4114.
      *
      * @param {object} [options] - The configuration object.
      * @returns {Promise} Resolves array of strings representing cert and key.
      */
    def _detectClientCertificate(): js.Promise[js.Array[Any]] = js.native
    def _detectClientCertificate(opts: ClientOptions): js.Promise[js.Array[Any]] = js.native
    
    /**
      * Creates a gRPC credentials. It asks the auth data if necessary.
      * @private
      * @param {Object} opts - options values for configuring credentials.
      * @param {Object=} opts.sslCreds - when specified, this is used instead
      *   of default channel credentials.
      * @return {Promise} The promise which will be resolved to the gRPC credential.
      */
    def _getCredentials(opts: ClientStubOptions): js.Promise[typings.grpcGrpcJs.mod.ChannelCredentials] = js.native
    
    /**
      * Return service path, taking into account mTLS logic.
      * See: https://google.aip.dev/auth/4114
      *
      * @param {string|undefined} servicePath - The path of the service.
      * @param {string|undefined} customServicePath - Did the user provide a custom service URL.
      * @param {boolean} hasCertificate - Was a certificate found.
      * @returns {string} The DNS address for this service.
      */
    def _mtlsServicePath(servicePath: String, customServicePath: Boolean, hasCertificate: Boolean): js.UndefOr[String] = js.native
    def _mtlsServicePath(servicePath: String, customServicePath: Unit, hasCertificate: Boolean): js.UndefOr[String] = js.native
    def _mtlsServicePath(servicePath: Unit, customServicePath: Boolean, hasCertificate: Boolean): js.UndefOr[String] = js.native
    def _mtlsServicePath(servicePath: Unit, customServicePath: Unit, hasCertificate: Boolean): js.UndefOr[String] = js.native
    
    var auth: GoogleAuth[JSONClient] = js.native
    
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
    ): Any = js.native
    
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
      * @param {string} defaultServicePath - The default service path.
      * @return {Promise} A promise which resolves to a gRPC stub instance.
      */
    def createStub(CreateStub: Instantiable0[ClientStub], options: ClientStubOptions): js.Promise[ClientStub] = js.native
    def createStub(CreateStub: Instantiable0[ClientStub], options: ClientStubOptions, customServicePath: Boolean): js.Promise[ClientStub] = js.native
    
    var fallback: Boolean | rest | proto = js.native
    
    var grpc: GrpcModule = js.native
    
    var grpcVersion: String = js.native
    
    var httpRules: js.UndefOr[js.Array[IHttpRule]] = js.native
    
    /**
      * Loads the gRPC service from the proto file(s) at the given path and with the
      * given options. Caches the loaded protos so the subsequent loads don't do
      * any disk reads.
      * @param filename The path to the proto file(s).
      * @param options Options for loading the proto file.
      * @param ignoreCache Defaults to `false`. Set it to `true` if the caching logic
      *   incorrectly decides that the options object is the same, or if you want to
      *   re-read the protos from disk for any other reason.
      */
    def loadFromProto(filename: String, options: Options): GrpcObject = js.native
    def loadFromProto(filename: String, options: Options, ignoreCache: Boolean): GrpcObject = js.native
    def loadFromProto(filename: js.Array[String], options: Options): GrpcObject = js.native
    def loadFromProto(filename: js.Array[String], options: Options, ignoreCache: Boolean): GrpcObject = js.native
    
    /**
      * Load gRPC proto service from a filename looking in googleapis common protos
      * when necessary. Caches the loaded protos so the subsequent loads don't do
      * any disk reads.
      * @param {String} protoPath - The directory to search for the protofile.
      * @param {String|String[]} filename - The filename(s) of the proto(s) to be loaded.
      *   If omitted, protoPath will be treated as a file path to load.
      * @param ignoreCache Defaults to `false`. Set it to `true` if the caching logic
      *   incorrectly decides that the options object is the same, or if you want to
      *   re-read the protos from disk for any other reason.
      * @return {Object<string, *>} The gRPC loaded result (the toplevel namespace
      *   object).
      */
    def loadProto(protoPath: String): GrpcObject = js.native
    def loadProto(protoPath: String, filename: String): GrpcObject = js.native
    def loadProto(protoPath: String, filename: String, ignoreCache: Boolean): GrpcObject = js.native
    def loadProto(protoPath: String, filename: js.Array[String]): GrpcObject = js.native
    def loadProto(protoPath: String, filename: js.Array[String], ignoreCache: Boolean): GrpcObject = js.native
    def loadProto(protoPath: String, filename: Unit, ignoreCache: Boolean): GrpcObject = js.native
    
    def loadProtoJSON(json: INamespace): GrpcObject = js.native
    def loadProtoJSON(json: INamespace, ignoreCache: Boolean): GrpcObject = js.native
    
    def metadataBuilder(headers: OutgoingHttpHeaders): js.Function2[
        /* abTests */ js.UndefOr[js.Object], 
        /* moreHeaders */ js.UndefOr[OutgoingHttpHeaders], 
        typings.grpcGrpcJs.mod.Metadata
      ] = js.native
  }
  /* static members */
  object GrpcClient {
    
    @JSImport("google-gax/build/src/grpc", "GrpcClient")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _resolveFile(protoPath: String, filename: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_resolveFile")(protoPath.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * In rare cases users might need to deallocate all memory consumed by loaded protos.
      * This method will delete the proto cache content.
      */
    inline def clearProtoCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearProtoCache")().asInstanceOf[Unit]
    
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
    inline def createByteLengthFunction(message: TypeofMessage): js.Function1[/* obj */ js.Object, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createByteLengthFunction")(message.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Object, Double]]
    
    @JSImport("google-gax/build/src/grpc", "GrpcClient.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-gax/build/src/grpc", "GrpcClient.protoCache")
    @js.native
    def protoCache: Any = js.native
    
    /**
      * Key for proto cache map. We are doing our best to make sure we respect
      * the options, so if the same proto file is loaded with different set of
      * options, the cache won't be used.  Since some of the options are
      * Functions (e.g. `enums: String` - see below in `loadProto()`),
      * they will be omitted from the cache key.  If the cache breaks anything
      * for you, use the `ignoreCache` parameter of `loadProto()` to disable it.
      */
    @JSImport("google-gax/build/src/grpc", "GrpcClient.protoCacheKey")
    @js.native
    def protoCacheKey: Any = js.native
    inline def protoCacheKey_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protoCacheKey")(x.asInstanceOf[js.Any])
    
    inline def protoCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protoCache")(x.asInstanceOf[js.Any])
  }
  
  trait ClientStubOptions
    extends StObject
       with /* index */ StringDictionary[js.UndefOr[String | Double | js.Object]] {
    
    var cert: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var servicePath: js.UndefOr[String] = js.undefined
    
    var sslCreds: js.UndefOr[typings.grpcGrpcJs.mod.ChannelCredentials] = js.undefined
  }
  object ClientStubOptions {
    
    inline def apply(): ClientStubOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientStubOptions]
    }
    
    extension [Self <: ClientStubOptions](x: Self) {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
      
      inline def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
      
      inline def setSslCreds(value: typings.grpcGrpcJs.mod.ChannelCredentials): Self = StObject.set(x, "sslCreds", value.asInstanceOf[js.Any])
      
      inline def setSslCredsUndefined: Self = StObject.set(x, "sslCreds", js.undefined)
    }
  }
  
  trait GrpcClientOptions
    extends StObject
       with GoogleAuthOptions[JSONClient] {
    
    var auth: js.UndefOr[GoogleAuth[JSONClient]] = js.undefined
    
    var grpc: js.UndefOr[GrpcModule] = js.undefined
    
    var httpRules: js.UndefOr[js.Array[IHttpRule]] = js.undefined
    
    var numericEnums: js.UndefOr[Boolean] = js.undefined
    
    var protoJson: js.UndefOr[Root] = js.undefined
  }
  object GrpcClientOptions {
    
    inline def apply(): GrpcClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrpcClientOptions]
    }
    
    extension [Self <: GrpcClientOptions](x: Self) {
      
      inline def setAuth(value: GoogleAuth[JSONClient]): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setGrpc(value: GrpcModule): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
      
      inline def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
      
      inline def setHttpRules(value: js.Array[IHttpRule]): Self = StObject.set(x, "httpRules", value.asInstanceOf[js.Any])
      
      inline def setHttpRulesUndefined: Self = StObject.set(x, "httpRules", js.undefined)
      
      inline def setHttpRulesVarargs(value: IHttpRule*): Self = StObject.set(x, "httpRules", js.Array(value*))
      
      inline def setNumericEnums(value: Boolean): Self = StObject.set(x, "numericEnums", value.asInstanceOf[js.Any])
      
      inline def setNumericEnumsUndefined: Self = StObject.set(x, "numericEnums", js.undefined)
      
      inline def setProtoJson(value: Root): Self = StObject.set(x, "protoJson", value.asInstanceOf[js.Any])
      
      inline def setProtoJsonUndefined: Self = StObject.set(x, "protoJson", js.undefined)
    }
  }
  
  @js.native
  trait GrpcModule extends StObject {
    
    var CallCredentials: TypeofCallCredentials = js.native
    
    var Channel: Instantiable3[
        /* target */ String, 
        /* credentials */ ChannelCredentials, 
        /* options */ ChannelOptions, 
        typings.grpcGrpcJs.mod.Channel
      ] = js.native
    
    var ChannelCredentials: TypeofChannelCredentials = js.native
    
    var Client: Instantiable2[
        /* address */ String, 
        /* credentials */ ChannelCredentials, 
        typings.grpcGrpcJs.mod.Client
      ] = js.native
    
    var InterceptingCall: Instantiable1[/* nextCall */ InterceptingCallInterface, typings.grpcGrpcJs.mod.InterceptingCall] = js.native
    
    var InterceptorConfigurationError: Instantiable1[/* message */ String, typings.grpcGrpcJs.mod.InterceptorConfigurationError] = js.native
    
    var ListenerBuilder: Instantiable0[typings.grpcGrpcJs.mod.ListenerBuilder] = js.native
    
    var Metadata: TypeofMetadata = js.native
    
    var RequesterBuilder: Instantiable0[typings.grpcGrpcJs.mod.RequesterBuilder] = js.native
    
    var Server: Instantiable0[typings.grpcGrpcJs.mod.Server] = js.native
    
    var ServerCredentials: TypeofServerCredentials = js.native
    
    var StatusBuilder: Instantiable0[typings.grpcGrpcJs.mod.StatusBuilder] = js.native
    
    def addAdminServicesToServer(server: Server): Unit = js.native
    
    def closeClient(client: typings.grpcGrpcJs.clientMod.Client): Unit = js.native
    
    val credentials: Typeofcredentials = js.native
    
    val experimental: Typeofexperimental = js.native
    
    def getChannelzHandlers(): ChannelzHandlers = js.native
    
    def getChannelzServiceDefinition(): ChannelzDefinition = js.native
    
    def getClientChannel(client: typings.grpcGrpcJs.clientMod.Client): Channel = js.native
    
    def load(filename: Any, format: Any, options: Any): scala.Nothing = js.native
    
    def loadObject(value: Any, options: Any): scala.Nothing = js.native
    
    def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
    
    def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
    
    def setLogger(logger: PartialConsole): Unit = js.native
    
    def waitForClientReady(
      client: typings.grpcGrpcJs.clientMod.Client,
      deadline: js.Date,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def waitForClientReady(
      client: typings.grpcGrpcJs.clientMod.Client,
      deadline: Double,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Metadata
    extends StObject
       with Instantiable0[Metadata] {
    
    def get(key: js.Object): js.Object = js.native
    
    def set(key: js.Object): Unit = js.native
    def set(key: js.Object, value: js.Object): Unit = js.native
    
    var value: MetadataValue = js.native
  }
  
  trait MetadataValue extends StObject {
    
    @JSName("equals")
    var equals_FMetadataValue: js.Function
  }
  object MetadataValue {
    
    inline def apply(equals_ : js.Function): MetadataValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataValue]
    }
    
    extension [Self <: MetadataValue](x: Self) {
      
      inline def setEquals_(value: js.Function): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    }
  }
}
