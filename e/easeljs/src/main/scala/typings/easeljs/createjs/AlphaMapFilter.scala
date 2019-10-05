package typings.easeljs.createjs

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AlphaMapFilter")
@js.native
class AlphaMapFilter protected () extends Filter {
  def this(alphaMap: HTMLCanvasElement) = this()
  def this(alphaMap: HTMLImageElement) = this()
  // properties
  var alphaMap: HTMLImageElement | HTMLCanvasElement = js.native
}

