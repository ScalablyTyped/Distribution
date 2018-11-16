package typings
package dom4Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * https://dom.spec.whatwg.org/#childnode
 */

trait ChildNode extends js.Object {
  /**
       * Inserts `nodes` just after this node, while replacing strings with equivalent `Text` nodes.
       */
  def after(nodes: (stdLib.Node | java.lang.String)*): scala.Unit
  /**
       * Inserts `nodes` just before this node, while replacing strings with equivalent `Text` nodes.
       */
  def before(nodes: (stdLib.Node | java.lang.String)*): scala.Unit
  /**
       * Removes this node.
       */
  def remove(): scala.Unit
  /**
       * Replaces this node with `nodes`, while replacing strings in nodes with equivalent Text nodes.
       */
  def replaceWith(nodes: (stdLib.Node | java.lang.String)*): scala.Unit
}

