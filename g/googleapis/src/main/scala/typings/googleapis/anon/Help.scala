package typings.googleapis.anon

import typings.googleapis.betaMod.computeBeta.SchemaErrorInfo
import typings.googleapis.betaMod.computeBeta.SchemaHelp
import typings.googleapis.betaMod.computeBeta.SchemaLocalizedMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Help extends StObject {
  
  var errorInfo: js.UndefOr[SchemaErrorInfo] = js.undefined
  
  var help: js.UndefOr[SchemaHelp] = js.undefined
  
  var localizedMessage: js.UndefOr[SchemaLocalizedMessage] = js.undefined
}
object Help {
  
  inline def apply(): Help = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Help]
  }
  
  extension [Self <: Help](x: Self) {
    
    inline def setErrorInfo(value: SchemaErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    inline def setHelp(value: SchemaHelp): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setLocalizedMessage(value: SchemaLocalizedMessage): Self = StObject.set(x, "localizedMessage", value.asInstanceOf[js.Any])
    
    inline def setLocalizedMessageUndefined: Self = StObject.set(x, "localizedMessage", js.undefined)
  }
}
