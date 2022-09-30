package typings.googleCloudSpanner.protosMod.google.rpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a LocalizedMessage. */
trait ILocalizedMessage extends StObject {
  
  /** LocalizedMessage locale */
  var locale: js.UndefOr[String | Null] = js.undefined
  
  /** LocalizedMessage message */
  var message: js.UndefOr[String | Null] = js.undefined
}
object ILocalizedMessage {
  
  inline def apply(): ILocalizedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILocalizedMessage]
  }
  
  extension [Self <: ILocalizedMessage](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
