package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/physics", "Particle")
@js.native
class Particle () extends js.Object {
  def this(options: IParticleOptions) = this()
  var angularMomentum: famousLib.mathMod.Vec3 = js.native
  var angularVelocity: famousLib.mathMod.Vec3 = js.native
  var collisionGroup: scala.Double = js.native
  var collisionMask: scala.Double = js.native
  var force: famousLib.mathMod.Vec3 = js.native
  var friction: scala.Double = js.native
  var inverseInertia: famousLib.mathMod.Mat33 = js.native
  var inverseMass: scala.Double = js.native
  var localInertia: famousLib.mathMod.Mat33 = js.native
  var localInveseInertia: famousLib.mathMod.Mat33 = js.native
  var mass: scala.Double = js.native
  var momentum: famousLib.mathMod.Vec3 = js.native
  var orientation: famousLib.mathMod.Quaternion = js.native
  var position: famousLib.mathMod.Vec3 = js.native
  var restitution: scala.Double = js.native
  var restrictions: scala.Double = js.native
  var size: js.Array[scala.Double] = js.native
  var torque: famousLib.mathMod.Vec3 = js.native
  var `type`: scala.Double = js.native
  var velocity: famousLib.mathMod.Vec3 = js.native
  def applyAngularImpulse(angularImpulse: famousLib.mathMod.Vec3): Particle = js.native
  def applyForce(force: famousLib.mathMod.Vec3): Particle = js.native
  def applyImpulse(impulse: famousLib.mathMod.Vec3): Particle = js.native
  def applyTorque(torque: famousLib.mathMod.Vec3): Particle = js.native
  def getAngularMomentum(): famousLib.mathMod.Vec3 = js.native
  def getAngularVelocity(): famousLib.mathMod.Vec3 = js.native
  def getForce(): famousLib.mathMod.Vec3 = js.native
  def getInverseMass(): scala.Double = js.native
  def getMass(): scala.Double = js.native
  def getMomentum(): famousLib.mathMod.Vec3 = js.native
  def getOrientation(): famousLib.mathMod.Quaternion = js.native
  def getPosition(): famousLib.mathMod.Vec3 = js.native
  def getRestrictions(): js.Array[java.lang.String] = js.native
  def getTorque(): famousLib.mathMod.Vec3 = js.native
  def getVelocity(): famousLib.mathMod.Vec3 = js.native
  def off(key: java.lang.String, callback: js.Function1[/* payload */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(key: java.lang.String, callback: js.Function1[/* payload */ js.Any, scala.Unit]): scala.Unit = js.native
  def setAngularMomentum(x: scala.Double, y: scala.Double, z: scala.Double): Particle = js.native
  def setAngularVelocity(x: scala.Double, y: scala.Double, z: scala.Double): Particle = js.native
  def setForce(x: scala.Double, y: scala.Double, z: scala.Double): Particle = js.native
  def setMass(mass: scala.Double): Particle = js.native
  def setMomentum(x: scala.Double, y: scala.Double, z: scala.Double): Particle = js.native
  def setOrientation(w: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): Particle = js.native
  def setPosition(x: scala.Double, y: scala.Double, z: scala.Double): Particle = js.native
  def setRestrictions(transRestrictions: java.lang.String, rotRestrictions: java.lang.String): Particle = js.native
  def setTorque(x: scala.Double, y: scala.Double, z: scala.Double): Particle = js.native
  def setVelocity(x: scala.Double, y: scala.Double, z: scala.Double): Particle = js.native
  def support(): famousLib.mathMod.Vec3 = js.native
  def trigger(key: java.lang.String, payload: js.Any): scala.Unit = js.native
  def updateInertia(): Particle = js.native
  def updateLocalInertia(): Particle = js.native
  def updateShape(): scala.Unit = js.native
}

