package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowDependencyAdding
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Element
import typings.devextreme.anon.EndExpr
import typings.devextreme.anon.KeyExpr
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.ResourceIdExpr
import typings.devextreme.anon.SelectedRowKey
import typings.devextreme.anon.TextExpr
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
  /** @name dxGantt.Options.allowSelection */
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  /** @name dxGantt.Options.columns */
  var columns: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.undefined
  /** @name dxGantt.Options.dependencies */
  var dependencies: js.UndefOr[KeyExpr] = js.undefined
  /** @name dxGantt.Options.editing */
  var editing: js.UndefOr[AllowDependencyAdding] = js.undefined
  /** @name dxGantt.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectedRowKey, _]] = js.undefined
  /** @name dxGantt.Options.resourceAssignments */
  var resourceAssignments: js.UndefOr[ResourceIdExpr] = js.undefined
  /** @name dxGantt.Options.resources */
  var resources: js.UndefOr[TextExpr] = js.undefined
  /** @name dxGantt.Options.scaleType */
  var scaleType: js.UndefOr[auto | minutes | hours | days | weeks | months | quarters | years] = js.undefined
  /** @name dxGantt.Options.selectedRowKey */
  var selectedRowKey: js.UndefOr[js.Any] = js.undefined
  /** @name dxGantt.Options.showResources */
  var showResources: js.UndefOr[Boolean] = js.undefined
  /** @name dxGantt.Options.showRowLines */
  var showRowLines: js.UndefOr[Boolean] = js.undefined
  /** @name dxGantt.Options.taskListWidth */
  var taskListWidth: js.UndefOr[Double] = js.undefined
  /** @name dxGantt.Options.taskTitlePosition */
  var taskTitlePosition: js.UndefOr[inside | outside | none] = js.undefined
  /** @name dxGantt.Options.tasks */
  var tasks: js.UndefOr[EndExpr] = js.undefined
}

object dxGanttOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowSelection: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    columns: js.Array[dxTreeListColumn | String] = null,
    dependencies: KeyExpr = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editing: AllowDependencyAdding = null,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    onContentReady: /* e */ ComponentElement[dxGantt] => _ = null,
    onDisposing: /* e */ Model[dxGantt] => _ = null,
    onInitialized: /* e */ Element[dxGantt] => _ = null,
    onOptionChanged: /* e */ Name[dxGantt] => _ = null,
    onSelectionChanged: /* e */ SelectedRowKey => _ = null,
    resourceAssignments: ResourceIdExpr = null,
    resources: TextExpr = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scaleType: auto | minutes | hours | days | weeks | months | quarters | years = null,
    selectedRowKey: js.Any = null,
    showResources: js.UndefOr[Boolean] = js.undefined,
    showRowLines: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    taskListWidth: js.UndefOr[Double] = js.undefined,
    taskTitlePosition: inside | outside | none = null,
    tasks: EndExpr = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxGanttOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (editing != null) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (resourceAssignments != null) __obj.updateDynamic("resourceAssignments")(resourceAssignments.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType.asInstanceOf[js.Any])
    if (selectedRowKey != null) __obj.updateDynamic("selectedRowKey")(selectedRowKey.asInstanceOf[js.Any])
    if (!js.isUndefined(showResources)) __obj.updateDynamic("showResources")(showResources.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowLines)) __obj.updateDynamic("showRowLines")(showRowLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(taskListWidth)) __obj.updateDynamic("taskListWidth")(taskListWidth.get.asInstanceOf[js.Any])
    if (taskTitlePosition != null) __obj.updateDynamic("taskTitlePosition")(taskTitlePosition.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxGanttOptions]
  }
}

