package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterName extends StObject {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  
  var parameterName: js.UndefOr[String] = js.undefined
}
object ParameterName {
  
  inline def apply(): ParameterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterName]
  }
  
  extension [Self <: ParameterName](x: Self) {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
  }
}
