package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientBeginCallbackEventHandler
import typings.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typings.devexpressWeb.ASPxClientEndCallbackEventHandler
import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientGanttCustomCommandEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the Gantt extension.
  */
@JSGlobal("MVCxClientGantt")
@js.native
class MVCxClientGantt ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGantt {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  var BeginCallback: typings.devexpressWeb.ASPxClientEvent[ASPxClientBeginCallbackEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientGantt.
    */
  /* CompleteClass */
  var CallbackError: typings.devexpressWeb.ASPxClientEvent[ASPxClientCallbackErrorEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Collapses all tasks.
    */
  /* CompleteClass */
  override def CollapseAll(): Unit = js.native
  
  /**
    * Collapses the specified parent task.
    * @param key The task key.
    */
  /* CompleteClass */
  override def CollapseTask(key: js.Any): Unit = js.native
  
  /**
    * Enables you to implement a custom command's logic.
    */
  /* CompleteClass */
  var CustomCommand: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttCustomCommandEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  var EndCallback: typings.devexpressWeb.ASPxClientEvent[ASPxClientEndCallbackEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Expands all tasks.
    */
  /* CompleteClass */
  override def ExpandAll(): Unit = js.native
  
  /**
    * Expands the specified task.
    * @param key The task key.
    */
  /* CompleteClass */
  override def ExpandTask(key: js.Any): Unit = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Sets the task's title position.
    * @param position The task position.
    */
  /* CompleteClass */
  override def SetTaskTitlePosition(position: typings.devexpressWeb.ASPxClientGanttTaskTitlePosition): Unit = js.native
  
  /**
    * Specifies the view type.
    * @param viewType The control's view type.
    */
  /* CompleteClass */
  override def SetViewType(viewType: typings.devexpressWeb.ASPxClientGanttViewType): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  
  /**
    * Specifies whether the resources are visible in the Gantt.
    * @param value true, to show resources in the Gantt; otherwise, false.
    */
  /* CompleteClass */
  override def ShowResources(value: Boolean): Unit = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
object MVCxClientGantt {
  
  @JSGlobal("MVCxClientGantt")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the MVCxClientGantt type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  inline def Cast(obj: js.Any): typings.devexpressWeb.MVCxClientGantt = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.devexpressWeb.MVCxClientGantt]
}
