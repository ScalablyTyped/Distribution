package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowDependencyAdding
import typings.devextreme.anon.AutoUpdateParentTasks
import typings.devextreme.anon.ColorExpr
import typings.devextreme.anon.EndExpr
import typings.devextreme.anon.KeyExpr
import typings.devextreme.anon.ResourceIdExpr
import typings.devextreme.anon.SelectedRowKey
import typings.devextreme.devextremeNumbers.`0`
import typings.devextreme.devextremeNumbers.`1`
import typings.devextreme.devextremeNumbers.`2`
import typings.devextreme.devextremeNumbers.`3`
import typings.devextreme.devextremeNumbers.`4`
import typings.devextreme.devextremeNumbers.`5`
import typings.devextreme.devextremeNumbers.`6`
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.days
import typings.devextreme.devextremeStrings.hours
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.minutes
import typings.devextreme.devextremeStrings.months
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.devextremeStrings.quarters
import typings.devextreme.devextremeStrings.weeks
import typings.devextreme.devextremeStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxGanttOptions extends WidgetOptions[dxGantt] {
  /** @name dxGantt.Options.allowSelection */
  var allowSelection: js.UndefOr[Boolean] = js.native
  /** @name dxGantt.Options.columns */
  var columns: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.native
  /** @name dxGantt.Options.dependencies */
  var dependencies: js.UndefOr[KeyExpr] = js.native
  /** @name dxGantt.Options.editing */
  var editing: js.UndefOr[AllowDependencyAdding] = js.native
  /** @name dxGantt.Options.firstDayOfWeek */
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  /** @name dxGantt.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectedRowKey, _]] = js.native
  /** @name dxGantt.Options.resourceAssignments */
  var resourceAssignments: js.UndefOr[ResourceIdExpr] = js.native
  /** @name dxGantt.Options.resources */
  var resources: js.UndefOr[ColorExpr] = js.native
  /** @name dxGantt.Options.scaleType */
  var scaleType: js.UndefOr[auto | minutes | hours | days | weeks | months | quarters | years] = js.native
  /** @name dxGantt.Options.selectedRowKey */
  var selectedRowKey: js.UndefOr[js.Any] = js.native
  /** @name dxGantt.Options.showResources */
  var showResources: js.UndefOr[Boolean] = js.native
  /** @name dxGantt.Options.showRowLines */
  var showRowLines: js.UndefOr[Boolean] = js.native
  /** @name dxGantt.Options.stripLines */
  var stripLines: js.UndefOr[js.Array[dxGanttStripLine]] = js.native
  /** @name dxGantt.Options.taskListWidth */
  var taskListWidth: js.UndefOr[Double] = js.native
  /** @name dxGantt.Options.taskTitlePosition */
  var taskTitlePosition: js.UndefOr[inside | outside | none] = js.native
  /** @name dxGantt.Options.tasks */
  var tasks: js.UndefOr[EndExpr] = js.native
  /** @name dxGantt.Options.toolbar */
  var toolbar: js.UndefOr[dxGanttToolbar] = js.native
  /** @name dxGantt.Options.validation */
  var validation: js.UndefOr[AutoUpdateParentTasks] = js.native
}

object dxGanttOptions {
  @scala.inline
  def apply(): dxGanttOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttOptions]
  }
  @scala.inline
  implicit class dxGanttOptionsOps[Self <: dxGanttOptions] (val x: Self) extends AnyVal {
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
    def setAllowSelection(value: Boolean): Self = this.set("allowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSelection: Self = this.set("allowSelection", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: (dxTreeListColumn | String)*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[dxTreeListColumn | String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDependencies(value: KeyExpr): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setEditing(value: AllowDependencyAdding): Self = this.set("editing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditing: Self = this.set("editing", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setOnSelectionChanged(value: /* e */ SelectedRowKey => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    @scala.inline
    def setResourceAssignments(value: ResourceIdExpr): Self = this.set("resourceAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceAssignments: Self = this.set("resourceAssignments", js.undefined)
    @scala.inline
    def setResources(value: ColorExpr): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setScaleType(value: auto | minutes | hours | days | weeks | months | quarters | years): Self = this.set("scaleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleType: Self = this.set("scaleType", js.undefined)
    @scala.inline
    def setSelectedRowKey(value: js.Any): Self = this.set("selectedRowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRowKey: Self = this.set("selectedRowKey", js.undefined)
    @scala.inline
    def setShowResources(value: Boolean): Self = this.set("showResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowResources: Self = this.set("showResources", js.undefined)
    @scala.inline
    def setShowRowLines(value: Boolean): Self = this.set("showRowLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRowLines: Self = this.set("showRowLines", js.undefined)
    @scala.inline
    def setStripLinesVarargs(value: dxGanttStripLine*): Self = this.set("stripLines", js.Array(value :_*))
    @scala.inline
    def setStripLines(value: js.Array[dxGanttStripLine]): Self = this.set("stripLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripLines: Self = this.set("stripLines", js.undefined)
    @scala.inline
    def setTaskListWidth(value: Double): Self = this.set("taskListWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskListWidth: Self = this.set("taskListWidth", js.undefined)
    @scala.inline
    def setTaskTitlePosition(value: inside | outside | none): Self = this.set("taskTitlePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskTitlePosition: Self = this.set("taskTitlePosition", js.undefined)
    @scala.inline
    def setTasks(value: EndExpr): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
    @scala.inline
    def setToolbar(value: dxGanttToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setValidation(value: AutoUpdateParentTasks): Self = this.set("validation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
  }
  
}

