package typings.figma

import typings.figma.figmaStrings.CENTER
import typings.figma.figmaStrings.INSIDE
import typings.figma.figmaStrings.OUTSIDE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryMixin extends js.Object {
  var dashPattern: js.Array[Double]
  var fillStyleId: String | js.Symbol
  var fills: js.Array[Paint] | js.Symbol
  var strokeAlign: CENTER | INSIDE | OUTSIDE
  var strokeCap: StrokeCap | js.Symbol
  var strokeJoin: StrokeJoin | js.Symbol
  var strokeStyleId: String
  var strokeWeight: Double
  var strokes: js.Array[Paint]
}

object GeometryMixin {
  @scala.inline
  def apply(
    dashPattern: js.Array[Double],
    fillStyleId: String | js.Symbol,
    fills: js.Array[Paint] | js.Symbol,
    strokeAlign: CENTER | INSIDE | OUTSIDE,
    strokeCap: StrokeCap | js.Symbol,
    strokeJoin: StrokeJoin | js.Symbol,
    strokeStyleId: String,
    strokeWeight: Double,
    strokes: js.Array[Paint]
  ): GeometryMixin = {
    val __obj = js.Dynamic.literal(dashPattern = dashPattern.asInstanceOf[js.Any], fillStyleId = fillStyleId.asInstanceOf[js.Any], fills = fills.asInstanceOf[js.Any], strokeAlign = strokeAlign.asInstanceOf[js.Any], strokeCap = strokeCap.asInstanceOf[js.Any], strokeJoin = strokeJoin.asInstanceOf[js.Any], strokeStyleId = strokeStyleId.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], strokes = strokes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeometryMixin]
  }
}

