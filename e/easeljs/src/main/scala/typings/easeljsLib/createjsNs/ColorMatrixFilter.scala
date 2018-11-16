package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ColorMatrixFilter")
@js.native
class ColorMatrixFilter protected () extends Filter {
  def this(matrix: ColorMatrix) = this()
  def this(matrix: js.Array[scala.Double]) = this()
  // properties
  var matrix: js.Array[scala.Double] | ColorMatrix = js.native
}

