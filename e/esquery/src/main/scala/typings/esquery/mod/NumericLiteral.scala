package typings.esquery.mod

import typings.esquery.esqueryStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericLiteral
  extends LiteralAtom
     with Literal {
  @JSName("value")
  var value_NumericLiteral: Double
}

object NumericLiteral {
  @scala.inline
  def apply(`type`: literal, value: Double): NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericLiteral]
  }
}

