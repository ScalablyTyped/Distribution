package typings.atFormatjsIntlDashUtils.libUnifiedDashNumberformatDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitPattern extends js.Object {
  var one: js.UndefOr[String] = js.undefined
  var other: js.UndefOr[String] = js.undefined
}

object UnitPattern {
  @scala.inline
  def apply(one: String = null, other: String = null): UnitPattern = {
    val __obj = js.Dynamic.literal()
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitPattern]
  }
}

