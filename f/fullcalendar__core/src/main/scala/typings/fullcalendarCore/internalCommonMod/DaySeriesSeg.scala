package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DaySeriesSeg extends StObject {
  
  var firstIndex: Double
  
  var isEnd: Boolean
  
  var isStart: Boolean
  
  var lastIndex: Double
}
object DaySeriesSeg {
  
  inline def apply(firstIndex: Double, isEnd: Boolean, isStart: Boolean, lastIndex: Double): DaySeriesSeg = {
    val __obj = js.Dynamic.literal(firstIndex = firstIndex.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaySeriesSeg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DaySeriesSeg] (val x: Self) extends AnyVal {
    
    inline def setFirstIndex(value: Double): Self = StObject.set(x, "firstIndex", value.asInstanceOf[js.Any])
    
    inline def setIsEnd(value: Boolean): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
    
    inline def setIsStart(value: Boolean): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
    
    inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
  }
}
