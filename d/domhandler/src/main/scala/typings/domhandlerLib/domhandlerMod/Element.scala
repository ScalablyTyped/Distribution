package typings
package domhandlerLib.domhandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends DomElement {
  @JSName("name")
  var name_Element: java.lang.String
}

object Element {
  @scala.inline
  def apply(
    name: java.lang.String,
    attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    children: js.Array[DomElement] = null,
    data: js.Any = null,
    next: DomElement = null,
    parent: DomElement = null,
    prev: DomElement = null,
    `type`: java.lang.String = null
  ): Element = {
    val __obj = js.Dynamic.literal(name = name)
    if (attribs != null) __obj.updateDynamic("attribs")(attribs)
    if (children != null) __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (next != null) __obj.updateDynamic("next")(next)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Element]
  }
}

