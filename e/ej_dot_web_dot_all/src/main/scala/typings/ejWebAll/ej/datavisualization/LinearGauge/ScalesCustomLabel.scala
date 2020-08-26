package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesCustomLabel extends js.Object {
  /** Specifies the label Color in customLabels
    * @Default {null}
    */
  var color: js.UndefOr[Double] = js.native
  /** Specifies the font in customLabels
    * @Default {null}
    */
  var font: js.UndefOr[ScalesCustomLabelsFont] = js.native
  /** Specifies the opacity in customLabels
    * @Default {0}
    */
  var opacity: js.UndefOr[String] = js.native
  /** Specifies the position in customLabels
    * @Default {null}
    */
  var position: js.UndefOr[ScalesCustomLabelsPosition] = js.native
  /** Specifies the positionType in customLabels.See CustomLabelPositionType
    * @Default {null}
    */
  var positionType: js.UndefOr[js.Any] = js.native
  /** Specifies the textAngle in customLabels
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.native
  /** Specifies the label Value in customLabels
    */
  var value: js.UndefOr[String] = js.native
}

object ScalesCustomLabel {
  @scala.inline
  def apply(): ScalesCustomLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesCustomLabel]
  }
  @scala.inline
  implicit class ScalesCustomLabelOps[Self <: ScalesCustomLabel] (val x: Self) extends AnyVal {
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
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFont(value: ScalesCustomLabelsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setOpacity(value: String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPosition(value: ScalesCustomLabelsPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionType(value: js.Any): Self = this.set("positionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionType: Self = this.set("positionType", js.undefined)
    @scala.inline
    def setTextAngle(value: Double): Self = this.set("textAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAngle: Self = this.set("textAngle", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

