package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait culture extends StObject {
  
  var calendars: js.UndefOr[calendarsSettings] = js.undefined
  
  var englishName: js.UndefOr[String] = js.undefined
  
  var isRTL: Boolean
  
  var language: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namtiveName: js.UndefOr[String] = js.undefined
  
  var numberFormat: js.UndefOr[formatSettings] = js.undefined
}
object culture {
  
  @scala.inline
  def apply(isRTL: Boolean): culture = {
    val __obj = js.Dynamic.literal(isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[culture]
  }
  
  @scala.inline
  implicit class cultureMutableBuilder[Self <: culture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendars(value: calendarsSettings): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    @scala.inline
    def setEnglishName(value: String): Self = StObject.set(x, "englishName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnglishNameUndefined: Self = StObject.set(x, "englishName", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamtiveName(value: String): Self = StObject.set(x, "namtiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamtiveNameUndefined: Self = StObject.set(x, "namtiveName", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: formatSettings): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
  }
}
