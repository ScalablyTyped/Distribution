package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayType extends Type_ {
  var elements: js.Array[Type_]
  var `type`: typings.doctrine.doctrineStrings.ArrayType
}

object ArrayType {
  @scala.inline
  def apply(elements: js.Array[Type_], `type`: typings.doctrine.doctrineStrings.ArrayType): ArrayType = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayType]
  }
}

