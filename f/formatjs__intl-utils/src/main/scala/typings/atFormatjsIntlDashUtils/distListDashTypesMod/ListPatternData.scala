package typings.atFormatjsIntlDashUtils.distListDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPatternData extends js.Object {
  var long: ListPattern
  var narrow: js.UndefOr[ListPattern] = js.undefined
  var short: js.UndefOr[ListPattern] = js.undefined
}

object ListPatternData {
  @scala.inline
  def apply(long: ListPattern, narrow: ListPattern = null, short: ListPattern = null): ListPatternData = {
    val __obj = js.Dynamic.literal(long = long)
    if (narrow != null) __obj.updateDynamic("narrow")(narrow)
    if (short != null) __obj.updateDynamic("short")(short)
    __obj.asInstanceOf[ListPatternData]
  }
}

