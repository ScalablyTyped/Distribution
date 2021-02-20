package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapDropDownEditEventMap extends BootstrapClientEditEventMap {
  
  var buttonClick: ButtonEditClickEventArgs = js.native
  
  var closeUp: EventArgs = js.native
  
  var dropDown: EventArgs = js.native
  
  var keyDown: EditKeyEventArgs = js.native
  
  var keyPress: EditKeyEventArgs = js.native
  
  var keyUp: EditKeyEventArgs = js.native
  
  var queryCloseUp: CancelEventArgs = js.native
  
  var textChanged: ProcessingModeEventArgs = js.native
  
  var userInput: EventArgs = js.native
}
object BootstrapDropDownEditEventMap {
  
  @scala.inline
  def apply(
    buttonClick: ButtonEditClickEventArgs,
    closeUp: EventArgs,
    dropDown: EventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    queryCloseUp: CancelEventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapDropDownEditEventMap = {
    val __obj = js.Dynamic.literal(buttonClick = buttonClick.asInstanceOf[js.Any], closeUp = closeUp.asInstanceOf[js.Any], dropDown = dropDown.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], queryCloseUp = queryCloseUp.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapDropDownEditEventMap]
  }
  
  @scala.inline
  implicit class BootstrapDropDownEditEventMapMutableBuilder[Self <: BootstrapDropDownEditEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonClick(value: ButtonEditClickEventArgs): Self = StObject.set(x, "buttonClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUp(value: EventArgs): Self = StObject.set(x, "closeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDown(value: EventArgs): Self = StObject.set(x, "dropDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDown(value: EditKeyEventArgs): Self = StObject.set(x, "keyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPress(value: EditKeyEventArgs): Self = StObject.set(x, "keyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUp(value: EditKeyEventArgs): Self = StObject.set(x, "keyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryCloseUp(value: CancelEventArgs): Self = StObject.set(x, "queryCloseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInput(value: EventArgs): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
  }
}
