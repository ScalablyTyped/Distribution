package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/physics", "Drag")
@js.native
class Drag () extends Force {
  def this(targets: js.Any) = this()
  def this(targets: js.Array[_]) = this()
  def this(targets: js.Any, options: IDragOptions) = this()
  def this(targets: js.Array[_], options: IDragOptions) = this()
  var max: scala.Double = js.native
  var strength: scala.Double = js.native
  def init(): scala.Unit = js.native
  def `type`(v: scala.Double): scala.Double = js.native
}

@JSImport("famous/physics", "Drag")
@js.native
object Drag extends js.Object {
  def LINEAR(v: scala.Double): scala.Double = js.native
  def QUADRATIC(v: scala.Double): scala.Double = js.native
}

