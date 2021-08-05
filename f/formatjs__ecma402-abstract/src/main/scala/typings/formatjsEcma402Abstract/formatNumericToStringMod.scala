package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.FormattedString
import typings.formatjsEcma402Abstract.anon.PickNumberFormatDigitInteMaximumFractionDigits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatNumericToStringMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/FormatNumericToString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatNumericToString(intlObject: PickNumberFormatDigitInteMaximumFractionDigits, x: Double): FormattedString = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatNumericToString")(intlObject.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[FormattedString]
}
