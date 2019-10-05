package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldType extends Type {
  var key: String
  var `type`: typings.doctrine.doctrineStrings.FieldType
  var value: js.UndefOr[Type] = js.undefined
}

object FieldType {
  @scala.inline
  def apply(key: String, `type`: typings.doctrine.doctrineStrings.FieldType, value: Type = null): FieldType = {
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FieldType]
  }
}

