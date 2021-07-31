package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.GetInternalSlots
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatPart
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFormatPartitionNumberPatternMod {
  
  @JSImport("@formatjs/ecma402-abstract/NumberFormat/PartitionNumberPattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def PartitionNumberPattern(numberFormat: NumberFormat, x: Double, hasGetInternalSlots: GetInternalSlots): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("PartitionNumberPattern")(numberFormat.asInstanceOf[js.Any], x.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
}
