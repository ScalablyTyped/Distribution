package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.Color1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartBoxStyle extends js.Object {
  var gradient: js.UndefOr[Color1] = js.native
  var rx: js.UndefOr[Double] = js.native
  var ry: js.UndefOr[Double] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
}

object ChartBoxStyle {
  @scala.inline
  def apply(): ChartBoxStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBoxStyle]
  }
  @scala.inline
  implicit class ChartBoxStyleOps[Self <: ChartBoxStyle] (val x: Self) extends AnyVal {
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
    def setGradient(value: Color1): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    @scala.inline
    def setRy(value: Double): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

