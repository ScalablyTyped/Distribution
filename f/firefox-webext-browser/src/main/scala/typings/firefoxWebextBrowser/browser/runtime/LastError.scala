package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This will be defined during an API method callback if there was an error */
trait LastError extends StObject {
  
  /** Details about the error which occurred. */
  var message: js.UndefOr[String] = js.undefined
}
object LastError {
  
  inline def apply(): LastError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastError]
  }
  
  extension [Self <: LastError](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
