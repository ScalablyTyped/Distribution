package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the DevExpress.Web.ASPxGantt control.
  */
@JSGlobal("ASPxClientGantt")
@js.native
class ASPxClientGantt () extends ASPxClientControl {
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

