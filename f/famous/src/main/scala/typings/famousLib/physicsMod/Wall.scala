package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/physics", "Wall")
@js.native
class Wall protected () extends Particle {
  def this(options: IWallOptions) = this()
  var invNormal: famousLib.mathMod.Vec3 = js.native
  var normal: famousLib.mathMod.Vec3 = js.native
}

