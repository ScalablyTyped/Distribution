package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndefinedLiteral extends Type {
  var `type`: typings.doctrine.doctrineStrings.UndefinedLiteral
}

object UndefinedLiteral {
  @scala.inline
  def apply(`type`: typings.doctrine.doctrineStrings.UndefinedLiteral): UndefinedLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UndefinedLiteral]
  }
}

