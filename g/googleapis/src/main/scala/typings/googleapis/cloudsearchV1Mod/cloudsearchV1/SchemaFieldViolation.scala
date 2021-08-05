package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFieldViolation extends StObject {
  
  /**
    * Description of the error.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Path of field with violation.
    */
  var field: js.UndefOr[String] = js.undefined
}
object SchemaFieldViolation {
  
  inline def apply(): SchemaFieldViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldViolation]
  }
  
  extension [Self <: SchemaFieldViolation](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
