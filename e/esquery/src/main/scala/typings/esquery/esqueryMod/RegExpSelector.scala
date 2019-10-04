package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.regexp
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpSelector extends Atom {
  @JSName("type")
  var type_RegExpSelector: regexp
  var value: RegExp
}

object RegExpSelector {
  @scala.inline
  def apply(`type`: regexp, value: RegExp): RegExpSelector = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegExpSelector]
  }
}

