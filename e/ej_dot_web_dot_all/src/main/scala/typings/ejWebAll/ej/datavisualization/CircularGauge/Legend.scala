package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Legend extends js.Object {
  /** Specifies the alignment of the legend.
    * @Default {Center. See Alignment}
    */
  var alignment: js.UndefOr[LegendAlignment | String] = js.native
  /** Options for customizing the legend border.
    */
  var border: js.UndefOr[LegendBorder] = js.native
  /** Fill color for the legend items. By using this property, it displays all legend item shapes in same color.Legend items representing invisible ranges is displayed in gray color.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options to customize the font used for legend item text.
    */
  var font: js.UndefOr[LegendFont] = js.native
  /** Gap or padding between the legend items.
    * @Default {20}
    */
  var itemPadding: js.UndefOr[Double] = js.native
  /** Options to customize the style of legend items.
    */
  var itemStyle: js.UndefOr[LegendItemStyle] = js.native
  /** Opacity of the legend.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the circular gauge.
    * @Default {Bottom. See Position}
    */
  var position: js.UndefOr[LegendPosition | String] = js.native
  /** Shape of the legend items.
    * @Default {Circle. See Shape}
    */
  var shape: js.UndefOr[LegendShape | String] = js.native
  /** Options to customize the size of the legend.
    */
  var size: js.UndefOr[LegendSize] = js.native
  /** Toggles the visibility of the ranges.
    * @Default {true}
    */
  var toggleVisibility: js.UndefOr[Boolean] = js.native
  /** Toggles the visibility of the legend.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Legend {
  @scala.inline
  def apply(): Legend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Legend]
  }
  @scala.inline
  implicit class LegendOps[Self <: Legend] (val x: Self) extends AnyVal {
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
    def setAlignment(value: LegendAlignment | String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setBorder(value: LegendBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: LegendFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setItemPadding(value: Double): Self = this.set("itemPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemPadding: Self = this.set("itemPadding", js.undefined)
    @scala.inline
    def setItemStyle(value: LegendItemStyle): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPosition(value: LegendPosition | String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShape(value: LegendShape | String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSize(value: LegendSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setToggleVisibility(value: Boolean): Self = this.set("toggleVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleVisibility: Self = this.set("toggleVisibility", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

