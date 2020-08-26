package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client collection that maintains client menu objects.
  */
@js.native
trait ASPxClientMenuCollection extends ASPxClientControlCollection {
  /**
    * Hides all menus maitained by the collection.
    */
  def HideAll(): Unit = js.native
  /**
    * Recalculates the position of visible sub menus.
    */
  def RecalculateAll(): Unit = js.native
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
    Get: js.Any => js.Any,
    GetByName: String => js.Any,
    GetControlsByPredicate: ASPxClientControlPredicate => js.Array[_],
    GetControlsByType: js.Any => js.Array[_],
    HideAll: () => Unit,
    RecalculateAll: () => Unit,
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  ): ASPxClientMenuCollection = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback.asInstanceOf[js.Any], BrowserWindowResized = BrowserWindowResized.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], ControlsInitialized = ControlsInitialized.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], ForEachControl = js.Any.fromFunction1(ForEachControl), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetControlsByPredicate = js.Any.fromFunction1(GetControlsByPredicate), GetControlsByType = js.Any.fromFunction1(GetControlsByType), HideAll = js.Any.fromFunction0(HideAll), RecalculateAll = js.Any.fromFunction0(RecalculateAll), ValidationCompleted = ValidationCompleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuCollection]
  }
  @scala.inline
  implicit class ASPxClientMenuCollectionOps[Self <: ASPxClientMenuCollection] (val x: Self) extends AnyVal {
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
    def setHideAll(value: () => Unit): Self = this.set("HideAll", js.Any.fromFunction0(value))
    @scala.inline
    def setRecalculateAll(value: () => Unit): Self = this.set("RecalculateAll", js.Any.fromFunction0(value))
  }
  
}

