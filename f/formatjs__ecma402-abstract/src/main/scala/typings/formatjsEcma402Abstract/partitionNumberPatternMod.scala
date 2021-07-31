package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`1`
import typings.formatjsEcma402Abstract.numberMod.NumberFormatPart
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partitionNumberPatternMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/PartitionNumberPattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def PartitionNumberPattern(numberFormat: NumberFormat, x: Double, hasGetInternalSlots: `1`): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("PartitionNumberPattern")(numberFormat.asInstanceOf[js.Any], x.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
}
