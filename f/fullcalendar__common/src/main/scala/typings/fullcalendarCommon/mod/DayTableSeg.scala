package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayTableSeg
  extends StObject
     with Seg {
  
  var firstCol: Double
  
  var lastCol: Double
  
  var row: Double
}
object DayTableSeg {
  
  inline def apply(firstCol: Double, isEnd: Boolean, isStart: Boolean, lastCol: Double, row: Double): DayTableSeg = {
    val __obj = js.Dynamic.literal(firstCol = firstCol.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], lastCol = lastCol.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayTableSeg]
  }
  
  extension [Self <: DayTableSeg](x: Self) {
    
    inline def setFirstCol(value: Double): Self = StObject.set(x, "firstCol", value.asInstanceOf[js.Any])
    
    inline def setLastCol(value: Double): Self = StObject.set(x, "lastCol", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
