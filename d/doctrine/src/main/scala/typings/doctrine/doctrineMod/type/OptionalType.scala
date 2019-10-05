package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalType extends Type {
  var expression: Type
  var `type`: typings.doctrine.doctrineStrings.OptionalType
}

object OptionalType {
  @scala.inline
  def apply(expression: Type, `type`: typings.doctrine.doctrineStrings.OptionalType): OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OptionalType]
  }
}

