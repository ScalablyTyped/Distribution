package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackend extends StObject {
  
  /**
    * Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. Backends must use compatible balancing modes. For more information, see Supported balancing modes and target capacity settings and Restrictions and guidance for instance groups. Note: Currently, if you use the API to configure incompatible balancing modes, the configuration might be accepted even though it has no impact and is ignored. Specifically, Backend.maxUtilization is ignored when Backend.balancingMode is RATE. In the future, this incompatible combination will be rejected.
    */
  var balancingMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A multiplier applied to the backend's target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
    */
  var capacityScaler: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
    */
  var failover: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. To determine what types of backends a load balancer supports, see the [Backend services overview](https://cloud.google.com/load-balancing/docs/backend-service#backends). You must use the *fully-qualified* URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
    */
  var group: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
    */
  var maxConnections: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
    */
  var maxConnectionsPerEndpoint: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
    */
  var maxConnectionsPerInstance: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
    */
  var maxRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
    */
  var maxRatePerEndpoint: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
    */
  var maxRatePerInstance: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional parameter to define a target capacity for the UTILIZATION balancing mode. The valid range is [0.0, 1.0]. For usage guidelines, see Utilization balancing mode.
    */
  var maxUtilization: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBackend {
  
  inline def apply(): SchemaBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackend]
  }
  
  extension [Self <: SchemaBackend](x: Self) {
    
    inline def setBalancingMode(value: String): Self = StObject.set(x, "balancingMode", value.asInstanceOf[js.Any])
    
    inline def setBalancingModeNull: Self = StObject.set(x, "balancingMode", null)
    
    inline def setBalancingModeUndefined: Self = StObject.set(x, "balancingMode", js.undefined)
    
    inline def setCapacityScaler(value: Double): Self = StObject.set(x, "capacityScaler", value.asInstanceOf[js.Any])
    
    inline def setCapacityScalerNull: Self = StObject.set(x, "capacityScaler", null)
    
    inline def setCapacityScalerUndefined: Self = StObject.set(x, "capacityScaler", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFailover(value: Boolean): Self = StObject.set(x, "failover", value.asInstanceOf[js.Any])
    
    inline def setFailoverNull: Self = StObject.set(x, "failover", null)
    
    inline def setFailoverUndefined: Self = StObject.set(x, "failover", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsNull: Self = StObject.set(x, "maxConnections", null)
    
    inline def setMaxConnectionsPerEndpoint(value: Double): Self = StObject.set(x, "maxConnectionsPerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsPerEndpointNull: Self = StObject.set(x, "maxConnectionsPerEndpoint", null)
    
    inline def setMaxConnectionsPerEndpointUndefined: Self = StObject.set(x, "maxConnectionsPerEndpoint", js.undefined)
    
    inline def setMaxConnectionsPerInstance(value: Double): Self = StObject.set(x, "maxConnectionsPerInstance", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsPerInstanceNull: Self = StObject.set(x, "maxConnectionsPerInstance", null)
    
    inline def setMaxConnectionsPerInstanceUndefined: Self = StObject.set(x, "maxConnectionsPerInstance", js.undefined)
    
    inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
    
    inline def setMaxRate(value: Double): Self = StObject.set(x, "maxRate", value.asInstanceOf[js.Any])
    
    inline def setMaxRateNull: Self = StObject.set(x, "maxRate", null)
    
    inline def setMaxRatePerEndpoint(value: Double): Self = StObject.set(x, "maxRatePerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setMaxRatePerEndpointNull: Self = StObject.set(x, "maxRatePerEndpoint", null)
    
    inline def setMaxRatePerEndpointUndefined: Self = StObject.set(x, "maxRatePerEndpoint", js.undefined)
    
    inline def setMaxRatePerInstance(value: Double): Self = StObject.set(x, "maxRatePerInstance", value.asInstanceOf[js.Any])
    
    inline def setMaxRatePerInstanceNull: Self = StObject.set(x, "maxRatePerInstance", null)
    
    inline def setMaxRatePerInstanceUndefined: Self = StObject.set(x, "maxRatePerInstance", js.undefined)
    
    inline def setMaxRateUndefined: Self = StObject.set(x, "maxRate", js.undefined)
    
    inline def setMaxUtilization(value: Double): Self = StObject.set(x, "maxUtilization", value.asInstanceOf[js.Any])
    
    inline def setMaxUtilizationNull: Self = StObject.set(x, "maxUtilization", null)
    
    inline def setMaxUtilizationUndefined: Self = StObject.set(x, "maxUtilization", js.undefined)
  }
}
