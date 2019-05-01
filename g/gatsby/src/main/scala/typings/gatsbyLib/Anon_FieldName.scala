package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldName extends js.Object {
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  var fieldValue: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var node: gatsbyLib.gatsbyMod.Node
  var value: js.Any
}

object Anon_FieldName {
  @scala.inline
  def apply(
    node: gatsbyLib.gatsbyMod.Node,
    value: js.Any,
    fieldName: java.lang.String = null,
    fieldValue: java.lang.String = null,
    name: java.lang.String = null
  ): Anon_FieldName = {
    val __obj = js.Dynamic.literal(node = node, value = value)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (fieldValue != null) __obj.updateDynamic("fieldValue")(fieldValue)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_FieldName]
  }
}

