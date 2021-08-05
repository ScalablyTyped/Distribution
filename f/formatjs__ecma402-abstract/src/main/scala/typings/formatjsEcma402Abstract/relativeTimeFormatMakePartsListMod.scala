package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimePart
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeUnit
import typings.std.Intl.NumberFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeTimeFormatMakePartsListMod {
  
  @JSImport("@formatjs/ecma402-abstract/RelativeTimeFormat/MakePartsList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MakePartsList(pattern: String, unit: RelativeTimeUnit, parts: js.Array[NumberFormatPart]): js.Array[RelativeTimePart] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakePartsList")(pattern.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[js.Array[RelativeTimePart]]
}
