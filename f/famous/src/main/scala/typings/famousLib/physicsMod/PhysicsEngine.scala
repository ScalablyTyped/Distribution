package typings
package famousLib.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/physics", "PhysicsEngine")
@js.native
class PhysicsEngine () extends js.Object {
  def add(args: js.Any*): PhysicsEngine = js.native
  def addBody(body: js.Any): scala.Unit = js.native
  def addConstraint(body: js.Any): scala.Unit = js.native
  def addForce(body: js.Any): scala.Unit = js.native
  def getTransform(body: js.Any): IPhysicsTransform = js.native
  def off(key: java.lang.String, callback: js.Function1[/* payload */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(key: java.lang.String, callback: js.Function1[/* payload */ js.Any, scala.Unit]): scala.Unit = js.native
  def remove(args: js.Any*): PhysicsEngine = js.native
  def removeBody(body: js.Any): scala.Unit = js.native
  def removeConstraint(body: js.Any): scala.Unit = js.native
  def removeForce(body: js.Any): scala.Unit = js.native
  def setOrientation(w: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  def setOrigin(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  def trigger(key: java.lang.String, payload: js.Any): scala.Unit = js.native
  def update(time: scala.Double): scala.Unit = js.native
}

