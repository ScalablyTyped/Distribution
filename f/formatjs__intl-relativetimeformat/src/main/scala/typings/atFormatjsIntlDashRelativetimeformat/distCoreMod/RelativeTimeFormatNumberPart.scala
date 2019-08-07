package typings.atFormatjsIntlDashRelativetimeformat.distCoreMod

import typings.atFormatjsIntlDashRelativetimeformat.distTypesMod.FormattableUnit
import typings.std.IntlNs.NumberFormatPart
import typings.std.IntlNs.NumberFormatPartTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeFormatNumberPart
  extends NumberFormatPart
     with Part {
  var unit: FormattableUnit
}

object RelativeTimeFormatNumberPart {
  @scala.inline
  def apply(`type`: NumberFormatPartTypes, unit: FormattableUnit, value: String): RelativeTimeFormatNumberPart = {
    val __obj = js.Dynamic.literal(unit = unit, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RelativeTimeFormatNumberPart]
  }
}

