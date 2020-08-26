package typings.figma.mod.global

import typings.figma.figmaStrings.CENTER
import typings.figma.figmaStrings.INSIDE
import typings.figma.figmaStrings.OUTSIDE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryMixin extends js.Object {
  var dashPattern: js.Array[Double] = js.native
  var fillStyleId: String | js.Symbol = js.native
  var fills: js.Array[Paint] | js.Symbol = js.native
  var strokeAlign: CENTER | INSIDE | OUTSIDE = js.native
  var strokeCap: StrokeCap | js.Symbol = js.native
  var strokeJoin: StrokeJoin | js.Symbol = js.native
  var strokeMiterLimit: Double = js.native
  var strokeStyleId: String = js.native
  var strokeWeight: Double = js.native
  var strokes: js.Array[Paint] = js.native
  def outlineStroke(): VectorNode | Null = js.native
}

object GeometryMixin {
  @scala.inline
  def apply(
    dashPattern: js.Array[Double],
    fillStyleId: String | js.Symbol,
    fills: js.Array[Paint] | js.Symbol,
    outlineStroke: () => VectorNode | Null,
    strokeAlign: CENTER | INSIDE | OUTSIDE,
    strokeCap: StrokeCap | js.Symbol,
    strokeJoin: StrokeJoin | js.Symbol,
    strokeMiterLimit: Double,
    strokeStyleId: String,
    strokeWeight: Double,
    strokes: js.Array[Paint]
  ): GeometryMixin = {
    val __obj = js.Dynamic.literal(dashPattern = dashPattern.asInstanceOf[js.Any], fillStyleId = fillStyleId.asInstanceOf[js.Any], fills = fills.asInstanceOf[js.Any], outlineStroke = js.Any.fromFunction0(outlineStroke), strokeAlign = strokeAlign.asInstanceOf[js.Any], strokeCap = strokeCap.asInstanceOf[js.Any], strokeJoin = strokeJoin.asInstanceOf[js.Any], strokeMiterLimit = strokeMiterLimit.asInstanceOf[js.Any], strokeStyleId = strokeStyleId.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], strokes = strokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryMixin]
  }
  @scala.inline
  implicit class GeometryMixinOps[Self <: GeometryMixin] (val x: Self) extends AnyVal {
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
    def setDashPatternVarargs(value: Double*): Self = this.set("dashPattern", js.Array(value :_*))
    @scala.inline
    def setDashPattern(value: js.Array[Double]): Self = this.set("dashPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillStyleId(value: String | js.Symbol): Self = this.set("fillStyleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillsVarargs(value: Paint*): Self = this.set("fills", js.Array(value :_*))
    @scala.inline
    def setFills(value: js.Array[Paint] | js.Symbol): Self = this.set("fills", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlineStroke(value: () => VectorNode | Null): Self = this.set("outlineStroke", js.Any.fromFunction0(value))
    @scala.inline
    def setStrokeAlign(value: CENTER | INSIDE | OUTSIDE): Self = this.set("strokeAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeCap(value: StrokeCap | js.Symbol): Self = this.set("strokeCap", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeJoin(value: StrokeJoin | js.Symbol): Self = this.set("strokeJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeMiterLimit(value: Double): Self = this.set("strokeMiterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeStyleId(value: String): Self = this.set("strokeStyleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokesVarargs(value: Paint*): Self = this.set("strokes", js.Array(value :_*))
    @scala.inline
    def setStrokes(value: js.Array[Paint]): Self = this.set("strokes", value.asInstanceOf[js.Any])
  }
  
}

