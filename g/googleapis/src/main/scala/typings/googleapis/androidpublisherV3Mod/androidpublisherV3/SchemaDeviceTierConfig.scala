package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceTierConfig extends StObject {
  
  /**
    * Definition of device groups for the app.
    */
  var deviceGroups: js.UndefOr[js.Array[SchemaDeviceGroup]] = js.undefined
  
  /**
    * Output only. The device tier config ID.
    */
  var deviceTierConfigId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Definition of the set of device tiers for the app.
    */
  var deviceTierSet: js.UndefOr[SchemaDeviceTierSet] = js.undefined
}
object SchemaDeviceTierConfig {
  
  inline def apply(): SchemaDeviceTierConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceTierConfig]
  }
  
  extension [Self <: SchemaDeviceTierConfig](x: Self) {
    
    inline def setDeviceGroups(value: js.Array[SchemaDeviceGroup]): Self = StObject.set(x, "deviceGroups", value.asInstanceOf[js.Any])
    
    inline def setDeviceGroupsUndefined: Self = StObject.set(x, "deviceGroups", js.undefined)
    
    inline def setDeviceGroupsVarargs(value: SchemaDeviceGroup*): Self = StObject.set(x, "deviceGroups", js.Array(value*))
    
    inline def setDeviceTierConfigId(value: String): Self = StObject.set(x, "deviceTierConfigId", value.asInstanceOf[js.Any])
    
    inline def setDeviceTierConfigIdNull: Self = StObject.set(x, "deviceTierConfigId", null)
    
    inline def setDeviceTierConfigIdUndefined: Self = StObject.set(x, "deviceTierConfigId", js.undefined)
    
    inline def setDeviceTierSet(value: SchemaDeviceTierSet): Self = StObject.set(x, "deviceTierSet", value.asInstanceOf[js.Any])
    
    inline def setDeviceTierSetUndefined: Self = StObject.set(x, "deviceTierSet", js.undefined)
  }
}
