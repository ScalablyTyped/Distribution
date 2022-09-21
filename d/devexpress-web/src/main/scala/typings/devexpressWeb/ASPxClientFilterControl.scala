package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client ASPxFilterControl.
  */
trait ASPxClientFilterControl
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs after a new filter expression has been applied.
    */
  var Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]]
  
  /**
    * Applies a filter constructed by an end-user.
    */
  def Apply(): Unit
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientFilterControl.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]]
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]]
  
  /**
    * Returns the applied filter expression.
    */
  def GetAppliedFilterExpression(): String
  
  /**
    * Returns the editor used to edit the specified values. The editor.
    * @param index The index of the filter condition.
    * @param valueIndex The index of the value in the specified filter condition.
    */
  def GetEditor(index: Double, valueIndex: Double): ASPxClientEditBase
  
  /**
    * Returns the filter expression.
    */
  def GetFilterExpression(): String
  
  /**
    * Returns a value indicating whether the filter expression being currently composed on the client side is valid - all expression conditions are filled.
    */
  def IsFilterExpressionValid(): Boolean
  
  /**
    * Resets the current filter expression to a previously applied filter expression.
    */
  def Reset(): Unit
}
object ASPxClientFilterControl {
  
  inline def apply(
    AdjustControl: () => Unit,
    Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]],
    Apply: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]],
    GetAppliedFilterExpression: () => String,
    GetClientVisible: () => Boolean,
    GetEditor: (Double, Double) => ASPxClientEditBase,
    GetFilterExpression: () => String,
    GetHeight: () => Double,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsFilterExpressionValid: () => Boolean,
    Reset: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientFilterControl = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Applied = Applied.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], GetAppliedFilterExpression = js.Any.fromFunction0(GetAppliedFilterExpression), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEditor = js.Any.fromFunction2(GetEditor), GetFilterExpression = js.Any.fromFunction0(GetFilterExpression), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], IsFilterExpressionValid = js.Any.fromFunction0(IsFilterExpressionValid), Reset = js.Any.fromFunction0(Reset), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFilterControl]
  }
  
  extension [Self <: ASPxClientFilterControl](x: Self) {
    
    inline def setApplied(value: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]]): Self = StObject.set(x, "Applied", value.asInstanceOf[js.Any])
    
    inline def setApply(value: () => Unit): Self = StObject.set(x, "Apply", js.Any.fromFunction0(value))
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setGetAppliedFilterExpression(value: () => String): Self = StObject.set(x, "GetAppliedFilterExpression", js.Any.fromFunction0(value))
    
    inline def setGetEditor(value: (Double, Double) => ASPxClientEditBase): Self = StObject.set(x, "GetEditor", js.Any.fromFunction2(value))
    
    inline def setGetFilterExpression(value: () => String): Self = StObject.set(x, "GetFilterExpression", js.Any.fromFunction0(value))
    
    inline def setIsFilterExpressionValid(value: () => Boolean): Self = StObject.set(x, "IsFilterExpressionValid", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
  }
}
