package typings.googleapis.anon

import typings.googleapis.computeV1Mod.computeV1.SchemaErrorInfo
import typings.googleapis.computeV1Mod.computeV1.SchemaHelp
import typings.googleapis.computeV1Mod.computeV1.SchemaLocalizedMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedMessage extends StObject {
  
  var errorInfo: js.UndefOr[SchemaErrorInfo] = js.undefined
  
  var help: js.UndefOr[SchemaHelp] = js.undefined
  
  var localizedMessage: js.UndefOr[SchemaLocalizedMessage] = js.undefined
}
object LocalizedMessage {
  
  inline def apply(): LocalizedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedMessage]
  }
  
  extension [Self <: LocalizedMessage](x: Self) {
    
    inline def setErrorInfo(value: SchemaErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    inline def setHelp(value: SchemaHelp): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setLocalizedMessage(value: SchemaLocalizedMessage): Self = StObject.set(x, "localizedMessage", value.asInstanceOf[js.Any])
    
    inline def setLocalizedMessageUndefined: Self = StObject.set(x, "localizedMessage", js.undefined)
  }
}
