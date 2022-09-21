package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1Value extends StObject {
  
  /**
    * Represents a boolean value.
    */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Represents a double value.
    */
  var doubleValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Represents an int64 value.
    */
  var int64Value: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents an 'Any' proto value.
    */
  var protoValue: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Represents a string value.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1Value {
  
  inline def apply(): SchemaGoogleCloudChannelV1Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1Value]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1Value](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueNull: Self = StObject.set(x, "boolValue", null)
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueNull: Self = StObject.set(x, "doubleValue", null)
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    inline def setInt64ValueNull: Self = StObject.set(x, "int64Value", null)
    
    inline def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
    
    inline def setProtoValue(value: StringDictionary[Any]): Self = StObject.set(x, "protoValue", value.asInstanceOf[js.Any])
    
    inline def setProtoValueNull: Self = StObject.set(x, "protoValue", null)
    
    inline def setProtoValueUndefined: Self = StObject.set(x, "protoValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
