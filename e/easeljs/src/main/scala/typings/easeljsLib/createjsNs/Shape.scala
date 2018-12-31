package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Shape")
@js.native
class Shape () extends DisplayObject {
  def this(graphics: Graphics) = this()
  // properties
  var graphics: Graphics = js.native
  def clone(recursive: scala.Boolean): Shape = js.native
}

