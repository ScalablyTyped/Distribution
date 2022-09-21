package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHealthStatus extends StObject {
  
  /**
    * Metadata defined as annotations for network endpoint.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * URL of the forwarding rule associated with the health status of the instance.
    */
  var forwardingRule: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A forwarding rule IP address assigned to this instance.
    */
  var forwardingRuleIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Health state of the instance.
    */
  var healthState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the instance resource.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For target pool based Network Load Balancing, it indicates the forwarding rule's IP address assigned to this instance. For other types of load balancing, the field indicates VM internal ip.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The named port of the instance group, not necessarily the port that is health-checked.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  var weight: js.UndefOr[String | Null] = js.undefined
  
  var weightError: js.UndefOr[String | Null] = js.undefined
}
object SchemaHealthStatus {
  
  inline def apply(): SchemaHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthStatus]
  }
  
  extension [Self <: SchemaHealthStatus](x: Self) {
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setForwardingRule(value: String): Self = StObject.set(x, "forwardingRule", value.asInstanceOf[js.Any])
    
    inline def setForwardingRuleIp(value: String): Self = StObject.set(x, "forwardingRuleIp", value.asInstanceOf[js.Any])
    
    inline def setForwardingRuleIpNull: Self = StObject.set(x, "forwardingRuleIp", null)
    
    inline def setForwardingRuleIpUndefined: Self = StObject.set(x, "forwardingRuleIp", js.undefined)
    
    inline def setForwardingRuleNull: Self = StObject.set(x, "forwardingRule", null)
    
    inline def setForwardingRuleUndefined: Self = StObject.set(x, "forwardingRule", js.undefined)
    
    inline def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    inline def setHealthStateNull: Self = StObject.set(x, "healthState", null)
    
    inline def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightError(value: String): Self = StObject.set(x, "weightError", value.asInstanceOf[js.Any])
    
    inline def setWeightErrorNull: Self = StObject.set(x, "weightError", null)
    
    inline def setWeightErrorUndefined: Self = StObject.set(x, "weightError", js.undefined)
    
    inline def setWeightNull: Self = StObject.set(x, "weight", null)
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
