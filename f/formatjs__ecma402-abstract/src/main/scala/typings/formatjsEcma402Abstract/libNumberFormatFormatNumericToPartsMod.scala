package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`0`
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatPart
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberFormatFormatNumericToPartsMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/FormatNumericToParts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatNumericToParts(nf: NumberFormat, x: Double, implDetails: `0`): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatNumericToParts")(nf.asInstanceOf[js.Any], x.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
}
