package typings.famous.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("famous/physics", "PhysicsEngine")
@js.native
class PhysicsEngine () extends js.Object {
  
  def add(args: js.Any*): PhysicsEngine = js.native
  
  def addBody(body: js.Any): Unit = js.native
  
  def addConstraint(body: js.Any): Unit = js.native
  
  def addForce(body: js.Any): Unit = js.native
  
  def getTransform(body: js.Any): IPhysicsTransform = js.native
  
  def off(key: String, callback: js.Function1[/* payload */ js.Any, Unit]): Unit = js.native
  
  def on(key: String, callback: js.Function1[/* payload */ js.Any, Unit]): Unit = js.native
  
  def remove(args: js.Any*): PhysicsEngine = js.native
  
  def removeBody(body: js.Any): Unit = js.native
  
  def removeConstraint(body: js.Any): Unit = js.native
  
  def removeForce(body: js.Any): Unit = js.native
  
  def setOrientation(w: Double, x: Double, y: Double, z: Double): Unit = js.native
  
  def setOrigin(x: Double, y: Double, z: Double): Unit = js.native
  
  def trigger(key: String, payload: js.Any): Unit = js.native
  
  def update(time: Double): Unit = js.native
}
