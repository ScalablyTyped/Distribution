package typings.famous.mod

import typings.famous.coreMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("famous/components", "Origin")
@js.native
class Origin protected () extends js.Object {
  def this(node: Node) = this()
  
  def getX(): Double = js.native
  
  def getY(): Double = js.native
  
  def getZ(): Double = js.native
  
  def halt(): Position = js.native
  
  def isActive(): Boolean = js.native
  
  def onUpdate(): Unit = js.native
  
  def set(x: Double): Origin = js.native
  def set(
    x: Double,
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    transition: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Origin = js.native
  def set(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], transition: js.Any): Origin = js.native
  def set(
    x: Double,
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    transition: js.Any,
    callback: js.Function
  ): Origin = js.native
  def set(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Origin = js.native
  def set(
    x: Double,
    y: js.UndefOr[scala.Nothing],
    z: Double,
    transition: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Origin = js.native
  def set(x: Double, y: js.UndefOr[scala.Nothing], z: Double, transition: js.Any): Origin = js.native
  def set(x: Double, y: js.UndefOr[scala.Nothing], z: Double, transition: js.Any, callback: js.Function): Origin = js.native
  def set(x: Double, y: Double): Origin = js.native
  def set(
    x: Double,
    y: Double,
    z: js.UndefOr[scala.Nothing],
    transition: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Origin = js.native
  def set(x: Double, y: Double, z: js.UndefOr[scala.Nothing], transition: js.Any): Origin = js.native
  def set(x: Double, y: Double, z: js.UndefOr[scala.Nothing], transition: js.Any, callback: js.Function): Origin = js.native
  def set(x: Double, y: Double, z: Double): Origin = js.native
  def set(x: Double, y: Double, z: Double, transition: js.UndefOr[scala.Nothing], callback: js.Function): Origin = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any): Origin = js.native
  def set(x: Double, y: Double, z: Double, transition: js.Any, callback: js.Function): Origin = js.native
  
  def setX(`val`: Double): Origin = js.native
  def setX(`val`: Double, transition: js.UndefOr[scala.Nothing], callback: js.Function): Origin = js.native
  def setX(`val`: Double, transition: js.Any): Origin = js.native
  def setX(`val`: Double, transition: js.Any, callback: js.Function): Origin = js.native
  
  def setY(`val`: Double): Origin = js.native
  def setY(`val`: Double, transition: js.UndefOr[scala.Nothing], callback: js.Function): Origin = js.native
  def setY(`val`: Double, transition: js.Any): Origin = js.native
  def setY(`val`: Double, transition: js.Any, callback: js.Function): Origin = js.native
  
  def setZ(`val`: Double): Origin = js.native
  def setZ(`val`: Double, transition: js.UndefOr[scala.Nothing], callback: js.Function): Origin = js.native
  def setZ(`val`: Double, transition: js.Any): Origin = js.native
  def setZ(`val`: Double, transition: js.Any, callback: js.Function): Origin = js.native
  
  def update(): Unit = js.native
}
