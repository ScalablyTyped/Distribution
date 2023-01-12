package typings.googleAppsScript.anon

import typings.googleAppsScript.GoogleAppsScript.Addons.DateInputObject
import typings.googleAppsScript.GoogleAppsScript.Addons.DateTimeInputObject
import typings.googleAppsScript.GoogleAppsScript.Addons.StringInputObject
import typings.googleAppsScript.GoogleAppsScript.Addons.TimeInputObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateInput extends StObject {
  
  var dateInput: js.UndefOr[DateInputObject] = js.undefined
  
  var dateTimeInput: js.UndefOr[DateTimeInputObject] = js.undefined
  
  var stringInputs: js.UndefOr[StringInputObject] = js.undefined
  
  var timeInput: js.UndefOr[TimeInputObject] = js.undefined
}
object DateInput {
  
  inline def apply(): DateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateInput] (val x: Self) extends AnyVal {
    
    inline def setDateInput(value: DateInputObject): Self = StObject.set(x, "dateInput", value.asInstanceOf[js.Any])
    
    inline def setDateInputUndefined: Self = StObject.set(x, "dateInput", js.undefined)
    
    inline def setDateTimeInput(value: DateTimeInputObject): Self = StObject.set(x, "dateTimeInput", value.asInstanceOf[js.Any])
    
    inline def setDateTimeInputUndefined: Self = StObject.set(x, "dateTimeInput", js.undefined)
    
    inline def setStringInputs(value: StringInputObject): Self = StObject.set(x, "stringInputs", value.asInstanceOf[js.Any])
    
    inline def setStringInputsUndefined: Self = StObject.set(x, "stringInputs", js.undefined)
    
    inline def setTimeInput(value: TimeInputObject): Self = StObject.set(x, "timeInput", value.asInstanceOf[js.Any])
    
    inline def setTimeInputUndefined: Self = StObject.set(x, "timeInput", js.undefined)
  }
}
