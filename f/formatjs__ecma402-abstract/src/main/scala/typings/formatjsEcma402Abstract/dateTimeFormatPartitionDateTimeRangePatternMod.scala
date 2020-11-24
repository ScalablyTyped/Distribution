package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeFormatFormatDateTimePatternMod.FormatDateTimePatternImplDetails
import typings.formatjsEcma402Abstract.dateTimeFormatToLocalTimeMod.ToLocalTimeImplDetails
import typings.formatjsEcma402Abstract.typesDateTimeMod.IntlDateTimeFormatPart
import typings.std.Intl.DateTimeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/DateTimeFormat/PartitionDateTimeRangePattern", JSImport.Namespace)
@js.native
object dateTimeFormatPartitionDateTimeRangePatternMod extends js.Object {
  
  def PartitionDateTimeRangePattern(
    dtf: DateTimeFormat,
    x: Double,
    y: Double,
    implDetails: FormatDateTimePatternImplDetails with ToLocalTimeImplDetails
  ): js.Array[IntlDateTimeFormatPart] = js.native
}
