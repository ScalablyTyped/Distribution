package typings.domhandler.domhandlerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomElement extends js.Object {
  var attribs: js.UndefOr[StringDictionary[String]] = js.undefined
  var children: js.UndefOr[js.Array[DomElement]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[DomElement] = js.undefined
  var parent: js.UndefOr[DomElement] = js.undefined
  var prev: js.UndefOr[DomElement] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DomElement {
  @scala.inline
  def apply(
    attribs: StringDictionary[String] = null,
    children: js.Array[DomElement] = null,
    data: js.Any = null,
    name: String = null,
    next: DomElement = null,
    parent: DomElement = null,
    prev: DomElement = null,
    `type`: String = null
  ): DomElement = {
    val __obj = js.Dynamic.literal()
    if (attribs != null) __obj.updateDynamic("attribs")(attribs.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomElement]
  }
}

