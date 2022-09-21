package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppRestrictionsSchemaRestrictionRestrictionValue extends StObject {
  
  /**
    * The type of the value being provided.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The boolean value - this will only be present if type is bool.
    */
  var valueBool: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The integer value - this will only be present if type is integer.
    */
  var valueInteger: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The list of string values - this will only be present if type is multiselect.
    */
  var valueMultiselect: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The string value - this will be present for types string, choice and hidden.
    */
  var valueString: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppRestrictionsSchemaRestrictionRestrictionValue {
  
  inline def apply(): SchemaAppRestrictionsSchemaRestrictionRestrictionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppRestrictionsSchemaRestrictionRestrictionValue]
  }
  
  extension [Self <: SchemaAppRestrictionsSchemaRestrictionRestrictionValue](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueBool(value: Boolean): Self = StObject.set(x, "valueBool", value.asInstanceOf[js.Any])
    
    inline def setValueBoolNull: Self = StObject.set(x, "valueBool", null)
    
    inline def setValueBoolUndefined: Self = StObject.set(x, "valueBool", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerNull: Self = StObject.set(x, "valueInteger", null)
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueMultiselect(value: js.Array[String]): Self = StObject.set(x, "valueMultiselect", value.asInstanceOf[js.Any])
    
    inline def setValueMultiselectNull: Self = StObject.set(x, "valueMultiselect", null)
    
    inline def setValueMultiselectUndefined: Self = StObject.set(x, "valueMultiselect", js.undefined)
    
    inline def setValueMultiselectVarargs(value: String*): Self = StObject.set(x, "valueMultiselect", js.Array(value*))
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringNull: Self = StObject.set(x, "valueString", null)
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
  }
}
