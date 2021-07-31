package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.numberMod.RawNumberFormatResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toRawPrecisionMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/ToRawPrecision", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ToRawPrecision(x: Double, minPrecision: Double, maxPrecision: Double): RawNumberFormatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("ToRawPrecision")(x.asInstanceOf[js.Any], minPrecision.asInstanceOf[js.Any], maxPrecision.asInstanceOf[js.Any])).asInstanceOf[RawNumberFormatResult]
}
