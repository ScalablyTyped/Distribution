package typings.flatpickr

import typings.flatpickr.globalsMod.global.Date
import typings.flatpickr.optionsMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weekSelectMod {
  
  @JSImport("flatpickr/dist/plugins/weekSelect/weekSelect", JSImport.Default)
  @js.native
  def default(): Plugin[PlusWeeks] = js.native
  
  @js.native
  trait PlusWeeks extends StObject {
    
    var weekEndDay: Date = js.native
    
    var weekStartDay: Date = js.native
  }
  object PlusWeeks {
    
    @scala.inline
    def apply(weekEndDay: Date, weekStartDay: Date): PlusWeeks = {
      val __obj = js.Dynamic.literal(weekEndDay = weekEndDay.asInstanceOf[js.Any], weekStartDay = weekStartDay.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlusWeeks]
    }
    
    @scala.inline
    implicit class PlusWeeksMutableBuilder[Self <: PlusWeeks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWeekEndDay(value: Date): Self = StObject.set(x, "weekEndDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekStartDay(value: Date): Self = StObject.set(x, "weekStartDay", value.asInstanceOf[js.Any])
    }
  }
}
