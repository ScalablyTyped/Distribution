package typings.formatjsIntl.typesMod

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<intl-messageformat.intl-messageformat.Formats> */
@js.native
trait CustomFormats extends js.Object {
  
  var date: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.native
  
  var number: js.UndefOr[Record[String, NumberFormatOptions]] = js.native
  
  var relative: js.UndefOr[Record[String, IntlRelativeTimeFormatOptions]] = js.native
  
  var time: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.native
}
object CustomFormats {
  
  @scala.inline
  def apply(): CustomFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFormats]
  }
  
  @scala.inline
  implicit class CustomFormatsOps[Self <: CustomFormats] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Record[String, DateTimeFormatOptions]): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setNumber(value: Record[String, NumberFormatOptions]): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setRelative(value: Record[String, IntlRelativeTimeFormatOptions]): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    
    @scala.inline
    def setTime(value: Record[String, DateTimeFormatOptions]): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
