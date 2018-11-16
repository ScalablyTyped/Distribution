package typings
package famousLib.componentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/components", "Rotation")
@js.native
class Rotation protected () extends js.Object {
  def this(node: famousLib.coreMod.Node) = this()
  def getX(): scala.Double = js.native
  def getY(): scala.Double = js.native
  def getZ(): scala.Double = js.native
  def halt(): Position = js.native
  def isActive(): scala.Boolean = js.native
  def onUpdate(): scala.Unit = js.native
  def set(x: scala.Double): Rotation = js.native
  def set(x: scala.Double, y: scala.Double): Rotation = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double): Rotation = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double, transition: js.Any): Rotation = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double, transition: js.Any, callback: js.Function): Rotation = js.native
  def setX(`val`: scala.Double): Rotation = js.native
  def setX(`val`: scala.Double, transition: js.Any): Rotation = js.native
  def setX(`val`: scala.Double, transition: js.Any, callback: js.Function): Rotation = js.native
  def setY(`val`: scala.Double): Rotation = js.native
  def setY(`val`: scala.Double, transition: js.Any): Rotation = js.native
  def setY(`val`: scala.Double, transition: js.Any, callback: js.Function): Rotation = js.native
  def setZ(`val`: scala.Double): Rotation = js.native
  def setZ(`val`: scala.Double, transition: js.Any): Rotation = js.native
  def setZ(`val`: scala.Double, transition: js.Any, callback: js.Function): Rotation = js.native
  def update(): scala.Unit = js.native
}

