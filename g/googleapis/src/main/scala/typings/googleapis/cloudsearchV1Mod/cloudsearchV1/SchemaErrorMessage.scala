package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error message per source response.
  */
trait SchemaErrorMessage extends StObject {
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaErrorMessage {
  
  inline def apply(): SchemaErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorMessage]
  }
  
  extension [Self <: SchemaErrorMessage](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
