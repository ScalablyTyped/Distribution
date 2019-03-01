package typings
package dom4Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentNode extends js.Object {
  /**
    * Returns the child elements.
    */
  val children: stdLib.HTMLCollection
  /**
    * Inserts `nodes` after the last child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def append(nodes: (stdLib.Node | java.lang.String)*): scala.Unit
  /**
    * Inserts `nodes` before the first child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def prepend(nodes: (stdLib.Node | java.lang.String)*): scala.Unit
}

object ParentNode {
  @scala.inline
  def apply(
    append: js.Function1[/* repeated */ stdLib.Node | java.lang.String, scala.Unit],
    children: stdLib.HTMLCollection,
    prepend: js.Function1[/* repeated */ stdLib.Node | java.lang.String, scala.Unit]
  ): ParentNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(append)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("prepend")(prepend)
    __obj.asInstanceOf[ParentNode]
  }
}

