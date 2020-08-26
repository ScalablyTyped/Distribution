package typings.ejWebAll.ej.datavisualization.HeatMapLegend

import typings.ejWebAll.ej.datavisualization.HeatMap.LegendMode
import typings.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies the color values of the column data.
    * @Default {[]}
    */
  var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.native
  /** Specifies the height of the heatmap legend.
    * @Default {null}
    */
  var height: js.UndefOr[js.Any] = js.native
  /** Specifies can enable responsive mode or not for heatmap legend.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Specifies the legend mode as gradient or list.
    * @Default {ej.HeatMap.LegendMode.Gradient}
    */
  var legendMode: js.UndefOr[LegendMode | String] = js.native
  /** Specifies the orientation of the heatmap legend
    * @Default {ej.HeatMap.LegendOrientation.Horizontal}
    */
  var orientation: js.UndefOr[LegendOrientation | String] = js.native
  /** Specifies whether the cell label can be shown or not.
    * @Default {false}
    */
  var showLabel: js.UndefOr[Boolean] = js.native
  /** Specifies the width of the heatmap legend.
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
    def setColorMappingCollectionVarargs(value: ColorMappingCollection*): Self = this.set("colorMappingCollection", js.Array(value :_*))
    @scala.inline
    def setColorMappingCollection(value: js.Array[ColorMappingCollection]): Self = this.set("colorMappingCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMappingCollection: Self = this.set("colorMappingCollection", js.undefined)
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setLegendMode(value: LegendMode | String): Self = this.set("legendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendMode: Self = this.set("legendMode", js.undefined)
    @scala.inline
    def setOrientation(value: LegendOrientation | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setShowLabel(value: Boolean): Self = this.set("showLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLabel: Self = this.set("showLabel", js.undefined)
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

