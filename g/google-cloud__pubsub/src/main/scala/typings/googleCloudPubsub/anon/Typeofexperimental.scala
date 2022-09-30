package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googleCloudPubsub.googleCloudPubsubBooleans.`true`
import typings.grpcGrpcJs.adminMod.GetHandlers
import typings.grpcGrpcJs.adminMod.GetServiceDefinition
import typings.grpcGrpcJs.anon.PartialChannelControlHelp
import typings.grpcGrpcJs.constantsMod.LogVerbosity
import typings.grpcGrpcJs.durationMod.Duration
import typings.grpcGrpcJs.filterMod.Filter
import typings.grpcGrpcJs.filterMod.FilterFactory
import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancerConstructor
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancingConfig
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancingConfigConstructor
import typings.grpcGrpcJs.resolverMod.ResolverConstructor
import typings.grpcGrpcJs.subchannelAddressMod.SubchannelAddress
import typings.grpcGrpcJs.subchannelInterfaceMod.SubchannelInterface
import typings.grpcGrpcJs.uriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofexperimental extends StObject {
  
  var BackoffTimeout: Instantiable1[
    /* callback */ js.Function0[Unit], 
    typings.googleGax.mod.grpc.experimental.BackoffTimeout
  ] = js.native
  
  var BaseFilter: Instantiable0[typings.googleGax.mod.grpc.experimental.BaseFilter] = js.native
  
  var BaseSubchannelWrapper: Instantiable1[
    /* child */ SubchannelInterface, 
    typings.googleGax.mod.grpc.experimental.BaseSubchannelWrapper
  ] = js.native
  
  var ChildLoadBalancerHandler: Instantiable1[
    /* channelControlHelper */ ChannelControlHelper, 
    typings.googleGax.mod.grpc.experimental.ChildLoadBalancerHandler
  ] = js.native
  
  var FilterStackFactory: Instantiable1[
    /* factories */ js.Array[FilterFactory[Filter]], 
    typings.googleGax.mod.grpc.experimental.FilterStackFactory
  ] = js.native
  
  var OutlierDetectionLoadBalancingConfig: TypeofOutlierDetectionLoa = js.native
  
  var QueuePicker: Instantiable1[
    /* loadBalancer */ LoadBalancer, 
    typings.googleGax.mod.grpc.experimental.QueuePicker
  ] = js.native
  
  var UnavailablePicker: Instantiable0[typings.googleGax.mod.grpc.experimental.UnavailablePicker] = js.native
  
  def createChildChannelControlHelper(parent: ChannelControlHelper, overrides: PartialChannelControlHelp): ChannelControlHelper = js.native
  
  def durationToMs(duration: Duration): Double = js.native
  
  def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig = js.native
  @JSName("getFirstUsableConfig")
  def getFirstUsableConfig_true(configs: js.Array[LoadBalancingConfig], fallbackTodefault: `true`): LoadBalancingConfig = js.native
  
  def log(severity: LogVerbosity, args: Any*): Unit = js.native
  
  def registerAdminService(getServiceDefinition: GetServiceDefinition, getHandlers: GetHandlers): Unit = js.native
  
  def registerLoadBalancerType(
    typeName: String,
    loadBalancerType: LoadBalancerConstructor,
    loadBalancingConfigType: LoadBalancingConfigConstructor
  ): Unit = js.native
  
  def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = js.native
  
  def subchannelAddressToString(address: SubchannelAddress): String = js.native
  
  def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
  
  def uriToString(uri: GrpcUri): String = js.native
  
  def validateLoadBalancingConfig(obj: Any): LoadBalancingConfig = js.native
}
