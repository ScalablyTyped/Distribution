package typings.flatpickr

import typings.flatpickr.distTypesGlobalsMod.global.Date
import typings.flatpickr.distTypesOptionsMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsWeekSelectWeekSelectMod {
  
  @JSImport("flatpickr/dist/plugins/weekSelect/weekSelect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin[PlusWeeks] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin[PlusWeeks]]
  
  trait PlusWeeks extends StObject {
    
    var weekEndDay: Date
    
    var weekStartDay: Date
  }
  object PlusWeeks {
    
    inline def apply(weekEndDay: Date, weekStartDay: Date): PlusWeeks = {
      val __obj = js.Dynamic.literal(weekEndDay = weekEndDay.asInstanceOf[js.Any], weekStartDay = weekStartDay.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlusWeeks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlusWeeks] (val x: Self) extends AnyVal {
      
      inline def setWeekEndDay(value: Date): Self = StObject.set(x, "weekEndDay", value.asInstanceOf[js.Any])
      
      inline def setWeekStartDay(value: Date): Self = StObject.set(x, "weekStartDay", value.asInstanceOf[js.Any])
    }
  }
}
