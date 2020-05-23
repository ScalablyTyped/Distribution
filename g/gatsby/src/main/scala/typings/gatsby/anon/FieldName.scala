package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldName extends js.Object {
  var fieldName: js.UndefOr[String] = js.undefined
  var fieldValue: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var node: typings.gatsby.mod.Node
  var value: js.Any
}

object FieldName {
  @scala.inline
  def apply(
    node: typings.gatsby.mod.Node,
    value: js.Any,
    fieldName: String = null,
    fieldValue: String = null,
    name: String = null
  ): FieldName = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (fieldValue != null) __obj.updateDynamic("fieldValue")(fieldValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldName]
  }
}

