package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegEntry extends StObject {
  
  var index: Double
  
  var span: SegSpan
  
  var thickness: Double
}
object SegEntry {
  
  inline def apply(index: Double, span: SegSpan, thickness: Double): SegEntry = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegEntry] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSpan(value: SegSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
