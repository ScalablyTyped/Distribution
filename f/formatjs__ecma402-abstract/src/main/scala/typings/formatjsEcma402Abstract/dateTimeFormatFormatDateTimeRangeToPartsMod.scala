package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeFormatFormatDateTimePatternMod.FormatDateTimePatternImplDetails
import typings.formatjsEcma402Abstract.dateTimeFormatToLocalTimeMod.ToLocalTimeImplDetails
import typings.std.Intl.DateTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeFormatFormatDateTimeRangeToPartsMod {
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/FormatDateTimeRangeToParts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def FormatDateTimeRangeToParts(
    dtf: DateTimeFormat,
    x: Double,
    y: Double,
    implDetails: FormatDateTimePatternImplDetails & ToLocalTimeImplDetails
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatDateTimeRangeToParts")(dtf.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
}
