package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesPointersPointerValueText extends js.Object {
  /** Specify pointer text angle of circular gauge.
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.native
  /** Specify pointer text auto angle of circular gauge.
    * @Default {false}
    */
  var autoAngle: js.UndefOr[Boolean] = js.native
  /** Specify pointer value text color of circular gauge.
    * @Default {#8c8c8c}
    */
  var color: js.UndefOr[String] = js.native
  /** Specify pointer value text distance from pointer of circular gauge.
    * @Default {20}
    */
  var distance: js.UndefOr[Double] = js.native
  /** Specify pointer value text font option of circular gauge.
    * @Default {object}
    */
  var font: js.UndefOr[ScalesPointersPointerValueTextFont] = js.native
  /** Specify pointer value text opacity of circular gauge.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** enable pointer value text visibility of circular gauge.
    * @Default {false}
    */
  var showValue: js.UndefOr[Boolean] = js.native
}

object ScalesPointersPointerValueText {
  @scala.inline
  def apply(): ScalesPointersPointerValueText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesPointersPointerValueText]
  }
  @scala.inline
  implicit class ScalesPointersPointerValueTextOps[Self <: ScalesPointersPointerValueText] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setAutoAngle(value: Boolean): Self = this.set("autoAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAngle: Self = this.set("autoAngle", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setFont(value: ScalesPointersPointerValueTextFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setShowValue(value: Boolean): Self = this.set("showValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowValue: Self = this.set("showValue", js.undefined)
  }
  
}

