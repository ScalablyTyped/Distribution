package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefaultTypes extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/user-default-types
  var array: js.Array[Any]
  
  var boolean: Boolean
  
  var dictionary: Record[String, Any]
  
  var double: Double
  
  var float: Double
  
  var integer: Double
  
  var string: String
  
  var url: String
}
object UserDefaultTypes {
  
  inline def apply(
    array: js.Array[Any],
    boolean: Boolean,
    dictionary: Record[String, Any],
    double: Double,
    float: Double,
    integer: Double,
    string: String,
    url: String
  ): UserDefaultTypes = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefaultTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserDefaultTypes] (val x: Self) extends AnyVal {
    
    inline def setArray(value: js.Array[Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: Any*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setDictionary(value: Record[String, Any]): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    inline def setDouble(value: Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
    
    inline def setFloat(value: Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setInteger(value: Double): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
