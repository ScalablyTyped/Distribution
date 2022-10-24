package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`0`
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatPart
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberFormatPartitionNumberRangePatternMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/PartitionNumberRangePattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PartitionNumberRangePattern(numberFormat: NumberFormat, x: Double, y: Double, param3: `0`): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("PartitionNumberRangePattern")(numberFormat.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
}
