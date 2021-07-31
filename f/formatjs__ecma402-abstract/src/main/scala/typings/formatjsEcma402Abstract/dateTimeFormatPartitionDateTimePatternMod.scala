package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeFormatFormatDateTimePatternMod.FormatDateTimePatternImplDetails
import typings.formatjsEcma402Abstract.dateTimeFormatToLocalTimeMod.ToLocalTimeImplDetails
import typings.formatjsEcma402Abstract.typesDateTimeMod.IntlDateTimeFormatPart
import typings.std.Intl.DateTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeFormatPartitionDateTimePatternMod {
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/PartitionDateTimePattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def PartitionDateTimePattern(
    dtf: DateTimeFormat,
    x: Double,
    implDetails: ToLocalTimeImplDetails & FormatDateTimePatternImplDetails
  ): js.Array[IntlDateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("PartitionDateTimePattern")(dtf.asInstanceOf[js.Any], x.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[js.Array[IntlDateTimeFormatPart]]
}
