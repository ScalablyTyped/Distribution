package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.GetInternalSlots
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatPart
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFormatFormatApproximatelyMod {
  
  @JSImport("@formatjs/ecma402-abstract/NumberFormat/FormatApproximately", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatApproximately(
    numberFormat: NumberFormat,
    result: js.Array[NumberFormatPart],
    hasGetInternalSlots: GetInternalSlots
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatApproximately")(numberFormat.asInstanceOf[js.Any], result.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
}
