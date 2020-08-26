package typings.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStyle extends js.Object {
  /** Color of the line in #RRGGBB format. */
  var strokeColor: js.UndefOr[String] = js.native
  /** Column-value, gradient or buckets styler that is used to determine the line color and opacity. */
  var strokeColorStyler: js.UndefOr[StyleFunction] = js.native
  /** Opacity of the line : 0.0 (transparent) to 1.0 (opaque). */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /** Width of the line in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.native
  /** Column-value or bucket styler that is used to determine the width of the line. */
  var strokeWeightStyler: js.UndefOr[StyleFunction] = js.native
}

object LineStyle {
  @scala.inline
  def apply(): LineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyle]
  }
  @scala.inline
  implicit class LineStyleOps[Self <: LineStyle] (val x: Self) extends AnyVal {
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
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeColorStyler(value: StyleFunction): Self = this.set("strokeColorStyler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColorStyler: Self = this.set("strokeColorStyler", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWeight: Self = this.set("strokeWeight", js.undefined)
    @scala.inline
    def setStrokeWeightStyler(value: StyleFunction): Self = this.set("strokeWeightStyler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWeightStyler: Self = this.set("strokeWeightStyler", js.undefined)
  }
  
}

