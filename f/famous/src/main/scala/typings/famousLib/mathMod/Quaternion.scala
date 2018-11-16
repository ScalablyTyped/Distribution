package typings
package famousLib.mathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/math", "Quaternion")
@js.native
class Quaternion () extends js.Object {
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def fromEuler(x: scala.Double, y: scala.Double, z: scala.Double): Quaternion = js.native
  def toEuler(output: Vec3): Vec3 = js.native
}

