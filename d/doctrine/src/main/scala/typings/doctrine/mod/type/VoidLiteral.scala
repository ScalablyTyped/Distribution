package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidLiteral extends Type_ {
  var `type`: typings.doctrine.doctrineStrings.VoidLiteral
}

object VoidLiteral {
  @scala.inline
  def apply(`type`: typings.doctrine.doctrineStrings.VoidLiteral): VoidLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidLiteral]
  }
}

