package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An input field that allows users to input a time.
  *
  *     // A time picker with default value of 3:30 PM.
  *     var dateTimePicker = CardService.newTimePicker()
  *         .setTitle("Enter the time.")
  *         .setFieldName("time_field")
  *         .setHours(15)
  *         .setMinutes(30)
  *         .setOnChangeAction(CardService.newAction()
  *             .setFunctionName("handleTimeChange"));
  */
trait TimePicker extends StObject {
  
  def setFieldName(fieldName: String): TimePicker
  
  def setHours(hours: Double): TimePicker
  
  def setMinutes(hours: Double): TimePicker
  
  def setOnChangeAction(action: Action): TimePicker
  
  def setTitle(title: String): TimePicker
}
object TimePicker {
  
  inline def apply(
    setFieldName: String => TimePicker,
    setHours: Double => TimePicker,
    setMinutes: Double => TimePicker,
    setOnChangeAction: Action => TimePicker,
    setTitle: String => TimePicker
  ): TimePicker = {
    val __obj = js.Dynamic.literal(setFieldName = js.Any.fromFunction1(setFieldName), setHours = js.Any.fromFunction1(setHours), setMinutes = js.Any.fromFunction1(setMinutes), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[TimePicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimePicker] (val x: Self) extends AnyVal {
    
    inline def setSetFieldName(value: String => TimePicker): Self = StObject.set(x, "setFieldName", js.Any.fromFunction1(value))
    
    inline def setSetHours(value: Double => TimePicker): Self = StObject.set(x, "setHours", js.Any.fromFunction1(value))
    
    inline def setSetMinutes(value: Double => TimePicker): Self = StObject.set(x, "setMinutes", js.Any.fromFunction1(value))
    
    inline def setSetOnChangeAction(value: Action => TimePicker): Self = StObject.set(x, "setOnChangeAction", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => TimePicker): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
