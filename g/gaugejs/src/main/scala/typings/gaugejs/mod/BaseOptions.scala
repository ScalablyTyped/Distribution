package typings.gaugejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var angle: Double
  var colorStart: String
  var colorStop: String
  var generateGradient: Boolean
  var highDpiSupport: Boolean
  var limitMax: Boolean
  var limitMin: Boolean
  var lineWidth: Double
  var pointer: PointerOptions
  var radiusScale: Double
  var strokeColor: String
}

object BaseOptions {
  @scala.inline
  def apply(
    angle: Double,
    colorStart: String,
    colorStop: String,
    generateGradient: Boolean,
    highDpiSupport: Boolean,
    limitMax: Boolean,
    limitMin: Boolean,
    lineWidth: Double,
    pointer: PointerOptions,
    radiusScale: Double,
    strokeColor: String
  ): BaseOptions = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], colorStart = colorStart.asInstanceOf[js.Any], colorStop = colorStop.asInstanceOf[js.Any], generateGradient = generateGradient.asInstanceOf[js.Any], highDpiSupport = highDpiSupport.asInstanceOf[js.Any], limitMax = limitMax.asInstanceOf[js.Any], limitMin = limitMin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

