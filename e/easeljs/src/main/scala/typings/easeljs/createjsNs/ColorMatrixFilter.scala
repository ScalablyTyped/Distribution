package typings.easeljs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ColorMatrixFilter")
@js.native
class ColorMatrixFilter protected () extends Filter {
  def this(matrix: js.Array[Double]) = this()
  def this(matrix: ColorMatrix) = this()
  // properties
  var matrix: js.Array[Double] | ColorMatrix = js.native
}

