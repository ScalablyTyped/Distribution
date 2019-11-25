package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullableType extends Type {
  var expression: Type
  var prefix: Boolean
  var `type`: typings.doctrine.doctrineStrings.NullableType
}

object NullableType {
  @scala.inline
  def apply(expression: Type, prefix: Boolean, `type`: typings.doctrine.doctrineStrings.NullableType): NullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableType]
  }
}

