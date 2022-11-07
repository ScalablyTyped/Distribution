package typings.draco3d.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncoderModule
  extends StObject
     with BaseModule {
  
  var Encoder: Instantiable0[typings.draco3d.mod.Encoder]
  
  var MESH_EDGEBREAKER_ENCODING: Double
  
  var MESH_SEQUENTIAL_ENCODING: Double
  
  var MeshBuilder: Instantiable0[typings.draco3d.mod.MeshBuilder]
}
object EncoderModule {
  
  inline def apply(
    COLOR: Double,
    DracoFloat32Array: Instantiable0[DracoFloat32Array],
    DracoInt16Array: Instantiable0[DracoInt16Array],
    DracoInt32Array: Instantiable0[DracoInt32Array],
    DracoInt8Array: Instantiable0[DracoInt8Array],
    DracoUInt16Array: Instantiable0[DracoUInt16Array],
    DracoUInt32Array: Instantiable0[DracoUInt32Array],
    DracoUInt8Array: Instantiable0[DracoUInt8Array],
    Encoder: Instantiable0[Encoder],
    GENERIC: Double,
    HEAP16: js.typedarray.Int16Array,
    HEAP32: js.typedarray.Int32Array,
    HEAP8: js.typedarray.Int8Array,
    HEAPF32: js.typedarray.Float32Array,
    HEAPU16: js.typedarray.Uint16Array,
    HEAPU32: js.typedarray.Uint32Array,
    HEAPU8: js.typedarray.Uint8Array,
    INVALID: Double,
    MESH_EDGEBREAKER_ENCODING: Double,
    MESH_SEQUENTIAL_ENCODING: Double,
    Mesh: Instantiable0[Mesh],
    MeshBuilder: Instantiable0[MeshBuilder],
    NORMAL: Double,
    POSITION: Double,
    TEX_COORD: Double,
    _free: Double => Unit,
    _malloc: Double => Double,
    destroy: Any => Unit
  ): EncoderModule = {
    val __obj = js.Dynamic.literal(COLOR = COLOR.asInstanceOf[js.Any], DracoFloat32Array = DracoFloat32Array.asInstanceOf[js.Any], DracoInt16Array = DracoInt16Array.asInstanceOf[js.Any], DracoInt32Array = DracoInt32Array.asInstanceOf[js.Any], DracoInt8Array = DracoInt8Array.asInstanceOf[js.Any], DracoUInt16Array = DracoUInt16Array.asInstanceOf[js.Any], DracoUInt32Array = DracoUInt32Array.asInstanceOf[js.Any], DracoUInt8Array = DracoUInt8Array.asInstanceOf[js.Any], Encoder = Encoder.asInstanceOf[js.Any], GENERIC = GENERIC.asInstanceOf[js.Any], HEAP16 = HEAP16.asInstanceOf[js.Any], HEAP32 = HEAP32.asInstanceOf[js.Any], HEAP8 = HEAP8.asInstanceOf[js.Any], HEAPF32 = HEAPF32.asInstanceOf[js.Any], HEAPU16 = HEAPU16.asInstanceOf[js.Any], HEAPU32 = HEAPU32.asInstanceOf[js.Any], HEAPU8 = HEAPU8.asInstanceOf[js.Any], INVALID = INVALID.asInstanceOf[js.Any], MESH_EDGEBREAKER_ENCODING = MESH_EDGEBREAKER_ENCODING.asInstanceOf[js.Any], MESH_SEQUENTIAL_ENCODING = MESH_SEQUENTIAL_ENCODING.asInstanceOf[js.Any], Mesh = Mesh.asInstanceOf[js.Any], MeshBuilder = MeshBuilder.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], POSITION = POSITION.asInstanceOf[js.Any], TEX_COORD = TEX_COORD.asInstanceOf[js.Any], _free = js.Any.fromFunction1(_free), _malloc = js.Any.fromFunction1(_malloc), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[EncoderModule]
  }
  
  extension [Self <: EncoderModule](x: Self) {
    
    inline def setEncoder(value: Instantiable0[Encoder]): Self = StObject.set(x, "Encoder", value.asInstanceOf[js.Any])
    
    inline def setMESH_EDGEBREAKER_ENCODING(value: Double): Self = StObject.set(x, "MESH_EDGEBREAKER_ENCODING", value.asInstanceOf[js.Any])
    
    inline def setMESH_SEQUENTIAL_ENCODING(value: Double): Self = StObject.set(x, "MESH_SEQUENTIAL_ENCODING", value.asInstanceOf[js.Any])
    
    inline def setMeshBuilder(value: Instantiable0[MeshBuilder]): Self = StObject.set(x, "MeshBuilder", value.asInstanceOf[js.Any])
  }
}
