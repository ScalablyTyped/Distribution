package typings.firebaseFirestore.distInternalMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distInternalMod.Timestamp2
import typings.firebaseFirestore.distInternalMod.ValueNullValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var arrayValue: js.UndefOr[ArrayValue] = js.undefined
  
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  
  var bytesValue: js.UndefOr[String | js.typedarray.Uint8Array] = js.undefined
  
  var doubleValue: js.UndefOr[String | Double] = js.undefined
  
  var geoPointValue: js.UndefOr[LatLng] = js.undefined
  
  var integerValue: js.UndefOr[String | Double] = js.undefined
  
  var mapValue: js.UndefOr[MapValue] = js.undefined
  
  var nullValue: js.UndefOr[ValueNullValue] = js.undefined
  
  var referenceValue: js.UndefOr[String] = js.undefined
  
  var stringValue: js.UndefOr[String] = js.undefined
  
  var timestampValue: js.UndefOr[Timestamp2] = js.undefined
}
object Value {
  
  inline def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setArrayValue(value: ArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
    
    inline def setArrayValueUndefined: Self = StObject.set(x, "arrayValue", js.undefined)
    
    inline def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setBytesValue(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "bytesValue", value.asInstanceOf[js.Any])
    
    inline def setBytesValueUndefined: Self = StObject.set(x, "bytesValue", js.undefined)
    
    inline def setDoubleValue(value: String | Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setGeoPointValue(value: LatLng): Self = StObject.set(x, "geoPointValue", value.asInstanceOf[js.Any])
    
    inline def setGeoPointValueUndefined: Self = StObject.set(x, "geoPointValue", js.undefined)
    
    inline def setIntegerValue(value: String | Double): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setMapValue(value: MapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
    
    inline def setMapValueUndefined: Self = StObject.set(x, "mapValue", js.undefined)
    
    inline def setNullValue(value: ValueNullValue): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setReferenceValue(value: String): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
    
    inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setTimestampValue(value: Timestamp2): Self = StObject.set(x, "timestampValue", value.asInstanceOf[js.Any])
    
    inline def setTimestampValueUndefined: Self = StObject.set(x, "timestampValue", js.undefined)
  }
}
