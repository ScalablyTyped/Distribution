package typings.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonStyle extends js.Object {
  /** Color of the interior of the polygon in #RRGGBB format. */
  var fillColor: js.UndefOr[String] = js.native
  /** Column-value, gradient, or bucket styler that is used to determine the interior color and opacity of the polygon. */
  var fillColorStyler: js.UndefOr[StyleFunction] = js.native
  /** Opacity of the interior of the polygon: 0.0 (transparent) to 1.0 (opaque). */
  var fillOpacity: js.UndefOr[Double] = js.native
  /** Color of the polygon border in #RRGGBB format. */
  var strokeColor: js.UndefOr[String] = js.native
  /** Column-value, gradient or buckets styler that is used to determine the border color and opacity. */
  var strokeColorStyler: js.UndefOr[StyleFunction] = js.native
  /** Opacity of the polygon border: 0.0 (transparent) to 1.0 (opaque). */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /** Width of the polyon border in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.native
  /** Column-value or bucket styler that is used to determine the width of the polygon border. */
  var strokeWeightStyler: js.UndefOr[StyleFunction] = js.native
}

object PolygonStyle {
  @scala.inline
  def apply(): PolygonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonStyle]
  }
  @scala.inline
  implicit class PolygonStyleOps[Self <: PolygonStyle] (val x: Self) extends AnyVal {
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
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillColorStyler(value: StyleFunction): Self = this.set("fillColorStyler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColorStyler: Self = this.set("fillColorStyler", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
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

