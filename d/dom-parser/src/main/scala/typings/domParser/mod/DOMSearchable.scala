package typings.domParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMSearchable extends js.Object {
  def getElementById(id: String): Node | Null
  def getElementsByClassName(className: String): js.Array[Node] | Null
  def getElementsByName(name: String): js.Array[Node] | Null
  def getElementsByTagName(tagName: String): js.Array[Node] | Null
}

object DOMSearchable {
  @scala.inline
  def apply(
    getElementById: String => Node | Null,
    getElementsByClassName: String => js.Array[Node] | Null,
    getElementsByName: String => js.Array[Node] | Null,
    getElementsByTagName: String => js.Array[Node] | Null
  ): DOMSearchable = {
    val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName))
    __obj.asInstanceOf[DOMSearchable]
  }
}

