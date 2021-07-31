package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.formatDateTimePatternMod.FormatDateTimePatternImplDetails
import typings.formatjsEcma402Abstract.toLocalTimeMod.ToLocalTimeImplDetails
import typings.std.Intl.DateTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDateTimeRangeToPartsMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/FormatDateTimeRangeToParts", JSImport.Namespace)
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
