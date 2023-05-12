package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.GetInternalSlots
import typings.formatjsEcma402Abstract.typesNumberMod.NumberRangeToParts
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFormatFormatNumericRangeToPartsMod {
  
  @JSImport("@formatjs/ecma402-abstract/NumberFormat/FormatNumericRangeToParts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatNumericRangeToParts(numberFormat: NumberFormat, x: Double, y: Double, param3: GetInternalSlots): js.Array[NumberRangeToParts] = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatNumericRangeToParts")(numberFormat.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberRangeToParts]]
}
