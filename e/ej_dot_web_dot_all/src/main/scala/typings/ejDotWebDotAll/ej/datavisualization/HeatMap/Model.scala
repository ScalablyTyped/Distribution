package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseEnter: js.UndefOr[js.Function1[/* e */ CellMouseEnterEventArgs, Unit]] = js.undefined
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseLeave: js.UndefOr[js.Function1[/* e */ CellMouseLeaveEventArgs, Unit]] = js.undefined
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseOver: js.UndefOr[js.Function1[/* e */ CellMouseOverEventArgs, Unit]] = js.undefined
  /** Triggered when the mouse over on the cell.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.undefined
  /** Specifies the color values of the heat map column data.
    * @Default {[]}
    */
  var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.undefined
  /** Specifies the default column properties for all the column style not specified in column properties.
    * @Default {[]}
    */
  var defaultColumnStyle: js.UndefOr[DefaultColumnStyle] = js.undefined
  /** Specifies whether the virtualization can be enable or not.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.undefined
  /** Specifies the property of the heat map cell.
    * @Default {Null}
    */
  var heatMapCell: js.UndefOr[HeatMapCell] = js.undefined
  /** Specifies the width of the heat map.
    * @Default {null}
    */
  var height: js.UndefOr[js.Any] = js.undefined
  /** Specifies the name of the heat map.
    * @Default {null}
    */
  var id: js.UndefOr[Double] = js.undefined
  /** Specifies can enable responsive mode or not for heat map.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Specifies the property and display value of the heat map column.
    * @Default {[]}
    */
  var itemsMapping: js.UndefOr[ItemsMapping] = js.undefined
  /** Specifies the source data of the heat map.
    * @Default {[]}
    */
  var itemsSource: js.UndefOr[js.Any] = js.undefined
  /** Specifies the no of legends can sync with heat map.
    * @Default {[]}
    */
  var legendCollection: js.UndefOr[js.Array[_]] = js.undefined
  /** Enables or disables tooltip of heatmap
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
  /** Specifies the width of the heat map.
    * @Default {null}
    */
  var width: js.UndefOr[js.Any] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    cellMouseEnter: /* e */ CellMouseEnterEventArgs => Unit = null,
    cellMouseLeave: /* e */ CellMouseLeaveEventArgs => Unit = null,
    cellMouseOver: /* e */ CellMouseOverEventArgs => Unit = null,
    cellSelected: /* e */ CellSelectedEventArgs => Unit = null,
    colorMappingCollection: js.Array[ColorMappingCollection] = null,
    defaultColumnStyle: DefaultColumnStyle = null,
    enableVirtualization: js.UndefOr[Boolean] = js.undefined,
    heatMapCell: HeatMapCell = null,
    height: js.Any = null,
    id: Int | Double = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    itemsMapping: ItemsMapping = null,
    itemsSource: js.Any = null,
    legendCollection: js.Array[_] = null,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    tooltipSettings: TooltipSettings = null,
    width: js.Any = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(js.Any.fromFunction1(cellMouseEnter))
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(js.Any.fromFunction1(cellMouseLeave))
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(js.Any.fromFunction1(cellMouseOver))
    if (cellSelected != null) __obj.updateDynamic("cellSelected")(js.Any.fromFunction1(cellSelected))
    if (colorMappingCollection != null) __obj.updateDynamic("colorMappingCollection")(colorMappingCollection.asInstanceOf[js.Any])
    if (defaultColumnStyle != null) __obj.updateDynamic("defaultColumnStyle")(defaultColumnStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enableVirtualization)) __obj.updateDynamic("enableVirtualization")(enableVirtualization.asInstanceOf[js.Any])
    if (heatMapCell != null) __obj.updateDynamic("heatMapCell")(heatMapCell.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (itemsMapping != null) __obj.updateDynamic("itemsMapping")(itemsMapping.asInstanceOf[js.Any])
    if (itemsSource != null) __obj.updateDynamic("itemsSource")(itemsSource.asInstanceOf[js.Any])
    if (legendCollection != null) __obj.updateDynamic("legendCollection")(legendCollection.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.asInstanceOf[js.Any])
    if (tooltipSettings != null) __obj.updateDynamic("tooltipSettings")(tooltipSettings.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

