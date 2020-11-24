package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapDateEditEventMap extends BootstrapClientEditEventMap {
  
  var buttonClick: ButtonEditClickEventArgs = js.native
  
  var calendarCustomDisabledDate: CalendarCustomDisabledDateEventArgs = js.native
  
  var closeUp: EventArgs = js.native
  
  var dateChanged: ProcessingModeEventArgs = js.native
  
  var dropDown: EventArgs = js.native
  
  var keyDown: EditKeyEventArgs = js.native
  
  var keyPress: EditKeyEventArgs = js.native
  
  var keyUp: EditKeyEventArgs = js.native
  
  var parseDate: ParseDateEventArgs = js.native
  
  var queryCloseUp: CancelEventArgs = js.native
  
  var textChanged: ProcessingModeEventArgs = js.native
  
  var userInput: EventArgs = js.native
}
object BootstrapDateEditEventMap {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class BootstrapDateEditEventMapOps[Self <: BootstrapDateEditEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButtonClick(value: ButtonEditClickEventArgs): Self = this.set("buttonClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarCustomDisabledDate(value: CalendarCustomDisabledDateEventArgs): Self = this.set("calendarCustomDisabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUp(value: EventArgs): Self = this.set("closeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateChanged(value: ProcessingModeEventArgs): Self = this.set("dateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDown(value: EventArgs): Self = this.set("dropDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDown(value: EditKeyEventArgs): Self = this.set("keyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPress(value: EditKeyEventArgs): Self = this.set("keyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUp(value: EditKeyEventArgs): Self = this.set("keyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseDate(value: ParseDateEventArgs): Self = this.set("parseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryCloseUp(value: CancelEventArgs): Self = this.set("queryCloseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextChanged(value: ProcessingModeEventArgs): Self = this.set("textChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInput(value: EventArgs): Self = this.set("userInput", value.asInstanceOf[js.Any])
  }
}
