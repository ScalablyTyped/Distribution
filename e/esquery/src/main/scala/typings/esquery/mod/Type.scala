package typings.esquery.mod

import typings.esquery.esqueryStrings.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type
  extends Atom
     with Selector {
  @JSName("type")
  var type_Type: `type`
  var value: String
}

object Type {
  @scala.inline
  def apply(`type`: `type`, value: String): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

