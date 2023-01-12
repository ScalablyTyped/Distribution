package typings.draco3d.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseModule extends StObject {
  
  var COLOR: Double
  
  var DracoFloat32Array: Instantiable0[typings.draco3d.mod.DracoFloat32Array]
  
  var DracoInt16Array: Instantiable0[typings.draco3d.mod.DracoInt16Array]
  
  var DracoInt32Array: Instantiable0[typings.draco3d.mod.DracoInt32Array]
  
  var DracoInt8Array: Instantiable0[typings.draco3d.mod.DracoInt8Array]
  
  var DracoUInt16Array: Instantiable0[typings.draco3d.mod.DracoUInt16Array]
  
  var DracoUInt32Array: Instantiable0[typings.draco3d.mod.DracoUInt32Array]
  
  var DracoUInt8Array: Instantiable0[typings.draco3d.mod.DracoUInt8Array]
  
  var GENERIC: Double
  
  var HEAP16: js.typedarray.Int16Array
  
  var HEAP32: js.typedarray.Int32Array
  
  var HEAP8: js.typedarray.Int8Array
  
  // Heap.
  var HEAPF32: js.typedarray.Float32Array
  
  var HEAPU16: js.typedarray.Uint16Array
  
  var HEAPU32: js.typedarray.Uint32Array
  
  var HEAPU8: js.typedarray.Uint8Array
  
  var INVALID: Double
  
  var Mesh: Instantiable0[typings.draco3d.mod.Mesh]
  
  var NORMAL: Double
  
  var POSITION: Double
  
  var TEX_COORD: Double
  
  def _free(ptr: Double): Unit
  
  def _malloc(ptr: Double): Double
  
  def destroy(`object`: Any): Unit
}
object BaseModule {
  
  inline def apply(
    COLOR: Double,
    DracoFloat32Array: Instantiable0[DracoFloat32Array],
    DracoInt16Array: Instantiable0[DracoInt16Array],
    DracoInt32Array: Instantiable0[DracoInt32Array],
    DracoInt8Array: Instantiable0[DracoInt8Array],
    DracoUInt16Array: Instantiable0[DracoUInt16Array],
    DracoUInt32Array: Instantiable0[DracoUInt32Array],
    DracoUInt8Array: Instantiable0[DracoUInt8Array],
    GENERIC: Double,
    HEAP16: js.typedarray.Int16Array,
    HEAP32: js.typedarray.Int32Array,
    HEAP8: js.typedarray.Int8Array,
    HEAPF32: js.typedarray.Float32Array,
    HEAPU16: js.typedarray.Uint16Array,
    HEAPU32: js.typedarray.Uint32Array,
    HEAPU8: js.typedarray.Uint8Array,
    INVALID: Double,
    Mesh: Instantiable0[Mesh],
    NORMAL: Double,
    POSITION: Double,
    TEX_COORD: Double,
    _free: Double => Unit,
    _malloc: Double => Double,
    destroy: Any => Unit
  ): BaseModule = {
    val __obj = js.Dynamic.literal(COLOR = COLOR.asInstanceOf[js.Any], DracoFloat32Array = DracoFloat32Array.asInstanceOf[js.Any], DracoInt16Array = DracoInt16Array.asInstanceOf[js.Any], DracoInt32Array = DracoInt32Array.asInstanceOf[js.Any], DracoInt8Array = DracoInt8Array.asInstanceOf[js.Any], DracoUInt16Array = DracoUInt16Array.asInstanceOf[js.Any], DracoUInt32Array = DracoUInt32Array.asInstanceOf[js.Any], DracoUInt8Array = DracoUInt8Array.asInstanceOf[js.Any], GENERIC = GENERIC.asInstanceOf[js.Any], HEAP16 = HEAP16.asInstanceOf[js.Any], HEAP32 = HEAP32.asInstanceOf[js.Any], HEAP8 = HEAP8.asInstanceOf[js.Any], HEAPF32 = HEAPF32.asInstanceOf[js.Any], HEAPU16 = HEAPU16.asInstanceOf[js.Any], HEAPU32 = HEAPU32.asInstanceOf[js.Any], HEAPU8 = HEAPU8.asInstanceOf[js.Any], INVALID = INVALID.asInstanceOf[js.Any], Mesh = Mesh.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], POSITION = POSITION.asInstanceOf[js.Any], TEX_COORD = TEX_COORD.asInstanceOf[js.Any], _free = js.Any.fromFunction1(_free), _malloc = js.Any.fromFunction1(_malloc), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[BaseModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseModule] (val x: Self) extends AnyVal {
    
    inline def setCOLOR(value: Double): Self = StObject.set(x, "COLOR", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Any => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setDracoFloat32Array(value: Instantiable0[DracoFloat32Array]): Self = StObject.set(x, "DracoFloat32Array", value.asInstanceOf[js.Any])
    
    inline def setDracoInt16Array(value: Instantiable0[DracoInt16Array]): Self = StObject.set(x, "DracoInt16Array", value.asInstanceOf[js.Any])
    
    inline def setDracoInt32Array(value: Instantiable0[DracoInt32Array]): Self = StObject.set(x, "DracoInt32Array", value.asInstanceOf[js.Any])
    
    inline def setDracoInt8Array(value: Instantiable0[DracoInt8Array]): Self = StObject.set(x, "DracoInt8Array", value.asInstanceOf[js.Any])
    
    inline def setDracoUInt16Array(value: Instantiable0[DracoUInt16Array]): Self = StObject.set(x, "DracoUInt16Array", value.asInstanceOf[js.Any])
    
    inline def setDracoUInt32Array(value: Instantiable0[DracoUInt32Array]): Self = StObject.set(x, "DracoUInt32Array", value.asInstanceOf[js.Any])
    
    inline def setDracoUInt8Array(value: Instantiable0[DracoUInt8Array]): Self = StObject.set(x, "DracoUInt8Array", value.asInstanceOf[js.Any])
    
    inline def setGENERIC(value: Double): Self = StObject.set(x, "GENERIC", value.asInstanceOf[js.Any])
    
    inline def setHEAP16(value: js.typedarray.Int16Array): Self = StObject.set(x, "HEAP16", value.asInstanceOf[js.Any])
    
    inline def setHEAP32(value: js.typedarray.Int32Array): Self = StObject.set(x, "HEAP32", value.asInstanceOf[js.Any])
    
    inline def setHEAP8(value: js.typedarray.Int8Array): Self = StObject.set(x, "HEAP8", value.asInstanceOf[js.Any])
    
    inline def setHEAPF32(value: js.typedarray.Float32Array): Self = StObject.set(x, "HEAPF32", value.asInstanceOf[js.Any])
    
    inline def setHEAPU16(value: js.typedarray.Uint16Array): Self = StObject.set(x, "HEAPU16", value.asInstanceOf[js.Any])
    
    inline def setHEAPU32(value: js.typedarray.Uint32Array): Self = StObject.set(x, "HEAPU32", value.asInstanceOf[js.Any])
    
    inline def setHEAPU8(value: js.typedarray.Uint8Array): Self = StObject.set(x, "HEAPU8", value.asInstanceOf[js.Any])
    
    inline def setINVALID(value: Double): Self = StObject.set(x, "INVALID", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: Instantiable0[Mesh]): Self = StObject.set(x, "Mesh", value.asInstanceOf[js.Any])
    
    inline def setNORMAL(value: Double): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
    
    inline def setPOSITION(value: Double): Self = StObject.set(x, "POSITION", value.asInstanceOf[js.Any])
    
    inline def setTEX_COORD(value: Double): Self = StObject.set(x, "TEX_COORD", value.asInstanceOf[js.Any])
    
    inline def set_free(value: Double => Unit): Self = StObject.set(x, "_free", js.Any.fromFunction1(value))
    
    inline def set_malloc(value: Double => Double): Self = StObject.set(x, "_malloc", js.Any.fromFunction1(value))
  }
}
