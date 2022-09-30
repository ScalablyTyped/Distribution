package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdefaults extends StObject {
  
  var bool: Boolean
  
  var bytes: js.Array[Double]
  
  var double: Double
  
  var fixed32: Double
  
  var fixed64: Double
  
  var float: Double
  
  var int32: Double
  
  var int64: Double
  
  var message: Null
  
  var sfixed32: Double
  
  var sfixed64: Double
  
  var sint32: Double
  
  var sint64: Double
  
  var string: String
  
  var uint32: Double
  
  var uint64: Double
}
object Typeofdefaults {
  
  inline def apply(
    bool: Boolean,
    bytes: js.Array[Double],
    double: Double,
    fixed32: Double,
    fixed64: Double,
    float: Double,
    int32: Double,
    int64: Double,
    message: Null,
    sfixed32: Double,
    sfixed64: Double,
    sint32: Double,
    sint64: Double,
    string: String,
    uint32: Double,
    uint64: Double
  ): Typeofdefaults = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], fixed32 = fixed32.asInstanceOf[js.Any], fixed64 = fixed64.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sfixed32 = sfixed32.asInstanceOf[js.Any], sfixed64 = sfixed64.asInstanceOf[js.Any], sint32 = sint32.asInstanceOf[js.Any], sint64 = sint64.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], uint32 = uint32.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdefaults]
  }
  
  extension [Self <: Typeofdefaults](x: Self) {
    
    inline def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setBytes(value: js.Array[Double]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesVarargs(value: Double*): Self = StObject.set(x, "bytes", js.Array(value*))
    
    inline def setDouble(value: Double): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
    
    inline def setFixed32(value: Double): Self = StObject.set(x, "fixed32", value.asInstanceOf[js.Any])
    
    inline def setFixed64(value: Double): Self = StObject.set(x, "fixed64", value.asInstanceOf[js.Any])
    
    inline def setFloat(value: Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setInt32(value: Double): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
    
    inline def setInt64(value: Double): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Null): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSfixed32(value: Double): Self = StObject.set(x, "sfixed32", value.asInstanceOf[js.Any])
    
    inline def setSfixed64(value: Double): Self = StObject.set(x, "sfixed64", value.asInstanceOf[js.Any])
    
    inline def setSint32(value: Double): Self = StObject.set(x, "sint32", value.asInstanceOf[js.Any])
    
    inline def setSint64(value: Double): Self = StObject.set(x, "sint64", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setUint32(value: Double): Self = StObject.set(x, "uint32", value.asInstanceOf[js.Any])
    
    inline def setUint64(value: Double): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
  }
}
