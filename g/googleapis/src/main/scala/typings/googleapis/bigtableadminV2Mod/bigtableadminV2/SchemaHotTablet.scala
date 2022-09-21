package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHotTablet extends StObject {
  
  /**
    * Tablet End Key (inclusive).
    */
  var endKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The end time of the hot tablet.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique name of the hot tablet. Values are of the form `projects/{project\}/instances/{instance\}/clusters/{cluster\}/hotTablets/[a-zA-Z0-9_-]*`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The average CPU usage spent by a node on this tablet over the start_time to end_time time range. The percentage is the amount of CPU used by the node to serve the tablet, from 0% (tablet was not interacted with) to 100% (the node spent all cycles serving the hot tablet).
    */
  var nodeCpuUsagePercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Tablet Start Key (inclusive).
    */
  var startKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The start time of the hot tablet.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the table that contains the tablet. Values are of the form `projects/{project\}/instances/{instance\}/tables/_a-zA-Z0-9*`.
    */
  var tableName: js.UndefOr[String | Null] = js.undefined
}
object SchemaHotTablet {
  
  inline def apply(): SchemaHotTablet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHotTablet]
  }
  
  extension [Self <: SchemaHotTablet](x: Self) {
    
    inline def setEndKey(value: String): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
    
    inline def setEndKeyNull: Self = StObject.set(x, "endKey", null)
    
    inline def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeCpuUsagePercent(value: Double): Self = StObject.set(x, "nodeCpuUsagePercent", value.asInstanceOf[js.Any])
    
    inline def setNodeCpuUsagePercentNull: Self = StObject.set(x, "nodeCpuUsagePercent", null)
    
    inline def setNodeCpuUsagePercentUndefined: Self = StObject.set(x, "nodeCpuUsagePercent", js.undefined)
    
    inline def setStartKey(value: String): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
    
    inline def setStartKeyNull: Self = StObject.set(x, "startKey", null)
    
    inline def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameNull: Self = StObject.set(x, "tableName", null)
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
