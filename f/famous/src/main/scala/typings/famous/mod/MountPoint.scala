package typings.famous.mod

import typings.famous.coreMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/components", "MountPoint")
@js.native
class MountPoint protected () extends js.Object {
  def this(node: Node) = this()
  def getX(): Double = js.native
  def getY(): Double = js.native
  def getZ(): Double = js.native
  def halt(): Position = js.native
  def isActive(): Boolean = js.native
  def onUpdate(): Unit = js.native
  def set(x: Double): MountPoint = js.native
  def set(x: Double, y: Double): MountPoint = js.native
  def set(x: Double, y: Double, z: Double): MountPoint = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any): MountPoint = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any, callback: js.Function): MountPoint = js.native
  def setX(`val`: Double): MountPoint = js.native
  def setX(`val`: Double, transition: js.Any): MountPoint = js.native
  def setX(`val`: Double, transition: js.Any, callback: js.Function): MountPoint = js.native
  def setY(`val`: Double): MountPoint = js.native
  def setY(`val`: Double, transition: js.Any): MountPoint = js.native
  def setY(`val`: Double, transition: js.Any, callback: js.Function): MountPoint = js.native
  def setZ(`val`: Double): MountPoint = js.native
  def setZ(`val`: Double, transition: js.Any): MountPoint = js.native
  def setZ(`val`: Double, transition: js.Any, callback: js.Function): MountPoint = js.native
  def update(): Unit = js.native
}

