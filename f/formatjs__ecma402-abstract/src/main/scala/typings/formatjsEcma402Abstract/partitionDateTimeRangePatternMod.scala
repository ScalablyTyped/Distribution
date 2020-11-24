package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeMod.IntlDateTimeFormatPart
import typings.formatjsEcma402Abstract.formatDateTimePatternMod.FormatDateTimePatternImplDetails
import typings.formatjsEcma402Abstract.toLocalTimeMod.ToLocalTimeImplDetails
import typings.std.Intl.DateTimeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/PartitionDateTimeRangePattern", JSImport.Namespace)
@js.native
object partitionDateTimeRangePatternMod extends js.Object {
  
  def PartitionDateTimeRangePattern(
    dtf: DateTimeFormat,
    x: Double,
    y: Double,
    implDetails: FormatDateTimePatternImplDetails with ToLocalTimeImplDetails
  ): js.Array[IntlDateTimeFormatPart] = js.native
}
