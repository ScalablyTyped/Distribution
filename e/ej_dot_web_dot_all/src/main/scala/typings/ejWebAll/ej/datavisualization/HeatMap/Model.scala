package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseEnter: js.UndefOr[js.Function1[/* e */ CellMouseEnterEventArgs, Unit]] = js.native
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseLeave: js.UndefOr[js.Function1[/* e */ CellMouseLeaveEventArgs, Unit]] = js.native
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseOver: js.UndefOr[js.Function1[/* e */ CellMouseOverEventArgs, Unit]] = js.native
  /** Triggered when the mouse over on the cell.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
  /** Specifies the color values of the heat map column data.
    * @Default {[]}
    */
  var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.native
  /** Specifies the default column properties for all the column style not specified in column properties.
    * @Default {[]}
    */
  var defaultColumnStyle: js.UndefOr[DefaultColumnStyle] = js.native
  /** Specifies whether the virtualization can be enable or not.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.native
  /** Specifies the property of the heat map cell.
    * @Default {Null}
    */
  var heatMapCell: js.UndefOr[HeatMapCell] = js.native
  /** Specifies the width of the heat map.
    * @Default {null}
    */
  var height: js.UndefOr[js.Any] = js.native
  /** Specifies the name of the heat map.
    * @Default {null}
    */
  var id: js.UndefOr[Double] = js.native
  /** Specifies can enable responsive mode or not for heat map.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Specifies the property and display value of the heat map column.
    * @Default {[]}
    */
  var itemsMapping: js.UndefOr[ItemsMapping] = js.native
  /** Specifies the source data of the heat map.
    * @Default {[]}
    */
  var itemsSource: js.UndefOr[js.Any] = js.native
  /** Specifies the no of legends can sync with heat map.
    * @Default {[]}
    */
  var legendCollection: js.UndefOr[js.Array[_]] = js.native
  /** Enables or disables tooltip of heatmap
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
  /** Specifies the width of the heat map.
    * @Default {null}
    */
  var width: js.UndefOr[js.Any] = js.native
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
    def setCellMouseEnter(value: /* e */ CellMouseEnterEventArgs => Unit): Self = this.set("cellMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellMouseEnter: Self = this.set("cellMouseEnter", js.undefined)
    @scala.inline
    def setCellMouseLeave(value: /* e */ CellMouseLeaveEventArgs => Unit): Self = this.set("cellMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellMouseLeave: Self = this.set("cellMouseLeave", js.undefined)
    @scala.inline
    def setCellMouseOver(value: /* e */ CellMouseOverEventArgs => Unit): Self = this.set("cellMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellMouseOver: Self = this.set("cellMouseOver", js.undefined)
    @scala.inline
    def setCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = this.set("cellSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellSelected: Self = this.set("cellSelected", js.undefined)
    @scala.inline
    def setColorMappingCollectionVarargs(value: ColorMappingCollection*): Self = this.set("colorMappingCollection", js.Array(value :_*))
    @scala.inline
    def setColorMappingCollection(value: js.Array[ColorMappingCollection]): Self = this.set("colorMappingCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMappingCollection: Self = this.set("colorMappingCollection", js.undefined)
    @scala.inline
    def setDefaultColumnStyle(value: DefaultColumnStyle): Self = this.set("defaultColumnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultColumnStyle: Self = this.set("defaultColumnStyle", js.undefined)
    @scala.inline
    def setEnableVirtualization(value: Boolean): Self = this.set("enableVirtualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableVirtualization: Self = this.set("enableVirtualization", js.undefined)
    @scala.inline
    def setHeatMapCell(value: HeatMapCell): Self = this.set("heatMapCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeatMapCell: Self = this.set("heatMapCell", js.undefined)
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setItemsMapping(value: ItemsMapping): Self = this.set("itemsMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsMapping: Self = this.set("itemsMapping", js.undefined)
    @scala.inline
    def setItemsSource(value: js.Any): Self = this.set("itemsSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsSource: Self = this.set("itemsSource", js.undefined)
    @scala.inline
    def setLegendCollectionVarargs(value: js.Any*): Self = this.set("legendCollection", js.Array(value :_*))
    @scala.inline
    def setLegendCollection(value: js.Array[_]): Self = this.set("legendCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendCollection: Self = this.set("legendCollection", js.undefined)
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    @scala.inline
    def setTooltipSettings(value: TooltipSettings): Self = this.set("tooltipSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipSettings: Self = this.set("tooltipSettings", js.undefined)
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

