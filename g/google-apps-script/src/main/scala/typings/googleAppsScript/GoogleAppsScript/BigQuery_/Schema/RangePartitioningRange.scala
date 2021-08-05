package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangePartitioningRange extends StObject {
  
  var end: js.UndefOr[String] = js.undefined
  
  var interval: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
}
object RangePartitioningRange {
  
  inline def apply(): RangePartitioningRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangePartitioningRange]
  }
  
  extension [Self <: RangePartitioningRange](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
