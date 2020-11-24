package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.`2`
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormat
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormattableUnit
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimePart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/RelativeTimeFormat/PartitionRelativeTimePattern", JSImport.Namespace)
@js.native
object partitionRelativeTimePatternMod extends js.Object {
  
  def PartitionRelativeTimePattern(
    rtf: RelativeTimeFormat,
    value: Double,
    unit: RelativeTimeFormattableUnit,
    hasGetInternalSlots: `2`
  ): js.Array[RelativeTimePart] = js.native
}
