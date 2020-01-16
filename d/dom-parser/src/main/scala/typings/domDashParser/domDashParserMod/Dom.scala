package typings.domDashParser.domDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom extends DOMSearchable {
  def getElementsByAttribute(attribute: String): js.Array[Node] | Null
}

object Dom {
  @scala.inline
  def apply(
    getElementById: String => Node | Null,
    getElementsByAttribute: String => js.Array[Node] | Null,
    getElementsByClassName: String => js.Array[Node] | Null,
    getElementsByName: String => js.Array[Node] | Null,
    getElementsByTagName: String => js.Array[Node] | Null
  ): Dom = {
    val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById), getElementsByAttribute = js.Any.fromFunction1(getElementsByAttribute), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName))
  
    __obj.asInstanceOf[Dom]
  }
}

