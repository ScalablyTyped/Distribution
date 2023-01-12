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
  
  inline def apply(isRTL: Boolean): culture = {
    val __obj = js.Dynamic.literal(isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[culture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: culture] (val x: Self) extends AnyVal {
    
    inline def setCalendars(value: calendarsSettings): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    inline def setEnglishName(value: String): Self = StObject.set(x, "englishName", value.asInstanceOf[js.Any])
    
    inline def setEnglishNameUndefined: Self = StObject.set(x, "englishName", js.undefined)
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamtiveName(value: String): Self = StObject.set(x, "namtiveName", value.asInstanceOf[js.Any])
    
    inline def setNamtiveNameUndefined: Self = StObject.set(x, "namtiveName", js.undefined)
    
    inline def setNumberFormat(value: formatSettings): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
  }
}
