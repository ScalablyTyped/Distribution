package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @public */
trait EventInfo extends StObject {
  
  var point: Point
}
object EventInfo {
  
  inline def apply(point: Point): EventInfo = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventInfo] (val x: Self) extends AnyVal {
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
