package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.`type`.ILatLng
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.ITimestamp
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.NullValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Value. */
trait IValue extends StObject {
  
  /** Value arrayValue */
  var arrayValue: js.UndefOr[IArrayValue | Null] = js.undefined
  
  /** Value booleanValue */
  var booleanValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Value bytesValue */
  var bytesValue: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** Value doubleValue */
  var doubleValue: js.UndefOr[Double | Null] = js.undefined
  
  /** Value geoPointValue */
  var geoPointValue: js.UndefOr[ILatLng | Null] = js.undefined
  
  /** Value integerValue */
  var integerValue: js.UndefOr[Double | String | Null] = js.undefined
  
  /** Value mapValue */
  var mapValue: js.UndefOr[IMapValue | Null] = js.undefined
  
  /** Value nullValue */
  var nullValue: js.UndefOr[NullValue | Null] = js.undefined
  
  /** Value referenceValue */
  var referenceValue: js.UndefOr[String | Null] = js.undefined
  
  /** Value stringValue */
  var stringValue: js.UndefOr[String | Null] = js.undefined
  
  /** Value timestampValue */
  var timestampValue: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IValue {
  
  inline def apply(): IValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValue]
  }
  
  extension [Self <: IValue](x: Self) {
    
    inline def setArrayValue(value: IArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
    
    inline def setArrayValueNull: Self = StObject.set(x, "arrayValue", null)
    
    inline def setArrayValueUndefined: Self = StObject.set(x, "arrayValue", js.undefined)
    
    inline def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueNull: Self = StObject.set(x, "booleanValue", null)
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setBytesValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytesValue", value.asInstanceOf[js.Any])
    
    inline def setBytesValueNull: Self = StObject.set(x, "bytesValue", null)
    
    inline def setBytesValueUndefined: Self = StObject.set(x, "bytesValue", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueNull: Self = StObject.set(x, "doubleValue", null)
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setGeoPointValue(value: ILatLng): Self = StObject.set(x, "geoPointValue", value.asInstanceOf[js.Any])
    
    inline def setGeoPointValueNull: Self = StObject.set(x, "geoPointValue", null)
    
    inline def setGeoPointValueUndefined: Self = StObject.set(x, "geoPointValue", js.undefined)
    
    inline def setIntegerValue(value: Double | String): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueNull: Self = StObject.set(x, "integerValue", null)
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setMapValue(value: IMapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
    
    inline def setMapValueNull: Self = StObject.set(x, "mapValue", null)
    
    inline def setMapValueUndefined: Self = StObject.set(x, "mapValue", js.undefined)
    
    inline def setNullValue(value: NullValue): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueNull: Self = StObject.set(x, "nullValue", null)
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setReferenceValue(value: String): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
    
    inline def setReferenceValueNull: Self = StObject.set(x, "referenceValue", null)
    
    inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setTimestampValue(value: ITimestamp): Self = StObject.set(x, "timestampValue", value.asInstanceOf[js.Any])
    
    inline def setTimestampValueNull: Self = StObject.set(x, "timestampValue", null)
    
    inline def setTimestampValueUndefined: Self = StObject.set(x, "timestampValue", js.undefined)
  }
}
