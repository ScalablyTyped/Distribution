package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeFormatFormatDateTimePatternMod.FormatDateTimePatternImplDetails
import typings.formatjsEcma402Abstract.dateTimeFormatToLocalTimeMod.ToLocalTimeImplDetails
import typings.formatjsEcma402Abstract.typesDateTimeMod.IntlDateTimeFormatPart
import typings.std.Intl.DateTimeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/DateTimeFormat/PartitionDateTimePattern", JSImport.Namespace)
@js.native
object dateTimeFormatPartitionDateTimePatternMod extends js.Object {
  
  def PartitionDateTimePattern(
    dtf: DateTimeFormat,
    x: Double,
    implDetails: ToLocalTimeImplDetails with FormatDateTimePatternImplDetails
  ): js.Array[IntlDateTimeFormatPart] = js.native
}
