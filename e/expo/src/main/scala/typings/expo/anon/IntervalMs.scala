package typings.expo.anon

import typings.expo.expoStrings.day
import typings.expo.expoStrings.hour
import typings.expo.expoStrings.minute
import typings.expo.expoStrings.month
import typings.expo.expoStrings.week
import typings.expo.expoStrings.year
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntervalMs extends StObject {
  
  var intervalMs: js.UndefOr[Double] = js.undefined
  
  var repeat: js.UndefOr[minute | hour | day | week | month | year] = js.undefined
  
  var time: js.UndefOr[Date | Double] = js.undefined
}
object IntervalMs {
  
  @scala.inline
  def apply(): IntervalMs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntervalMs]
  }
  
  @scala.inline
  implicit class IntervalMsMutableBuilder[Self <: IntervalMs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntervalMs(value: Double): Self = StObject.set(x, "intervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalMsUndefined: Self = StObject.set(x, "intervalMs", js.undefined)
    
    @scala.inline
    def setRepeat(value: minute | hour | day | week | month | year): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setTime(value: Date | Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
