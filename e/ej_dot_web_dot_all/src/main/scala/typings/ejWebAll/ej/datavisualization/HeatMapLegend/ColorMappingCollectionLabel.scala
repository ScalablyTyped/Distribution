package typings.ejWebAll.ej.datavisualization.HeatMapLegend

import typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorMappingCollectionLabel extends js.Object {
  /** Enables/disables the bold style of the heatmap legend label.
    * @Default {false}
    */
  var bold: js.UndefOr[Boolean] = js.native
  /** Specifies the font color of the heatmap legend label.
    * @Default {black}
    */
  var fontColor: js.UndefOr[String] = js.native
  /** Specifies the font family of the heatmap legend label.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.native
  /** Specifies the font size of the heatmap legend label.
    * @Default {10}
    */
  var fontSize: js.UndefOr[Double] = js.native
  /** Enables/disables the italic style of the heatmap legend label.
    * @Default {false}
    */
  var italic: js.UndefOr[Boolean] = js.native
  /** specifies the text value of the heatmap legend label.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the text style of the heatmap legend label.
    * @Default {ej.HeatMap.TextDecoration.None}
    */
  var textDecoration: js.UndefOr[TextDecoration | String] = js.native
}

object ColorMappingCollectionLabel {
  @scala.inline
  def apply(): ColorMappingCollectionLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMappingCollectionLabel]
  }
  @scala.inline
  implicit class ColorMappingCollectionLabelOps[Self <: ColorMappingCollectionLabel] (val x: Self) extends AnyVal {
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
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextDecoration(value: TextDecoration | String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
  }
  
}

