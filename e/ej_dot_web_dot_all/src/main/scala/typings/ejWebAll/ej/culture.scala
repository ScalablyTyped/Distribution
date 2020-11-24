package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait culture extends js.Object {
  
  var calendars: js.UndefOr[calendarsSettings] = js.native
  
  var englishName: js.UndefOr[String] = js.native
  
  var isRTL: Boolean = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namtiveName: js.UndefOr[String] = js.native
  
  var numberFormat: js.UndefOr[formatSettings] = js.native
}
object culture {
  
  @scala.inline
  def apply(isRTL: Boolean): culture = {
    val __obj = js.Dynamic.literal(isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[culture]
  }
  
  @scala.inline
  implicit class cultureOps[Self <: culture] (val x: Self) extends AnyVal {
    
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
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendars(value: calendarsSettings): Self = this.set("calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    
    @scala.inline
    def setEnglishName(value: String): Self = this.set("englishName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnglishName: Self = this.set("englishName", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamtiveName(value: String): Self = this.set("namtiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamtiveName: Self = this.set("namtiveName", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: formatSettings): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
  }
}
