package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimePart
import typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeUnit
import typings.std.Intl.NumberFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/RelativeTimeFormat/MakePartsList", JSImport.Namespace)
@js.native
object makePartsListMod extends js.Object {
  
  def MakePartsList(pattern: String, unit: RelativeTimeUnit, parts: js.Array[NumberFormatPart]): js.Array[RelativeTimePart] = js.native
}
