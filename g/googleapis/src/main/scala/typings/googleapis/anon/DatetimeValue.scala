package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeValue extends StObject {
  
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  var datetimeValue: js.UndefOr[String] = js.undefined
  
  var intValue: js.UndefOr[String] = js.undefined
  
  var msgValue: js.UndefOr[js.Array[StringDictionary[js.Any]]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var stringValue: js.UndefOr[String] = js.undefined
}
object DatetimeValue {
  
  @scala.inline
  def apply(): DatetimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeValue]
  }
  
  @scala.inline
  implicit class DatetimeValueMutableBuilder[Self <: DatetimeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setDatetimeValue(value: String): Self = StObject.set(x, "datetimeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetimeValueUndefined: Self = StObject.set(x, "datetimeValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    @scala.inline
    def setMsgValue(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "msgValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgValueUndefined: Self = StObject.set(x, "msgValue", js.undefined)
    
    @scala.inline
    def setMsgValueVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "msgValue", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
