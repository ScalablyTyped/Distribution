package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorInfo extends StObject {
  
  var errorInfo: String
}
object ErrorInfo {
  
  inline def apply(errorInfo: String): ErrorInfo = {
    val __obj = js.Dynamic.literal(errorInfo = errorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
  
  extension [Self <: ErrorInfo](x: Self) {
    
    inline def setErrorInfo(value: String): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
  }
}
