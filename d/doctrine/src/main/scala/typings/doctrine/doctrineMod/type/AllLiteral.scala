package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllLiteral extends Type {
  var `type`: typings.doctrine.doctrineStrings.AllLiteral
}

object AllLiteral {
  @scala.inline
  def apply(`type`: typings.doctrine.doctrineStrings.AllLiteral): AllLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllLiteral]
  }
}

