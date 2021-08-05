package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  
  var type_value: js.UndefOr[String] = js.undefined
}
object Ref {
  
  inline def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  
  extension [Self <: Ref](x: Self) {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    inline def setType_value(value: String): Self = StObject.set(x, "type_value", value.asInstanceOf[js.Any])
    
    inline def setType_valueUndefined: Self = StObject.set(x, "type_value", js.undefined)
  }
}
