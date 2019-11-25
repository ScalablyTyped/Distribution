package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends Atom {
  var name: String
  @JSName("type")
  var type_Field: field
}

object Field {
  @scala.inline
  def apply(name: String, `type`: field): Field = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

