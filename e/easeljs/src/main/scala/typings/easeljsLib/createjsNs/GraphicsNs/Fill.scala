package typings
package easeljsLib.createjsNs.GraphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Graphics.Fill")
@js.native
class Fill protected () extends js.Object {
  def this(style: js.Object) = this()
  def this(style: js.Object, matrix: easeljsLib.createjsNs.Matrix2D) = this()
  var matrix: easeljsLib.createjsNs.Matrix2D = js.native
  // properties
  var style: js.Object = js.native
  // methods
  def bitmap(image: stdLib.HTMLImageElement): Fill = js.native
  def bitmap(image: stdLib.HTMLImageElement, repetition: java.lang.String): Fill = js.native
  def linearGradient(
    colors: js.Array[scala.Double],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): Fill = js.native
  def radialGradient(
    colors: js.Array[scala.Double],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): Fill = js.native
}

