package typings.dhtmlxscheduler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerHotkeys extends StObject {
  
  var edit_cancel: Double
  
  var edit_save: Double
}
object SchedulerHotkeys {
  
  @scala.inline
  def apply(edit_cancel: Double, edit_save: Double): SchedulerHotkeys = {
    val __obj = js.Dynamic.literal(edit_cancel = edit_cancel.asInstanceOf[js.Any], edit_save = edit_save.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerHotkeys]
  }
  
  @scala.inline
  implicit class SchedulerHotkeysMutableBuilder[Self <: SchedulerHotkeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdit_cancel(value: Double): Self = StObject.set(x, "edit_cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_save(value: Double): Self = StObject.set(x, "edit_save", value.asInstanceOf[js.Any])
  }
}
