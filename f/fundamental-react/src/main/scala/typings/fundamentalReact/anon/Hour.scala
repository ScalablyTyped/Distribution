package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactInts.`0`
import typings.fundamentalReact.fundamentalReactInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hour extends StObject {
  
  var hour: String
  
  var meridiem: `0` | `1`
  
  var minute: String
  
  var second: String
}
object Hour {
  
  inline def apply(hour: String, meridiem: `0` | `1`, minute: String, second: String): Hour = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hour]
  }
  
  extension [Self <: Hour](x: Self) {
    
    inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMeridiem(value: `0` | `1`): Self = StObject.set(x, "meridiem", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
