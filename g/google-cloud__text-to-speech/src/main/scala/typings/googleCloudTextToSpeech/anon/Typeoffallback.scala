package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.proto
import typings.googleCloudTextToSpeech.googleCloudTextToSpeechStrings.rest
import typings.googleGax.buildSrcApitypesMod.GRPCCall
import typings.googleGax.buildSrcApitypesMod.GaxCall
import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import typings.googleGax.buildSrcDescriptorMod.Descriptor
import typings.googleGax.buildSrcGaxMod.BackoffSettings
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.buildSrcGaxMod.CallSettings
import typings.googleGax.buildSrcGaxMod.ClientConfig
import typings.googleGax.buildSrcGrpcMod.GrpcClient
import typings.googleGax.buildSrcGrpcMod.GrpcClientOptions
import typings.googleGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import typings.googleGax.buildSrcLongRunningCallsLongrunningMod.LROOperation
import typings.googleGax.buildSrcOperationsClientMod.OperationsClientBuilder
import typings.googleGax.buildSrcStreamingCallsStreamingMod.StreamType
import typings.googleGax.mod.fallback.Operation_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoffallback extends StObject {
  
  var BundleDescriptor: Instantiable4[
    /* bundledField */ String, 
    /* requestDiscriminatorFields */ js.Array[String], 
    /* subresponseField */ String, 
    /* byteLengthFunction */ js.Function, 
    typings.googleGax.mod.fallback.BundleDescriptor
  ] = js.native
  
  var CallSettings: Instantiable0[typings.googleGax.mod.fallback.CallSettings] = js.native
  
  var GoogleError: TypeofGoogleError = js.native
  
  var GrpcClient: TypeofGrpcClient = js.native
  
  var IamClient: TypeofIamClient = js.native
  
  var LocationsClient: TypeofLocationsClient = js.native
  
  var Operation: Instantiable3[
    /* grpcOp */ LROOperation, 
    /* longrunningDescriptor */ LongRunningDescriptor, 
    /* backoffSettings */ BackoffSettings, 
    Operation_
  ] = js.native
  
  var OperationsClient: Instantiable3[
    /* gaxGrpc */ GrpcClient, 
    /* operationsProtos */ Any, 
    /* options */ ClientOptions, 
    typings.googleGax.mod.fallback.OperationsClient
  ] = js.native
  
  var PageDescriptor: Instantiable3[
    /* requestPageTokenField */ String, 
    /* responsePageTokenField */ String, 
    /* resourceField */ String, 
    typings.googleGax.mod.fallback.PageDescriptor
  ] = js.native
  
  var PathTemplate: Instantiable1[/* data */ String, typings.googleGax.mod.fallback.PathTemplate] = js.native
  
  var RetryOptions: Instantiable2[
    /* retryCodes */ js.Array[Double], 
    /* backoffSettings */ BackoffSettings, 
    typings.googleGax.mod.fallback.RetryOptions
  ] = js.native
  
  var StreamDescriptor: Instantiable1[/* streamType */ StreamType, typings.googleGax.mod.fallback.StreamDescriptor] = js.native
  
  def constructSettings(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object
  ): Any = js.native
  def constructSettings(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object,
    otherArgs: js.Object
  ): Any = js.native
  
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, fallback: Boolean): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor, fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor, fallback: Boolean): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, fallback: Boolean): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, fallback: proto | rest): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, fallback: Boolean): GaxCall = js.native
  
  def createDefaultBackoffSettings(): BackoffSettings = js.native
  
  val defaultToObjectOptions: TypeofdefaultToObjectOpti = js.native
  
  val fallback: Any = js.native
  
  def lro(options: GrpcClientOptions): OperationsClientBuilder = js.native
  
  def operation(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = js.native
  def operation(
    op: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ): typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = js.native
  
  val protobuf: Typeofprotobuf = js.native
  
  val protobufMinimal: TypeofprotobufMinimal = js.native
  
  val routingHeader: TypeofroutingHeader = js.native
  
  val version: String = js.native
  
  def warn(code: String, message: String): Unit = js.native
  def warn(code: String, message: String, warnType: String): Unit = js.native
}
