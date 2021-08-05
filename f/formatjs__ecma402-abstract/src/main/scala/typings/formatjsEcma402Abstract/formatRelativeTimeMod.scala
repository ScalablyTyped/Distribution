package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`2`
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormat
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormattableUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatRelativeTimeMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/RelativeTimeFormat/FormatRelativeTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatRelativeTime(rtf: RelativeTimeFormat, value: Double, unit: RelativeTimeFormattableUnit, implDetails: `2`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatRelativeTime")(rtf.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[String]
}
