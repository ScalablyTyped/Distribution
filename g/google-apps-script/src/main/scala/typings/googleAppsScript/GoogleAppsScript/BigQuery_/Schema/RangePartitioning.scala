package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangePartitioning extends StObject {
  
  var field: js.UndefOr[String] = js.undefined
  
  var range: js.UndefOr[RangePartitioningRange] = js.undefined
}
object RangePartitioning {
  
  inline def apply(): RangePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangePartitioning]
  }
  
  extension [Self <: RangePartitioning](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setRange(value: RangePartitioningRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
