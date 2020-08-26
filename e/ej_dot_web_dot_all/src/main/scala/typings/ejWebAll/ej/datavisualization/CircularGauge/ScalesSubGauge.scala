package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesSubGauge extends js.Object {
  /** Specify subGauge Height of circular gauge
    * @Default {150}
    */
  var height: js.UndefOr[Double] = js.native
  /** Specify position for sub-gauge of circular gauge
    * @Default {Object}
    */
  var position: js.UndefOr[ScalesSubGaugesPosition] = js.native
  /** Specify subGauge Width of circular gauge
    * @Default {150}
    */
  var width: js.UndefOr[Double] = js.native
}

object ScalesSubGauge {
  @scala.inline
  def apply(): ScalesSubGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesSubGauge]
  }
  @scala.inline
  implicit class ScalesSubGaugeOps[Self <: ScalesSubGauge] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPosition(value: ScalesSubGaugesPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

