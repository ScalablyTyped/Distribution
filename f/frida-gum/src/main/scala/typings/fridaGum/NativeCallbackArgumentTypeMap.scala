package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeCallbackArgumentTypeMap
  extends StObject
     with BaseNativeTypeMap {
  
  var int64: Int64
  
  var pointer: NativePointer
  
  var size_t: UInt64
  
  var ssize_t: Int64
  
  var uint64: UInt64
  
  var void: Unit
}
object NativeCallbackArgumentTypeMap {
  
  inline def apply(
    bool: Double,
    char: Double,
    double: Double,
    float: Double,
    int: Double,
    int16: Double,
    int32: Double,
    int64: Int64,
    int8: Double,
    long: Double,
    pointer: NativePointer,
    size_t: UInt64,
    ssize_t: Int64,
    uchar: Double,
    uint: Double,
    uint16: Double,
    uint32: Double,
    uint64: UInt64,
    uint8: Double,
    ulong: Double,
    void: Unit
  ): NativeCallbackArgumentTypeMap = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], int16 = int16.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], int64 = int64.asInstanceOf[js.Any], int8 = int8.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], size_t = size_t.asInstanceOf[js.Any], ssize_t = ssize_t.asInstanceOf[js.Any], uchar = uchar.asInstanceOf[js.Any], uint = uint.asInstanceOf[js.Any], uint16 = uint16.asInstanceOf[js.Any], uint32 = uint32.asInstanceOf[js.Any], uint64 = uint64.asInstanceOf[js.Any], uint8 = uint8.asInstanceOf[js.Any], ulong = ulong.asInstanceOf[js.Any], void = void.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeCallbackArgumentTypeMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeCallbackArgumentTypeMap] (val x: Self) extends AnyVal {
    
    inline def setInt64(value: Int64): Self = StObject.set(x, "int64", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: NativePointer): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setSize_t(value: UInt64): Self = StObject.set(x, "size_t", value.asInstanceOf[js.Any])
    
    inline def setSsize_t(value: Int64): Self = StObject.set(x, "ssize_t", value.asInstanceOf[js.Any])
    
    inline def setUint64(value: UInt64): Self = StObject.set(x, "uint64", value.asInstanceOf[js.Any])
    
    inline def setVoid(value: Unit): Self = StObject.set(x, "void", value.asInstanceOf[js.Any])
  }
}
