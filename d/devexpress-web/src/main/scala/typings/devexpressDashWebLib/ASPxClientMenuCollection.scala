package typings
package devexpressDashWebLib

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
  def HideAll(): scala.Unit
  /**
    * Recalculates the position of visible sub menus.
    */
  def RecalculateAll(): scala.Unit
}

object ASPxClientMenuCollection {
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
    HideAll: js.Function0[scala.Unit],
    RecalculateAll: js.Function0[scala.Unit],
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  ): ASPxClientMenuCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BeginCallback")(BeginCallback)
    __obj.updateDynamic("BrowserWindowResized")(BrowserWindowResized)
    __obj.updateDynamic("CallbackError")(CallbackError)
    __obj.updateDynamic("ControlsInitialized")(ControlsInitialized)
    __obj.updateDynamic("EndCallback")(EndCallback)
    __obj.updateDynamic("ForEachControl")(ForEachControl)
    __obj.updateDynamic("Get")(Get)
    __obj.updateDynamic("GetByName")(GetByName)
    __obj.updateDynamic("GetControlsByPredicate")(GetControlsByPredicate)
    __obj.updateDynamic("GetControlsByType")(GetControlsByType)
    __obj.updateDynamic("HideAll")(HideAll)
    __obj.updateDynamic("RecalculateAll")(RecalculateAll)
    __obj.updateDynamic("ValidationCompleted")(ValidationCompleted)
    __obj.asInstanceOf[ASPxClientMenuCollection]
  }
}

