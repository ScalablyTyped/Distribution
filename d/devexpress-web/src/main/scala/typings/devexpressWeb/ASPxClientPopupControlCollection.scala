package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client collection that maintains client popup control objects.
  */
trait ASPxClientPopupControlCollection
  extends StObject
     with ASPxClientControlCollection {
  
  /**
    * Hides all popup windows maintained by the collection.
    */
  def HideAllWindows(): Unit
}
object ASPxClientPopupControlCollection {
  
  inline def apply(
    BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientControlCollection]],
    BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlCollection]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientControlCollection]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientControlCollection]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientControlCollection]],
    ForEachControl: ASPxClientControlAction => Unit,
    Get: Any => Any,
    GetByName: String => Any,
    GetControlsByPredicate: ASPxClientControlPredicate => js.Array[Any],
    GetControlsByType: Any => js.Array[Any],
    HideAllWindows: () => Unit,
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientControlCollection]]
  ): ASPxClientPopupControlCollection = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback.asInstanceOf[js.Any], BrowserWindowResized = BrowserWindowResized.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], ControlsInitialized = ControlsInitialized.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], ForEachControl = js.Any.fromFunction1(ForEachControl), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetControlsByPredicate = js.Any.fromFunction1(GetControlsByPredicate), GetControlsByType = js.Any.fromFunction1(GetControlsByType), HideAllWindows = js.Any.fromFunction0(HideAllWindows), ValidationCompleted = ValidationCompleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupControlCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientPopupControlCollection] (val x: Self) extends AnyVal {
    
    inline def setHideAllWindows(value: () => Unit): Self = StObject.set(x, "HideAllWindows", js.Any.fromFunction0(value))
  }
}
