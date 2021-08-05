package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlMapsValidateResponse extends StObject {
  
  var result: js.UndefOr[SchemaUrlMapValidationResult] = js.undefined
}
object SchemaUrlMapsValidateResponse {
  
  inline def apply(): SchemaUrlMapsValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsValidateResponse]
  }
  
  extension [Self <: SchemaUrlMapsValidateResponse](x: Self) {
    
    inline def setResult(value: SchemaUrlMapValidationResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
