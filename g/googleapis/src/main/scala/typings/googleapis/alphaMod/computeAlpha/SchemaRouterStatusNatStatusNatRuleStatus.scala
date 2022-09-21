package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterStatusNatStatusNatRuleStatus extends StObject {
  
  /**
    * A list of active IPs for NAT. Example: ["1.1.1.1", "179.12.26.133"].
    */
  var activeNatIps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of IPs for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
    */
  var drainNatIps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The number of extra IPs to allocate. This will be greater than 0 only if the existing IPs in this NAT Rule are NOT enough to allow all configured VMs to use NAT.
    */
  var minExtraIpsNeeded: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of VM endpoints (i.e., NICs) that have NAT Mappings from this NAT Rule.
    */
  var numVmEndpointsWithNatMappings: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rule number of the rule.
    */
  var ruleNumber: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRouterStatusNatStatusNatRuleStatus {
  
  inline def apply(): SchemaRouterStatusNatStatusNatRuleStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusNatStatusNatRuleStatus]
  }
  
  extension [Self <: SchemaRouterStatusNatStatusNatRuleStatus](x: Self) {
    
    inline def setActiveNatIps(value: js.Array[String]): Self = StObject.set(x, "activeNatIps", value.asInstanceOf[js.Any])
    
    inline def setActiveNatIpsNull: Self = StObject.set(x, "activeNatIps", null)
    
    inline def setActiveNatIpsUndefined: Self = StObject.set(x, "activeNatIps", js.undefined)
    
    inline def setActiveNatIpsVarargs(value: String*): Self = StObject.set(x, "activeNatIps", js.Array(value*))
    
    inline def setDrainNatIps(value: js.Array[String]): Self = StObject.set(x, "drainNatIps", value.asInstanceOf[js.Any])
    
    inline def setDrainNatIpsNull: Self = StObject.set(x, "drainNatIps", null)
    
    inline def setDrainNatIpsUndefined: Self = StObject.set(x, "drainNatIps", js.undefined)
    
    inline def setDrainNatIpsVarargs(value: String*): Self = StObject.set(x, "drainNatIps", js.Array(value*))
    
    inline def setMinExtraIpsNeeded(value: Double): Self = StObject.set(x, "minExtraIpsNeeded", value.asInstanceOf[js.Any])
    
    inline def setMinExtraIpsNeededNull: Self = StObject.set(x, "minExtraIpsNeeded", null)
    
    inline def setMinExtraIpsNeededUndefined: Self = StObject.set(x, "minExtraIpsNeeded", js.undefined)
    
    inline def setNumVmEndpointsWithNatMappings(value: Double): Self = StObject.set(x, "numVmEndpointsWithNatMappings", value.asInstanceOf[js.Any])
    
    inline def setNumVmEndpointsWithNatMappingsNull: Self = StObject.set(x, "numVmEndpointsWithNatMappings", null)
    
    inline def setNumVmEndpointsWithNatMappingsUndefined: Self = StObject.set(x, "numVmEndpointsWithNatMappings", js.undefined)
    
    inline def setRuleNumber(value: Double): Self = StObject.set(x, "ruleNumber", value.asInstanceOf[js.Any])
    
    inline def setRuleNumberNull: Self = StObject.set(x, "ruleNumber", null)
    
    inline def setRuleNumberUndefined: Self = StObject.set(x, "ruleNumber", js.undefined)
  }
}
