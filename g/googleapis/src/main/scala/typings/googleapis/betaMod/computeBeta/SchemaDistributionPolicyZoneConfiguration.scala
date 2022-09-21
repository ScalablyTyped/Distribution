package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDistributionPolicyZoneConfiguration extends StObject {
  
  /**
    * The URL of the zone. The zone must exist in the region where the managed instance group is located.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaDistributionPolicyZoneConfiguration {
  
  inline def apply(): SchemaDistributionPolicyZoneConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistributionPolicyZoneConfiguration]
  }
  
  extension [Self <: SchemaDistributionPolicyZoneConfiguration](x: Self) {
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
