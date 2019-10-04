package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericLiteral extends Literal {
  @JSName("value")
  var value_NumericLiteral: Double
}

object NumericLiteral {
  @scala.inline
  def apply(`type`: literal, value: Double): NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NumericLiteral]
  }
}

