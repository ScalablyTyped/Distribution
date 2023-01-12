package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegRect
  extends StObject
     with SegEntry {
  
  var levelCoord: Double
}
object SegRect {
  
  inline def apply(index: Double, levelCoord: Double, span: SegSpan, thickness: Double): SegRect = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], levelCoord = levelCoord.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegRect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegRect] (val x: Self) extends AnyVal {
    
    inline def setLevelCoord(value: Double): Self = StObject.set(x, "levelCoord", value.asInstanceOf[js.Any])
  }
}
