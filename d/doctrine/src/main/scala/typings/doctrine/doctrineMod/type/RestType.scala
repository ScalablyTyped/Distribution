package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestType extends Type {
  var expression: js.UndefOr[Type] = js.undefined
  var `type`: typings.doctrine.doctrineStrings.RestType
}

object RestType {
  @scala.inline
  def apply(`type`: typings.doctrine.doctrineStrings.RestType, expression: Type = null): RestType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestType]
  }
}

