package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the DevExpress.Web.ASPxGantt control.
  */
@js.native
trait ASPxClientGantt extends ASPxClientControl {
  /**
    * Sets the task's title position.
    * @param position The task position.
    */
  def SetTaskTitlePosition(position: ASPxClientGanttTaskTitlePosition): Unit = js.native
  /**
    * Specifies the view type.
    * @param viewType The control's view type.
    */
  def SetViewType(viewType: ASPxClientGanttViewType): Unit = js.native
  /**
    * Specifies whether the resources are visible in the Gantt.
    * @param value true, to show resources in the Gantt; otherwise, false.
    */
  def ShowResources(value: Boolean): Unit = js.native
}

object ASPxClientGantt {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
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
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetTaskTitlePosition = js.Any.fromFunction1(SetTaskTitlePosition), SetViewType = js.Any.fromFunction1(SetViewType), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowResources = js.Any.fromFunction1(ShowResources), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGantt]
  }
  @scala.inline
  implicit class ASPxClientGanttOps[Self <: ASPxClientGantt] (val x: Self) extends AnyVal {
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
    def setSetTaskTitlePosition(value: ASPxClientGanttTaskTitlePosition => Unit): Self = this.set("SetTaskTitlePosition", js.Any.fromFunction1(value))
    @scala.inline
    def setSetViewType(value: ASPxClientGanttViewType => Unit): Self = this.set("SetViewType", js.Any.fromFunction1(value))
    @scala.inline
    def setShowResources(value: Boolean => Unit): Self = this.set("ShowResources", js.Any.fromFunction1(value))
  }
  
}

