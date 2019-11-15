package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenMixin extends js.Object {
  val children: js.Array[SceneNode] = js.native
  def appendChild(child: SceneNode): Unit = js.native
  def findAll(): js.Array[SceneNode] = js.native
  def findAll(callback: js.Function1[/* node */ SceneNode, Boolean]): js.Array[SceneNode] = js.native
  def findOne(callback: js.Function1[/* node */ SceneNode, Boolean]): SceneNode | Null = js.native
  def insertChild(index: Double, child: SceneNode): Unit = js.native
}

