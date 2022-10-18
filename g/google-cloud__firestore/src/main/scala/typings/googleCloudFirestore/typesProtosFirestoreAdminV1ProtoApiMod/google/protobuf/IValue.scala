package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Value. */
trait IValue extends StObject {
  
  /** Value boolValue */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Value listValue */
  var listValue: js.UndefOr[IListValue | Null] = js.undefined
  
  /** Value nullValue */
  var nullValue: js.UndefOr[NullValue | Null] = js.undefined
  
  /** Value numberValue */
  var numberValue: js.UndefOr[Double | Null] = js.undefined
  
  /** Value stringValue */
  var stringValue: js.UndefOr[String | Null] = js.undefined
  
  /** Value structValue */
  var structValue: js.UndefOr[IStruct | Null] = js.undefined
}
object IValue {
  
  inline def apply(): IValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValue]
  }
  
  extension [Self <: IValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueNull: Self = StObject.set(x, "boolValue", null)
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setListValue(value: IListValue): Self = StObject.set(x, "listValue", value.asInstanceOf[js.Any])
    
    inline def setListValueNull: Self = StObject.set(x, "listValue", null)
    
    inline def setListValueUndefined: Self = StObject.set(x, "listValue", js.undefined)
    
    inline def setNullValue(value: NullValue): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueNull: Self = StObject.set(x, "nullValue", null)
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueNull: Self = StObject.set(x, "numberValue", null)
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setStructValue(value: IStruct): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
    
    inline def setStructValueNull: Self = StObject.set(x, "structValue", null)
    
    inline def setStructValueUndefined: Self = StObject.set(x, "structValue", js.undefined)
  }
}
