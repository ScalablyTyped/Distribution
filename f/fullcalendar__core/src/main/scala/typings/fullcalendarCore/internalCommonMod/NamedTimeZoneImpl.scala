package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedTimeZoneImpl extends StObject {
  
  def offsetForArray(a: js.Array[Double]): Double
  
  var timeZoneName: String
  
  def timestampToArray(ms: Double): js.Array[Double]
}
object NamedTimeZoneImpl {
  
  inline def apply(
    offsetForArray: js.Array[Double] => Double,
    timeZoneName: String,
    timestampToArray: Double => js.Array[Double]
  ): NamedTimeZoneImpl = {
    val __obj = js.Dynamic.literal(offsetForArray = js.Any.fromFunction1(offsetForArray), timeZoneName = timeZoneName.asInstanceOf[js.Any], timestampToArray = js.Any.fromFunction1(timestampToArray))
    __obj.asInstanceOf[NamedTimeZoneImpl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedTimeZoneImpl] (val x: Self) extends AnyVal {
    
    inline def setOffsetForArray(value: js.Array[Double] => Double): Self = StObject.set(x, "offsetForArray", js.Any.fromFunction1(value))
    
    inline def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    inline def setTimestampToArray(value: Double => js.Array[Double]): Self = StObject.set(x, "timestampToArray", js.Any.fromFunction1(value))
  }
}
