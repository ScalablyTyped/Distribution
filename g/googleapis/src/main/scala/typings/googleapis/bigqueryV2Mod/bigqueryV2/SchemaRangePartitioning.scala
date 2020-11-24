package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRangePartitioning extends js.Object {
  
  /**
    * [TrustedTester] [Required] The table is partitioned by this field. The
    * field must be a top-level NULLABLE/REQUIRED field. The only supported
    * type is INTEGER/INT64.
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * [TrustedTester] [Required] Defines the ranges for range partitioning.
    */
  var range: js.UndefOr[End] = js.native
}
object SchemaRangePartitioning {
  
  @scala.inline
  def apply(): SchemaRangePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRangePartitioning]
  }
  
  @scala.inline
  implicit class SchemaRangePartitioningOps[Self <: SchemaRangePartitioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setRange(value: End): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
