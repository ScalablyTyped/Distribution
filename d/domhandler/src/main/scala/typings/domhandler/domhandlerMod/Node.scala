package typings.domhandler.domhandlerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends DomElement {
  val firstChild: DomElement
  val lastChild: DomElement
  val nodeType: Double
}

object Node {
  @scala.inline
  def apply(
    firstChild: DomElement,
    lastChild: DomElement,
    nodeType: Double,
    attribs: StringDictionary[String] = null,
    children: js.Array[DomElement] = null,
    data: js.Any = null,
    name: String = null,
    next: DomElement = null,
    parent: DomElement = null,
    prev: DomElement = null,
    `type`: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    if (attribs != null) __obj.updateDynamic("attribs")(attribs.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

