package typings.famous.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/physics", "Force")
@js.native
class Force () extends js.Object {
  def this(targets: js.Any) = this()
  def this(targets: js.Array[_]) = this()
  def this(targets: js.UndefOr[scala.Nothing], options: IForceOptions) = this()
  def this(targets: js.Any, options: IForceOptions) = this()
  def this(targets: js.Array[_], options: IForceOptions) = this()
  var targets: js.Array[_] = js.native
  def addTarget(target: js.Any): Unit = js.native
  def init(options: js.Any): Unit = js.native
  def removeTarget(target: js.Any): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def update(): Unit = js.native
  def update(time: js.UndefOr[scala.Nothing], dt: Double): Unit = js.native
  def update(time: Double): Unit = js.native
  def update(time: Double, dt: Double): Unit = js.native
}

