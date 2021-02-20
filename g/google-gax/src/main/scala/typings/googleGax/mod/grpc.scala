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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grpc {
  
  @JSImport("google-gax", "grpc.CallCredentials")
  @js.native
  abstract class CallCredentials ()
    extends typings.grpcGrpcJs.mod.CallCredentials
  /* static members */
  object CallCredentials {
    
    @JSImport("google-gax", "grpc.CallCredentials.createEmpty")
    @js.native
    def createEmpty(): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredentials The authentication client to use.
      * @return The resulting CallCredentials object.
      */
    @JSImport("google-gax", "grpc.CallCredentials.createFromGoogleCredential")
    @js.native
    def createFromGoogleCredential(googleCredentials: OAuth2Client): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Creates a new CallCredentials object from a given function that generates
      * Metadata objects.
      * @param metadataGenerator A function that accepts a set of options, and
      * generates a Metadata object based on these options, which is passed back
      * to the caller via a supplied (err, metadata) callback.
      */
    @JSImport("google-gax", "grpc.CallCredentials.createFromMetadataGenerator")
    @js.native
    def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
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
    
    /**
      * Return a new ChannelCredentials instance with no credentials.
      */
    @JSImport("google-gax", "grpc.ChannelCredentials.createInsecure")
    @js.native
    def createInsecure(): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    
    /**
      * Return a new ChannelCredentials instance with a given set of credentials.
      * The resulting instance can be used to construct a Channel that communicates
      * over TLS.
      * @param rootCerts The root certificate data.
      * @param privateKey The client certificate private key, if available.
      * @param certChain The client certificate key chain, if available.
      */
    @JSImport("google-gax", "grpc.ChannelCredentials.createSsl")
    @js.native
    def createSsl(
      rootCerts: js.UndefOr[Buffer | Null],
      privateKey: js.UndefOr[Buffer | Null],
      certChain: js.UndefOr[Buffer | Null],
      verifyOptions: js.UndefOr[VerifyOptions]
    ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
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
    
    /**
      * Returns a new Metadata object based fields in a given IncomingHttpHeaders
      * object.
      * @param headers An IncomingHttpHeaders object.
      */
    @JSImport("google-gax", "grpc.Metadata.fromHttp2Headers")
    @js.native
    def fromHttp2Headers(headers: IncomingHttpHeaders): typings.grpcGrpcJs.metadataMod.Metadata = js.native
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
    
    @JSImport("google-gax", "grpc.ServerCredentials.createInsecure")
    @js.native
    def createInsecure(): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    
    @JSImport("google-gax", "grpc.ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    @JSImport("google-gax", "grpc.ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    @JSImport("google-gax", "grpc.ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    @JSImport("google-gax", "grpc.ServerCredentials.createSsl")
    @js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  }
  
  @JSImport("google-gax", "grpc.StatusBuilder")
  @js.native
  class StatusBuilder ()
    extends typings.grpcGrpcJs.mod.StatusBuilder
  
  @JSImport("google-gax", "grpc.closeClient")
  @js.native
  def closeClient(client: typings.grpcGrpcJs.clientMod.Client): Unit = js.native
  
  @JSImport("google-gax", "grpc.connectivityState")
  @js.native
  object connectivityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConnectivityState with Double] = js.native
    
    /* 0 */ val CONNECTING: typings.grpcGrpcJs.channelMod.ConnectivityState.CONNECTING with Double = js.native
    
    /* 3 */ val IDLE: typings.grpcGrpcJs.channelMod.ConnectivityState.IDLE with Double = js.native
    
    /* 1 */ val READY: typings.grpcGrpcJs.channelMod.ConnectivityState.READY with Double = js.native
    
    /* 4 */ val SHUTDOWN: typings.grpcGrpcJs.channelMod.ConnectivityState.SHUTDOWN with Double = js.native
    
    /* 2 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.channelMod.ConnectivityState.TRANSIENT_FAILURE with Double = js.native
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
    @JSImport("google-gax", "grpc.credentials.combineCallCredentials")
    @js.native
    def combineCallCredentials(
      first: typings.grpcGrpcJs.callCredentialsMod.CallCredentials,
      additional: typings.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Combine a ChannelCredentials with any number of CallCredentials into a
      * single ChannelCredentials object.
      * @param channelCredentials The ChannelCredentials object.
      * @param callCredentials Any number of CallCredentials objects.
      * @return The resulting ChannelCredentials object.
      */
    @JSImport("google-gax", "grpc.credentials.combineChannelCredentials")
    @js.native
    def combineChannelCredentials(
      channelCredentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      callCredentials: typings.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    
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
  
  @JSImport("google-gax", "grpc.getClientChannel")
  @js.native
  def getClientChannel(client: typings.grpcGrpcJs.clientMod.Client): typings.grpcGrpcJs.channelMod.Channel = js.native
  
  @JSImport("google-gax", "grpc.load")
  @js.native
  def load(filename: js.Any, format: js.Any, options: js.Any): scala.Nothing = js.native
  
  @JSImport("google-gax", "grpc.loadObject")
  @js.native
  def loadObject(value: js.Any, options: js.Any): scala.Nothing = js.native
  
  @JSImport("google-gax", "grpc.loadPackageDefinition")
  @js.native
  def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
  
  @JSImport("google-gax", "grpc.logVerbosity")
  @js.native
  object logVerbosity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogVerbosity with Double] = js.native
    
    /* 0 */ val DEBUG: typings.grpcGrpcJs.constantsMod.LogVerbosity.DEBUG with Double = js.native
    
    /* 2 */ val ERROR: typings.grpcGrpcJs.constantsMod.LogVerbosity.ERROR with Double = js.native
    
    /* 1 */ val INFO: typings.grpcGrpcJs.constantsMod.LogVerbosity.INFO with Double = js.native
  }
  
  @JSImport("google-gax", "grpc.makeClientConstructor")
  @js.native
  def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
  @JSImport("google-gax", "grpc.makeClientConstructor")
  @js.native
  def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  
  @JSImport("google-gax", "grpc.makeGenericClientConstructor")
  @js.native
  def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
  @JSImport("google-gax", "grpc.makeGenericClientConstructor")
  @js.native
  def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  
  @JSImport("google-gax", "grpc.propagate")
  @js.native
  object propagate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Propagate with Double] = js.native
    
    /* 8 */ val CANCELLATION: typings.grpcGrpcJs.constantsMod.Propagate.CANCELLATION with Double = js.native
    
    /* 2 */ val CENSUS_STATS_CONTEXT: typings.grpcGrpcJs.constantsMod.Propagate.CENSUS_STATS_CONTEXT with Double = js.native
    
    /* 4 */ val CENSUS_TRACING_CONTEXT: typings.grpcGrpcJs.constantsMod.Propagate.CENSUS_TRACING_CONTEXT with Double = js.native
    
    /* 1 */ val DEADLINE: typings.grpcGrpcJs.constantsMod.Propagate.DEADLINE with Double = js.native
    
    /* 65536 */ val DEFAULTS: typings.grpcGrpcJs.constantsMod.Propagate.DEFAULTS with Double = js.native
  }
  
  @JSImport("google-gax", "grpc.setLogVerbosity")
  @js.native
  def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
  
  @JSImport("google-gax", "grpc.setLogger")
  @js.native
  def setLogger(logger: PartialConsole): Unit = js.native
  
  @JSImport("google-gax", "grpc.status")
  @js.native
  object status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.grpcGrpcJs.constantsMod.Status with Double] = js.native
    
    /* 10 */ val ABORTED: typings.grpcGrpcJs.constantsMod.Status.ABORTED with Double = js.native
    
    /* 6 */ val ALREADY_EXISTS: typings.grpcGrpcJs.constantsMod.Status.ALREADY_EXISTS with Double = js.native
    
    /* 1 */ val CANCELLED: typings.grpcGrpcJs.constantsMod.Status.CANCELLED with Double = js.native
    
    /* 15 */ val DATA_LOSS: typings.grpcGrpcJs.constantsMod.Status.DATA_LOSS with Double = js.native
    
    /* 4 */ val DEADLINE_EXCEEDED: typings.grpcGrpcJs.constantsMod.Status.DEADLINE_EXCEEDED with Double = js.native
    
    /* 9 */ val FAILED_PRECONDITION: typings.grpcGrpcJs.constantsMod.Status.FAILED_PRECONDITION with Double = js.native
    
    /* 13 */ val INTERNAL: typings.grpcGrpcJs.constantsMod.Status.INTERNAL with Double = js.native
    
    /* 3 */ val INVALID_ARGUMENT: typings.grpcGrpcJs.constantsMod.Status.INVALID_ARGUMENT with Double = js.native
    
    /* 5 */ val NOT_FOUND: typings.grpcGrpcJs.constantsMod.Status.NOT_FOUND with Double = js.native
    
    /* 0 */ val OK: typings.grpcGrpcJs.constantsMod.Status.OK with Double = js.native
    
    /* 11 */ val OUT_OF_RANGE: typings.grpcGrpcJs.constantsMod.Status.OUT_OF_RANGE with Double = js.native
    
    /* 7 */ val PERMISSION_DENIED: typings.grpcGrpcJs.constantsMod.Status.PERMISSION_DENIED with Double = js.native
    
    /* 8 */ val RESOURCE_EXHAUSTED: typings.grpcGrpcJs.constantsMod.Status.RESOURCE_EXHAUSTED with Double = js.native
    
    /* 16 */ val UNAUTHENTICATED: typings.grpcGrpcJs.constantsMod.Status.UNAUTHENTICATED with Double = js.native
    
    /* 14 */ val UNAVAILABLE: typings.grpcGrpcJs.constantsMod.Status.UNAVAILABLE with Double = js.native
    
    /* 12 */ val UNIMPLEMENTED: typings.grpcGrpcJs.constantsMod.Status.UNIMPLEMENTED with Double = js.native
    
    /* 2 */ val UNKNOWN: typings.grpcGrpcJs.constantsMod.Status.UNKNOWN with Double = js.native
  }
  
  @JSImport("google-gax", "grpc.waitForClientReady")
  @js.native
  def waitForClientReady(
    client: typings.grpcGrpcJs.clientMod.Client,
    deadline: Double,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  @JSImport("google-gax", "grpc.waitForClientReady")
  @js.native
  def waitForClientReady(
    client: typings.grpcGrpcJs.clientMod.Client,
    deadline: Date,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
}
