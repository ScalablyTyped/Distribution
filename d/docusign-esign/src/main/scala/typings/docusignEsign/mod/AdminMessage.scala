package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminMessage extends StObject {
  
  var baseMessage: js.UndefOr[String] = js.undefined
  
  var moreInformation: js.UndefOr[String] = js.undefined
}
object AdminMessage {
  
  inline def apply(): AdminMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminMessage]
  }
  
  extension [Self <: AdminMessage](x: Self) {
    
    inline def setBaseMessage(value: String): Self = StObject.set(x, "baseMessage", value.asInstanceOf[js.Any])
    
    inline def setBaseMessageUndefined: Self = StObject.set(x, "baseMessage", js.undefined)
    
    inline def setMoreInformation(value: String): Self = StObject.set(x, "moreInformation", value.asInstanceOf[js.Any])
    
    inline def setMoreInformationUndefined: Self = StObject.set(x, "moreInformation", js.undefined)
  }
}
