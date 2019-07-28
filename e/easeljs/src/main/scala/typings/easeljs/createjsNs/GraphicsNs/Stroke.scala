package typings.easeljs.createjsNs.GraphicsNs

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Graphics.Stroke")
@js.native
class Stroke protected () extends js.Object {
  def this(style: js.Object, ignoreScale: Boolean) = this()
  var ignoreScale: Boolean = js.native
  // properties
  var style: js.Object = js.native
  // methods
  def bitmap(image: HTMLImageElement): Stroke = js.native
  def bitmap(image: HTMLImageElement, repetition: String): Stroke = js.native
  def linearGradient(colors: js.Array[Double], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Stroke = js.native
  def radialGradient(
    colors: js.Array[Double],
    ratios: js.Array[Double],
    x0: Double,
    y0: Double,
    r0: Double,
    x1: Double,
    y1: Double,
    r1: Double
  ): Stroke = js.native
}

