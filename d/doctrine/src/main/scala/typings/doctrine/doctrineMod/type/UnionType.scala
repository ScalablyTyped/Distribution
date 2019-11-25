package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionType extends Type {
  var elements: js.Array[Type]
  var `type`: typings.doctrine.doctrineStrings.UnionType
}

object UnionType {
  @scala.inline
  def apply(elements: js.Array[Type], `type`: typings.doctrine.doctrineStrings.UnionType): UnionType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionType]
  }
}

