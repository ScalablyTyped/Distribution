package typings.googleCloudSpanner.anon

import org.scalablytyped.runtime.Instantiable7
import typings.googleGax.mod.grpc.experimental.OutlierDetectionLoadBalancingConfig
import typings.grpcGrpcJs.anon.PartialFailurePercentageE
import typings.grpcGrpcJs.anon.PartialSuccessRateEjectio
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOutlierDetectionLoa
  extends StObject
     with Instantiable7[
      /* intervalMs */ Double | Null, 
      /* baseEjectionTimeMs */ Double | Null, 
      /* maxEjectionTimeMs */ Double | Null, 
      /* maxEjectionPercent */ Double | Null, 
      /* successRateEjection */ PartialSuccessRateEjectio | Null, 
      /* failurePercentageEjection */ PartialFailurePercentageE | Null, 
      /* childPolicy */ js.Array[LoadBalancingConfig], 
      OutlierDetectionLoadBalancingConfig
    ] {
  
  def createFromJson(obj: Any): typings.grpcGrpcJs.buildSrcLoadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig = js.native
}
