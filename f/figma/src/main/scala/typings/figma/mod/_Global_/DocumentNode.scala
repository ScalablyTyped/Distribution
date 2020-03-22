package typings.figma.mod._Global_

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
  /**
    * If you only need to search immediate children, it is much faster
    * to call node.children.filter(callback) or node.findChildren(callback)
    */
  def findAll(): js.Array[PageNode | SceneNode] = js.native
  def findAll(callback: js.Function1[/* node */ PageNode | SceneNode, Boolean]): js.Array[PageNode | SceneNode] = js.native
  def findChild(callback: js.Function1[/* node */ PageNode, Boolean]): PageNode | Null = js.native
  def findChildren(): js.Array[PageNode] = js.native
  def findChildren(callback: js.Function1[/* node */ PageNode, Boolean]): js.Array[PageNode] = js.native
  /**
    * If you only need to search immediate children, it is much faster
    * to call node.children.find(callback) or node.findChild(callback)
    */
  def findOne(callback: js.Function1[/* node */ PageNode | SceneNode, Boolean]): PageNode | SceneNode | Null = js.native
  def insertChild(index: Double, child: PageNode): Unit = js.native
}

