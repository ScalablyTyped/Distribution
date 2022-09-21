package typings.draco3d

import org.scalablytyped.runtime.Instantiable0
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("draco3d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait DataType extends StObject
  object DataType {
    
    @JSImport("draco3d", "DataType")
    @js.native
    def apply(value: scala.Nothing): js.UndefOr[DataType & scala.Nothing] = js.native
  }
  
  @js.native
  sealed trait GeometryType extends StObject
  object GeometryType {
    
    @JSImport("draco3d", "GeometryType")
    @js.native
    def apply(value: scala.Nothing): js.UndefOr[GeometryType & scala.Nothing] = js.native
  }
  
  inline def createDecoderModule(): js.Promise[DecoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoderModule")().asInstanceOf[js.Promise[DecoderModule]]
  inline def createDecoderModule(`object`: Record[String, Any]): js.Promise[DecoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoderModule")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DecoderModule]]
  
  inline def createEncoderModule(): js.Promise[EncoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoderModule")().asInstanceOf[js.Promise[EncoderModule]]
  inline def createEncoderModule(`object`: Record[String, Any]): js.Promise[EncoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoderModule")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EncoderModule]]
  
  trait Attribute extends StObject {
    
    def num_components(): Double
  }
  object Attribute {
    
    inline def apply(num_components: () => Double): Attribute = {
      val __obj = js.Dynamic.literal(num_components = js.Any.fromFunction0(num_components))
      __obj.asInstanceOf[Attribute]
    }
    
    extension [Self <: Attribute](x: Self) {
      
      inline def setNum_components(value: () => Double): Self = StObject.set(x, "num_components", js.Any.fromFunction0(value))
    }
  }
  
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
    
    extension [Self <: BaseModule](x: Self) {
      
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
  
  trait Decoder extends StObject {
    
    def DecodeBufferToMesh(buffer: DecoderBuffer, mesh: Mesh): Status
    
    def GetAttribute(mesh: Mesh, id: Double): Attribute
    
    def GetAttributeByUniqueId(mesh: Mesh, id: Double): Attribute
    
    def GetAttributeDataArrayForAllPoints(mesh: Mesh, attribute: Attribute, `type`: DataType, byteLength: Double, ptr: Double): Unit
    
    def GetAttributeFloatForAllPoints(mesh: Mesh, attribute: Attribute, array: DracoArray): Unit
    
    def GetAttributeId(mesh: Mesh, attributeType: Double): Double
    
    def GetAttributeInt16ForAllPoints(mesh: Mesh, attribute: Attribute, array: DracoArray): Unit
    
    def GetAttributeInt32ForAllPoints(mesh: Mesh, attribute: Attribute, array: DracoArray): Unit
    
    def GetAttributeInt8ForAllPoints(mesh: Mesh, attribute: Attribute, array: DracoArray): Unit
    
    def GetAttributeUInt16ForAllPoints(mesh: Mesh, attribute: Attribute, array: DracoArray): Unit
    
    def GetAttributeUInt32ForAllPoints(mesh: Mesh, attribute: Attribute, array: DracoArray): Unit
    
    def GetAttributeUInt8ForAllPoints(mesh: Mesh, attribute: Attribute, array: DracoArray): Unit
    
    def GetEncodedGeometryType(buffer: DecoderBuffer): GeometryType
    
    def GetFaceFromMesh(mesh: Mesh, index: Double, array: DracoArray): Double
    
    def GetTrianglesUInt16Array(mesh: Mesh, byteLength: Double, ptr: Double): Unit
    
    def GetTrianglesUInt32Array(mesh: Mesh, byteLength: Double, ptr: Double): Unit
  }
  object Decoder {
    
    inline def apply(
      DecodeBufferToMesh: (DecoderBuffer, Mesh) => Status,
      GetAttribute: (Mesh, Double) => Attribute,
      GetAttributeByUniqueId: (Mesh, Double) => Attribute,
      GetAttributeDataArrayForAllPoints: (Mesh, Attribute, DataType, Double, Double) => Unit,
      GetAttributeFloatForAllPoints: (Mesh, Attribute, DracoArray) => Unit,
      GetAttributeId: (Mesh, Double) => Double,
      GetAttributeInt16ForAllPoints: (Mesh, Attribute, DracoArray) => Unit,
      GetAttributeInt32ForAllPoints: (Mesh, Attribute, DracoArray) => Unit,
      GetAttributeInt8ForAllPoints: (Mesh, Attribute, DracoArray) => Unit,
      GetAttributeUInt16ForAllPoints: (Mesh, Attribute, DracoArray) => Unit,
      GetAttributeUInt32ForAllPoints: (Mesh, Attribute, DracoArray) => Unit,
      GetAttributeUInt8ForAllPoints: (Mesh, Attribute, DracoArray) => Unit,
      GetEncodedGeometryType: DecoderBuffer => GeometryType,
      GetFaceFromMesh: (Mesh, Double, DracoArray) => Double,
      GetTrianglesUInt16Array: (Mesh, Double, Double) => Unit,
      GetTrianglesUInt32Array: (Mesh, Double, Double) => Unit
    ): Decoder = {
      val __obj = js.Dynamic.literal(DecodeBufferToMesh = js.Any.fromFunction2(DecodeBufferToMesh), GetAttribute = js.Any.fromFunction2(GetAttribute), GetAttributeByUniqueId = js.Any.fromFunction2(GetAttributeByUniqueId), GetAttributeDataArrayForAllPoints = js.Any.fromFunction5(GetAttributeDataArrayForAllPoints), GetAttributeFloatForAllPoints = js.Any.fromFunction3(GetAttributeFloatForAllPoints), GetAttributeId = js.Any.fromFunction2(GetAttributeId), GetAttributeInt16ForAllPoints = js.Any.fromFunction3(GetAttributeInt16ForAllPoints), GetAttributeInt32ForAllPoints = js.Any.fromFunction3(GetAttributeInt32ForAllPoints), GetAttributeInt8ForAllPoints = js.Any.fromFunction3(GetAttributeInt8ForAllPoints), GetAttributeUInt16ForAllPoints = js.Any.fromFunction3(GetAttributeUInt16ForAllPoints), GetAttributeUInt32ForAllPoints = js.Any.fromFunction3(GetAttributeUInt32ForAllPoints), GetAttributeUInt8ForAllPoints = js.Any.fromFunction3(GetAttributeUInt8ForAllPoints), GetEncodedGeometryType = js.Any.fromFunction1(GetEncodedGeometryType), GetFaceFromMesh = js.Any.fromFunction3(GetFaceFromMesh), GetTrianglesUInt16Array = js.Any.fromFunction3(GetTrianglesUInt16Array), GetTrianglesUInt32Array = js.Any.fromFunction3(GetTrianglesUInt32Array))
      __obj.asInstanceOf[Decoder]
    }
    
    extension [Self <: Decoder](x: Self) {
      
      inline def setDecodeBufferToMesh(value: (DecoderBuffer, Mesh) => Status): Self = StObject.set(x, "DecodeBufferToMesh", js.Any.fromFunction2(value))
      
      inline def setGetAttribute(value: (Mesh, Double) => Attribute): Self = StObject.set(x, "GetAttribute", js.Any.fromFunction2(value))
      
      inline def setGetAttributeByUniqueId(value: (Mesh, Double) => Attribute): Self = StObject.set(x, "GetAttributeByUniqueId", js.Any.fromFunction2(value))
      
      inline def setGetAttributeDataArrayForAllPoints(value: (Mesh, Attribute, DataType, Double, Double) => Unit): Self = StObject.set(x, "GetAttributeDataArrayForAllPoints", js.Any.fromFunction5(value))
      
      inline def setGetAttributeFloatForAllPoints(value: (Mesh, Attribute, DracoArray) => Unit): Self = StObject.set(x, "GetAttributeFloatForAllPoints", js.Any.fromFunction3(value))
      
      inline def setGetAttributeId(value: (Mesh, Double) => Double): Self = StObject.set(x, "GetAttributeId", js.Any.fromFunction2(value))
      
      inline def setGetAttributeInt16ForAllPoints(value: (Mesh, Attribute, DracoArray) => Unit): Self = StObject.set(x, "GetAttributeInt16ForAllPoints", js.Any.fromFunction3(value))
      
      inline def setGetAttributeInt32ForAllPoints(value: (Mesh, Attribute, DracoArray) => Unit): Self = StObject.set(x, "GetAttributeInt32ForAllPoints", js.Any.fromFunction3(value))
      
      inline def setGetAttributeInt8ForAllPoints(value: (Mesh, Attribute, DracoArray) => Unit): Self = StObject.set(x, "GetAttributeInt8ForAllPoints", js.Any.fromFunction3(value))
      
      inline def setGetAttributeUInt16ForAllPoints(value: (Mesh, Attribute, DracoArray) => Unit): Self = StObject.set(x, "GetAttributeUInt16ForAllPoints", js.Any.fromFunction3(value))
      
      inline def setGetAttributeUInt32ForAllPoints(value: (Mesh, Attribute, DracoArray) => Unit): Self = StObject.set(x, "GetAttributeUInt32ForAllPoints", js.Any.fromFunction3(value))
      
      inline def setGetAttributeUInt8ForAllPoints(value: (Mesh, Attribute, DracoArray) => Unit): Self = StObject.set(x, "GetAttributeUInt8ForAllPoints", js.Any.fromFunction3(value))
      
      inline def setGetEncodedGeometryType(value: DecoderBuffer => GeometryType): Self = StObject.set(x, "GetEncodedGeometryType", js.Any.fromFunction1(value))
      
      inline def setGetFaceFromMesh(value: (Mesh, Double, DracoArray) => Double): Self = StObject.set(x, "GetFaceFromMesh", js.Any.fromFunction3(value))
      
      inline def setGetTrianglesUInt16Array(value: (Mesh, Double, Double) => Unit): Self = StObject.set(x, "GetTrianglesUInt16Array", js.Any.fromFunction3(value))
      
      inline def setGetTrianglesUInt32Array(value: (Mesh, Double, Double) => Unit): Self = StObject.set(x, "GetTrianglesUInt32Array", js.Any.fromFunction3(value))
    }
  }
  
  trait DecoderBuffer extends StObject {
    
    def Init(array: js.typedarray.Int8Array, byteLength: Double): Unit
  }
  object DecoderBuffer {
    
    inline def apply(Init: (js.typedarray.Int8Array, Double) => Unit): DecoderBuffer = {
      val __obj = js.Dynamic.literal(Init = js.Any.fromFunction2(Init))
      __obj.asInstanceOf[DecoderBuffer]
    }
    
    extension [Self <: DecoderBuffer](x: Self) {
      
      inline def setInit(value: (js.typedarray.Int8Array, Double) => Unit): Self = StObject.set(x, "Init", js.Any.fromFunction2(value))
    }
  }
  
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
      TEX_COORD: Double,
      TRIANGULAR_MESH: GeometryType,
      _free: Double => Unit,
      _malloc: Double => Double,
      destroy: Any => Unit
    ): DecoderModule = {
      val __obj = js.Dynamic.literal(COLOR = COLOR.asInstanceOf[js.Any], DT_FLOAT32 = DT_FLOAT32.asInstanceOf[js.Any], DT_INT16 = DT_INT16.asInstanceOf[js.Any], DT_INT32 = DT_INT32.asInstanceOf[js.Any], DT_INT8 = DT_INT8.asInstanceOf[js.Any], DT_UINT16 = DT_UINT16.asInstanceOf[js.Any], DT_UINT32 = DT_UINT32.asInstanceOf[js.Any], DT_UINT8 = DT_UINT8.asInstanceOf[js.Any], Decoder = Decoder.asInstanceOf[js.Any], DecoderBuffer = DecoderBuffer.asInstanceOf[js.Any], DracoFloat32Array = DracoFloat32Array.asInstanceOf[js.Any], DracoInt16Array = DracoInt16Array.asInstanceOf[js.Any], DracoInt32Array = DracoInt32Array.asInstanceOf[js.Any], DracoInt8Array = DracoInt8Array.asInstanceOf[js.Any], DracoUInt16Array = DracoUInt16Array.asInstanceOf[js.Any], DracoUInt32Array = DracoUInt32Array.asInstanceOf[js.Any], DracoUInt8Array = DracoUInt8Array.asInstanceOf[js.Any], GENERIC = GENERIC.asInstanceOf[js.Any], HEAP16 = HEAP16.asInstanceOf[js.Any], HEAP32 = HEAP32.asInstanceOf[js.Any], HEAP8 = HEAP8.asInstanceOf[js.Any], HEAPF32 = HEAPF32.asInstanceOf[js.Any], HEAPU16 = HEAPU16.asInstanceOf[js.Any], HEAPU32 = HEAPU32.asInstanceOf[js.Any], HEAPU8 = HEAPU8.asInstanceOf[js.Any], INVALID = INVALID.asInstanceOf[js.Any], Mesh = Mesh.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], POINT_CLOUD = POINT_CLOUD.asInstanceOf[js.Any], POSITION = POSITION.asInstanceOf[js.Any], TEX_COORD = TEX_COORD.asInstanceOf[js.Any], TRIANGULAR_MESH = TRIANGULAR_MESH.asInstanceOf[js.Any], _free = js.Any.fromFunction1(_free), _malloc = js.Any.fromFunction1(_malloc), destroy = js.Any.fromFunction1(destroy))
      __obj.asInstanceOf[DecoderModule]
    }
    
    extension [Self <: DecoderModule](x: Self) {
      
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
      
      inline def setTRIANGULAR_MESH(value: GeometryType): Self = StObject.set(x, "TRIANGULAR_MESH", value.asInstanceOf[js.Any])
    }
  }
  
  trait DracoArray extends StObject {
    
    def GetValue(index: Double): Double
  }
  object DracoArray {
    
    inline def apply(GetValue: Double => Double): DracoArray = {
      val __obj = js.Dynamic.literal(GetValue = js.Any.fromFunction1(GetValue))
      __obj.asInstanceOf[DracoArray]
    }
    
    extension [Self <: DracoArray](x: Self) {
      
      inline def setGetValue(value: Double => Double): Self = StObject.set(x, "GetValue", js.Any.fromFunction1(value))
    }
  }
  
  type DracoFloat32Array = DracoArray
  
  type DracoInt16Array = DracoArray
  
  type DracoInt32Array = DracoArray
  
  type DracoInt8Array = DracoArray
  
  type DracoUInt16Array = DracoArray
  
  type DracoUInt32Array = DracoArray
  
  type DracoUInt8Array = DracoArray
  
  trait Encoder extends StObject {
    
    def EncodeMeshToDracoBuffer(mesh: Mesh, array: DracoInt8Array): Double
    
    def GetNumberOfEncodedFaces(): Double
    
    def GetNumberOfEncodedPoints(): Double
    
    def SetAttributeExplicitQuantization(
      attribute: Double,
      bits: Double,
      itemSize: Double,
      origin: js.Tuple3[Double, Double, Double],
      range: Double
    ): Unit
    
    def SetAttributeQuantization(attribute: Double, bits: Double): Unit
    
    def SetEncodingMethod(method: Double): Unit
    
    def SetSpeedOptions(encodeSpeed: Double, decodeSpeed: Double): Unit
    
    def SetTrackEncodedProperties(track: Boolean): Unit
  }
  object Encoder {
    
    inline def apply(
      EncodeMeshToDracoBuffer: (Mesh, DracoInt8Array) => Double,
      GetNumberOfEncodedFaces: () => Double,
      GetNumberOfEncodedPoints: () => Double,
      SetAttributeExplicitQuantization: (Double, Double, Double, js.Tuple3[Double, Double, Double], Double) => Unit,
      SetAttributeQuantization: (Double, Double) => Unit,
      SetEncodingMethod: Double => Unit,
      SetSpeedOptions: (Double, Double) => Unit,
      SetTrackEncodedProperties: Boolean => Unit
    ): Encoder = {
      val __obj = js.Dynamic.literal(EncodeMeshToDracoBuffer = js.Any.fromFunction2(EncodeMeshToDracoBuffer), GetNumberOfEncodedFaces = js.Any.fromFunction0(GetNumberOfEncodedFaces), GetNumberOfEncodedPoints = js.Any.fromFunction0(GetNumberOfEncodedPoints), SetAttributeExplicitQuantization = js.Any.fromFunction5(SetAttributeExplicitQuantization), SetAttributeQuantization = js.Any.fromFunction2(SetAttributeQuantization), SetEncodingMethod = js.Any.fromFunction1(SetEncodingMethod), SetSpeedOptions = js.Any.fromFunction2(SetSpeedOptions), SetTrackEncodedProperties = js.Any.fromFunction1(SetTrackEncodedProperties))
      __obj.asInstanceOf[Encoder]
    }
    
    extension [Self <: Encoder](x: Self) {
      
      inline def setEncodeMeshToDracoBuffer(value: (Mesh, DracoInt8Array) => Double): Self = StObject.set(x, "EncodeMeshToDracoBuffer", js.Any.fromFunction2(value))
      
      inline def setGetNumberOfEncodedFaces(value: () => Double): Self = StObject.set(x, "GetNumberOfEncodedFaces", js.Any.fromFunction0(value))
      
      inline def setGetNumberOfEncodedPoints(value: () => Double): Self = StObject.set(x, "GetNumberOfEncodedPoints", js.Any.fromFunction0(value))
      
      inline def setSetAttributeExplicitQuantization(value: (Double, Double, Double, js.Tuple3[Double, Double, Double], Double) => Unit): Self = StObject.set(x, "SetAttributeExplicitQuantization", js.Any.fromFunction5(value))
      
      inline def setSetAttributeQuantization(value: (Double, Double) => Unit): Self = StObject.set(x, "SetAttributeQuantization", js.Any.fromFunction2(value))
      
      inline def setSetEncodingMethod(value: Double => Unit): Self = StObject.set(x, "SetEncodingMethod", js.Any.fromFunction1(value))
      
      inline def setSetSpeedOptions(value: (Double, Double) => Unit): Self = StObject.set(x, "SetSpeedOptions", js.Any.fromFunction2(value))
      
      inline def setSetTrackEncodedProperties(value: Boolean => Unit): Self = StObject.set(x, "SetTrackEncodedProperties", js.Any.fromFunction1(value))
    }
  }
  
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
  
  trait Mesh extends StObject {
    
    def num_faces(): Double
    
    def num_points(): Double
    
    var ptr: Double
  }
  object Mesh {
    
    inline def apply(num_faces: () => Double, num_points: () => Double, ptr: Double): Mesh = {
      val __obj = js.Dynamic.literal(num_faces = js.Any.fromFunction0(num_faces), num_points = js.Any.fromFunction0(num_points), ptr = ptr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mesh]
    }
    
    extension [Self <: Mesh](x: Self) {
      
      inline def setNum_faces(value: () => Double): Self = StObject.set(x, "num_faces", js.Any.fromFunction0(value))
      
      inline def setNum_points(value: () => Double): Self = StObject.set(x, "num_points", js.Any.fromFunction0(value))
      
      inline def setPtr(value: Double): Self = StObject.set(x, "ptr", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MeshBuilder extends StObject {
    
    def AddFacesToMesh(mesh: Mesh, numFaces: Double, faces: js.typedarray.Uint16Array): Unit = js.native
    def AddFacesToMesh(mesh: Mesh, numFaces: Double, faces: js.typedarray.Uint32Array): Unit = js.native
    
    def AddFloatAttribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
    
    def AddInt16Attribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
    
    def AddInt8Attribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
    
    def AddUInt16Attribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
    
    def AddUInt32Attribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
    
    def AddUInt8Attribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
  }
  
  trait Status extends StObject {
    
    def error_msg(): String
    
    def ok(): Boolean
  }
  object Status {
    
    inline def apply(error_msg: () => String, ok: () => Boolean): Status = {
      val __obj = js.Dynamic.literal(error_msg = js.Any.fromFunction0(error_msg), ok = js.Any.fromFunction0(ok))
      __obj.asInstanceOf[Status]
    }
    
    extension [Self <: Status](x: Self) {
      
      inline def setError_msg(value: () => String): Self = StObject.set(x, "error_msg", js.Any.fromFunction0(value))
      
      inline def setOk(value: () => Boolean): Self = StObject.set(x, "ok", js.Any.fromFunction0(value))
    }
  }
  
  type TypedArray = js.typedarray.Float32Array | js.typedarray.Uint32Array | js.typedarray.Uint16Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Int8Array
}
