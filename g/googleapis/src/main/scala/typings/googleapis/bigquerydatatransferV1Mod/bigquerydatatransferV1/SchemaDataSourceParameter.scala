package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceParameter extends StObject {
  
  /**
    * All possible values for the parameter.
    */
  var allowedValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If true, it should not be used in new transfers, and it should not be visible to users.
    */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Parameter description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parameter display name in the user interface.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. This field has no effect.
    */
  var fields: js.UndefOr[js.Array[SchemaDataSourceParameter]] = js.undefined
  
  /**
    * Cannot be changed after initial creation.
    */
  var immutable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * For integer and double values specifies maxminum allowed value.
    */
  var maxValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * For integer and double values specifies minimum allowed value.
    */
  var minValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Parameter identifier.
    */
  var paramId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. This field has no effect.
    */
  var recurse: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Deprecated. This field has no effect.
    */
  var repeated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Is parameter required.
    */
  var required: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Parameter type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the requirements for this field, in case the user input does not fulfill the regex pattern or min/max values.
    */
  var validationDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL to a help document to further explain the naming requirements.
    */
  var validationHelpUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Regular expression which can be used for parameter validation.
    */
  var validationRegex: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataSourceParameter {
  
  inline def apply(): SchemaDataSourceParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceParameter]
  }
  
  extension [Self <: SchemaDataSourceParameter](x: Self) {
    
    inline def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesNull: Self = StObject.set(x, "allowedValues", null)
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFields(value: js.Array[SchemaDataSourceParameter]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaDataSourceParameter*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setImmutableNull: Self = StObject.set(x, "immutable", null)
    
    inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueNull: Self = StObject.set(x, "maxValue", null)
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueNull: Self = StObject.set(x, "minValue", null)
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setParamId(value: String): Self = StObject.set(x, "paramId", value.asInstanceOf[js.Any])
    
    inline def setParamIdNull: Self = StObject.set(x, "paramId", null)
    
    inline def setParamIdUndefined: Self = StObject.set(x, "paramId", js.undefined)
    
    inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
    
    inline def setRecurseNull: Self = StObject.set(x, "recurse", null)
    
    inline def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    
    inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
    
    inline def setRepeatedNull: Self = StObject.set(x, "repeated", null)
    
    inline def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidationDescription(value: String): Self = StObject.set(x, "validationDescription", value.asInstanceOf[js.Any])
    
    inline def setValidationDescriptionNull: Self = StObject.set(x, "validationDescription", null)
    
    inline def setValidationDescriptionUndefined: Self = StObject.set(x, "validationDescription", js.undefined)
    
    inline def setValidationHelpUrl(value: String): Self = StObject.set(x, "validationHelpUrl", value.asInstanceOf[js.Any])
    
    inline def setValidationHelpUrlNull: Self = StObject.set(x, "validationHelpUrl", null)
    
    inline def setValidationHelpUrlUndefined: Self = StObject.set(x, "validationHelpUrl", js.undefined)
    
    inline def setValidationRegex(value: String): Self = StObject.set(x, "validationRegex", value.asInstanceOf[js.Any])
    
    inline def setValidationRegexNull: Self = StObject.set(x, "validationRegex", null)
    
    inline def setValidationRegexUndefined: Self = StObject.set(x, "validationRegex", js.undefined)
  }
}
