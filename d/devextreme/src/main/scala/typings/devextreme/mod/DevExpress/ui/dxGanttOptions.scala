package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAllowDependencyAdding
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonEndExpr
import typings.devextreme.AnonKeyExpr
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonResourceIdExpr
import typings.devextreme.AnonSelectedRowKey
import typings.devextreme.AnonTextExpr
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

trait dxGanttOptions extends WidgetOptions[dxGantt] {
  /** Specifies whether users can select tasks in the Gantt. */
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  /** An array of columns in the Gantt. */
  var columns: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.undefined
  /** Configures dependencies. */
  var dependencies: js.UndefOr[AnonKeyExpr] = js.undefined
  /** Configures edit options. */
  var editing: js.UndefOr[AnonAllowDependencyAdding] = js.undefined
  /** A function that is executed after users select a task or clear its selection. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonSelectedRowKey, _]] = js.undefined
  /** Configures resource assignments. */
  var resourceAssignments: js.UndefOr[AnonResourceIdExpr] = js.undefined
  /** Configures task resources. */
  var resources: js.UndefOr[AnonTextExpr] = js.undefined
  /** Specifies the zoom level of tasks in the Gantt chart. */
  var scaleType: js.UndefOr[auto | minutes | hours | days | weeks | months | quarters | years] = js.undefined
  /** Allows you to select a row or determine which row is selected. */
  var selectedRowKey: js.UndefOr[js.Any] = js.undefined
  /** Specifies whether to display task resources. */
  var showResources: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to show/hide horizontal faint lines that separate tasks. */
  var showRowLines: js.UndefOr[Boolean] = js.undefined
  /** Specifies the width of the task list in pixels. */
  var taskListWidth: js.UndefOr[Double] = js.undefined
  /** Specifies a task's title position. */
  var taskTitlePosition: js.UndefOr[inside | outside | none] = js.undefined
  /** Configures tasks. */
  var tasks: js.UndefOr[AnonEndExpr] = js.undefined
}

object dxGanttOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowSelection: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    columns: js.Array[dxTreeListColumn | String] = null,
    dependencies: AnonKeyExpr = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editing: AnonAllowDependencyAdding = null,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    onContentReady: /* e */ AnonComponentElement[dxGantt] => _ = null,
    onDisposing: /* e */ AnonModel[dxGantt] => _ = null,
    onInitialized: /* e */ AnonElement[dxGantt] => _ = null,
    onOptionChanged: /* e */ AnonName[dxGantt] => _ = null,
    onSelectionChanged: /* e */ AnonSelectedRowKey => _ = null,
    resourceAssignments: AnonResourceIdExpr = null,
    resources: AnonTextExpr = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scaleType: auto | minutes | hours | days | weeks | months | quarters | years = null,
    selectedRowKey: js.Any = null,
    showResources: js.UndefOr[Boolean] = js.undefined,
    showRowLines: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    taskListWidth: Int | Double = null,
    taskTitlePosition: inside | outside | none = null,
    tasks: AnonEndExpr = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxGanttOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editing != null) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (resourceAssignments != null) __obj.updateDynamic("resourceAssignments")(resourceAssignments.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType.asInstanceOf[js.Any])
    if (selectedRowKey != null) __obj.updateDynamic("selectedRowKey")(selectedRowKey.asInstanceOf[js.Any])
    if (!js.isUndefined(showResources)) __obj.updateDynamic("showResources")(showResources.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowLines)) __obj.updateDynamic("showRowLines")(showRowLines.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (taskListWidth != null) __obj.updateDynamic("taskListWidth")(taskListWidth.asInstanceOf[js.Any])
    if (taskTitlePosition != null) __obj.updateDynamic("taskTitlePosition")(taskTitlePosition.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxGanttOptions]
  }
}

