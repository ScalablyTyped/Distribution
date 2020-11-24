package typings.formatjsEcma402Abstract.typesRelativeTimeMod

import typings.std.Intl.NumberFormatPart
import typings.std.Intl.NumberFormatPartTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeTimeFormatNumberPart
  extends NumberFormatPart
     with RelativeTimePart {
  
  var unit: RelativeTimeUnit = js.native
}
object RelativeTimeFormatNumberPart {
  
  @scala.inline
  def apply(`type`: NumberFormatPartTypes, unit: RelativeTimeUnit, value: String): RelativeTimeFormatNumberPart = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeFormatNumberPart]
  }
  
  @scala.inline
  implicit class RelativeTimeFormatNumberPartOps[Self <: RelativeTimeFormatNumberPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUnit(value: RelativeTimeUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
}
