package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1PolicySchemaRequiredItems extends StObject {
  
  /**
    * The value(s) of the field that provoke required field enforcement. An empty field_conditions implies that any value assigned to this field will provoke required field enforcement.
    */
  var fieldConditions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The fields that are required as a consequence of the field conditions.
    */
  var requiredFields: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1PolicySchemaRequiredItems {
  
  inline def apply(): SchemaGoogleChromePolicyV1PolicySchemaRequiredItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1PolicySchemaRequiredItems]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1PolicySchemaRequiredItems](x: Self) {
    
    inline def setFieldConditions(value: js.Array[String]): Self = StObject.set(x, "fieldConditions", value.asInstanceOf[js.Any])
    
    inline def setFieldConditionsNull: Self = StObject.set(x, "fieldConditions", null)
    
    inline def setFieldConditionsUndefined: Self = StObject.set(x, "fieldConditions", js.undefined)
    
    inline def setFieldConditionsVarargs(value: String*): Self = StObject.set(x, "fieldConditions", js.Array(value*))
    
    inline def setRequiredFields(value: js.Array[String]): Self = StObject.set(x, "requiredFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredFieldsNull: Self = StObject.set(x, "requiredFields", null)
    
    inline def setRequiredFieldsUndefined: Self = StObject.set(x, "requiredFields", js.undefined)
    
    inline def setRequiredFieldsVarargs(value: String*): Self = StObject.set(x, "requiredFields", js.Array(value*))
  }
}
