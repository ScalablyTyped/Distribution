package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`0`
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormat
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormattableUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeTimeFormatFormatRelativeTimeMod {
  
  @JSImport("@formatjs/ecma402-abstract/RelativeTimeFormat/FormatRelativeTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatRelativeTime(rtf: RelativeTimeFormat, value: Double, unit: RelativeTimeFormattableUnit, implDetails: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatRelativeTime")(rtf.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[String]
}
