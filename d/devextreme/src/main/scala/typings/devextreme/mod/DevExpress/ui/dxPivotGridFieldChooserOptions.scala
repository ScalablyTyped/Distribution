package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllFields
import typings.devextreme.anon.AreaComponent
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Element
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.SearchTimeout
import typings.devextreme.devextremeNumbers.`0`
import typings.devextreme.devextremeNumbers.`1`
import typings.devextreme.devextremeNumbers.`2`
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.onDemand
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPivotGridFieldChooserOptions extends WidgetOptions[dxPivotGridFieldChooser] {
  /** @name dxPivotGridFieldChooser.Options.allowSearch */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGridFieldChooser.Options.applyChangesMode */
  var applyChangesMode: js.UndefOr[instantly | onDemand] = js.undefined
  /** @name dxPivotGridFieldChooser.Options.dataSource */
  var dataSource: js.UndefOr[PivotGridDataSource] = js.undefined
  /** @name dxPivotGridFieldChooser.Options.headerFilter */
  var headerFilter: js.UndefOr[SearchTimeout] = js.undefined
  /** @name dxPivotGridFieldChooser.Options.layout */
  var layout: js.UndefOr[`0` | `1` | `2`] = js.undefined
  /** @name dxPivotGridFieldChooser.Options.onContextMenuPreparing */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ AreaComponent, _]] = js.undefined
  /** @name dxPivotGridFieldChooser.Options.searchTimeout */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  /** @name dxPivotGridFieldChooser.Options.state */
  var state: js.UndefOr[js.Any] = js.undefined
  /** @name dxPivotGridFieldChooser.Options.texts */
  var texts: js.UndefOr[AllFields] = js.undefined
}

object dxPivotGridFieldChooserOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    applyChangesMode: instantly | onDemand = null,
    bindingOptions: js.Any = null,
    dataSource: PivotGridDataSource = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    headerFilter: SearchTimeout = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    layout: `0` | `1` | `2` = null,
    onContentReady: /* e */ ComponentElement[dxPivotGridFieldChooser] => _ = null,
    onContextMenuPreparing: /* e */ AreaComponent => _ = null,
    onDisposing: /* e */ Model[dxPivotGridFieldChooser] => _ = null,
    onInitialized: /* e */ Element[dxPivotGridFieldChooser] => _ = null,
    onOptionChanged: /* e */ Name[dxPivotGridFieldChooser] => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    searchTimeout: js.UndefOr[Double] = js.undefined,
    state: js.Any = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    texts: AllFields = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxPivotGridFieldChooserOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.get.asInstanceOf[js.Any])
    if (applyChangesMode != null) __obj.updateDynamic("applyChangesMode")(applyChangesMode.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onContextMenuPreparing != null) __obj.updateDynamic("onContextMenuPreparing")(js.Any.fromFunction1(onContextMenuPreparing))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(searchTimeout)) __obj.updateDynamic("searchTimeout")(searchTimeout.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPivotGridFieldChooserOptions]
  }
}

