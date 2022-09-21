package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicyGroupPlacementPolicy extends StObject {
  
  /**
    * The number of availability domains to spread instances across. If two instances are in different availability domain, they are not in the same low latency network.
    */
  var availabilityDomainCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies network collocation
    */
  var collocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies network locality
    */
  var locality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Scope specifies the availability domain to which the VMs should be spread.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies instances to hosts placement relationship
    */
  var style: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of VMs in this placement group. Google does not recommend that you use this field unless you use a compact policy and you want your policy to work only if it contains this exact number of VMs.
    */
  var vmCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaResourcePolicyGroupPlacementPolicy {
  
  inline def apply(): SchemaResourcePolicyGroupPlacementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyGroupPlacementPolicy]
  }
  
  extension [Self <: SchemaResourcePolicyGroupPlacementPolicy](x: Self) {
    
    inline def setAvailabilityDomainCount(value: Double): Self = StObject.set(x, "availabilityDomainCount", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityDomainCountNull: Self = StObject.set(x, "availabilityDomainCount", null)
    
    inline def setAvailabilityDomainCountUndefined: Self = StObject.set(x, "availabilityDomainCount", js.undefined)
    
    inline def setCollocation(value: String): Self = StObject.set(x, "collocation", value.asInstanceOf[js.Any])
    
    inline def setCollocationNull: Self = StObject.set(x, "collocation", null)
    
    inline def setCollocationUndefined: Self = StObject.set(x, "collocation", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityNull: Self = StObject.set(x, "locality", null)
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVmCount(value: Double): Self = StObject.set(x, "vmCount", value.asInstanceOf[js.Any])
    
    inline def setVmCountNull: Self = StObject.set(x, "vmCount", null)
    
    inline def setVmCountUndefined: Self = StObject.set(x, "vmCount", js.undefined)
  }
}
