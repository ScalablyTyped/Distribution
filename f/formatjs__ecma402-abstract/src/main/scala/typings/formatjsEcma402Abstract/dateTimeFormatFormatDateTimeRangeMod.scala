package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeFormatFormatDateTimePatternMod.FormatDateTimePatternImplDetails
import typings.formatjsEcma402Abstract.dateTimeFormatToLocalTimeMod.ToLocalTimeImplDetails
import typings.std.Intl.DateTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeFormatFormatDateTimeRangeMod {
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/FormatDateTimeRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def FormatDateTimeRange(
    dtf: DateTimeFormat,
    x: Double,
    y: Double,
    implDetails: FormatDateTimePatternImplDetails & ToLocalTimeImplDetails
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatDateTimeRange")(dtf.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[String]
}
