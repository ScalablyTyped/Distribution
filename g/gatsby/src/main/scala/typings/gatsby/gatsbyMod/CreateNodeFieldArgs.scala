package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNodeFieldArgs extends js.Object {
  /**
    * @deprecated
    */
  var fieldName: js.UndefOr[String] = js.undefined
  /**
    * @deprecated
    */
  var fieldValue: js.UndefOr[String] = js.undefined
  var name: String
  var node: Node
  var value: String
}

object CreateNodeFieldArgs {
  @scala.inline
  def apply(name: String, node: Node, value: String, fieldName: String = null, fieldValue: String = null): CreateNodeFieldArgs = {
    val __obj = js.Dynamic.literal(name = name, node = node, value = value)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (fieldValue != null) __obj.updateDynamic("fieldValue")(fieldValue)
    __obj.asInstanceOf[CreateNodeFieldArgs]
  }
}

