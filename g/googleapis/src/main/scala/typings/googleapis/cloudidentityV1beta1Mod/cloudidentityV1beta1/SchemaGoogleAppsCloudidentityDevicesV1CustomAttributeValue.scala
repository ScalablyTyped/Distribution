package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCloudidentityDevicesV1CustomAttributeValue extends StObject {
  
  /**
    * Represents a boolean value.
    */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Represents a double value.
    */
  var numberValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Represents a string value.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCloudidentityDevicesV1CustomAttributeValue {
  
  inline def apply(): SchemaGoogleAppsCloudidentityDevicesV1CustomAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCloudidentityDevicesV1CustomAttributeValue]
  }
  
  extension [Self <: SchemaGoogleAppsCloudidentityDevicesV1CustomAttributeValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueNull: Self = StObject.set(x, "boolValue", null)
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueNull: Self = StObject.set(x, "numberValue", null)
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
