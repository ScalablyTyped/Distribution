package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDistributionPolicy extends StObject {
  
  /**
    * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
    */
  var targetShape: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Zones where the regional managed instance group will create and manage its instances.
    */
  var zones: js.UndefOr[js.Array[SchemaDistributionPolicyZoneConfiguration]] = js.undefined
}
object SchemaDistributionPolicy {
  
  inline def apply(): SchemaDistributionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistributionPolicy]
  }
  
  extension [Self <: SchemaDistributionPolicy](x: Self) {
    
    inline def setTargetShape(value: String): Self = StObject.set(x, "targetShape", value.asInstanceOf[js.Any])
    
    inline def setTargetShapeNull: Self = StObject.set(x, "targetShape", null)
    
    inline def setTargetShapeUndefined: Self = StObject.set(x, "targetShape", js.undefined)
    
    inline def setZones(value: js.Array[SchemaDistributionPolicyZoneConfiguration]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: SchemaDistributionPolicyZoneConfiguration*): Self = StObject.set(x, "zones", js.Array(value*))
  }
}
