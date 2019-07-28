package typings.famous.componentsMod

import typings.famous.coreMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/components", "Opacity")
@js.native
class Opacity protected () extends js.Object {
  def this(node: Node) = this()
  def get(): Double = js.native
  def halt(): Position = js.native
  def isActive(): Boolean = js.native
  def onUpdate(): Unit = js.native
  def set(value: Double): Opacity = js.native
  def set(value: Double, transition: js.Any): Opacity = js.native
  def set(value: Double, transition: js.Any, callback: js.Function): Opacity = js.native
  def update(): Unit = js.native
}

