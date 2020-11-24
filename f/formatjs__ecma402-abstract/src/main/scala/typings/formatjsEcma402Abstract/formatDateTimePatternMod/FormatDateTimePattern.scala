package typings.formatjsEcma402Abstract.formatDateTimePatternMod

import typings.formatjsEcma402Abstract.dateTimeMod.IntlDateTimeFormatPart
import typings.formatjsEcma402Abstract.toLocalTimeMod.ToLocalTimeImplDetails
import typings.std.Intl.DateTimeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/FormatDateTimePattern", "FormatDateTimePattern")
@js.native
object FormatDateTimePattern extends js.Object {
  
  def apply(
    dtf: DateTimeFormat,
    patternParts: js.Array[IntlDateTimeFormatPart],
    x: Double,
    hasGetInternalSlotsLocaleDataGetDefaultTimeZoneTzData: FormatDateTimePatternImplDetails with ToLocalTimeImplDetails
  ): js.Array[IntlDateTimeFormatPart] = js.native
}
