package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignDisplayPattern extends js.Object {
  var always: NotationPattern
  var auto: NotationPattern
  var exceptZero: NotationPattern
  var never: NotationPattern
}

object SignDisplayPattern {
  @scala.inline
  def apply(
    always: NotationPattern,
    auto: NotationPattern,
    exceptZero: NotationPattern,
    never: NotationPattern
  ): SignDisplayPattern = {
    val __obj = js.Dynamic.literal(always = always.asInstanceOf[js.Any], auto = auto.asInstanceOf[js.Any], exceptZero = exceptZero.asInstanceOf[js.Any], never = never.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignDisplayPattern]
  }
}

