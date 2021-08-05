package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapTagBoxEventMap
  extends StObject
     with BootstrapClientEditEventMap {
  
  var beginCallback: BeginCallbackEventArgs
  
  var buttonClick: ButtonEditClickEventArgs
  
  var callbackError: CallbackErrorEventArgs
  
  var closeUp: EventArgs
  
  var customHighlighting: ListEditCustomHighlightingEventArgs
  
  var dropDown: EventArgs
  
  var endCallback: EndCallbackEventArgs
  
  var itemFiltering: ListEditItemFilteringEventArgs
  
  var keyDown: EditKeyEventArgs
  
  var keyPress: EditKeyEventArgs
  
  var keyUp: EditKeyEventArgs
  
  var queryCloseUp: CancelEventArgs
  
  var selectedIndexChanged: ProcessingModeEventArgs
  
  var tagsChanged: EventArgs
  
  var textChanged: ProcessingModeEventArgs
  
  var userInput: EventArgs
}
object BootstrapTagBoxEventMap {
  
  inline def apply(
    beginCallback: BeginCallbackEventArgs,
    buttonClick: ButtonEditClickEventArgs,
    callbackError: CallbackErrorEventArgs,
    closeUp: EventArgs,
    customHighlighting: ListEditCustomHighlightingEventArgs,
    dropDown: EventArgs,
    endCallback: EndCallbackEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    itemFiltering: ListEditItemFilteringEventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    queryCloseUp: CancelEventArgs,
    selectedIndexChanged: ProcessingModeEventArgs,
    tagsChanged: EventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapTagBoxEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], buttonClick = buttonClick.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], closeUp = closeUp.asInstanceOf[js.Any], customHighlighting = customHighlighting.asInstanceOf[js.Any], dropDown = dropDown.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], itemFiltering = itemFiltering.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], queryCloseUp = queryCloseUp.asInstanceOf[js.Any], selectedIndexChanged = selectedIndexChanged.asInstanceOf[js.Any], tagsChanged = tagsChanged.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTagBoxEventMap]
  }
  
  extension [Self <: BootstrapTagBoxEventMap](x: Self) {
    
    inline def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    inline def setButtonClick(value: ButtonEditClickEventArgs): Self = StObject.set(x, "buttonClick", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    inline def setCloseUp(value: EventArgs): Self = StObject.set(x, "closeUp", value.asInstanceOf[js.Any])
    
    inline def setCustomHighlighting(value: ListEditCustomHighlightingEventArgs): Self = StObject.set(x, "customHighlighting", value.asInstanceOf[js.Any])
    
    inline def setDropDown(value: EventArgs): Self = StObject.set(x, "dropDown", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    inline def setItemFiltering(value: ListEditItemFilteringEventArgs): Self = StObject.set(x, "itemFiltering", value.asInstanceOf[js.Any])
    
    inline def setKeyDown(value: EditKeyEventArgs): Self = StObject.set(x, "keyDown", value.asInstanceOf[js.Any])
    
    inline def setKeyPress(value: EditKeyEventArgs): Self = StObject.set(x, "keyPress", value.asInstanceOf[js.Any])
    
    inline def setKeyUp(value: EditKeyEventArgs): Self = StObject.set(x, "keyUp", value.asInstanceOf[js.Any])
    
    inline def setQueryCloseUp(value: CancelEventArgs): Self = StObject.set(x, "queryCloseUp", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "selectedIndexChanged", value.asInstanceOf[js.Any])
    
    inline def setTagsChanged(value: EventArgs): Self = StObject.set(x, "tagsChanged", value.asInstanceOf[js.Any])
    
    inline def setTextChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
    
    inline def setUserInput(value: EventArgs): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
  }
}
