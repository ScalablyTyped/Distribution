package typings.googleapis.anon

import typings.googleapis.alphaMod.computeAlpha.SchemaErrorInfo
import typings.googleapis.alphaMod.computeAlpha.SchemaHelp
import typings.googleapis.alphaMod.computeAlpha.SchemaLocalizedMessage
import typings.googleapis.alphaMod.computeAlpha.SchemaQuotaExceededInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorInfo extends StObject {
  
  var errorInfo: js.UndefOr[SchemaErrorInfo] = js.undefined
  
  var help: js.UndefOr[SchemaHelp] = js.undefined
  
  var localizedMessage: js.UndefOr[SchemaLocalizedMessage] = js.undefined
  
  var quotaInfo: js.UndefOr[SchemaQuotaExceededInfo] = js.undefined
}
object ErrorInfo {
  
  inline def apply(): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorInfo]
  }
  
  extension [Self <: ErrorInfo](x: Self) {
    
    inline def setErrorInfo(value: SchemaErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    inline def setHelp(value: SchemaHelp): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setLocalizedMessage(value: SchemaLocalizedMessage): Self = StObject.set(x, "localizedMessage", value.asInstanceOf[js.Any])
    
    inline def setLocalizedMessageUndefined: Self = StObject.set(x, "localizedMessage", js.undefined)
    
    inline def setQuotaInfo(value: SchemaQuotaExceededInfo): Self = StObject.set(x, "quotaInfo", value.asInstanceOf[js.Any])
    
    inline def setQuotaInfoUndefined: Self = StObject.set(x, "quotaInfo", js.undefined)
  }
}
