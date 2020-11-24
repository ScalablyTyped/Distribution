package typings.formatjsEcma402Abstract.relativeTimeMod

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.literal
import typings.std.Intl.NumberFormatPartTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.formatjsEcma402Abstract.utilsMod.LiteralPart
  - typings.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormatNumberPart
*/
trait RelativeTimePart extends js.Object
object RelativeTimePart {
  
  @scala.inline
  def LiteralPart(`type`: literal, value: String): RelativeTimePart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimePart]
  }
  
  @scala.inline
  def RelativeTimeFormatNumberPart(`type`: NumberFormatPartTypes, unit: RelativeTimeUnit, value: String): RelativeTimePart = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimePart]
  }
}
