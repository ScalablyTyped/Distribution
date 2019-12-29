package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralAtom extends Atom {
  @JSName("type")
  var type_LiteralAtom: literal
  var value: String | Double
}

object LiteralAtom {
  @scala.inline
  def apply(`type`: literal, value: String | Double): LiteralAtom = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralAtom]
  }
}

