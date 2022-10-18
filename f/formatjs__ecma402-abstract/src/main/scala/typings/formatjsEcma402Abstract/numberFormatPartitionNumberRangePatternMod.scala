package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.GetInternalSlots
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatPart
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFormatPartitionNumberRangePatternMod {
  
  @JSImport("@formatjs/ecma402-abstract/NumberFormat/PartitionNumberRangePattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PartitionNumberRangePattern(numberFormat: NumberFormat, x: Double, y: Double, hasGetInternalSlots: GetInternalSlots): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("PartitionNumberRangePattern")(numberFormat.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
}
