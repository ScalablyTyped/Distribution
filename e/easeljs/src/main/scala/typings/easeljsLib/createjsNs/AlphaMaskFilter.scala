package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AlphaMaskFilter")
@js.native
class AlphaMaskFilter protected () extends Filter {
  def this(mask: stdLib.HTMLCanvasElement) = this()
  def this(mask: stdLib.HTMLImageElement) = this()
  // properties
  var mask: stdLib.HTMLImageElement | stdLib.HTMLCanvasElement = js.native
}

