package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactNumbers.`0`
import typings.fundamentalReact.fundamentalReactNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hour extends StObject {
  
  var hour: String = js.native
  
  var meridiem: `0` | `1` = js.native
  
  var minute: String = js.native
  
  var second: String = js.native
}
object Hour {
  
  @scala.inline
  def apply(hour: String, meridiem: `0` | `1`, minute: String, second: String): Hour = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hour]
  }
  
  @scala.inline
  implicit class HourMutableBuilder[Self <: Hour] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeridiem(value: `0` | `1`): Self = StObject.set(x, "meridiem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
