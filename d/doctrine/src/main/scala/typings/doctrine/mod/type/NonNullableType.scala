package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonNullableType extends Type_ {
  var expression: Type_
  var prefix: Boolean
  var `type`: typings.doctrine.doctrineStrings.NonNullableType
}

object NonNullableType {
  @scala.inline
  def apply(expression: Type_, prefix: Boolean, `type`: typings.doctrine.doctrineStrings.NonNullableType): NonNullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonNullableType]
  }
}

