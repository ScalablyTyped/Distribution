package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires, on clicking the tree map items.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Specifies the border brush color of the treemap
    * @Default {white}
    */
  var borderBrush: js.UndefOr[String] = js.native
  /** Specifies the border thickness of the treemap
    * @Default {1}
    */
  var borderThickness: js.UndefOr[Double] = js.native
  /** Specifies the field name in the datasource that contains color values for treemap items.
    * @Default {null}
    */
  var colorPath: js.UndefOr[String] = js.native
  /** Specifies the color value path of the treemap
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[String] = js.native
  /** Specifies the datasource of the treemap
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Specifies the desaturationColorMapping settings of the treemap
    */
  var desaturationColorMapping: js.UndefOr[DesaturationColorMapping] = js.native
  /** Specifies the dockPosition for legend
    * @Default {top}
    */
  var dockPosition: js.UndefOr[DockPosition | String] = js.native
  /** Fires, on double clicking the tree map items.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** This property is used to select group of treemap items while clicking and dragging
    * @Default {false}
    */
  var draggingGroupOnSelection: js.UndefOr[Boolean] = js.native
  /** This property is used to select treemap items while clicking and dragging
    * @Default {false}
    */
  var draggingOnSelection: js.UndefOr[Boolean] = js.native
  /** specifies the drillDown header color
    * @Default {'null'}
    */
  var drillDownHeaderColor: js.UndefOr[String] = js.native
  /** Triggers on treemap  drilldown  item  selected.
    */
  var drillDownItemSelected: js.UndefOr[js.Function1[/* e */ DrillDownItemSelectedEventArgs, Unit]] = js.native
  /** Specifies to render particular level of the treemap.
    * @Default {0}
    */
  var drillDownLevel: js.UndefOr[Double] = js.native
  /** specifies the drillDown selection color
    * @Default {'#000000'}
    */
  var drillDownSelectionColor: js.UndefOr[String] = js.native
  /** Specifies to drill the particular data of the treemap.
    * @Default {null}
    */
  var drillDownValue: js.UndefOr[String] = js.native
  /** Triggers when drilldown is started
    */
  var drillStarted: js.UndefOr[js.Function1[/* e */ DrillStartedEventArgs, Unit]] = js.native
  /** Enable/Disable the drillDown for treemap
    * @Default {false}
    */
  var enableDrillDown: js.UndefOr[Boolean] = js.native
  /** Specifies whether gradient color has to be applied for treemap items
    * @Default {false}
    */
  var enableGradient: js.UndefOr[Boolean] = js.native
  /** Specify to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.native
  /** Specifies whether treemap need to resize when container is resized
    * @Default {true}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** Specifies the group color mapping of the treemap
    * @Default {[]}
    */
  var groupColorMapping: js.UndefOr[js.Array[GroupColorMapping]] = js.native
  /** Specifies the selection mode of the treemap. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var groupSelectionMode: js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.groupSelectionMode | String] = js.native
  /** Specifies the header for parent item during drilldown. This is applicable only for hierarchical data source.
    * @Default {null}
    */
  var header: js.UndefOr[String] = js.native
  /** Triggers before rendering the treemap drilldown header template
    */
  var headerTemplateRendering: js.UndefOr[js.Function1[/* e */ HeaderTemplateRenderingEventArgs, Unit]] = js.native
  /** Specifies the highlight border brush of treemap
    * @Default {gray}
    */
  var highlightBorderBrush: js.UndefOr[String] = js.native
  /** Specifies the border thickness when treemap items is highlighted in the treemap
    * @Default {5}
    */
  var highlightBorderThickness: js.UndefOr[Double] = js.native
  /** Specifies the highlight border brush of treemap
    * @Default {gray}
    */
  var highlightGroupBorderBrush: js.UndefOr[String] = js.native
  /** Specifies the border thickness when treemap items is highlighted in the treemap
    * @Default {5}
    */
  var highlightGroupBorderThickness: js.UndefOr[Double] = js.native
  /** Specifies whether treemap item need to highlighted on selection
    * @Default {false}
    */
  var highlightGroupOnSelection: js.UndefOr[Boolean] = js.native
  /** Specifies whether treemap item need to highlighted on selection
    * @Default {false}
    */
  var highlightOnSelection: js.UndefOr[Boolean] = js.native
  /** Specifies whether datasource is hierarchical or not.
    * @Default {false}
    */
  var isHierarchicalDatasource: js.UndefOr[Boolean] = js.native
  /** Controls whether Treemap has to be responsive while resizing the window.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggers while rendering each treemap items.
    */
  var itemRendering: js.UndefOr[js.Function1[/* e */ ItemRenderingEventArgs, Unit]] = js.native
  /** Specifies the items layout mode of the treemap. Accepted itemsLayoutMode values are Squarified, SliceAndDiceHorizontal, SliceAndDiceVertical and SliceAndDiceAuto
    * @Default {Squarified}
    */
  var itemsLayoutMode: js.UndefOr[ItemsLayoutMode | String] = js.native
  /** Specifies the leaf settings of the treemap
    */
  var leafItemSettings: js.UndefOr[LeafItemSettings] = js.native
  /** Triggers while rendering each legend item
    */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, Unit]] = js.native
  /** Specifies the legend settings of the treemap
    */
  var legendSettings: js.UndefOr[LegendSettings] = js.native
  /** Specify levels of treemap for grouped visualization of data
    * @Default {[]}
    */
  var levels: js.UndefOr[js.Array[Level]] = js.native
  /** Name of the culture based on which Tree Map should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the paletteColorMapping of the treemap
    */
  var paletteColorMapping: js.UndefOr[PaletteColorMapping] = js.native
  /** Specifies the rangeColorMapping settings of the treemap
    * @Default {[]}
    */
  var rangeColorMapping: js.UndefOr[js.Array[RangeColorMapping]] = js.native
  /** Triggers after refreshing the treemap items.
    */
  var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, Unit]] = js.native
  /** Fires, on right clicking the tree map items.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Specifies the selection mode of treemap item. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var selectionMode: js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.selectionMode | String] = js.native
  /** Specifies the legend visibility status of the treemap
    * @Default {false}
    */
  var showLegend: js.UndefOr[Boolean] = js.native
  /** Specifies whether treemap showTooltip need to be visible
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies the tooltip template of the treemap
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /** Triggers when the group selection is performed on treemap items.
    */
  var treeMapGroupSelected: js.UndefOr[js.Function1[/* e */ TreeMapGroupSelectedEventArgs, Unit]] = js.native
  /** Triggers on treemap item selected.
    */
  var treeMapItemSelected: js.UndefOr[js.Function1[/* e */ TreeMapItemSelectedEventArgs, Unit]] = js.native
  /** Hold the treeMapItems to be displayed in treemap
    * @Default {[]}
    */
  var treeMapItems: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the uniColorMapping settings of the treemap
    */
  var uniColorMapping: js.UndefOr[UniColorMapping] = js.native
  /** Specifies the weight value path of the treemap
    * @Default {null}
    */
  var weightValuePath: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("Click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("Click", js.undefined)
    @scala.inline
    def setBorderBrush(value: String): Self = this.set("borderBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBrush: Self = this.set("borderBrush", js.undefined)
    @scala.inline
    def setBorderThickness(value: Double): Self = this.set("borderThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderThickness: Self = this.set("borderThickness", js.undefined)
    @scala.inline
    def setColorPath(value: String): Self = this.set("colorPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPath: Self = this.set("colorPath", js.undefined)
    @scala.inline
    def setColorValuePath(value: String): Self = this.set("colorValuePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorValuePath: Self = this.set("colorValuePath", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDesaturationColorMapping(value: DesaturationColorMapping): Self = this.set("desaturationColorMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesaturationColorMapping: Self = this.set("desaturationColorMapping", js.undefined)
    @scala.inline
    def setDockPosition(value: DockPosition | String): Self = this.set("dockPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDockPosition: Self = this.set("dockPosition", js.undefined)
    @scala.inline
    def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = this.set("doubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoubleClick: Self = this.set("doubleClick", js.undefined)
    @scala.inline
    def setDraggingGroupOnSelection(value: Boolean): Self = this.set("draggingGroupOnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggingGroupOnSelection: Self = this.set("draggingGroupOnSelection", js.undefined)
    @scala.inline
    def setDraggingOnSelection(value: Boolean): Self = this.set("draggingOnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggingOnSelection: Self = this.set("draggingOnSelection", js.undefined)
    @scala.inline
    def setDrillDownHeaderColor(value: String): Self = this.set("drillDownHeaderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillDownHeaderColor: Self = this.set("drillDownHeaderColor", js.undefined)
    @scala.inline
    def setDrillDownItemSelected(value: /* e */ DrillDownItemSelectedEventArgs => Unit): Self = this.set("drillDownItemSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrillDownItemSelected: Self = this.set("drillDownItemSelected", js.undefined)
    @scala.inline
    def setDrillDownLevel(value: Double): Self = this.set("drillDownLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillDownLevel: Self = this.set("drillDownLevel", js.undefined)
    @scala.inline
    def setDrillDownSelectionColor(value: String): Self = this.set("drillDownSelectionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillDownSelectionColor: Self = this.set("drillDownSelectionColor", js.undefined)
    @scala.inline
    def setDrillDownValue(value: String): Self = this.set("drillDownValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillDownValue: Self = this.set("drillDownValue", js.undefined)
    @scala.inline
    def setDrillStarted(value: /* e */ DrillStartedEventArgs => Unit): Self = this.set("drillStarted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrillStarted: Self = this.set("drillStarted", js.undefined)
    @scala.inline
    def setEnableDrillDown(value: Boolean): Self = this.set("enableDrillDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDrillDown: Self = this.set("enableDrillDown", js.undefined)
    @scala.inline
    def setEnableGradient(value: Boolean): Self = this.set("enableGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGradient: Self = this.set("enableGradient", js.undefined)
    @scala.inline
    def setEnableGroupSeparator(value: Boolean): Self = this.set("enableGroupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGroupSeparator: Self = this.set("enableGroupSeparator", js.undefined)
    @scala.inline
    def setEnableResize(value: Boolean): Self = this.set("enableResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableResize: Self = this.set("enableResize", js.undefined)
    @scala.inline
    def setGroupColorMappingVarargs(value: GroupColorMapping*): Self = this.set("groupColorMapping", js.Array(value :_*))
    @scala.inline
    def setGroupColorMapping(value: js.Array[GroupColorMapping]): Self = this.set("groupColorMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupColorMapping: Self = this.set("groupColorMapping", js.undefined)
    @scala.inline
    def setGroupSelectionMode(value: groupSelectionMode | String): Self = this.set("groupSelectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSelectionMode: Self = this.set("groupSelectionMode", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderTemplateRendering(value: /* e */ HeaderTemplateRenderingEventArgs => Unit): Self = this.set("headerTemplateRendering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderTemplateRendering: Self = this.set("headerTemplateRendering", js.undefined)
    @scala.inline
    def setHighlightBorderBrush(value: String): Self = this.set("highlightBorderBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightBorderBrush: Self = this.set("highlightBorderBrush", js.undefined)
    @scala.inline
    def setHighlightBorderThickness(value: Double): Self = this.set("highlightBorderThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightBorderThickness: Self = this.set("highlightBorderThickness", js.undefined)
    @scala.inline
    def setHighlightGroupBorderBrush(value: String): Self = this.set("highlightGroupBorderBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightGroupBorderBrush: Self = this.set("highlightGroupBorderBrush", js.undefined)
    @scala.inline
    def setHighlightGroupBorderThickness(value: Double): Self = this.set("highlightGroupBorderThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightGroupBorderThickness: Self = this.set("highlightGroupBorderThickness", js.undefined)
    @scala.inline
    def setHighlightGroupOnSelection(value: Boolean): Self = this.set("highlightGroupOnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightGroupOnSelection: Self = this.set("highlightGroupOnSelection", js.undefined)
    @scala.inline
    def setHighlightOnSelection(value: Boolean): Self = this.set("highlightOnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightOnSelection: Self = this.set("highlightOnSelection", js.undefined)
    @scala.inline
    def setIsHierarchicalDatasource(value: Boolean): Self = this.set("isHierarchicalDatasource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHierarchicalDatasource: Self = this.set("isHierarchicalDatasource", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setItemRendering(value: /* e */ ItemRenderingEventArgs => Unit): Self = this.set("itemRendering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemRendering: Self = this.set("itemRendering", js.undefined)
    @scala.inline
    def setItemsLayoutMode(value: ItemsLayoutMode | String): Self = this.set("itemsLayoutMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsLayoutMode: Self = this.set("itemsLayoutMode", js.undefined)
    @scala.inline
    def setLeafItemSettings(value: LeafItemSettings): Self = this.set("leafItemSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeafItemSettings: Self = this.set("leafItemSettings", js.undefined)
    @scala.inline
    def setLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => Unit): Self = this.set("legendItemRendering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendItemRendering: Self = this.set("legendItemRendering", js.undefined)
    @scala.inline
    def setLegendSettings(value: LegendSettings): Self = this.set("legendSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendSettings: Self = this.set("legendSettings", js.undefined)
    @scala.inline
    def setLevelsVarargs(value: Level*): Self = this.set("levels", js.Array(value :_*))
    @scala.inline
    def setLevels(value: js.Array[Level]): Self = this.set("levels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPaletteColorMapping(value: PaletteColorMapping): Self = this.set("paletteColorMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaletteColorMapping: Self = this.set("paletteColorMapping", js.undefined)
    @scala.inline
    def setRangeColorMappingVarargs(value: RangeColorMapping*): Self = this.set("rangeColorMapping", js.Array(value :_*))
    @scala.inline
    def setRangeColorMapping(value: js.Array[RangeColorMapping]): Self = this.set("rangeColorMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeColorMapping: Self = this.set("rangeColorMapping", js.undefined)
    @scala.inline
    def setRefreshed(value: /* e */ RefreshedEventArgs => Unit): Self = this.set("refreshed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefreshed: Self = this.set("refreshed", js.undefined)
    @scala.inline
    def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = this.set("rightClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRightClick: Self = this.set("rightClick", js.undefined)
    @scala.inline
    def setSelectionMode(value: selectionMode | String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setShowLegend(value: Boolean): Self = this.set("showLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLegend: Self = this.set("showLegend", js.undefined)
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    @scala.inline
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    @scala.inline
    def setTreeMapGroupSelected(value: /* e */ TreeMapGroupSelectedEventArgs => Unit): Self = this.set("treeMapGroupSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTreeMapGroupSelected: Self = this.set("treeMapGroupSelected", js.undefined)
    @scala.inline
    def setTreeMapItemSelected(value: /* e */ TreeMapItemSelectedEventArgs => Unit): Self = this.set("treeMapItemSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTreeMapItemSelected: Self = this.set("treeMapItemSelected", js.undefined)
    @scala.inline
    def setTreeMapItemsVarargs(value: js.Any*): Self = this.set("treeMapItems", js.Array(value :_*))
    @scala.inline
    def setTreeMapItems(value: js.Array[_]): Self = this.set("treeMapItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeMapItems: Self = this.set("treeMapItems", js.undefined)
    @scala.inline
    def setUniColorMapping(value: UniColorMapping): Self = this.set("uniColorMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniColorMapping: Self = this.set("uniColorMapping", js.undefined)
    @scala.inline
    def setWeightValuePath(value: String): Self = this.set("weightValuePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightValuePath: Self = this.set("weightValuePath", js.undefined)
  }
  
}

