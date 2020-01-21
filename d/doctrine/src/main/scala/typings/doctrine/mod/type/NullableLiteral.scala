package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullableLiteral extends Type_ {
  var `type`: typings.doctrine.doctrineStrings.NullableLiteral
}

object NullableLiteral {
  @scala.inline
  def apply(`type`: typings.doctrine.doctrineStrings.NullableLiteral): NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableLiteral]
  }
}

