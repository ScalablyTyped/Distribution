package typings.figma.figmaMod._Global_

import typings.figma.figmaStrings.DOCUMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Nodes
@js.native
trait DocumentNode
  extends BaseNodeMixin
     with BaseNode {
  val children: js.Array[PageNode] = js.native
  val `type`: DOCUMENT = js.native
  def appendChild(child: PageNode): Unit = js.native
  def findAll(): js.Array[PageNode | SceneNode] = js.native
  def findAll(callback: js.Function1[/* node */ PageNode | SceneNode, Boolean]): js.Array[PageNode | SceneNode] = js.native
  def findOne(callback: js.Function1[/* node */ PageNode | SceneNode, Boolean]): PageNode | SceneNode | Null = js.native
  def insertChild(index: Double, child: PageNode): Unit = js.native
}

