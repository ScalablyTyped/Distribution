package typings.easydate.mod

import typings.easydate.easydateStrings.local
import typings.easydate.easydateStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateConfig extends js.Object {
  
  var adjust: js.UndefOr[Boolean] = js.native
  
  var setDate: js.UndefOr[String] = js.native
  
  var timeZone: js.UndefOr[utc | local] = js.native
}
object DateConfig {
  
  @scala.inline
  def apply(): DateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateConfig]
  }
  
  @scala.inline
  implicit class DateConfigOps[Self <: DateConfig] (val x: Self) extends AnyVal {
    
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
    def setAdjust(value: Boolean): Self = this.set("adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjust: Self = this.set("adjust", js.undefined)
    
    @scala.inline
    def setSetDate(value: String): Self = this.set("setDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDate: Self = this.set("setDate", js.undefined)
    
    @scala.inline
    def setTimeZone(value: utc | local): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
