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
    ForEachControl: js.Function1[ASPxClientControlAction, scala.Unit],
    Get: js.Function1[js.Object, js.Object],
    GetByName: js.Function1[java.lang.String, js.Object],
    GetControlsByPredicate: js.Function1[ASPxClientControlPredicate, js.Array[js.Object]],
    GetControlsByType: js.Function1[js.Object, js.Array[js.Object]],
    HideAllWindows: js.Function0[scala.Unit],
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  ): ASPxClientPopupControlCollection = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback, BrowserWindowResized = BrowserWindowResized, CallbackError = CallbackError, ControlsInitialized = ControlsInitialized, EndCallback = EndCallback, ForEachControl = ForEachControl, Get = Get, GetByName = GetByName, GetControlsByPredicate = GetControlsByPredicate, GetControlsByType = GetControlsByType, HideAllWindows = HideAllWindows, ValidationCompleted = ValidationCompleted)
  
    __obj.asInstanceOf[ASPxClientPopupControlCollection]
  }
}

