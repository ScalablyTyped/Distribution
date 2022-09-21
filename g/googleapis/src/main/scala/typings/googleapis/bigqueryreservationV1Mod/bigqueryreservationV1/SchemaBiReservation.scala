package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBiReservation extends StObject {
  
  /**
    * The resource name of the singleton BI reservation. Reservation names have the form `projects/{project_id\}/locations/{location_id\}/biReservation`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Preferred tables to use BI capacity for.
    */
  var preferredTables: js.UndefOr[js.Array[SchemaTableReference]] = js.undefined
  
  /**
    * Size of a reservation, in bytes.
    */
  var size: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last update timestamp of a reservation.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaBiReservation {
  
  inline def apply(): SchemaBiReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBiReservation]
  }
  
  extension [Self <: SchemaBiReservation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreferredTables(value: js.Array[SchemaTableReference]): Self = StObject.set(x, "preferredTables", value.asInstanceOf[js.Any])
    
    inline def setPreferredTablesUndefined: Self = StObject.set(x, "preferredTables", js.undefined)
    
    inline def setPreferredTablesVarargs(value: SchemaTableReference*): Self = StObject.set(x, "preferredTables", js.Array(value*))
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
