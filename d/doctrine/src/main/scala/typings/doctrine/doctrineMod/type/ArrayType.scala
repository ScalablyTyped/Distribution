package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayType extends Type {
  var elements: js.Array[Type]
  var `type`: typings.doctrine.doctrineStrings.ArrayType
}

object ArrayType {
  @scala.inline
  def apply(elements: js.Array[Type], `type`: typings.doctrine.doctrineStrings.ArrayType): ArrayType = {
    val __obj = js.Dynamic.literal(elements = elements)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArrayType]
  }
}

