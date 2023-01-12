package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAbstractObjectMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/abstract-object", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AbstractObject {
    
    /* CompleteClass */
    @JSName("$key")
    var $key: String = js.native
    
    /* CompleteClass */
    @JSName("$value")
    var $value: Any = js.native
    
    /* CompleteClass */
    var _data: Any = js.native
    
    /* CompleteClass */
    override def _defineProperty(field: String): Unit = js.native
    
    /* CompleteClass */
    var _fields: js.Array[String] = js.native
    
    /* CompleteClass */
    override def exportData(): Record[String, Any] = js.native
    
    /* CompleteClass */
    override def set(field: String, value: Any): AbstractObject = js.native
    
    /* CompleteClass */
    override def setData(data: Record[String, Any]): AbstractObject = js.native
  }
  
  trait AbstractObject extends StObject {
    
    @JSName("$key")
    var $key: String
    
    @JSName("$value")
    var $value: Any
    
    var _data: Any
    
    def _defineProperty(field: String): Unit
    
    var _fields: js.Array[String]
    
    def exportData(): Record[String, Any]
    
    def set(field: String, value: Any): AbstractObject
    
    def setData(data: Record[String, Any]): AbstractObject
  }
  object AbstractObject {
    
    inline def apply(
      $key: String,
      $value: Any,
      _data: Any,
      _defineProperty: String => Unit,
      _fields: js.Array[String],
      exportData: () => Record[String, Any],
      set: (String, Any) => AbstractObject,
      setData: Record[String, Any] => AbstractObject
    ): AbstractObject = {
      val __obj = js.Dynamic.literal($key = $key.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any], _data = _data.asInstanceOf[js.Any], _defineProperty = js.Any.fromFunction1(_defineProperty), _fields = _fields.asInstanceOf[js.Any], exportData = js.Any.fromFunction0(exportData), set = js.Any.fromFunction2(set), setData = js.Any.fromFunction1(setData))
      __obj.asInstanceOf[AbstractObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractObject] (val x: Self) extends AnyVal {
      
      inline def set$key(value: String): Self = StObject.set(x, "$key", value.asInstanceOf[js.Any])
      
      inline def set$value(value: Any): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
      
      inline def setExportData(value: () => Record[String, Any]): Self = StObject.set(x, "exportData", js.Any.fromFunction0(value))
      
      inline def setSet(value: (String, Any) => AbstractObject): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSetData(value: Record[String, Any] => AbstractObject): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      inline def set_data(value: Any): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
      
      inline def set_defineProperty(value: String => Unit): Self = StObject.set(x, "_defineProperty", js.Any.fromFunction1(value))
      
      inline def set_fields(value: js.Array[String]): Self = StObject.set(x, "_fields", value.asInstanceOf[js.Any])
      
      inline def set_fieldsVarargs(value: String*): Self = StObject.set(x, "_fields", js.Array(value*))
    }
  }
}
