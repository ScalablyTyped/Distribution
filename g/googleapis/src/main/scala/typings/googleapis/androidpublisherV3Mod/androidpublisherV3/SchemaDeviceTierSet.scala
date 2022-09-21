package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceTierSet extends StObject {
  
  /**
    * Device tiers belonging to the set.
    */
  var deviceTiers: js.UndefOr[js.Array[SchemaDeviceTier]] = js.undefined
}
object SchemaDeviceTierSet {
  
  inline def apply(): SchemaDeviceTierSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceTierSet]
  }
  
  extension [Self <: SchemaDeviceTierSet](x: Self) {
    
    inline def setDeviceTiers(value: js.Array[SchemaDeviceTier]): Self = StObject.set(x, "deviceTiers", value.asInstanceOf[js.Any])
    
    inline def setDeviceTiersUndefined: Self = StObject.set(x, "deviceTiers", js.undefined)
    
    inline def setDeviceTiersVarargs(value: SchemaDeviceTier*): Self = StObject.set(x, "deviceTiers", js.Array(value*))
  }
}
