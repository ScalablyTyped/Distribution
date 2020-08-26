package typings.famous.mod

import typings.famous.coreMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/components", "Rotation")
@js.native
class Rotation protected () extends js.Object {
  def this(node: Node) = this()
  def getX(): Double = js.native
  def getY(): Double = js.native
  def getZ(): Double = js.native
  def halt(): Position = js.native
  def isActive(): Boolean = js.native
  def onUpdate(): Unit = js.native
  def set(x: Double): Rotation = js.native
  def set(
    x: Double,
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    transition: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Rotation = js.native
  def set(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], transition: js.Any): Rotation = js.native
  def set(
    x: Double,
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    transition: js.Any,
    callback: js.Function
  ): Rotation = js.native
  def set(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Rotation = js.native
  def set(
    x: Double,
    y: js.UndefOr[scala.Nothing],
    z: Double,
    transition: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Rotation = js.native
  def set(x: Double, y: js.UndefOr[scala.Nothing], z: Double, transition: js.Any): Rotation = js.native
  def set(x: Double, y: js.UndefOr[scala.Nothing], z: Double, transition: js.Any, callback: js.Function): Rotation = js.native
  def set(x: Double, y: Double): Rotation = js.native
  def set(
    x: Double,
    y: Double,
    z: js.UndefOr[scala.Nothing],
    transition: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Rotation = js.native
  def set(x: Double, y: Double, z: js.UndefOr[scala.Nothing], transition: js.Any): Rotation = js.native
  def set(x: Double, y: Double, z: js.UndefOr[scala.Nothing], transition: js.Any, callback: js.Function): Rotation = js.native
  def set(x: Double, y: Double, z: Double): Rotation = js.native
  def set(x: Double, y: Double, z: Double, transition: js.UndefOr[scala.Nothing], callback: js.Function): Rotation = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any): Rotation = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any, callback: js.Function): Rotation = js.native
  def setX(`val`: Double): Rotation = js.native
  def setX(`val`: Double, transition: js.UndefOr[scala.Nothing], callback: js.Function): Rotation = js.native
  def setX(`val`: Double, transition: js.Any): Rotation = js.native
  def setX(`val`: Double, transition: js.Any, callback: js.Function): Rotation = js.native
  def setY(`val`: Double): Rotation = js.native
  def setY(`val`: Double, transition: js.UndefOr[scala.Nothing], callback: js.Function): Rotation = js.native
  def setY(`val`: Double, transition: js.Any): Rotation = js.native
  def setY(`val`: Double, transition: js.Any, callback: js.Function): Rotation = js.native
  def setZ(`val`: Double): Rotation = js.native
  def setZ(`val`: Double, transition: js.UndefOr[scala.Nothing], callback: js.Function): Rotation = js.native
  def setZ(`val`: Double, transition: js.Any): Rotation = js.native
  def setZ(`val`: Double, transition: js.Any, callback: js.Function): Rotation = js.native
  def update(): Unit = js.native
}

