package typings.doctrine.doctrineMod.`type`

import typings.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullLiteral extends Type {
  var `type`: typings.doctrine.doctrineStrings.NullLiteral
}

object NullLiteral {
  @scala.inline
  def apply(`type`: typings.doctrine.doctrineStrings.NullLiteral): NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteral]
  }
}

