package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRangePartitioning extends StObject {
  
  /**
    * [TrustedTester] [Required] The table is partitioned by this field. The
    * field must be a top-level NULLABLE/REQUIRED field. The only supported
    * type is INTEGER/INT64.
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * [TrustedTester] [Required] Defines the ranges for range partitioning.
    */
  var range: js.UndefOr[End] = js.undefined
}
object SchemaRangePartitioning {
  
  @scala.inline
  def apply(): SchemaRangePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRangePartitioning]
  }
  
  @scala.inline
  implicit class SchemaRangePartitioningMutableBuilder[Self <: SchemaRangePartitioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setRange(value: End): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
