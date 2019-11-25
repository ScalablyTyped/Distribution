package typings.atFormatjsIntlDashUtils.libUnifiedDashNumberformatDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitData extends js.Object {
  var displayName: String
  var long: UnitPattern
  var narrow: js.UndefOr[UnitPattern] = js.undefined
  var short: js.UndefOr[UnitPattern] = js.undefined
}

object UnitData {
  @scala.inline
  def apply(displayName: String, long: UnitPattern, narrow: UnitPattern = null, short: UnitPattern = null): UnitData = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any])
    if (narrow != null) __obj.updateDynamic("narrow")(narrow.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitData]
  }
}

