package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This helper structure for DraggingTool holds the original location Point.
  */
trait DraggingInfo extends StObject {
  
  // undocumented
  var point: Point
}
object DraggingInfo {
  
  inline def apply(point: Point): DraggingInfo = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggingInfo] (val x: Self) extends AnyVal {
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
