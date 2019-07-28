package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client collection that maintains client menu objects.
  */
trait ASPxClientMenuCollection extends ASPxClientControlCollection {
  /**
    * Hides all menus maitained by the collection.
    */
  def HideAll(): Unit
  /**
    * Recalculates the position of visible sub menus.
    */
  def RecalculateAll(): Unit
}

object ASPxClientMenuCollection {
  @scala.inline
  def apply(
    BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientControlCollection]],
    BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlCollection]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientControlCollection]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientControlCollection]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientControlCollection]],
    ForEachControl: ASPxClientControlAction => Unit,
    Get: js.Object => js.Object,
    GetByName: String => js.Object,
    GetControlsByPredicate: ASPxClientControlPredicate => js.Array[js.Object],
    GetControlsByType: js.Object => js.Array[js.Object],
    HideAll: () => Unit,
    RecalculateAll: () => Unit,
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  ): ASPxClientMenuCollection = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback, BrowserWindowResized = BrowserWindowResized, CallbackError = CallbackError, ControlsInitialized = ControlsInitialized, EndCallback = EndCallback, ForEachControl = js.Any.fromFunction1(ForEachControl), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetControlsByPredicate = js.Any.fromFunction1(GetControlsByPredicate), GetControlsByType = js.Any.fromFunction1(GetControlsByType), HideAll = js.Any.fromFunction0(HideAll), RecalculateAll = js.Any.fromFunction0(RecalculateAll), ValidationCompleted = ValidationCompleted)
  
    __obj.asInstanceOf[ASPxClientMenuCollection]
  }
}

