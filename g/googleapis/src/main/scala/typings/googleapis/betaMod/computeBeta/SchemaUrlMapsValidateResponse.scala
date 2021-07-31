package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlMapsValidateResponse extends StObject {
  
  var result: js.UndefOr[SchemaUrlMapValidationResult] = js.undefined
}
object SchemaUrlMapsValidateResponse {
  
  @scala.inline
  def apply(): SchemaUrlMapsValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsValidateResponse]
  }
  
  @scala.inline
  implicit class SchemaUrlMapsValidateResponseMutableBuilder[Self <: SchemaUrlMapsValidateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: SchemaUrlMapValidationResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
