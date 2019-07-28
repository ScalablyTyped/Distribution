package typings.famous.componentsMod

import typings.famous.coreMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/components", "Scale")
@js.native
class Scale protected () extends js.Object {
  def this(node: Node) = this()
  def getX(): Double = js.native
  def getY(): Double = js.native
  def getZ(): Double = js.native
  def halt(): Position = js.native
  def isActive(): Boolean = js.native
  def onUpdate(): Unit = js.native
  def set(x: Double): Scale = js.native
  def set(x: Double, y: Double): Scale = js.native
  def set(x: Double, y: Double, z: Double): Scale = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any): Scale = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any, callback: js.Function): Scale = js.native
  def setX(`val`: Double): Scale = js.native
  def setX(`val`: Double, transition: js.Any): Scale = js.native
  def setX(`val`: Double, transition: js.Any, callback: js.Function): Scale = js.native
  def setY(`val`: Double): Scale = js.native
  def setY(`val`: Double, transition: js.Any): Scale = js.native
  def setY(`val`: Double, transition: js.Any, callback: js.Function): Scale = js.native
  def setZ(`val`: Double): Scale = js.native
  def setZ(`val`: Double, transition: js.Any): Scale = js.native
  def setZ(`val`: Double, transition: js.Any, callback: js.Function): Scale = js.native
  def update(): Unit = js.native
}

