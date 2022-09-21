package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeValue extends StObject {
  
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  var datetimeValue: js.UndefOr[String] = js.undefined
  
  var intValue: js.UndefOr[String] = js.undefined
  
  var msgValue: js.UndefOr[js.Array[StringDictionary[Any]]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var stringValue: js.UndefOr[String] = js.undefined
}
object DatetimeValue {
  
  inline def apply(): DatetimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeValue]
  }
  
  extension [Self <: DatetimeValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setDatetimeValue(value: String): Self = StObject.set(x, "datetimeValue", value.asInstanceOf[js.Any])
    
    inline def setDatetimeValueUndefined: Self = StObject.set(x, "datetimeValue", js.undefined)
    
    inline def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    inline def setMsgValue(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "msgValue", value.asInstanceOf[js.Any])
    
    inline def setMsgValueUndefined: Self = StObject.set(x, "msgValue", js.undefined)
    
    inline def setMsgValueVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "msgValue", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
