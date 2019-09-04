package typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitPattern extends js.Object {
  var one: js.UndefOr[String] = js.undefined
  var other: js.UndefOr[String] = js.undefined
  var perUnit: js.UndefOr[String] = js.undefined
}

object UnitPattern {
  @scala.inline
  def apply(one: String = null, other: String = null, perUnit: String = null): UnitPattern = {
    val __obj = js.Dynamic.literal()
    if (one != null) __obj.updateDynamic("one")(one)
    if (other != null) __obj.updateDynamic("other")(other)
    if (perUnit != null) __obj.updateDynamic("perUnit")(perUnit)
    __obj.asInstanceOf[UnitPattern]
  }
}

