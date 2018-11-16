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

