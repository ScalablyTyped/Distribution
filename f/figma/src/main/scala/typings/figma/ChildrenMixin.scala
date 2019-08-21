package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenMixin extends js.Object {
  val children: js.Array[BaseNode] = js.native
  def appendChild(child: BaseNode): Unit = js.native
  def findAll(): js.Array[BaseNode] = js.native
  def findAll(callback: js.Function1[/* node */ BaseNode, Boolean]): js.Array[BaseNode] = js.native
  def findOne(callback: js.Function1[/* node */ BaseNode, Boolean]): BaseNode | Null = js.native
  def insertChild(index: Double, child: BaseNode): Unit = js.native
}

