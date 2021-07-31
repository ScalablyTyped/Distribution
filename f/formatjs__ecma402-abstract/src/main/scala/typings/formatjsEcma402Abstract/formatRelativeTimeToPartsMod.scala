package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`2`
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormat
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormattableUnit
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimePart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatRelativeTimeToPartsMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/RelativeTimeFormat/FormatRelativeTimeToParts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def FormatRelativeTimeToParts(rtf: RelativeTimeFormat, value: Double, unit: RelativeTimeFormattableUnit, implDetails: `2`): js.Array[RelativeTimePart] = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatRelativeTimeToParts")(rtf.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[js.Array[RelativeTimePart]]
}
