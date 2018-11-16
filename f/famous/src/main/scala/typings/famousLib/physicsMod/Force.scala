package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/physics", "Force")
@js.native
class Force () extends js.Object {
  def this(targets: js.Any) = this()
  def this(targets: js.Array[_]) = this()
  def this(targets: js.Any, options: IForceOptions) = this()
  def this(targets: js.Array[_], options: IForceOptions) = this()
  var targets: js.Array[_] = js.native
  def addTarget(target: js.Any): scala.Unit = js.native
  def init(options: js.Any): scala.Unit = js.native
  def removeTarget(target: js.Any): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(time: scala.Double): scala.Unit = js.native
  def update(time: scala.Double, dt: scala.Double): scala.Unit = js.native
}

