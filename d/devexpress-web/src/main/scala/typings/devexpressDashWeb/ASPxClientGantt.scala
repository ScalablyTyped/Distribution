package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxGantt control.
  */
@JSGlobal("ASPxClientGantt")
@js.native
class ASPxClientGantt () extends ASPxClientTreeList {
  @JSName("BatchEditChangesCanceling")
  var BatchEditChangesCanceling_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListBatchEditChangesCancelingEventHandler[ASPxClientGantt]] = js.native
  @JSName("BatchEditChangesSaving")
  var BatchEditChangesSaving_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListBatchEditChangesSavingEventHandler[ASPxClientGantt]] = js.native
  @JSName("BatchEditConfirmShowing")
  var BatchEditConfirmShowing_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListBatchEditConfirmShowingEventHandler[ASPxClientGantt]] = js.native
  @JSName("BatchEditEndEditing")
  var BatchEditEndEditing_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListBatchEditEndEditingEventHandler[ASPxClientGantt]] = js.native
  @JSName("BatchEditNodeDeleting")
  var BatchEditNodeDeleting_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListBatchEditNodeDeletingEventHandler[ASPxClientGantt]] = js.native
  @JSName("BatchEditNodeInserting")
  var BatchEditNodeInserting_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListBatchEditNodeInsertingEventHandler[ASPxClientGantt]] = js.native
  @JSName("BatchEditNodeRecovering")
  var BatchEditNodeRecovering_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListBatchEditNodeRecoveringEventHandler[ASPxClientGantt]] = js.native
  @JSName("BatchEditNodeValidating")
  var BatchEditNodeValidating_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListBatchEditNodeValidatingEventHandler[ASPxClientGantt]] = js.native
  @JSName("BatchEditStartEditing")
  var BatchEditStartEditing_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListBatchEditStartEditingEventHandler[ASPxClientGantt]] = js.native
  @JSName("BatchEditTemplateCellFocused")
  var BatchEditTemplateCellFocused_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListBatchEditTemplateCellFocusedEventHandler[ASPxClientGantt]] = js.native
  @JSName("EndDragNode")
  var EndDragNode_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListEndDragNodeEventHandler[ASPxClientGantt]] = js.native
  @JSName("FocusedCellChanging")
  var FocusedCellChanging_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListFocusedCellChangingEventHandler[ASPxClientGantt]] = js.native
  @JSName("SelectionChanged")
  var SelectionChanged_ASPxClientGantt: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientGantt]] = js.native
  @JSName("StartDragNode")
  var StartDragNode_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListStartDragNodeEventHandler[ASPxClientGantt]] = js.native
  @JSName("ToolbarItemClick")
  var ToolbarItemClick_ASPxClientGantt: ASPxClientEvent[ASPxClientTreeListToolbarItemClickEventHandler[ASPxClientGantt]] = js.native
  /**
    * Sets a task's title position.
    * @param position Lists title positions.
    */
  def SetTaskTitlePosition(position: ASPxClientGanttTaskTitlePosition): Unit = js.native
  /**
    * Sets a view to display tasks.
    * @param viewType Lists views to display tasks.
    */
  def SetViewType(viewType: ASPxClientGanttViewType): Unit = js.native
  /**
    * Shows resources for tasks.
    * @param value true to display resources; otherwise, false.
    */
  def ShowResources(value: Boolean): Unit = js.native
}

