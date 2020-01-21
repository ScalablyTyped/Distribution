package typings.famous.mod

import typings.famous.coreMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/components", "Align")
@js.native
class Align protected () extends js.Object {
  def this(node: Node) = this()
  def getX(): Double = js.native
  def getY(): Double = js.native
  def getZ(): Double = js.native
  def halt(): Position = js.native
  def isActive(): Boolean = js.native
  def onUpdate(): Unit = js.native
  def set(x: Double): Align = js.native
  def set(x: Double, y: Double): Align = js.native
  def set(x: Double, y: Double, z: Double): Align = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any): Align = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any, callback: js.Function): Align = js.native
  def setX(`val`: Double): Align = js.native
  def setX(`val`: Double, transition: js.Any): Align = js.native
  def setX(`val`: Double, transition: js.Any, callback: js.Function): Align = js.native
  def setY(`val`: Double): Align = js.native
  def setY(`val`: Double, transition: js.Any): Align = js.native
  def setY(`val`: Double, transition: js.Any, callback: js.Function): Align = js.native
  def setZ(`val`: Double): Align = js.native
  def setZ(`val`: Double, transition: js.Any): Align = js.native
  def setZ(`val`: Double, transition: js.Any, callback: js.Function): Align = js.native
  def update(): Unit = js.native
}

