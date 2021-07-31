package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeMod.IntlDateTimeFormatPart
import typings.formatjsEcma402Abstract.formatDateTimePatternMod.FormatDateTimePatternImplDetails
import typings.formatjsEcma402Abstract.toLocalTimeMod.ToLocalTimeImplDetails
import typings.std.Intl.DateTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partitionDateTimePatternMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/PartitionDateTimePattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def PartitionDateTimePattern(
    dtf: DateTimeFormat,
    x: Double,
    implDetails: ToLocalTimeImplDetails & FormatDateTimePatternImplDetails
  ): js.Array[IntlDateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("PartitionDateTimePattern")(dtf.asInstanceOf[js.Any], x.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[js.Array[IntlDateTimeFormatPart]]
}
