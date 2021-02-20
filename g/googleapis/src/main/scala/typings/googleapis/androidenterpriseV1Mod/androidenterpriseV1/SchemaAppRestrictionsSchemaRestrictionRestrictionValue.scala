package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A typed value for the restriction.
  */
@js.native
trait SchemaAppRestrictionsSchemaRestrictionRestrictionValue extends StObject {
  
  /**
    * The type of the value being provided.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The boolean value - this will only be present if type is bool.
    */
  var valueBool: js.UndefOr[Boolean] = js.native
  
  /**
    * The integer value - this will only be present if type is integer.
    */
  var valueInteger: js.UndefOr[Double] = js.native
  
  /**
    * The list of string values - this will only be present if type is
    * multiselect.
    */
  var valueMultiselect: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The string value - this will be present for types string, choice and
    * hidden.
    */
  var valueString: js.UndefOr[String] = js.native
}
object SchemaAppRestrictionsSchemaRestrictionRestrictionValue {
  
  @scala.inline
  def apply(): SchemaAppRestrictionsSchemaRestrictionRestrictionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppRestrictionsSchemaRestrictionRestrictionValue]
  }
  
  @scala.inline
  implicit class SchemaAppRestrictionsSchemaRestrictionRestrictionValueMutableBuilder[Self <: SchemaAppRestrictionsSchemaRestrictionRestrictionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValueBool(value: Boolean): Self = StObject.set(x, "valueBool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBoolUndefined: Self = StObject.set(x, "valueBool", js.undefined)
    
    @scala.inline
    def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    @scala.inline
    def setValueMultiselect(value: js.Array[String]): Self = StObject.set(x, "valueMultiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMultiselectUndefined: Self = StObject.set(x, "valueMultiselect", js.undefined)
    
    @scala.inline
    def setValueMultiselectVarargs(value: String*): Self = StObject.set(x, "valueMultiselect", js.Array(value :_*))
    
    @scala.inline
    def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
  }
}
