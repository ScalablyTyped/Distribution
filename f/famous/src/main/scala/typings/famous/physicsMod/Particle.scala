package typings.famous.physicsMod

import typings.famous.mathMod.Mat33
import typings.famous.mathMod.Quaternion
import typings.famous.mathMod.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/physics", "Particle")
@js.native
class Particle () extends js.Object {
  def this(options: IParticleOptions) = this()
  var angularMomentum: Vec3 = js.native
  var angularVelocity: Vec3 = js.native
  var collisionGroup: Double = js.native
  var collisionMask: Double = js.native
  var force: Vec3 = js.native
  var friction: Double = js.native
  var inverseInertia: Mat33 = js.native
  var inverseMass: Double = js.native
  var localInertia: Mat33 = js.native
  var localInveseInertia: Mat33 = js.native
  var mass: Double = js.native
  var momentum: Vec3 = js.native
  var orientation: Quaternion = js.native
  var position: Vec3 = js.native
  var restitution: Double = js.native
  var restrictions: Double = js.native
  var size: js.Array[Double] = js.native
  var torque: Vec3 = js.native
  var `type`: Double = js.native
  var velocity: Vec3 = js.native
  def applyAngularImpulse(angularImpulse: Vec3): Particle = js.native
  def applyForce(force: Vec3): Particle = js.native
  def applyImpulse(impulse: Vec3): Particle = js.native
  def applyTorque(torque: Vec3): Particle = js.native
  def getAngularMomentum(): Vec3 = js.native
  def getAngularVelocity(): Vec3 = js.native
  def getForce(): Vec3 = js.native
  def getInverseMass(): Double = js.native
  def getMass(): Double = js.native
  def getMomentum(): Vec3 = js.native
  def getOrientation(): Quaternion = js.native
  def getPosition(): Vec3 = js.native
  def getRestrictions(): js.Array[String] = js.native
  def getTorque(): Vec3 = js.native
  def getVelocity(): Vec3 = js.native
  def off(key: String, callback: js.Function1[/* payload */ js.Any, Unit]): Unit = js.native
  def on(key: String, callback: js.Function1[/* payload */ js.Any, Unit]): Unit = js.native
  def setAngularMomentum(x: Double, y: Double, z: Double): Particle = js.native
  def setAngularVelocity(x: Double, y: Double, z: Double): Particle = js.native
  def setForce(x: Double, y: Double, z: Double): Particle = js.native
  def setMass(mass: Double): Particle = js.native
  def setMomentum(x: Double, y: Double, z: Double): Particle = js.native
  def setOrientation(w: Double, x: Double, y: Double, z: Double): Particle = js.native
  def setPosition(x: Double, y: Double, z: Double): Particle = js.native
  def setRestrictions(transRestrictions: String, rotRestrictions: String): Particle = js.native
  def setTorque(x: Double, y: Double, z: Double): Particle = js.native
  def setVelocity(x: Double, y: Double, z: Double): Particle = js.native
  def support(): Vec3 = js.native
  def trigger(key: String, payload: js.Any): Unit = js.native
  def updateInertia(): Particle = js.native
  def updateLocalInertia(): Particle = js.native
  def updateShape(): Unit = js.native
}

