package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapDateEditEventMap
  extends StObject
     with BootstrapClientEditEventMap {
  
  var buttonClick: ButtonEditClickEventArgs
  
  var calendarCustomDisabledDate: CalendarCustomDisabledDateEventArgs
  
  var closeUp: EventArgs
  
  var dateChanged: ProcessingModeEventArgs
  
  var dropDown: EventArgs
  
  var keyDown: EditKeyEventArgs
  
  var keyPress: EditKeyEventArgs
  
  var keyUp: EditKeyEventArgs
  
  var parseDate: ParseDateEventArgs
  
  var queryCloseUp: CancelEventArgs
  
  var textChanged: ProcessingModeEventArgs
  
  var userInput: EventArgs
}
object BootstrapDateEditEventMap {
  
  inline def apply(
    buttonClick: ButtonEditClickEventArgs,
    calendarCustomDisabledDate: CalendarCustomDisabledDateEventArgs,
    closeUp: EventArgs,
    dateChanged: ProcessingModeEventArgs,
    dropDown: EventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    parseDate: ParseDateEventArgs,
    queryCloseUp: CancelEventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapDateEditEventMap = {
    val __obj = js.Dynamic.literal(buttonClick = buttonClick.asInstanceOf[js.Any], calendarCustomDisabledDate = calendarCustomDisabledDate.asInstanceOf[js.Any], closeUp = closeUp.asInstanceOf[js.Any], dateChanged = dateChanged.asInstanceOf[js.Any], dropDown = dropDown.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], parseDate = parseDate.asInstanceOf[js.Any], queryCloseUp = queryCloseUp.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapDateEditEventMap]
  }
  
  extension [Self <: BootstrapDateEditEventMap](x: Self) {
    
    inline def setButtonClick(value: ButtonEditClickEventArgs): Self = StObject.set(x, "buttonClick", value.asInstanceOf[js.Any])
    
    inline def setCalendarCustomDisabledDate(value: CalendarCustomDisabledDateEventArgs): Self = StObject.set(x, "calendarCustomDisabledDate", value.asInstanceOf[js.Any])
    
    inline def setCloseUp(value: EventArgs): Self = StObject.set(x, "closeUp", value.asInstanceOf[js.Any])
    
    inline def setDateChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "dateChanged", value.asInstanceOf[js.Any])
    
    inline def setDropDown(value: EventArgs): Self = StObject.set(x, "dropDown", value.asInstanceOf[js.Any])
    
    inline def setKeyDown(value: EditKeyEventArgs): Self = StObject.set(x, "keyDown", value.asInstanceOf[js.Any])
    
    inline def setKeyPress(value: EditKeyEventArgs): Self = StObject.set(x, "keyPress", value.asInstanceOf[js.Any])
    
    inline def setKeyUp(value: EditKeyEventArgs): Self = StObject.set(x, "keyUp", value.asInstanceOf[js.Any])
    
    inline def setParseDate(value: ParseDateEventArgs): Self = StObject.set(x, "parseDate", value.asInstanceOf[js.Any])
    
    inline def setQueryCloseUp(value: CancelEventArgs): Self = StObject.set(x, "queryCloseUp", value.asInstanceOf[js.Any])
    
    inline def setTextChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
    
    inline def setUserInput(value: EventArgs): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
  }
}
