package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNodeFieldArgs extends js.Object {
  /**
    * @deprecated
    */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated
    */
  var fieldValue: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var node: Node
  var value: java.lang.String
}

object CreateNodeFieldArgs {
  @scala.inline
  def apply(
    name: java.lang.String,
    node: Node,
    value: java.lang.String,
    fieldName: java.lang.String = null,
    fieldValue: java.lang.String = null
  ): CreateNodeFieldArgs = {
    val __obj = js.Dynamic.literal(name = name, node = node, value = value)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (fieldValue != null) __obj.updateDynamic("fieldValue")(fieldValue)
    __obj.asInstanceOf[CreateNodeFieldArgs]
  }
}

