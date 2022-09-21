package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimePartitioning extends StObject {
  
  /**
    * [Optional] Number of milliseconds for which to keep the storage for partitions in the table. The storage in a partition will have an expiration time of its partition time plus this value.
    */
  var expirationMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is specified, the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
    */
  var field: js.UndefOr[String | Null] = js.undefined
  
  var requirePartitionFilter: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Required] The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively. When the type is not specified, the default behavior is DAY.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimePartitioning {
  
  inline def apply(): SchemaTimePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimePartitioning]
  }
  
  extension [Self <: SchemaTimePartitioning](x: Self) {
    
    inline def setExpirationMs(value: String): Self = StObject.set(x, "expirationMs", value.asInstanceOf[js.Any])
    
    inline def setExpirationMsNull: Self = StObject.set(x, "expirationMs", null)
    
    inline def setExpirationMsUndefined: Self = StObject.set(x, "expirationMs", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
    
    inline def setRequirePartitionFilterNull: Self = StObject.set(x, "requirePartitionFilter", null)
    
    inline def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
