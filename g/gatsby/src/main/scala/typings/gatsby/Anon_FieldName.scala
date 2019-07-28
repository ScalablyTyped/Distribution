package typings.gatsby

import typings.gatsby.gatsbyMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldName extends js.Object {
  var fieldName: js.UndefOr[String] = js.undefined
  var fieldValue: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var node: Node
  var value: js.Any
}

object Anon_FieldName {
  @scala.inline
  def apply(
    node: Node,
    value: js.Any,
    fieldName: String = null,
    fieldValue: String = null,
    name: String = null
  ): Anon_FieldName = {
    val __obj = js.Dynamic.literal(node = node, value = value)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (fieldValue != null) __obj.updateDynamic("fieldValue")(fieldValue)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_FieldName]
  }
}

