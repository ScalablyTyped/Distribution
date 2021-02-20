package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileUploadArguments extends StObject {
  
  var fileLocale: js.UndefOr[String] = js.native
  
  var moneyInMicros: js.UndefOr[Boolean] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
}
object FileUploadArguments {
  
  @scala.inline
  def apply(): FileUploadArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadArguments]
  }
  
  @scala.inline
  implicit class FileUploadArgumentsMutableBuilder[Self <: FileUploadArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileLocale(value: String): Self = StObject.set(x, "fileLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileLocaleUndefined: Self = StObject.set(x, "fileLocale", js.undefined)
    
    @scala.inline
    def setMoneyInMicros(value: Boolean): Self = StObject.set(x, "moneyInMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoneyInMicrosUndefined: Self = StObject.set(x, "moneyInMicros", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
