package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTaskbarInfoEventArgs extends js.Object {
  /** Returns the baseline background of current item.
    */
  var baselineBackground: js.UndefOr[String] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the data of the record.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the milestone background of current item.
    */
  var milestoneBackground: js.UndefOr[String] = js.native
  /** Returns the parent progressbar background of current item.
    */
  var parentProgressbarBackground: js.UndefOr[String] = js.native
  /** Returns the parent progressbar border color of current item.
    */
  var parentProgressbarBorder: js.UndefOr[String] = js.native
  /** Returns the parent taskbar background of current item.
    */
  var parentTaskbarBackground: js.UndefOr[String] = js.native
  /** Returns the parent taskbar border color of current item.
    */
  var parentTaskbarBorder: js.UndefOr[String] = js.native
  /** Returns the progressbar background of current item.
    */
  var progressbarBackground: js.UndefOr[String] = js.native
  /** Returns the progressbar border color of current item.
    */
  var progressbarBorder: js.UndefOr[String] = js.native
  /** Returns the taskbar background of current item.
    */
  var taskbarBackground: js.UndefOr[String] = js.native
  /** Returns the taskbar border color of current item.
    */
  var taskbarBorder: js.UndefOr[String] = js.native
  /** Returns the taskbar text color of current item.
    */
  var taskbarTextColor: js.UndefOr[String] = js.native
}

object QueryTaskbarInfoEventArgs {
  @scala.inline
  def apply(): QueryTaskbarInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTaskbarInfoEventArgs]
  }
  @scala.inline
  implicit class QueryTaskbarInfoEventArgsOps[Self <: QueryTaskbarInfoEventArgs] (val x: Self) extends AnyVal {
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
    def setBaselineBackground(value: String): Self = this.set("baselineBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineBackground: Self = this.set("baselineBackground", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMilestoneBackground(value: String): Self = this.set("milestoneBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilestoneBackground: Self = this.set("milestoneBackground", js.undefined)
    @scala.inline
    def setParentProgressbarBackground(value: String): Self = this.set("parentProgressbarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentProgressbarBackground: Self = this.set("parentProgressbarBackground", js.undefined)
    @scala.inline
    def setParentProgressbarBorder(value: String): Self = this.set("parentProgressbarBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentProgressbarBorder: Self = this.set("parentProgressbarBorder", js.undefined)
    @scala.inline
    def setParentTaskbarBackground(value: String): Self = this.set("parentTaskbarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTaskbarBackground: Self = this.set("parentTaskbarBackground", js.undefined)
    @scala.inline
    def setParentTaskbarBorder(value: String): Self = this.set("parentTaskbarBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTaskbarBorder: Self = this.set("parentTaskbarBorder", js.undefined)
    @scala.inline
    def setProgressbarBackground(value: String): Self = this.set("progressbarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressbarBackground: Self = this.set("progressbarBackground", js.undefined)
    @scala.inline
    def setProgressbarBorder(value: String): Self = this.set("progressbarBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressbarBorder: Self = this.set("progressbarBorder", js.undefined)
    @scala.inline
    def setTaskbarBackground(value: String): Self = this.set("taskbarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarBackground: Self = this.set("taskbarBackground", js.undefined)
    @scala.inline
    def setTaskbarBorder(value: String): Self = this.set("taskbarBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarBorder: Self = this.set("taskbarBorder", js.undefined)
    @scala.inline
    def setTaskbarTextColor(value: String): Self = this.set("taskbarTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarTextColor: Self = this.set("taskbarTextColor", js.undefined)
  }
  
}

