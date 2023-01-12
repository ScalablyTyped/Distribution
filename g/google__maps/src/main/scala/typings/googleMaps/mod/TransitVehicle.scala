package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitVehicle extends StObject {
  
  /** contains the URL for an icon associated with this vehicle type. */
  var icon: String
  
  /** contains the URL for the icon associated with this vehicle type, based on the local transport signage. */
  var local_icon: String
  
  /** contains the name of the vehicle on this line. eg. "Subway.". */
  var name: String
  
  /** contains the type of vehicle that runs on this line. */
  var `type`: VehicleType
}
object TransitVehicle {
  
  inline def apply(icon: String, local_icon: String, name: String, `type`: VehicleType): TransitVehicle = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], local_icon = local_icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitVehicle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitVehicle] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setLocal_icon(value: String): Self = StObject.set(x, "local_icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: VehicleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
