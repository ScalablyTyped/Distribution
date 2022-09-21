package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterStatusNatStatus extends StObject {
  
  /**
    * A list of IPs auto-allocated for NAT. Example: ["1.1.1.1", "129.2.16.89"]
    */
  var autoAllocatedNatIps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of IPs auto-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
    */
  var drainAutoAllocatedNatIps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of IPs user-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
    */
  var drainUserAllocatedNatIps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The number of extra IPs to allocate. This will be greater than 0 only if user-specified IPs are NOT enough to allow all configured VMs to use NAT. This value is meaningful only when auto-allocation of NAT IPs is *not* used.
    */
  var minExtraNatIpsNeeded: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Unique name of this NAT.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of VM endpoints (i.e., Nics) that can use NAT.
    */
  var numVmEndpointsWithNatMappings: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Status of rules in this NAT.
    */
  var ruleStatus: js.UndefOr[js.Array[SchemaRouterStatusNatStatusNatRuleStatus]] = js.undefined
  
  /**
    * A list of fully qualified URLs of reserved IP address resources.
    */
  var userAllocatedNatIpResources: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of IPs user-allocated for NAT. They will be raw IP strings like "179.12.26.133".
    */
  var userAllocatedNatIps: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRouterStatusNatStatus {
  
  inline def apply(): SchemaRouterStatusNatStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusNatStatus]
  }
  
  extension [Self <: SchemaRouterStatusNatStatus](x: Self) {
    
    inline def setAutoAllocatedNatIps(value: js.Array[String]): Self = StObject.set(x, "autoAllocatedNatIps", value.asInstanceOf[js.Any])
    
    inline def setAutoAllocatedNatIpsNull: Self = StObject.set(x, "autoAllocatedNatIps", null)
    
    inline def setAutoAllocatedNatIpsUndefined: Self = StObject.set(x, "autoAllocatedNatIps", js.undefined)
    
    inline def setAutoAllocatedNatIpsVarargs(value: String*): Self = StObject.set(x, "autoAllocatedNatIps", js.Array(value*))
    
    inline def setDrainAutoAllocatedNatIps(value: js.Array[String]): Self = StObject.set(x, "drainAutoAllocatedNatIps", value.asInstanceOf[js.Any])
    
    inline def setDrainAutoAllocatedNatIpsNull: Self = StObject.set(x, "drainAutoAllocatedNatIps", null)
    
    inline def setDrainAutoAllocatedNatIpsUndefined: Self = StObject.set(x, "drainAutoAllocatedNatIps", js.undefined)
    
    inline def setDrainAutoAllocatedNatIpsVarargs(value: String*): Self = StObject.set(x, "drainAutoAllocatedNatIps", js.Array(value*))
    
    inline def setDrainUserAllocatedNatIps(value: js.Array[String]): Self = StObject.set(x, "drainUserAllocatedNatIps", value.asInstanceOf[js.Any])
    
    inline def setDrainUserAllocatedNatIpsNull: Self = StObject.set(x, "drainUserAllocatedNatIps", null)
    
    inline def setDrainUserAllocatedNatIpsUndefined: Self = StObject.set(x, "drainUserAllocatedNatIps", js.undefined)
    
    inline def setDrainUserAllocatedNatIpsVarargs(value: String*): Self = StObject.set(x, "drainUserAllocatedNatIps", js.Array(value*))
    
    inline def setMinExtraNatIpsNeeded(value: Double): Self = StObject.set(x, "minExtraNatIpsNeeded", value.asInstanceOf[js.Any])
    
    inline def setMinExtraNatIpsNeededNull: Self = StObject.set(x, "minExtraNatIpsNeeded", null)
    
    inline def setMinExtraNatIpsNeededUndefined: Self = StObject.set(x, "minExtraNatIpsNeeded", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumVmEndpointsWithNatMappings(value: Double): Self = StObject.set(x, "numVmEndpointsWithNatMappings", value.asInstanceOf[js.Any])
    
    inline def setNumVmEndpointsWithNatMappingsNull: Self = StObject.set(x, "numVmEndpointsWithNatMappings", null)
    
    inline def setNumVmEndpointsWithNatMappingsUndefined: Self = StObject.set(x, "numVmEndpointsWithNatMappings", js.undefined)
    
    inline def setRuleStatus(value: js.Array[SchemaRouterStatusNatStatusNatRuleStatus]): Self = StObject.set(x, "ruleStatus", value.asInstanceOf[js.Any])
    
    inline def setRuleStatusUndefined: Self = StObject.set(x, "ruleStatus", js.undefined)
    
    inline def setRuleStatusVarargs(value: SchemaRouterStatusNatStatusNatRuleStatus*): Self = StObject.set(x, "ruleStatus", js.Array(value*))
    
    inline def setUserAllocatedNatIpResources(value: js.Array[String]): Self = StObject.set(x, "userAllocatedNatIpResources", value.asInstanceOf[js.Any])
    
    inline def setUserAllocatedNatIpResourcesNull: Self = StObject.set(x, "userAllocatedNatIpResources", null)
    
    inline def setUserAllocatedNatIpResourcesUndefined: Self = StObject.set(x, "userAllocatedNatIpResources", js.undefined)
    
    inline def setUserAllocatedNatIpResourcesVarargs(value: String*): Self = StObject.set(x, "userAllocatedNatIpResources", js.Array(value*))
    
    inline def setUserAllocatedNatIps(value: js.Array[String]): Self = StObject.set(x, "userAllocatedNatIps", value.asInstanceOf[js.Any])
    
    inline def setUserAllocatedNatIpsNull: Self = StObject.set(x, "userAllocatedNatIps", null)
    
    inline def setUserAllocatedNatIpsUndefined: Self = StObject.set(x, "userAllocatedNatIps", js.undefined)
    
    inline def setUserAllocatedNatIpsVarargs(value: String*): Self = StObject.set(x, "userAllocatedNatIps", js.Array(value*))
  }
}
