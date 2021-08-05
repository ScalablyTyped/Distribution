package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client collection that maintains client menu objects.
  */
trait ASPxClientMenuCollection
  extends StObject
     with ASPxClientControlCollection {
  
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
  
  inline def apply(
    BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientControlCollection]],
    BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlCollection]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientControlCollection]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientControlCollection]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientControlCollection]],
    ForEachControl: ASPxClientControlAction => Unit,
    Get: js.Any => js.Any,
    GetByName: String => js.Any,
    GetControlsByPredicate: ASPxClientControlPredicate => js.Array[js.Any],
    GetControlsByType: js.Any => js.Array[js.Any],
    HideAll: () => Unit,
    RecalculateAll: () => Unit,
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  ): ASPxClientMenuCollection = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback.asInstanceOf[js.Any], BrowserWindowResized = BrowserWindowResized.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], ControlsInitialized = ControlsInitialized.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], ForEachControl = js.Any.fromFunction1(ForEachControl), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetControlsByPredicate = js.Any.fromFunction1(GetControlsByPredicate), GetControlsByType = js.Any.fromFunction1(GetControlsByType), HideAll = js.Any.fromFunction0(HideAll), RecalculateAll = js.Any.fromFunction0(RecalculateAll), ValidationCompleted = ValidationCompleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuCollection]
  }
  
  extension [Self <: ASPxClientMenuCollection](x: Self) {
    
    inline def setHideAll(value: () => Unit): Self = StObject.set(x, "HideAll", js.Any.fromFunction0(value))
    
    inline def setRecalculateAll(value: () => Unit): Self = StObject.set(x, "RecalculateAll", js.Any.fromFunction0(value))
  }
}
