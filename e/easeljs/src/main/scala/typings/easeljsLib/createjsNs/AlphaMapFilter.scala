package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AlphaMapFilter")
@js.native
class AlphaMapFilter protected () extends Filter {
  def this(alphaMap: stdLib.HTMLCanvasElement) = this()
  def this(alphaMap: stdLib.HTMLImageElement) = this()
  // properties
  var alphaMap: stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = js.native
}

