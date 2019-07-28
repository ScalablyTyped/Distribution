package typings.easeljs.createjsNs.GraphicsNs

import typings.easeljs.createjsNs.Matrix2D
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Graphics.Fill")
@js.native
class Fill protected () extends js.Object {
  def this(style: js.Object) = this()
  def this(style: js.Object, matrix: Matrix2D) = this()
  var matrix: Matrix2D = js.native
  // properties
  var style: js.Object = js.native
  // methods
  def bitmap(image: HTMLImageElement): Fill = js.native
  def bitmap(image: HTMLImageElement, repetition: String): Fill = js.native
  def linearGradient(colors: js.Array[Double], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Fill = js.native
  def radialGradient(
    colors: js.Array[Double],
    ratios: js.Array[Double],
    x0: Double,
    y0: Double,
    r0: Double,
    x1: Double,
    y1: Double,
    r1: Double
  ): Fill = js.native
}

