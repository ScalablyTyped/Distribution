package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the DevExpress.Web.ASPxGantt control.
  */
trait ASPxClientGantt
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGantt]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientGantt.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientGantt]]
  
  /**
    * Collapses all tasks.
    */
  def CollapseAll(): Unit
  
  /**
    * Collapses the specified parent task.
    * @param key The task key.
    */
  def CollapseTask(key: js.Any): Unit
  
  /**
    * Enables you to implement a custom command's logic.
    */
  var CustomCommand: ASPxClientEvent[ASPxClientGanttCustomCommandEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGantt]]
  
  /**
    * Expands all tasks.
    */
  def ExpandAll(): Unit
  
  /**
    * Expands the specified task.
    * @param key The task key.
    */
  def ExpandTask(key: js.Any): Unit
  
  /**
    * Sets the task's title position.
    * @param position The task position.
    */
  def SetTaskTitlePosition(position: ASPxClientGanttTaskTitlePosition): Unit
  
  /**
    * Specifies the view type.
    * @param viewType The control's view type.
    */
  def SetViewType(viewType: ASPxClientGanttViewType): Unit
  
  /**
    * Specifies whether the resources are visible in the Gantt.
    * @param value true, to show resources in the Gantt; otherwise, false.
    */
  def ShowResources(value: Boolean): Unit
}
object ASPxClientGantt {
  
  inline def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGantt]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientGantt]],
    CollapseAll: () => Unit,
    CollapseTask: js.Any => Unit,
    CustomCommand: ASPxClientEvent[ASPxClientGanttCustomCommandEventHandler[ASPxClientGantt]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGantt]],
    ExpandAll: () => Unit,
    ExpandTask: js.Any => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetTaskTitlePosition: ASPxClientGanttTaskTitlePosition => Unit,
    SetViewType: ASPxClientGanttViewType => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ShowResources: Boolean => Unit,
    name: String
  ): ASPxClientGantt = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CollapseAll = js.Any.fromFunction0(CollapseAll), CollapseTask = js.Any.fromFunction1(CollapseTask), CustomCommand = CustomCommand.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], ExpandAll = js.Any.fromFunction0(ExpandAll), ExpandTask = js.Any.fromFunction1(ExpandTask), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetTaskTitlePosition = js.Any.fromFunction1(SetTaskTitlePosition), SetViewType = js.Any.fromFunction1(SetViewType), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowResources = js.Any.fromFunction1(ShowResources), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGantt]
  }
  
  extension [Self <: ASPxClientGantt](x: Self) {
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setCollapseAll(value: () => Unit): Self = StObject.set(x, "CollapseAll", js.Any.fromFunction0(value))
    
    inline def setCollapseTask(value: js.Any => Unit): Self = StObject.set(x, "CollapseTask", js.Any.fromFunction1(value))
    
    inline def setCustomCommand(value: ASPxClientEvent[ASPxClientGanttCustomCommandEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "CustomCommand", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setExpandAll(value: () => Unit): Self = StObject.set(x, "ExpandAll", js.Any.fromFunction0(value))
    
    inline def setExpandTask(value: js.Any => Unit): Self = StObject.set(x, "ExpandTask", js.Any.fromFunction1(value))
    
    inline def setSetTaskTitlePosition(value: ASPxClientGanttTaskTitlePosition => Unit): Self = StObject.set(x, "SetTaskTitlePosition", js.Any.fromFunction1(value))
    
    inline def setSetViewType(value: ASPxClientGanttViewType => Unit): Self = StObject.set(x, "SetViewType", js.Any.fromFunction1(value))
    
    inline def setShowResources(value: Boolean => Unit): Self = StObject.set(x, "ShowResources", js.Any.fromFunction1(value))
  }
}
