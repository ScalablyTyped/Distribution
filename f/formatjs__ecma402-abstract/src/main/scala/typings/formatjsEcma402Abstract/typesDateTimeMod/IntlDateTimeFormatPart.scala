package typings.formatjsEcma402Abstract.typesDateTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlDateTimeFormatPart extends js.Object {
  
  var source: js.UndefOr[RangePatternType] = js.native
  
  var `type`: IntlDateTimeFormatPartType = js.native
  
  var value: js.UndefOr[String] = js.native
}
object IntlDateTimeFormatPart {
  
  @scala.inline
  def apply(`type`: IntlDateTimeFormatPartType): IntlDateTimeFormatPart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlDateTimeFormatPart]
  }
  
  @scala.inline
  implicit class IntlDateTimeFormatPartOps[Self <: IntlDateTimeFormatPart] (val x: Self) extends AnyVal {
    
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
    def setType(value: IntlDateTimeFormatPartType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: RangePatternType): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
