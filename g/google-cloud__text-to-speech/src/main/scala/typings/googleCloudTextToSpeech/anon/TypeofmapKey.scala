package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofmapKey extends StObject {
  
  var bool: Double
  
  var fixed32: Double
  
  var fixed64: Double
  
  var int32: Double
  
  var int64: Double
  
  var sfixed32: Double
  
  var sfixed64: Double
  
  var sint32: Double
  
  var sint64: Double
  
  var string: Double
  
  var uint32: Double
  
  var uint64: Double
}
object TypeofmapKey {
  
  inline def apply(
    bool: Double,
    fixed32: Double,
    fixed64: Double,
    int32: Double,
    int64: Double,
    sfixed32: Double,
    sfixed64: Double,
    sint32: Double,
    sint64: Double,
    string: Double,
    uint32: Double,
    uint64: Double
  ): TypeofmapKey = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], fixed32 = fixed32.asInstanceOf[js.Any], fixed64 = fixed64.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], sfixed32 = sfixed32.asInstanceOf[js.Any], sfixed64 = sfixed64.asInstanceOf[js.Any], sint32 = sint32.asInstanceOf[js.Any], sint64 = sint64.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], uint32 = uint32.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofmapKey]
  }
  
  extension [Self <: TypeofmapKey](x: Self) {
    
    inline def setBool(value: Double): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setFixed32(value: Double): Self = StObject.set(x, "fixed32", value.asInstanceOf[js.Any])
    
    inline def setFixed64(value: Double): Self = StObject.set(x, "fixed64", value.asInstanceOf[js.Any])
    
    inline def setInt32(value: Double): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
    
    inline def setInt64(value: Double): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
    
    inline def setSfixed32(value: Double): Self = StObject.set(x, "sfixed32", value.asInstanceOf[js.Any])
    
    inline def setSfixed64(value: Double): Self = StObject.set(x, "sfixed64", value.asInstanceOf[js.Any])
    
    inline def setSint32(value: Double): Self = StObject.set(x, "sint32", value.asInstanceOf[js.Any])
    
    inline def setSint64(value: Double): Self = StObject.set(x, "sint64", value.asInstanceOf[js.Any])
    
    inline def setString(value: Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setUint32(value: Double): Self = StObject.set(x, "uint32", value.asInstanceOf[js.Any])
    
    inline def setUint64(value: Double): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
  }
}
