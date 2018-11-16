package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/physics", "Spring")
@js.native
class Spring () extends Force {
  def this(source: Particle) = this()
  def this(source: Particle, targets: Particle) = this()
  def this(source: Particle, targets: js.Array[Particle]) = this()
  def this(source: Particle, targets: Particle, options: ISpringOptions) = this()
  def this(source: Particle, targets: js.Array[Particle], options: ISpringOptions) = this()
  var anchor: famousLib.mathMod.Vec3 = js.native
  var damping: scala.Double = js.native
  var dampingRatio: scala.Double = js.native
  var length: scala.Double = js.native
  var maxLength: scala.Double = js.native
  var period: scala.Double = js.native
  var stiffness: scala.Double = js.native
  def init(): scala.Unit = js.native
  def init(options: ISpringOptions): scala.Unit = js.native
  def `type`(dist: js.Any, rMax: js.Any): scala.Double = js.native
}

@JSImport("famous/physics", "Spring")
@js.native
object Spring extends js.Object {
  def FENE(dist: js.Any, rMax: js.Any): scala.Double = js.native
  def HOOKE(dist: js.Any, rMax: js.Any): scala.Double = js.native
}

