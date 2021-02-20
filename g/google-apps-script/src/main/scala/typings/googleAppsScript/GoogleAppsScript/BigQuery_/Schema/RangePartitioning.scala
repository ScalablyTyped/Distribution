package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangePartitioning extends StObject {
  
  var field: js.UndefOr[String] = js.native
  
  var range: js.UndefOr[RangePartitioningRange] = js.native
}
object RangePartitioning {
  
  @scala.inline
  def apply(): RangePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangePartitioning]
  }
  
  @scala.inline
  implicit class RangePartitioningMutableBuilder[Self <: RangePartitioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setRange(value: RangePartitioningRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
