package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the tree map items.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the border brush color of the treemap
    * @Default {white}
    */
  var borderBrush: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border thickness of the treemap
    * @Default {1}
    */
  var borderThickness: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the field name in the datasource that contains color values for treemap items.
    * @Default {null}
    */
  var colorPath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the color value path of the treemap
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the datasource of the treemap
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Specifies the desaturationColorMapping settings of the treemap
    */
  var desaturationColorMapping: js.UndefOr[DesaturationColorMapping] = js.undefined
  /** Specifies the dockPosition for legend
    * @Default {top}
    */
  var dockPosition: js.UndefOr[DockPosition | java.lang.String] = js.undefined
  /** Fires, on double clicking the tree map items.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** This property is used to select group of treemap items while clicking and dragging
    * @Default {false}
    */
  var draggingGroupOnSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** This property is used to select treemap items while clicking and dragging
    * @Default {false}
    */
  var draggingOnSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** specifies the drillDown header color
    * @Default {'null'}
    */
  var drillDownHeaderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers on treemap  drilldown  item  selected.
    */
  var drillDownItemSelected: js.UndefOr[js.Function1[/* e */ DrillDownItemSelectedEventArgs, scala.Unit]] = js.undefined
  /** Specifies to render particular level of the treemap.
    * @Default {0}
    */
  var drillDownLevel: js.UndefOr[scala.Double] = js.undefined
  /** specifies the drillDown selection color
    * @Default {'#000000'}
    */
  var drillDownSelectionColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies to drill the particular data of the treemap.
    * @Default {null}
    */
  var drillDownValue: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when drilldown is started
    */
  var drillStarted: js.UndefOr[js.Function1[/* e */ DrillStartedEventArgs, scala.Unit]] = js.undefined
  /** Enable/Disable the drillDown for treemap
    * @Default {false}
    */
  var enableDrillDown: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether gradient color has to be applied for treemap items
    * @Default {false}
    */
  var enableGradient: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether treemap need to resize when container is resized
    * @Default {true}
    */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the group color mapping of the treemap
    * @Default {[]}
    */
  var groupColorMapping: js.UndefOr[js.Array[GroupColorMapping]] = js.undefined
  /** Specifies the selection mode of the treemap. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var groupSelectionMode: js.UndefOr[groupSelectionMode | java.lang.String] = js.undefined
  /** Specifies the header for parent item during drilldown. This is applicable only for hierarchical data source.
    * @Default {null}
    */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers before rendering the treemap drilldown header template
    */
  var headerTemplateRendering: js.UndefOr[js.Function1[/* e */ HeaderTemplateRenderingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the highlight border brush of treemap
    * @Default {gray}
    */
  var highlightBorderBrush: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border thickness when treemap items is highlighted in the treemap
    * @Default {5}
    */
  var highlightBorderThickness: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the highlight border brush of treemap
    * @Default {gray}
    */
  var highlightGroupBorderBrush: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border thickness when treemap items is highlighted in the treemap
    * @Default {5}
    */
  var highlightGroupBorderThickness: js.UndefOr[scala.Double] = js.undefined
  /** Specifies whether treemap item need to highlighted on selection
    * @Default {false}
    */
  var highlightGroupOnSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether treemap item need to highlighted on selection
    * @Default {false}
    */
  var highlightOnSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether datasource is hierarchical or not.
    * @Default {false}
    */
  var isHierarchicalDatasource: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether Treemap has to be responsive while resizing the window.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers while rendering each treemap items.
    */
  var itemRendering: js.UndefOr[js.Function1[/* e */ ItemRenderingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the items layout mode of the treemap. Accepted itemsLayoutMode values are Squarified, SliceAndDiceHorizontal, SliceAndDiceVertical and SliceAndDiceAuto
    * @Default {Squarified}
    */
  var itemsLayoutMode: js.UndefOr[ItemsLayoutMode | java.lang.String] = js.undefined
  /** Specifies the leaf settings of the treemap
    */
  var leafItemSettings: js.UndefOr[LeafItemSettings] = js.undefined
  /** Triggers while rendering each legend item
    */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the legend settings of the treemap
    */
  var legendSettings: js.UndefOr[LegendSettings] = js.undefined
  /** Specify levels of treemap for grouped visualization of data
    * @Default {[]}
    */
  var levels: js.UndefOr[js.Array[Level]] = js.undefined
  /** Name of the culture based on which Tree Map should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the paletteColorMapping of the treemap
    */
  var paletteColorMapping: js.UndefOr[PaletteColorMapping] = js.undefined
  /** Specifies the rangeColorMapping settings of the treemap
    * @Default {[]}
    */
  var rangeColorMapping: js.UndefOr[js.Array[RangeColorMapping]] = js.undefined
  /** Triggers after refreshing the treemap items.
    */
  var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, scala.Unit]] = js.undefined
  /** Fires, on right clicking the tree map items.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the selection mode of treemap item. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var selectionMode: js.UndefOr[selectionMode | java.lang.String] = js.undefined
  /** Specifies the legend visibility status of the treemap
    * @Default {false}
    */
  var showLegend: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether treemap showTooltip need to be visible
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the tooltip template of the treemap
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when the group selection is performed on treemap items.
    */
  var treeMapGroupSelected: js.UndefOr[js.Function1[/* e */ TreeMapGroupSelectedEventArgs, scala.Unit]] = js.undefined
  /** Triggers on treemap item selected.
    */
  var treeMapItemSelected: js.UndefOr[js.Function1[/* e */ TreeMapItemSelectedEventArgs, scala.Unit]] = js.undefined
  /** Hold the treeMapItems to be displayed in treemap
    * @Default {[]}
    */
  var treeMapItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the uniColorMapping settings of the treemap
    */
  var uniColorMapping: js.UndefOr[UniColorMapping] = js.undefined
  /** Specifies the weight value path of the treemap
    * @Default {null}
    */
  var weightValuePath: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Click: /* e */ ClickEventArgs => scala.Unit = null,
    borderBrush: java.lang.String = null,
    borderThickness: scala.Int | scala.Double = null,
    colorPath: java.lang.String = null,
    colorValuePath: java.lang.String = null,
    dataSource: js.Any = null,
    desaturationColorMapping: DesaturationColorMapping = null,
    dockPosition: DockPosition | java.lang.String = null,
    doubleClick: /* e */ DoubleClickEventArgs => scala.Unit = null,
    draggingGroupOnSelection: js.UndefOr[scala.Boolean] = js.undefined,
    draggingOnSelection: js.UndefOr[scala.Boolean] = js.undefined,
    drillDownHeaderColor: java.lang.String = null,
    drillDownItemSelected: /* e */ DrillDownItemSelectedEventArgs => scala.Unit = null,
    drillDownLevel: scala.Int | scala.Double = null,
    drillDownSelectionColor: java.lang.String = null,
    drillDownValue: java.lang.String = null,
    drillStarted: /* e */ DrillStartedEventArgs => scala.Unit = null,
    enableDrillDown: js.UndefOr[scala.Boolean] = js.undefined,
    enableGradient: js.UndefOr[scala.Boolean] = js.undefined,
    enableGroupSeparator: js.UndefOr[scala.Boolean] = js.undefined,
    enableResize: js.UndefOr[scala.Boolean] = js.undefined,
    groupColorMapping: js.Array[GroupColorMapping] = null,
    groupSelectionMode: groupSelectionMode | java.lang.String = null,
    header: java.lang.String = null,
    headerTemplateRendering: /* e */ HeaderTemplateRenderingEventArgs => scala.Unit = null,
    highlightBorderBrush: java.lang.String = null,
    highlightBorderThickness: scala.Int | scala.Double = null,
    highlightGroupBorderBrush: java.lang.String = null,
    highlightGroupBorderThickness: scala.Int | scala.Double = null,
    highlightGroupOnSelection: js.UndefOr[scala.Boolean] = js.undefined,
    highlightOnSelection: js.UndefOr[scala.Boolean] = js.undefined,
    isHierarchicalDatasource: js.UndefOr[scala.Boolean] = js.undefined,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    itemRendering: /* e */ ItemRenderingEventArgs => scala.Unit = null,
    itemsLayoutMode: ItemsLayoutMode | java.lang.String = null,
    leafItemSettings: LeafItemSettings = null,
    legendItemRendering: /* e */ LegendItemRenderingEventArgs => scala.Unit = null,
    legendSettings: LegendSettings = null,
    levels: js.Array[Level] = null,
    locale: java.lang.String = null,
    paletteColorMapping: PaletteColorMapping = null,
    rangeColorMapping: js.Array[RangeColorMapping] = null,
    refreshed: /* e */ RefreshedEventArgs => scala.Unit = null,
    rightClick: /* e */ RightClickEventArgs => scala.Unit = null,
    selectionMode: selectionMode | java.lang.String = null,
    showLegend: js.UndefOr[scala.Boolean] = js.undefined,
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    tooltipTemplate: java.lang.String = null,
    treeMapGroupSelected: /* e */ TreeMapGroupSelectedEventArgs => scala.Unit = null,
    treeMapItemSelected: /* e */ TreeMapItemSelectedEventArgs => scala.Unit = null,
    treeMapItems: js.Array[_] = null,
    uniColorMapping: UniColorMapping = null,
    weightValuePath: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(js.Any.fromFunction1(Click))
    if (borderBrush != null) __obj.updateDynamic("borderBrush")(borderBrush)
    if (borderThickness != null) __obj.updateDynamic("borderThickness")(borderThickness.asInstanceOf[js.Any])
    if (colorPath != null) __obj.updateDynamic("colorPath")(colorPath)
    if (colorValuePath != null) __obj.updateDynamic("colorValuePath")(colorValuePath)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (desaturationColorMapping != null) __obj.updateDynamic("desaturationColorMapping")(desaturationColorMapping)
    if (dockPosition != null) __obj.updateDynamic("dockPosition")(dockPosition.asInstanceOf[js.Any])
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1(doubleClick))
    if (!js.isUndefined(draggingGroupOnSelection)) __obj.updateDynamic("draggingGroupOnSelection")(draggingGroupOnSelection)
    if (!js.isUndefined(draggingOnSelection)) __obj.updateDynamic("draggingOnSelection")(draggingOnSelection)
    if (drillDownHeaderColor != null) __obj.updateDynamic("drillDownHeaderColor")(drillDownHeaderColor)
    if (drillDownItemSelected != null) __obj.updateDynamic("drillDownItemSelected")(js.Any.fromFunction1(drillDownItemSelected))
    if (drillDownLevel != null) __obj.updateDynamic("drillDownLevel")(drillDownLevel.asInstanceOf[js.Any])
    if (drillDownSelectionColor != null) __obj.updateDynamic("drillDownSelectionColor")(drillDownSelectionColor)
    if (drillDownValue != null) __obj.updateDynamic("drillDownValue")(drillDownValue)
    if (drillStarted != null) __obj.updateDynamic("drillStarted")(js.Any.fromFunction1(drillStarted))
    if (!js.isUndefined(enableDrillDown)) __obj.updateDynamic("enableDrillDown")(enableDrillDown)
    if (!js.isUndefined(enableGradient)) __obj.updateDynamic("enableGradient")(enableGradient)
    if (!js.isUndefined(enableGroupSeparator)) __obj.updateDynamic("enableGroupSeparator")(enableGroupSeparator)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (groupColorMapping != null) __obj.updateDynamic("groupColorMapping")(groupColorMapping)
    if (groupSelectionMode != null) __obj.updateDynamic("groupSelectionMode")(groupSelectionMode.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (headerTemplateRendering != null) __obj.updateDynamic("headerTemplateRendering")(js.Any.fromFunction1(headerTemplateRendering))
    if (highlightBorderBrush != null) __obj.updateDynamic("highlightBorderBrush")(highlightBorderBrush)
    if (highlightBorderThickness != null) __obj.updateDynamic("highlightBorderThickness")(highlightBorderThickness.asInstanceOf[js.Any])
    if (highlightGroupBorderBrush != null) __obj.updateDynamic("highlightGroupBorderBrush")(highlightGroupBorderBrush)
    if (highlightGroupBorderThickness != null) __obj.updateDynamic("highlightGroupBorderThickness")(highlightGroupBorderThickness.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightGroupOnSelection)) __obj.updateDynamic("highlightGroupOnSelection")(highlightGroupOnSelection)
    if (!js.isUndefined(highlightOnSelection)) __obj.updateDynamic("highlightOnSelection")(highlightOnSelection)
    if (!js.isUndefined(isHierarchicalDatasource)) __obj.updateDynamic("isHierarchicalDatasource")(isHierarchicalDatasource)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (itemRendering != null) __obj.updateDynamic("itemRendering")(js.Any.fromFunction1(itemRendering))
    if (itemsLayoutMode != null) __obj.updateDynamic("itemsLayoutMode")(itemsLayoutMode.asInstanceOf[js.Any])
    if (leafItemSettings != null) __obj.updateDynamic("leafItemSettings")(leafItemSettings)
    if (legendItemRendering != null) __obj.updateDynamic("legendItemRendering")(js.Any.fromFunction1(legendItemRendering))
    if (legendSettings != null) __obj.updateDynamic("legendSettings")(legendSettings)
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (paletteColorMapping != null) __obj.updateDynamic("paletteColorMapping")(paletteColorMapping)
    if (rangeColorMapping != null) __obj.updateDynamic("rangeColorMapping")(rangeColorMapping)
    if (refreshed != null) __obj.updateDynamic("refreshed")(js.Any.fromFunction1(refreshed))
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1(rightClick))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    if (treeMapGroupSelected != null) __obj.updateDynamic("treeMapGroupSelected")(js.Any.fromFunction1(treeMapGroupSelected))
    if (treeMapItemSelected != null) __obj.updateDynamic("treeMapItemSelected")(js.Any.fromFunction1(treeMapItemSelected))
    if (treeMapItems != null) __obj.updateDynamic("treeMapItems")(treeMapItems)
    if (uniColorMapping != null) __obj.updateDynamic("uniColorMapping")(uniColorMapping)
    if (weightValuePath != null) __obj.updateDynamic("weightValuePath")(weightValuePath)
    __obj.asInstanceOf[Model]
  }
}

