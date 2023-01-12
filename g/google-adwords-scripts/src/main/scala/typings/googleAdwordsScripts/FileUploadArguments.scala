package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUploadArguments extends StObject {
  
  var fileLocale: js.UndefOr[String] = js.undefined
  
  var moneyInMicros: js.UndefOr[Boolean] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object FileUploadArguments {
  
  inline def apply(): FileUploadArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileUploadArguments] (val x: Self) extends AnyVal {
    
    inline def setFileLocale(value: String): Self = StObject.set(x, "fileLocale", value.asInstanceOf[js.Any])
    
    inline def setFileLocaleUndefined: Self = StObject.set(x, "fileLocale", js.undefined)
    
    inline def setMoneyInMicros(value: Boolean): Self = StObject.set(x, "moneyInMicros", value.asInstanceOf[js.Any])
    
    inline def setMoneyInMicrosUndefined: Self = StObject.set(x, "moneyInMicros", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
