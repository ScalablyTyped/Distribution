package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client collection that maintains client popup control objects.
  */
trait ASPxClientPopupControlCollection extends ASPxClientControlCollection {
  /**
    * Hides all popup windows maintained by the collection.
    */
  def HideAllWindows(): scala.Unit
}

object ASPxClientPopupControlCollection {
  @scala.inline
  def apply(
    BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientControlCollection]],
    BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlCollection]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientControlCollection]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientControlCollection]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientControlCollection]],
    ForEachControl: ASPxClientControlAction => scala.Unit,
    Get: js.Object => js.Object,
    GetByName: java.lang.String => js.Object,
    GetControlsByPredicate: ASPxClientControlPredicate => js.Array[js.Object],
    GetControlsByType: js.Object => js.Array[js.Object],
    HideAllWindows: () => scala.Unit,
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  ): ASPxClientPopupControlCollection = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback, BrowserWindowResized = BrowserWindowResized, CallbackError = CallbackError, ControlsInitialized = ControlsInitialized, EndCallback = EndCallback, ForEachControl = js.Any.fromFunction1(ForEachControl), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetControlsByPredicate = js.Any.fromFunction1(GetControlsByPredicate), GetControlsByType = js.Any.fromFunction1(GetControlsByType), HideAllWindows = js.Any.fromFunction0(HideAllWindows), ValidationCompleted = ValidationCompleted)
  
    __obj.asInstanceOf[ASPxClientPopupControlCollection]
  }
}

