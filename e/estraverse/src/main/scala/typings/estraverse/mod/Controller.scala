package typings.estraverse.mod

import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("estraverse", "Controller")
@js.native
class Controller () extends js.Object {
  /**
    * Break the traversals.
    */
  def break(): Unit = js.native
  /**
    * The current node.
    */
  def current(): Node = js.native
  /**
    * Notify the controller to break the traversals, skip the child nodes of current node or remove the
    * current node.
    */
  def notify(flag: VisitorOption): Unit = js.native
  /**
    * An array of parent elements.
    */
  def parents(): js.Array[Node] = js.native
  /**
    * Obtain the property paths array from root to the current node.
    */
  def path(): (js.Array[String | Double]) | Null = js.native
  /**
    * Remove the current node.
    */
  def remove(): Unit = js.native
  /**
    * Traverse and replace the AST.
    */
  def replace(root: Node, visitor: Visitor): Node = js.native
  /**
    * Skip the child nodes of current node.
    */
  def skip(): Unit = js.native
  /**
    * Traverse the AST.
    */
  def traverse(root: Node, visitor: Visitor): Unit = js.native
  /**
    * The type of current node.
    */
  def `type`(): String = js.native
}

