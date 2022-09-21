package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ParameterDefinition extends StObject {
  
  /**
    * If not empty, parameter values must be drawn from this list. For example, [us-west1, us-west2, ...] Applicable to STRING parameter type.
    */
  var allowedValues: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1Value]] = js.undefined
  
  /**
    * Maximum value of the parameter, if applicable. Inclusive. For example, maximum seats when purchasing Google Workspace Business Standard. Applicable to INT64 and DOUBLE parameter types.
    */
  var maxValue: js.UndefOr[SchemaGoogleCloudChannelV1Value] = js.undefined
  
  /**
    * Minimal value of the parameter, if applicable. Inclusive. For example, minimal commitment when purchasing Anthos is 0.01. Applicable to INT64 and DOUBLE parameter types.
    */
  var minValue: js.UndefOr[SchemaGoogleCloudChannelV1Value] = js.undefined
  
  /**
    * Name of the parameter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set to true, parameter is optional to purchase this Offer.
    */
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Data type of the parameter. Minimal value, Maximum value and allowed values will use specified data type here.
    */
  var parameterType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ParameterDefinition {
  
  inline def apply(): SchemaGoogleCloudChannelV1ParameterDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ParameterDefinition]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ParameterDefinition](x: Self) {
    
    inline def setAllowedValues(value: js.Array[SchemaGoogleCloudChannelV1Value]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: SchemaGoogleCloudChannelV1Value*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setMaxValue(value: SchemaGoogleCloudChannelV1Value): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: SchemaGoogleCloudChannelV1Value): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setParameterType(value: String): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
    
    inline def setParameterTypeNull: Self = StObject.set(x, "parameterType", null)
    
    inline def setParameterTypeUndefined: Self = StObject.set(x, "parameterType", js.undefined)
  }
}
