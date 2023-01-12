package typings.draco3d.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecoderModule
  extends StObject
     with BaseModule {
  
  // DataType.
  var DT_FLOAT32: DataType
  
  var DT_INT16: DataType
  
  var DT_INT32: DataType
  
  var DT_INT8: DataType
  
  var DT_UINT16: DataType
  
  var DT_UINT32: DataType
  
  var DT_UINT8: DataType
  
  var Decoder: Instantiable0[typings.draco3d.mod.Decoder]
  
  var DecoderBuffer: Instantiable0[typings.draco3d.mod.DecoderBuffer]
  
  var POINT_CLOUD: GeometryType
  
  var PointCloud: Instantiable0[typings.draco3d.mod.PointCloud]
  
  // GeometryType.
  var TRIANGULAR_MESH: GeometryType
}
object DecoderModule {
  
  inline def apply(
    COLOR: Double,
    DT_FLOAT32: DataType,
    DT_INT16: DataType,
    DT_INT32: DataType,
    DT_INT8: DataType,
    DT_UINT16: DataType,
    DT_UINT32: DataType,
    DT_UINT8: DataType,
    Decoder: Instantiable0[Decoder],
    DecoderBuffer: Instantiable0[DecoderBuffer],
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
    POINT_CLOUD: GeometryType,
    POSITION: Double,
    PointCloud: Instantiable0[PointCloud],
    TEX_COORD: Double,
    TRIANGULAR_MESH: GeometryType,
    _free: Double => Unit,
    _malloc: Double => Double,
    destroy: Any => Unit
  ): DecoderModule = {
    val __obj = js.Dynamic.literal(COLOR = COLOR.asInstanceOf[js.Any], DT_FLOAT32 = DT_FLOAT32.asInstanceOf[js.Any], DT_INT16 = DT_INT16.asInstanceOf[js.Any], DT_INT32 = DT_INT32.asInstanceOf[js.Any], DT_INT8 = DT_INT8.asInstanceOf[js.Any], DT_UINT16 = DT_UINT16.asInstanceOf[js.Any], DT_UINT32 = DT_UINT32.asInstanceOf[js.Any], DT_UINT8 = DT_UINT8.asInstanceOf[js.Any], Decoder = Decoder.asInstanceOf[js.Any], DecoderBuffer = DecoderBuffer.asInstanceOf[js.Any], DracoFloat32Array = DracoFloat32Array.asInstanceOf[js.Any], DracoInt16Array = DracoInt16Array.asInstanceOf[js.Any], DracoInt32Array = DracoInt32Array.asInstanceOf[js.Any], DracoInt8Array = DracoInt8Array.asInstanceOf[js.Any], DracoUInt16Array = DracoUInt16Array.asInstanceOf[js.Any], DracoUInt32Array = DracoUInt32Array.asInstanceOf[js.Any], DracoUInt8Array = DracoUInt8Array.asInstanceOf[js.Any], GENERIC = GENERIC.asInstanceOf[js.Any], HEAP16 = HEAP16.asInstanceOf[js.Any], HEAP32 = HEAP32.asInstanceOf[js.Any], HEAP8 = HEAP8.asInstanceOf[js.Any], HEAPF32 = HEAPF32.asInstanceOf[js.Any], HEAPU16 = HEAPU16.asInstanceOf[js.Any], HEAPU32 = HEAPU32.asInstanceOf[js.Any], HEAPU8 = HEAPU8.asInstanceOf[js.Any], INVALID = INVALID.asInstanceOf[js.Any], Mesh = Mesh.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], POINT_CLOUD = POINT_CLOUD.asInstanceOf[js.Any], POSITION = POSITION.asInstanceOf[js.Any], PointCloud = PointCloud.asInstanceOf[js.Any], TEX_COORD = TEX_COORD.asInstanceOf[js.Any], TRIANGULAR_MESH = TRIANGULAR_MESH.asInstanceOf[js.Any], _free = js.Any.fromFunction1(_free), _malloc = js.Any.fromFunction1(_malloc), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[DecoderModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecoderModule] (val x: Self) extends AnyVal {
    
    inline def setDT_FLOAT32(value: DataType): Self = StObject.set(x, "DT_FLOAT32", value.asInstanceOf[js.Any])
    
    inline def setDT_INT16(value: DataType): Self = StObject.set(x, "DT_INT16", value.asInstanceOf[js.Any])
    
    inline def setDT_INT32(value: DataType): Self = StObject.set(x, "DT_INT32", value.asInstanceOf[js.Any])
    
    inline def setDT_INT8(value: DataType): Self = StObject.set(x, "DT_INT8", value.asInstanceOf[js.Any])
    
    inline def setDT_UINT16(value: DataType): Self = StObject.set(x, "DT_UINT16", value.asInstanceOf[js.Any])
    
    inline def setDT_UINT32(value: DataType): Self = StObject.set(x, "DT_UINT32", value.asInstanceOf[js.Any])
    
    inline def setDT_UINT8(value: DataType): Self = StObject.set(x, "DT_UINT8", value.asInstanceOf[js.Any])
    
    inline def setDecoder(value: Instantiable0[Decoder]): Self = StObject.set(x, "Decoder", value.asInstanceOf[js.Any])
    
    inline def setDecoderBuffer(value: Instantiable0[DecoderBuffer]): Self = StObject.set(x, "DecoderBuffer", value.asInstanceOf[js.Any])
    
    inline def setPOINT_CLOUD(value: GeometryType): Self = StObject.set(x, "POINT_CLOUD", value.asInstanceOf[js.Any])
    
    inline def setPointCloud(value: Instantiable0[PointCloud]): Self = StObject.set(x, "PointCloud", value.asInstanceOf[js.Any])
    
    inline def setTRIANGULAR_MESH(value: GeometryType): Self = StObject.set(x, "TRIANGULAR_MESH", value.asInstanceOf[js.Any])
  }
}
