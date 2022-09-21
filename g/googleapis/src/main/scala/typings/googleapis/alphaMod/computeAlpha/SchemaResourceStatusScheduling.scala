package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceStatusScheduling extends StObject {
  
  /**
    * Specifies the availability domain (AD), which this instance should be scheduled on. The AD belongs to the spread GroupPlacementPolicy resource policy that has been assigned to the instance. Specify a value between 1-max count of availability domains in your GroupPlacementPolicy. See go/placement-policy-extension for more details.
    */
  var availabilityDomain: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Time in future when the instance will be terminated in RFC3339 text format.
    */
  var terminationTimestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceStatusScheduling {
  
  inline def apply(): SchemaResourceStatusScheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceStatusScheduling]
  }
  
  extension [Self <: SchemaResourceStatusScheduling](x: Self) {
    
    inline def setAvailabilityDomain(value: Double): Self = StObject.set(x, "availabilityDomain", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityDomainNull: Self = StObject.set(x, "availabilityDomain", null)
    
    inline def setAvailabilityDomainUndefined: Self = StObject.set(x, "availabilityDomain", js.undefined)
    
    inline def setTerminationTimestamp(value: String): Self = StObject.set(x, "terminationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setTerminationTimestampNull: Self = StObject.set(x, "terminationTimestamp", null)
    
    inline def setTerminationTimestampUndefined: Self = StObject.set(x, "terminationTimestamp", js.undefined)
  }
}
