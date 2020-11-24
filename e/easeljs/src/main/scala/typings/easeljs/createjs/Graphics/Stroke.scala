package typings.easeljs.createjs.Graphics

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stroke extends js.Object {
  
  // methods
  def bitmap(image: HTMLImageElement): Stroke = js.native
  def bitmap(image: HTMLImageElement, repetition: String): Stroke = js.native
  
  var ignoreScale: Boolean = js.native
  
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
  
  // properties
  var style: js.Object = js.native
}
