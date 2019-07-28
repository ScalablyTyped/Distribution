package typings.famous.mathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/math", "Quaternion")
@js.native
class Quaternion () extends js.Object {
  var w: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def fromEuler(x: Double, y: Double, z: Double): Quaternion = js.native
  def toEuler(output: Vec3): Vec3 = js.native
}

