package typings
package easeljsLib.createjsNs.GraphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Graphics.Stroke")
@js.native
class Stroke protected () extends js.Object {
  def this(style: js.Object, ignoreScale: scala.Boolean) = this()
  var ignoreScale: scala.Boolean = js.native
  // properties
  var style: js.Object = js.native
  // methods
  def bitmap(image: stdLib.HTMLImageElement): Stroke = js.native
  // methods
  def bitmap(image: stdLib.HTMLImageElement, repetition: java.lang.String): Stroke = js.native
  def linearGradient(
    colors: js.Array[scala.Double],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): Stroke = js.native
  def radialGradient(
    colors: js.Array[scala.Double],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): Stroke = js.native
}

