package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientBeginCallbackEventHandler
import typings.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typings.devexpressWeb.ASPxClientEndCallbackEventHandler
import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientGanttContextMenuCustomizationEventHandler
import typings.devexpressWeb.ASPxClientGanttContextMenuEventHandler
import typings.devexpressWeb.ASPxClientGanttCustomCommandEventHandler
import typings.devexpressWeb.ASPxClientGanttDependencyDeletedEventHandler
import typings.devexpressWeb.ASPxClientGanttDependencyDeletingEventHandler
import typings.devexpressWeb.ASPxClientGanttDependencyInsertedEventHandler
import typings.devexpressWeb.ASPxClientGanttDependencyInsertingEventHandler
import typings.devexpressWeb.ASPxClientGanttEndCellEditingEventHandler
import typings.devexpressWeb.ASPxClientGanttFocusedTaskChangedEventHandler
import typings.devexpressWeb.ASPxClientGanttFocusedTaskChangingEventHandler
import typings.devexpressWeb.ASPxClientGanttResourceAssignedEventHandler
import typings.devexpressWeb.ASPxClientGanttResourceAssigningEventHandler
import typings.devexpressWeb.ASPxClientGanttResourceDeletedEventHandler
import typings.devexpressWeb.ASPxClientGanttResourceDeletingEventHandler
import typings.devexpressWeb.ASPxClientGanttResourceInsertedEventHandler
import typings.devexpressWeb.ASPxClientGanttResourceInsertingEventHandler
import typings.devexpressWeb.ASPxClientGanttResourceUnassignedEventHandler
import typings.devexpressWeb.ASPxClientGanttResourceUnassigningEventHandler
import typings.devexpressWeb.ASPxClientGanttStartCellEditingEventHandler
import typings.devexpressWeb.ASPxClientGanttTaskDeletedEventHandler
import typings.devexpressWeb.ASPxClientGanttTaskDeletingEventHandler
import typings.devexpressWeb.ASPxClientGanttTaskEditDialogShowingEventHandler
import typings.devexpressWeb.ASPxClientGanttTaskEventHandler
import typings.devexpressWeb.ASPxClientGanttTaskInsertedEventHandler
import typings.devexpressWeb.ASPxClientGanttTaskInsertingEventHandler
import typings.devexpressWeb.ASPxClientGanttTaskMovingEventHandler
import typings.devexpressWeb.ASPxClientGanttTaskUpdatedEventHandler
import typings.devexpressWeb.ASPxClientGanttTaskUpdatingEventHandler
import typings.devexpressWeb.ASPxClientGanttTooltipShowingEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the Gantt extension.
  */
@JSGlobal("MVCxClientGantt")
@js.native
open class MVCxClientGantt ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGantt {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Assigns a resource to a task.
    * @param resourceKey The resource's key.
    * @param taskKey The task's key.
    */
  /* CompleteClass */
  override def AssignResourceToTask(resourceKey: Any, taskKey: Any): Unit = js.native
  
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
  override def CollapseTask(key: Any): Unit = js.native
  
  /**
    * Occurs when a user right-clicks a task or dependency to open the context menu.
    */
  /* CompleteClass */
  var ContextMenu: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttContextMenuEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs before the built-in context menu is rendered.
    */
  /* CompleteClass */
  var ContextMenuCustomization: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttContextMenuCustomizationEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Enables you to implement a custom command's logic.
    */
  /* CompleteClass */
  var CustomCommand: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttCustomCommandEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Deletes a dependency.
    * @param key The dependency's key.
    */
  /* CompleteClass */
  override def DeleteDependency(key: Any): Unit = js.native
  
  /**
    * Deletes a resource.
    * @param key The resource's key.
    */
  /* CompleteClass */
  override def DeleteResource(key: Any): Unit = js.native
  
  /**
    * Deletes a task.
    * @param key The task's key.
    */
  /* CompleteClass */
  override def DeleteTask(key: Any): Unit = js.native
  
  /**
    * Occurs after a user deleted a dependency.
    */
  /* CompleteClass */
  var DependencyDeleted: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttDependencyDeletedEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user deletes a dependency.
    */
  /* CompleteClass */
  var DependencyDeleting: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttDependencyDeletingEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user inserted a dependency.
    */
  /* CompleteClass */
  var DependencyInserted: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttDependencyInsertedEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user inserts a dependency.
    */
  /* CompleteClass */
  var DependencyInserting: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttDependencyInsertingEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  var EndCallback: typings.devexpressWeb.ASPxClientEvent[ASPxClientEndCallbackEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs before a user finishes editing a cell.
    */
  /* CompleteClass */
  var EndCellEditing: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttEndCellEditingEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
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
  override def ExpandTask(key: Any): Unit = js.native
  
  /**
    * Occurs when a task is focused.
    */
  /* CompleteClass */
  var FocusedTaskChanged: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttFocusedTaskChangedEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a task is focused.
    */
  /* CompleteClass */
  var FocusedTaskChanging: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttFocusedTaskChangingEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Gets the dependency data. The dependency's data.
    * @param key The dependency's key.
    */
  /* CompleteClass */
  override def GetDependencyData(key: Any): Any = js.native
  
  /**
    * Gets the focused task's key.
    */
  /* CompleteClass */
  override def GetFocusedTaskKey(): Any = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Gets the resource assignment data. The resource assignment data.
    * @param key The resource assignment's key.
    */
  /* CompleteClass */
  override def GetResourceAssignmentData(key: Any): Any = js.native
  
  /**
    * Gets the resource data. The resource's data.
    * @param key The resource's key.
    */
  /* CompleteClass */
  override def GetResourceData(key: Any): Any = js.native
  
  /**
    * Gets the task data. The task data.
    * @param key The task's key.
    */
  /* CompleteClass */
  override def GetTaskData(key: Any): Any = js.native
  
  /**
    * Gets resources assigned to a task. The resources.
    * @param key The task's key.
    */
  /* CompleteClass */
  override def GetTaskResources(key: Any): js.Array[Any] = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Gets the keys of the visible dependencies.
    */
  /* CompleteClass */
  override def GetVisibleDependencyKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible resource assignments.
    */
  /* CompleteClass */
  override def GetVisibleResourceAssignmentKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible resources.
    */
  /* CompleteClass */
  override def GetVisibleResourceKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible tasks.
    */
  /* CompleteClass */
  override def GetVisibleTaskKeys(): js.Array[Any] = js.native
  
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
    * Inserts a new dependency.
    * @param data The dependency data.
    */
  /* CompleteClass */
  override def InsertDependency(data: Any): Unit = js.native
  
  /**
    * Inserts a new resource.
    * @param data The resource data.
    * @param taskKeys An array of tasks' keys.
    */
  /* CompleteClass */
  override def InsertResource(data: Any, taskKeys: js.Array[Any]): Unit = js.native
  
  /**
    * Inserts a new task.
    * @param data The task data.
    */
  /* CompleteClass */
  override def InsertTask(data: Any): Unit = js.native
  
  /**
    * Occurs after a user assigned a resource to a task.
    */
  /* CompleteClass */
  var ResourceAssigned: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceAssignedEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user assigns a resource to a task.
    */
  /* CompleteClass */
  var ResourceAssigning: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceAssigningEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user deleted a resource.
    */
  /* CompleteClass */
  var ResourceDeleted: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceDeletedEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user deletes a resource.
    */
  /* CompleteClass */
  var ResourceDeleting: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceDeletingEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user inserted a new resource.
    */
  /* CompleteClass */
  var ResourceInserted: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceInsertedEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user inserts a new resource.
    */
  /* CompleteClass */
  var ResourceInserting: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceInsertingEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user removed a resource from a task.
    */
  /* CompleteClass */
  var ResourceUnassigned: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceUnassignedEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user removes a resource from a task.
    */
  /* CompleteClass */
  var ResourceUnassigning: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceUnassigningEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
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
    * Sets the focused task.
    * @param key The task's key.
    */
  /* CompleteClass */
  override def SetFocusedTaskKey(key: Any): Unit = js.native
  
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
    * Occurs before a user starts to edit a cell.
    */
  /* CompleteClass */
  var StartCellEditing: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttStartCellEditingEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs when a user clicks a task.
    */
  /* CompleteClass */
  var TaskClick: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs when a user double-clicks a task.
    */
  /* CompleteClass */
  var TaskDblClick: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs after a user deleted a task.
    */
  /* CompleteClass */
  var TaskDeleted: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskDeletedEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs before a user deletes a task.
    */
  /* CompleteClass */
  var TaskDeleting: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskDeletingEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs before the edit dialog is shown.
    */
  /* CompleteClass */
  var TaskEditDialogShowing: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttTaskEditDialogShowingEventHandler[typings.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user inserted a task.
    */
  /* CompleteClass */
  var TaskInserted: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskInsertedEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs before a user inserts a task.
    */
  /* CompleteClass */
  var TaskInserting: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskInsertingEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs before a user moves a task.
    */
  /* CompleteClass */
  var TaskMoving: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskMovingEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs after a user updated a task.
    */
  /* CompleteClass */
  var TaskUpdated: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskUpdatedEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs before a user updates a task.
    */
  /* CompleteClass */
  var TaskUpdating: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskUpdatingEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs before a tooltip is displayed.
    */
  /* CompleteClass */
  var TooltipShowing: typings.devexpressWeb.ASPxClientEvent[ASPxClientGanttTooltipShowingEventHandler[typings.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Removes a resource from the task.
    * @param resourceKey The resource's key.
    * @param taskKey The task's key.
    */
  /* CompleteClass */
  override def UnassignResourceFromTask(resourceKey: Any, taskKey: Any): Unit = js.native
  
  /**
    * Updates the task data.
    * @param key The task's key.
    * @param data The task data.
    */
  /* CompleteClass */
  override def UpdateTask(key: Any, data: Any): Unit = js.native
  
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
  inline def Cast(obj: Any): typings.devexpressWeb.MVCxClientGantt = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.devexpressWeb.MVCxClientGantt]
}
