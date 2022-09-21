package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaErrorInfo extends StObject {
  
  var errorMessages: js.UndefOr[js.Array[SchemaErrorMessage]] = js.undefined
}
object SchemaErrorInfo {
  
  inline def apply(): SchemaErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorInfo]
  }
  
  extension [Self <: SchemaErrorInfo](x: Self) {
    
    inline def setErrorMessages(value: js.Array[SchemaErrorMessage]): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
    
    inline def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
    
    inline def setErrorMessagesVarargs(value: SchemaErrorMessage*): Self = StObject.set(x, "errorMessages", js.Array(value*))
  }
}
