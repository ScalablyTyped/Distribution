package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimePartitioning extends StObject {
  
  /**
    * [Optional] Number of milliseconds for which to keep the storage for
    * partitions in the table. The storage in a partition will have an
    * expiration time of its partition time plus this value.
    */
  var expirationMs: js.UndefOr[String] = js.undefined
  
  /**
    * [Beta] [Optional] If not set, the table is partitioned by pseudo column,
    * referenced via either &#39;_PARTITIONTIME&#39; as TIMESTAMP type, or
    * &#39;_PARTITIONDATE&#39; as DATE type. If field is specified, the table
    * is instead partitioned by this field. The field must be a top-level
    * TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
    */
  var field: js.UndefOr[String] = js.undefined
  
  var requirePartitionFilter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Required] The only type supported is DAY, which will generate one
    * partition per day.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaTimePartitioning {
  
  @scala.inline
  def apply(): SchemaTimePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimePartitioning]
  }
  
  @scala.inline
  implicit class SchemaTimePartitioningMutableBuilder[Self <: SchemaTimePartitioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationMs(value: String): Self = StObject.set(x, "expirationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMsUndefined: Self = StObject.set(x, "expirationMs", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
