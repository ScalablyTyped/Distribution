package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`1`
import typings.formatjsEcma402Abstract.numberMod.NumberFormatPart
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatNumericToPartsMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/FormatNumericToParts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatNumericToParts(nf: NumberFormat, x: Double, implDetails: `1`): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatNumericToParts")(nf.asInstanceOf[js.Any], x.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
}
