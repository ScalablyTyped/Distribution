package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDistributionPolicy extends StObject {
  
  /**
    * Zones where the regional managed instance group will create and manage
    * instances.
    */
  var zones: js.UndefOr[js.Array[SchemaDistributionPolicyZoneConfiguration]] = js.undefined
}
object SchemaDistributionPolicy {
  
  inline def apply(): SchemaDistributionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistributionPolicy]
  }
  
  extension [Self <: SchemaDistributionPolicy](x: Self) {
    
    inline def setZones(value: js.Array[SchemaDistributionPolicyZoneConfiguration]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: SchemaDistributionPolicyZoneConfiguration*): Self = StObject.set(x, "zones", js.Array(value :_*))
  }
}
