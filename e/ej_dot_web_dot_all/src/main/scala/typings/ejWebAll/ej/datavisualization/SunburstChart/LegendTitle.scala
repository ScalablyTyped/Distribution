package typings.ejWebAll.ej.datavisualization.SunburstChart

import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendTitle extends js.Object {
  /** Options to customize the font used for legend title
    */
  var font: js.UndefOr[LegendTitleFont] = js.native
  /** Text to be displayed in legend title.
    */
  var text: js.UndefOr[String] = js.native
  /** Alignment of the legend title.
    * @Default {center. See Alignment}
    */
  var textAlignment: js.UndefOr[SunburstAlignment | String] = js.native
  /** Enables or disables the legend title.
    * @Default {true}
    */
  var visible: js.UndefOr[String] = js.native
}

object LegendTitle {
  @scala.inline
  def apply(): LegendTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendTitle]
  }
  @scala.inline
  implicit class LegendTitleOps[Self <: LegendTitle] (val x: Self) extends AnyVal {
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
    def setFont(value: LegendTitleFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextAlignment(value: SunburstAlignment | String): Self = this.set("textAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlignment: Self = this.set("textAlignment", js.undefined)
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

