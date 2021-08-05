package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`0`
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormat
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormattableUnit
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimePart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeTimeFormatFormatRelativeTimeToPartsMod {
  
  @JSImport("@formatjs/ecma402-abstract/RelativeTimeFormat/FormatRelativeTimeToParts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatRelativeTimeToParts(rtf: RelativeTimeFormat, value: Double, unit: RelativeTimeFormattableUnit, implDetails: `0`): js.Array[RelativeTimePart] = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatRelativeTimeToParts")(rtf.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[js.Array[RelativeTimePart]]
}
