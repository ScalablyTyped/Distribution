package typings.famous.physicsMod

import typings.famous.mathMod.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/physics", "RotationalSpring")
@js.native
class RotationalSpring () extends Force {
  def this(source: Particle) = this()
  def this(source: js.UndefOr[scala.Nothing], targets: js.Array[Particle]) = this()
  def this(source: js.UndefOr[scala.Nothing], targets: Particle) = this()
  def this(source: Particle, targets: js.Array[Particle]) = this()
  def this(source: Particle, targets: Particle) = this()
  def this(
    source: js.UndefOr[scala.Nothing],
    targets: js.UndefOr[scala.Nothing],
    options: IRotationalSpringOptions
  ) = this()
  def this(source: js.UndefOr[scala.Nothing], targets: js.Array[Particle], options: IRotationalSpringOptions) = this()
  def this(source: js.UndefOr[scala.Nothing], targets: Particle, options: IRotationalSpringOptions) = this()
  def this(source: Particle, targets: js.UndefOr[scala.Nothing], options: IRotationalSpringOptions) = this()
  def this(source: Particle, targets: js.Array[Particle], options: IRotationalSpringOptions) = this()
  def this(source: Particle, targets: Particle, options: IRotationalSpringOptions) = this()
  var anchor: Vec3 = js.native
  var damping: Double = js.native
  var dampingRatio: Double = js.native
  var max: Double = js.native
  var period: Double = js.native
  var stiffness: Double = js.native
}

