package typings.atFormatjsIntlDashRelativetimeformat.distDashEs6CoreMod

import typings.atFormatjsIntlDashRelativetimeformat.distDashEs6TypesMod.Unit
import typings.std.Intl.NumberFormatPart
import typings.std.Intl.NumberFormatPartTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeFormatNumberPart
  extends NumberFormatPart
     with Part {
  var unit: Unit
}

object RelativeTimeFormatNumberPart {
  @scala.inline
  def apply(`type`: NumberFormatPartTypes, unit: Unit, value: String): RelativeTimeFormatNumberPart = {
    val __obj = js.Dynamic.literal(unit = unit, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RelativeTimeFormatNumberPart]
  }
}

