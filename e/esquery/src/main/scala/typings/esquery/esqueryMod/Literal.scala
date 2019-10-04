package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literal extends Atom {
  @JSName("type")
  var type_Literal: literal
  var value: String | Double
}

object Literal {
  @scala.inline
  def apply(`type`: literal, value: String | Double): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Literal]
  }
}

