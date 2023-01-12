package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntervalFormatFallback extends StObject {
  
  var intervalFormatFallback: String
}
object IntervalFormatFallback {
  
  inline def apply(intervalFormatFallback: String): IntervalFormatFallback = {
    val __obj = js.Dynamic.literal(intervalFormatFallback = intervalFormatFallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalFormatFallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntervalFormatFallback] (val x: Self) extends AnyVal {
    
    inline def setIntervalFormatFallback(value: String): Self = StObject.set(x, "intervalFormatFallback", value.asInstanceOf[js.Any])
  }
}
