package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.formatDateTimePatternMod.FormatDateTimePatternImplDetails
import typings.formatjsEcma402Abstract.toLocalTimeMod.ToLocalTimeImplDetails
import typings.std.Intl.DateTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDateTimeRangeMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/FormatDateTimeRange", "FormatDateTimeRange")
  @js.native
  def FormatDateTimeRange(
    dtf: DateTimeFormat,
    x: Double,
    y: Double,
    implDetails: FormatDateTimePatternImplDetails with ToLocalTimeImplDetails
  ): String = js.native
}
