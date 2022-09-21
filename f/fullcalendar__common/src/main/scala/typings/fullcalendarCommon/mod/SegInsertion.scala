package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegInsertion extends StObject {
  
  var lateral: Double
  
  var level: Double
  
  var levelCoord: Double
  
  var stackCnt: Double
  
  var touchingEntry: SegEntry
  
  var touchingLateral: Double
  
  var touchingLevel: Double
}
object SegInsertion {
  
  inline def apply(
    lateral: Double,
    level: Double,
    levelCoord: Double,
    stackCnt: Double,
    touchingEntry: SegEntry,
    touchingLateral: Double,
    touchingLevel: Double
  ): SegInsertion = {
    val __obj = js.Dynamic.literal(lateral = lateral.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], levelCoord = levelCoord.asInstanceOf[js.Any], stackCnt = stackCnt.asInstanceOf[js.Any], touchingEntry = touchingEntry.asInstanceOf[js.Any], touchingLateral = touchingLateral.asInstanceOf[js.Any], touchingLevel = touchingLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegInsertion]
  }
  
  extension [Self <: SegInsertion](x: Self) {
    
    inline def setLateral(value: Double): Self = StObject.set(x, "lateral", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelCoord(value: Double): Self = StObject.set(x, "levelCoord", value.asInstanceOf[js.Any])
    
    inline def setStackCnt(value: Double): Self = StObject.set(x, "stackCnt", value.asInstanceOf[js.Any])
    
    inline def setTouchingEntry(value: SegEntry): Self = StObject.set(x, "touchingEntry", value.asInstanceOf[js.Any])
    
    inline def setTouchingLateral(value: Double): Self = StObject.set(x, "touchingLateral", value.asInstanceOf[js.Any])
    
    inline def setTouchingLevel(value: Double): Self = StObject.set(x, "touchingLevel", value.asInstanceOf[js.Any])
  }
}
