package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicatorsMacdLine extends js.Object {
  /** Color of MACD line.
    * @Default {#ff9933}
    */
  var fill: js.UndefOr[String] = js.native
  /** Width of the MACD line.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.native
}

object IndicatorsMacdLine {
  @scala.inline
  def apply(): IndicatorsMacdLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicatorsMacdLine]
  }
  @scala.inline
  implicit class IndicatorsMacdLineOps[Self <: IndicatorsMacdLine] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

