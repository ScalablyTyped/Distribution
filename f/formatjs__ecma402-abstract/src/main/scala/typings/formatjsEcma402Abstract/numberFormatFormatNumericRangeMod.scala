package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.GetInternalSlots
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFormatFormatNumericRangeMod {
  
  @JSImport("@formatjs/ecma402-abstract/NumberFormat/FormatNumericRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatNumericRange(numberFormat: NumberFormat, x: Double, y: Double, param3: GetInternalSlots): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatNumericRange")(numberFormat.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[String]
}
