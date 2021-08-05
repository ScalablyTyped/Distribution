package typings.gandiLivedns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  /**
    * Can be used as a date with "new Date(change_time);"
    */
  var change_time: String
  
  var serial: Double
  
  var zone_data: js.Array[ZoneRecord]
  
  var zone_uuid: String
}
object Snapshot {
  
  inline def apply(change_time: String, serial: Double, zone_data: js.Array[ZoneRecord], zone_uuid: String): Snapshot = {
    val __obj = js.Dynamic.literal(change_time = change_time.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], zone_data = zone_data.asInstanceOf[js.Any], zone_uuid = zone_uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setChange_time(value: String): Self = StObject.set(x, "change_time", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: Double): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setZone_data(value: js.Array[ZoneRecord]): Self = StObject.set(x, "zone_data", value.asInstanceOf[js.Any])
    
    inline def setZone_dataVarargs(value: ZoneRecord*): Self = StObject.set(x, "zone_data", js.Array(value :_*))
    
    inline def setZone_uuid(value: String): Self = StObject.set(x, "zone_uuid", value.asInstanceOf[js.Any])
  }
}
