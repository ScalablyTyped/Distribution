package typings.googleGax.mod

import typings.grpcGrpcJs.anon.PartialConsole
import typings.grpcGrpcJs.callCredentialsMod.CallMetadataGenerator
import typings.grpcGrpcJs.callCredentialsMod.OAuth2Client
import typings.grpcGrpcJs.channelCredentialsMod.VerifyOptions
import typings.grpcGrpcJs.channelMod.ConnectivityState
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.clientInterceptorsMod.InterceptingCallInterface
import typings.grpcGrpcJs.clientInterceptorsMod.Requester
import typings.grpcGrpcJs.clientMod.ClientOptions
import typings.grpcGrpcJs.constantsMod.LogVerbosity
import typings.grpcGrpcJs.constantsMod.Propagate
import typings.grpcGrpcJs.makeClientMod.GrpcObject
import typings.grpcGrpcJs.makeClientMod.PackageDefinition
import typings.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typings.grpcGrpcJs.metadataMod.MetadataOptions
import typings.grpcGrpcJs.serverCredentialsMod.KeyCertPair
import typings.node.Buffer
import typings.node.http2Mod.IncomingHttpHeaders
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grpc {
  
  @JSImport("google-gax", "grpc")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-gax", "grpc.CallCredentials")
  @js.native
  abstract class CallCredentials ()
    extends typings.grpcGrpcJs.mod.CallCredentials
  /* static members */
  object CallCredentials {
    
    @JSImport("google-gax", "grpc.CallCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createEmpty(): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[typings.grpcGrpcJs.callCredentialsMod.CallCredentials]
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredentials The authentication client to use.
      * @return The resulting CallCredentials object.
      */
    @scala.inline
    def createFromGoogleCredential(googleCredentials: OAuth2Client): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromGoogleCredential")(googleCredentials.asInstanceOf[js.Any]).asInstanceOf[typings.grpcGrpcJs.callCredentialsMod.CallCredentials]
    
    /**
      * Creates a new CallCredentials object from a given function that generates
      * Metadata objects.
      * @param metadataGenerator A function that accepts a set of options, and
      * generates a Metadata object based on these options, which is passed back
      * to the caller via a supplied (err, metadata) callback.
      */
    @scala.inline
    def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromMetadataGenerator")(metadataGenerator.asInstanceOf[js.Any]).asInstanceOf[typings.grpcGrpcJs.callCredentialsMod.CallCredentials]
  }
  
  @JSImport("google-gax", "grpc.Channel")
  @js.native
  class Channel protected ()
    extends typings.grpcGrpcJs.mod.Channel {
    def this(
      target: String,
      credentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      options: ChannelOptions
    ) = this()
  }
  
  @JSImport("google-gax", "grpc.ChannelCredentials")
  @js.native
  abstract class ChannelCredentials protected ()
    extends typings.grpcGrpcJs.mod.ChannelCredentials {
    protected def this(callCredentials: typings.grpcGrpcJs.callCredentialsMod.CallCredentials) = this()
  }
  /* static members */
  object ChannelCredentials {
    
    @JSImport("google-gax", "grpc.ChannelCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return a new ChannelCredentials instance with no credentials.
      */
    @scala.inline
    def createInsecure(): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials]
    
    /**
      * Return a new ChannelCredentials instance with a given set of credentials.
      * The resulting instance can be used to construct a Channel that communicates
      * over TLS.
      * @param rootCerts The root certificate data.
      * @param privateKey The client certificate private key, if available.
      * @param certChain The client certificate key chain, if available.
      */
    @scala.inline
    def createSsl(
      rootCerts: js.UndefOr[Buffer | Null],
      privateKey: js.UndefOr[Buffer | Null],
      certChain: js.UndefOr[Buffer | Null],
      verifyOptions: js.UndefOr[VerifyOptions]
    ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials]
  }
  
  @JSImport("google-gax", "grpc.Client")
  @js.native
  class Client protected ()
    extends typings.grpcGrpcJs.mod.Client {
    def this(address: String, credentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials) = this()
    def this(
      address: String,
      credentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      options: ClientOptions
    ) = this()
  }
  
  @JSImport("google-gax", "grpc.InterceptingCall")
  @js.native
  class InterceptingCall protected ()
    extends typings.grpcGrpcJs.mod.InterceptingCall {
    def this(nextCall: InterceptingCallInterface) = this()
    def this(nextCall: InterceptingCallInterface, requester: Requester) = this()
  }
  
  @JSImport("google-gax", "grpc.InterceptorConfigurationError")
  @js.native
  class InterceptorConfigurationError protected ()
    extends typings.grpcGrpcJs.mod.InterceptorConfigurationError {
    def this(message: String) = this()
  }
  
  @JSImport("google-gax", "grpc.ListenerBuilder")
  @js.native
  class ListenerBuilder ()
    extends typings.grpcGrpcJs.mod.ListenerBuilder
  
  @JSImport("google-gax", "grpc.Metadata")
  @js.native
  class Metadata ()
    extends typings.grpcGrpcJs.mod.Metadata {
    def this(options: MetadataOptions) = this()
  }
  /* static members */
  object Metadata {
    
    @JSImport("google-gax", "grpc.Metadata")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Metadata object based fields in a given IncomingHttpHeaders
      * object.
      * @param headers An IncomingHttpHeaders object.
      */
    @scala.inline
    def fromHttp2Headers(headers: IncomingHttpHeaders): typings.grpcGrpcJs.metadataMod.Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHttp2Headers")(headers.asInstanceOf[js.Any]).asInstanceOf[typings.grpcGrpcJs.metadataMod.Metadata]
  }
  
  @JSImport("google-gax", "grpc.RequesterBuilder")
  @js.native
  class RequesterBuilder ()
    extends typings.grpcGrpcJs.mod.RequesterBuilder
  
  @JSImport("google-gax", "grpc.Server")
  @js.native
  class Server ()
    extends typings.grpcGrpcJs.mod.Server {
    def this(options: ChannelOptions) = this()
  }
  
  @JSImport("google-gax", "grpc.ServerCredentials")
  @js.native
  abstract class ServerCredentials ()
    extends typings.grpcGrpcJs.mod.ServerCredentials
  /* static members */
  object ServerCredentials {
    
    @JSImport("google-gax", "grpc.ServerCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createInsecure(): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials]
    
    @scala.inline
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials]
    @scala.inline
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any], checkClientCertificate.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials]
    @scala.inline
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials]
    @scala.inline
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any], checkClientCertificate.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials]
  }
  
  @JSImport("google-gax", "grpc.StatusBuilder")
  @js.native
  class StatusBuilder ()
    extends typings.grpcGrpcJs.mod.StatusBuilder
  
  @scala.inline
  def closeClient(client: typings.grpcGrpcJs.clientMod.Client): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeClient")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("google-gax", "grpc.connectivityState")
  @js.native
  object connectivityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConnectivityState & Double] = js.native
    
    /* 0 */ val CONNECTING: typings.grpcGrpcJs.channelMod.ConnectivityState.CONNECTING & Double = js.native
    
    /* 3 */ val IDLE: typings.grpcGrpcJs.channelMod.ConnectivityState.IDLE & Double = js.native
    
    /* 1 */ val READY: typings.grpcGrpcJs.channelMod.ConnectivityState.READY & Double = js.native
    
    /* 4 */ val SHUTDOWN: typings.grpcGrpcJs.channelMod.ConnectivityState.SHUTDOWN & Double = js.native
    
    /* 2 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.channelMod.ConnectivityState.TRANSIENT_FAILURE & Double = js.native
  }
  
  object credentials {
    
    @JSImport("google-gax", "grpc.credentials")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combine any number of CallCredentials into a single CallCredentials
      * object.
      * @param first The first CallCredentials object.
      * @param additional Any number of additional CallCredentials objects.
      * @return The resulting CallCredentials object.
      */
    @scala.inline
    def combineCallCredentials(
      first: typings.grpcGrpcJs.callCredentialsMod.CallCredentials,
      additional: typings.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("combineCallCredentials")(first.asInstanceOf[js.Any], additional.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.callCredentialsMod.CallCredentials]
    
    /**
      * Combine a ChannelCredentials with any number of CallCredentials into a
      * single ChannelCredentials object.
      * @param channelCredentials The ChannelCredentials object.
      * @param callCredentials Any number of CallCredentials objects.
      * @return The resulting ChannelCredentials object.
      */
    @scala.inline
    def combineChannelCredentials(
      channelCredentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      callCredentials: typings.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("combineChannelCredentials")(channelCredentials.asInstanceOf[js.Any], callCredentials.asInstanceOf[js.Any])).asInstanceOf[typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials]
    
    @JSImport("google-gax", "grpc.credentials.createEmpty")
    @js.native
    def createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any = js.native
    @scala.inline
    def createEmpty_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createEmpty")(x.asInstanceOf[js.Any])
    
    @JSImport("google-gax", "grpc.credentials.createFromGoogleCredential")
    @js.native
    def createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any = js.native
    @scala.inline
    def createFromGoogleCredential_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFromGoogleCredential")(x.asInstanceOf[js.Any])
    
    @JSImport("google-gax", "grpc.credentials.createFromMetadataGenerator")
    @js.native
    def createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any = js.native
    @scala.inline
    def createFromMetadataGenerator_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFromMetadataGenerator")(x.asInstanceOf[js.Any])
    
    @JSImport("google-gax", "grpc.credentials.createInsecure")
    @js.native
    def createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any = js.native
    @scala.inline
    def createInsecure_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createInsecure")(x.asInstanceOf[js.Any])
    
    @JSImport("google-gax", "grpc.credentials.createSsl")
    @js.native
    def createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any = js.native
    @scala.inline
    def createSsl_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSsl")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getClientChannel(client: typings.grpcGrpcJs.clientMod.Client): typings.grpcGrpcJs.channelMod.Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientChannel")(client.asInstanceOf[js.Any]).asInstanceOf[typings.grpcGrpcJs.channelMod.Channel]
  
  @scala.inline
  def load(filename: js.Any, format: js.Any, options: js.Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def loadObject(value: js.Any, options: js.Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("loadObject")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPackageDefinition")(packageDef.asInstanceOf[js.Any]).asInstanceOf[GrpcObject]
  
  @JSImport("google-gax", "grpc.logVerbosity")
  @js.native
  object logVerbosity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogVerbosity & Double] = js.native
    
    /* 0 */ val DEBUG: typings.grpcGrpcJs.constantsMod.LogVerbosity.DEBUG & Double = js.native
    
    /* 2 */ val ERROR: typings.grpcGrpcJs.constantsMod.LogVerbosity.ERROR & Double = js.native
    
    /* 1 */ val INFO: typings.grpcGrpcJs.constantsMod.LogVerbosity.INFO & Double = js.native
  }
  
  @scala.inline
  def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  @scala.inline
  def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], classOptions.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  
  @scala.inline
  def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeGenericClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  @scala.inline
  def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeGenericClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], classOptions.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  
  @JSImport("google-gax", "grpc.propagate")
  @js.native
  object propagate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Propagate & Double] = js.native
    
    /* 8 */ val CANCELLATION: typings.grpcGrpcJs.constantsMod.Propagate.CANCELLATION & Double = js.native
    
    /* 2 */ val CENSUS_STATS_CONTEXT: typings.grpcGrpcJs.constantsMod.Propagate.CENSUS_STATS_CONTEXT & Double = js.native
    
    /* 4 */ val CENSUS_TRACING_CONTEXT: typings.grpcGrpcJs.constantsMod.Propagate.CENSUS_TRACING_CONTEXT & Double = js.native
    
    /* 1 */ val DEADLINE: typings.grpcGrpcJs.constantsMod.Propagate.DEADLINE & Double = js.native
    
    /* 65536 */ val DEFAULTS: typings.grpcGrpcJs.constantsMod.Propagate.DEFAULTS & Double = js.native
  }
  
  @scala.inline
  def setLogVerbosity(verbosity: LogVerbosity): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogVerbosity")(verbosity.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setLogger(logger: PartialConsole): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("google-gax", "grpc.status")
  @js.native
  object status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.grpcGrpcJs.constantsMod.Status & Double] = js.native
    
    /* 10 */ val ABORTED: typings.grpcGrpcJs.constantsMod.Status.ABORTED & Double = js.native
    
    /* 6 */ val ALREADY_EXISTS: typings.grpcGrpcJs.constantsMod.Status.ALREADY_EXISTS & Double = js.native
    
    /* 1 */ val CANCELLED: typings.grpcGrpcJs.constantsMod.Status.CANCELLED & Double = js.native
    
    /* 15 */ val DATA_LOSS: typings.grpcGrpcJs.constantsMod.Status.DATA_LOSS & Double = js.native
    
    /* 4 */ val DEADLINE_EXCEEDED: typings.grpcGrpcJs.constantsMod.Status.DEADLINE_EXCEEDED & Double = js.native
    
    /* 9 */ val FAILED_PRECONDITION: typings.grpcGrpcJs.constantsMod.Status.FAILED_PRECONDITION & Double = js.native
    
    /* 13 */ val INTERNAL: typings.grpcGrpcJs.constantsMod.Status.INTERNAL & Double = js.native
    
    /* 3 */ val INVALID_ARGUMENT: typings.grpcGrpcJs.constantsMod.Status.INVALID_ARGUMENT & Double = js.native
    
    /* 5 */ val NOT_FOUND: typings.grpcGrpcJs.constantsMod.Status.NOT_FOUND & Double = js.native
    
    /* 0 */ val OK: typings.grpcGrpcJs.constantsMod.Status.OK & Double = js.native
    
    /* 11 */ val OUT_OF_RANGE: typings.grpcGrpcJs.constantsMod.Status.OUT_OF_RANGE & Double = js.native
    
    /* 7 */ val PERMISSION_DENIED: typings.grpcGrpcJs.constantsMod.Status.PERMISSION_DENIED & Double = js.native
    
    /* 8 */ val RESOURCE_EXHAUSTED: typings.grpcGrpcJs.constantsMod.Status.RESOURCE_EXHAUSTED & Double = js.native
    
    /* 16 */ val UNAUTHENTICATED: typings.grpcGrpcJs.constantsMod.Status.UNAUTHENTICATED & Double = js.native
    
    /* 14 */ val UNAVAILABLE: typings.grpcGrpcJs.constantsMod.Status.UNAVAILABLE & Double = js.native
    
    /* 12 */ val UNIMPLEMENTED: typings.grpcGrpcJs.constantsMod.Status.UNIMPLEMENTED & Double = js.native
    
    /* 2 */ val UNKNOWN: typings.grpcGrpcJs.constantsMod.Status.UNKNOWN & Double = js.native
  }
  
  @scala.inline
  def waitForClientReady(
    client: typings.grpcGrpcJs.clientMod.Client,
    deadline: Double,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForClientReady")(client.asInstanceOf[js.Any], deadline.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def waitForClientReady(
    client: typings.grpcGrpcJs.clientMod.Client,
    deadline: Date,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForClientReady")(client.asInstanceOf[js.Any], deadline.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
