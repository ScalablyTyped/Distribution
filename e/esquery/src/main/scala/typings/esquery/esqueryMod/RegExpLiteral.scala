package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.regexp
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral extends Atom {
  @JSName("type")
  var type_RegExpLiteral: regexp
  var value: RegExp
}

object RegExpLiteral {
  @scala.inline
  def apply(`type`: regexp, value: RegExp): RegExpLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
}

