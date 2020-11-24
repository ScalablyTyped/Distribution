package typings.famous.physicsMod

import typings.famous.mathMod.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("famous/physics", "Spring")
@js.native
class Spring () extends Force {
  def this(source: Particle) = this()
  def this(source: js.UndefOr[scala.Nothing], targets: js.Array[Particle]) = this()
  def this(source: js.UndefOr[scala.Nothing], targets: Particle) = this()
  def this(source: Particle, targets: js.Array[Particle]) = this()
  def this(source: Particle, targets: Particle) = this()
  def this(source: js.UndefOr[scala.Nothing], targets: js.UndefOr[scala.Nothing], options: ISpringOptions) = this()
  def this(source: js.UndefOr[scala.Nothing], targets: js.Array[Particle], options: ISpringOptions) = this()
  def this(source: js.UndefOr[scala.Nothing], targets: Particle, options: ISpringOptions) = this()
  def this(source: Particle, targets: js.UndefOr[scala.Nothing], options: ISpringOptions) = this()
  def this(source: Particle, targets: js.Array[Particle], options: ISpringOptions) = this()
  def this(source: Particle, targets: Particle, options: ISpringOptions) = this()
  
  var anchor: Vec3 = js.native
  
  var damping: Double = js.native
  
  var dampingRatio: Double = js.native
  
  def init(): Unit = js.native
  def init(options: ISpringOptions): Unit = js.native
  
  var length: Double = js.native
  
  var maxLength: Double = js.native
  
  var period: Double = js.native
  
  var stiffness: Double = js.native
  
  def `type`(dist: js.Any, rMax: js.Any): Double = js.native
}
/* static members */
@JSImport("famous/physics", "Spring")
@js.native
object Spring extends js.Object {
  
  def FENE(dist: js.Any, rMax: js.Any): Double = js.native
  
  def HOOKE(dist: js.Any, rMax: js.Any): Double = js.native
}
