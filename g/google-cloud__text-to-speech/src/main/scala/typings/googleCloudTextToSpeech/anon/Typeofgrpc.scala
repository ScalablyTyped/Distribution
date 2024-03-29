package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.grpcGrpcJs.anon.PartialConsole
import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.buildSrcChannelMod.Channel
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptingCallInterface
import typings.grpcGrpcJs.buildSrcClientMod.Client
import typings.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity
import typings.grpcGrpcJs.buildSrcMakeClientMod.GrpcObject
import typings.grpcGrpcJs.buildSrcMakeClientMod.PackageDefinition
import typings.grpcGrpcJs.buildSrcMakeClientMod.ServiceClientConstructor
import typings.grpcGrpcJs.buildSrcServerMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofgrpc extends StObject {
  
  var CallCredentials: TypeofCallCredentials = js.native
  
  var Channel: Instantiable3[
    /* target */ String, 
    /* credentials */ ChannelCredentials, 
    /* options */ ChannelOptions, 
    typings.googleGax.mod.grpc.Channel
  ] = js.native
  
  var ChannelCredentials: TypeofChannelCredentials = js.native
  
  var Client: Instantiable2[
    /* address */ String, 
    /* credentials */ ChannelCredentials, 
    typings.googleGax.mod.grpc.Client
  ] = js.native
  
  var InterceptingCall: Instantiable1[
    /* nextCall */ InterceptingCallInterface, 
    typings.googleGax.mod.grpc.InterceptingCall
  ] = js.native
  
  var InterceptorConfigurationError: Instantiable1[/* message */ String, typings.googleGax.mod.grpc.InterceptorConfigurationError] = js.native
  
  var ListenerBuilder: Instantiable0[typings.googleGax.mod.grpc.ListenerBuilder] = js.native
  
  var Metadata: TypeofMetadata = js.native
  
  var RequesterBuilder: Instantiable0[typings.googleGax.mod.grpc.RequesterBuilder] = js.native
  
  var Server: Instantiable0[typings.googleGax.mod.grpc.Server] = js.native
  
  var ServerCredentials: TypeofServerCredentials = js.native
  
  var StatusBuilder: Instantiable0[typings.googleGax.mod.grpc.StatusBuilder] = js.native
  
  def addAdminServicesToServer(server: Server): Unit = js.native
  
  def closeClient(client: Client): Unit = js.native
  
  val credentials: Typeofcredentials = js.native
  
  val experimental: Typeofexperimental = js.native
  
  def getChannelzHandlers(): Any = js.native
  
  def getChannelzServiceDefinition(): Any = js.native
  
  def getClientChannel(client: Client): Channel = js.native
  
  def load(filename: Any, format: Any, options: Any): scala.Nothing = js.native
  
  def loadObject(value: Any, options: Any): scala.Nothing = js.native
  
  def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
  
  def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
  def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  
  def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
  def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  
  def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
  
  def setLogger(logger: PartialConsole): Unit = js.native
  
  def waitForClientReady(client: Client, deadline: js.Date, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def waitForClientReady(client: Client, deadline: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
}
