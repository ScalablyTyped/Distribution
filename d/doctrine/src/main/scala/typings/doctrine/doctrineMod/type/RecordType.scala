package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordType extends Type {
  var fields: js.Array[Type]
  var `type`: typings.doctrine.doctrineStrings.RecordType
}

object RecordType {
  @scala.inline
  def apply(fields: js.Array[Type], `type`: typings.doctrine.doctrineStrings.RecordType): RecordType = {
    val __obj = js.Dynamic.literal(fields = fields)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecordType]
  }
}

