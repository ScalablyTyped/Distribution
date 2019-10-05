package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ColorFilter")
@js.native
class ColorFilter protected () extends Filter {
  def this(
    redMultiplier: js.UndefOr[Double],
    greenMultiplier: js.UndefOr[Double],
    blueMultiplier: js.UndefOr[Double],
    alphaMultiplier: js.UndefOr[Double],
    redOffset: js.UndefOr[Double],
    greenOffset: js.UndefOr[Double],
    blueOffset: js.UndefOr[Double],
    alphaOffset: js.UndefOr[Double]
  ) = this()
  // properties
  var alphaMultiplier: Double = js.native
  var alphaOffset: Double = js.native
  var blueMultiplier: Double = js.native
  var blueOffset: Double = js.native
  var greenMultiplier: Double = js.native
  var greenOffset: Double = js.native
  var redMultiplier: Double = js.native
  var redOffset: Double = js.native
}

