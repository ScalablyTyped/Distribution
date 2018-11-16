package typings
package famousLib.componentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/components", "MountPoint")
@js.native
class MountPoint protected () extends js.Object {
  def this(node: famousLib.coreMod.Node) = this()
  def getX(): scala.Double = js.native
  def getY(): scala.Double = js.native
  def getZ(): scala.Double = js.native
  def halt(): Position = js.native
  def isActive(): scala.Boolean = js.native
  def onUpdate(): scala.Unit = js.native
  def set(x: scala.Double): MountPoint = js.native
  def set(x: scala.Double, y: scala.Double): MountPoint = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double): MountPoint = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double, transition: js.Any): MountPoint = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double, transition: js.Any, callback: js.Function): MountPoint = js.native
  def setX(`val`: scala.Double): MountPoint = js.native
  def setX(`val`: scala.Double, transition: js.Any): MountPoint = js.native
  def setX(`val`: scala.Double, transition: js.Any, callback: js.Function): MountPoint = js.native
  def setY(`val`: scala.Double): MountPoint = js.native
  def setY(`val`: scala.Double, transition: js.Any): MountPoint = js.native
  def setY(`val`: scala.Double, transition: js.Any, callback: js.Function): MountPoint = js.native
  def setZ(`val`: scala.Double): MountPoint = js.native
  def setZ(`val`: scala.Double, transition: js.Any): MountPoint = js.native
  def setZ(`val`: scala.Double, transition: js.Any, callback: js.Function): MountPoint = js.native
  def update(): scala.Unit = js.native
}

