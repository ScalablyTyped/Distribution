package typings.draco3d.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decoder extends StObject {
  
  def DecodeBufferToMesh(buffer: DecoderBuffer, mesh: Mesh): Status
  
  def DecodeBufferToPointCloud(buffer: DecoderBuffer, pointCloud: PointCloud): Status
  
  def GetAttribute(mesh: PointCloud, id: Double): Attribute
  
  def GetAttributeByUniqueId(mesh: Mesh, id: Double): Attribute
  
  def GetAttributeDataArrayForAllPoints(mesh: Mesh, attribute: Attribute, `type`: DataType, byteLength: Double, ptr: Double): Unit
  
  def GetAttributeFloatForAllPoints(mesh: Mesh, attribute: Attribute, array: DracoArray): Unit
  
  def GetAttributeId(mesh: PointCloud, attributeType: Double): Double
  
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
    DecodeBufferToPointCloud: (DecoderBuffer, PointCloud) => Status,
    GetAttribute: (PointCloud, Double) => Attribute,
    GetAttributeByUniqueId: (Mesh, Double) => Attribute,
    GetAttributeDataArrayForAllPoints: (Mesh, Attribute, DataType, Double, Double) => Unit,
    GetAttributeFloatForAllPoints: (Mesh, Attribute, DracoArray) => Unit,
    GetAttributeId: (PointCloud, Double) => Double,
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
    val __obj = js.Dynamic.literal(DecodeBufferToMesh = js.Any.fromFunction2(DecodeBufferToMesh), DecodeBufferToPointCloud = js.Any.fromFunction2(DecodeBufferToPointCloud), GetAttribute = js.Any.fromFunction2(GetAttribute), GetAttributeByUniqueId = js.Any.fromFunction2(GetAttributeByUniqueId), GetAttributeDataArrayForAllPoints = js.Any.fromFunction5(GetAttributeDataArrayForAllPoints), GetAttributeFloatForAllPoints = js.Any.fromFunction3(GetAttributeFloatForAllPoints), GetAttributeId = js.Any.fromFunction2(GetAttributeId), GetAttributeInt16ForAllPoints = js.Any.fromFunction3(GetAttributeInt16ForAllPoints), GetAttributeInt32ForAllPoints = js.Any.fromFunction3(GetAttributeInt32ForAllPoints), GetAttributeInt8ForAllPoints = js.Any.fromFunction3(GetAttributeInt8ForAllPoints), GetAttributeUInt16ForAllPoints = js.Any.fromFunction3(GetAttributeUInt16ForAllPoints), GetAttributeUInt32ForAllPoints = js.Any.fromFunction3(GetAttributeUInt32ForAllPoints), GetAttributeUInt8ForAllPoints = js.Any.fromFunction3(GetAttributeUInt8ForAllPoints), GetEncodedGeometryType = js.Any.fromFunction1(GetEncodedGeometryType), GetFaceFromMesh = js.Any.fromFunction3(GetFaceFromMesh), GetTrianglesUInt16Array = js.Any.fromFunction3(GetTrianglesUInt16Array), GetTrianglesUInt32Array = js.Any.fromFunction3(GetTrianglesUInt32Array))
    __obj.asInstanceOf[Decoder]
  }
  
  extension [Self <: Decoder](x: Self) {
    
    inline def setDecodeBufferToMesh(value: (DecoderBuffer, Mesh) => Status): Self = StObject.set(x, "DecodeBufferToMesh", js.Any.fromFunction2(value))
    
    inline def setDecodeBufferToPointCloud(value: (DecoderBuffer, PointCloud) => Status): Self = StObject.set(x, "DecodeBufferToPointCloud", js.Any.fromFunction2(value))
    
    inline def setGetAttribute(value: (PointCloud, Double) => Attribute): Self = StObject.set(x, "GetAttribute", js.Any.fromFunction2(value))
    
    inline def setGetAttributeByUniqueId(value: (Mesh, Double) => Attribute): Self = StObject.set(x, "GetAttributeByUniqueId", js.Any.fromFunction2(value))
    
    inline def setGetAttributeDataArrayForAllPoints(value: (Mesh, Attribute, DataType, Double, Double) => Unit): Self = StObject.set(x, "GetAttributeDataArrayForAllPoints", js.Any.fromFunction5(value))
    
    inline def setGetAttributeFloatForAllPoints(value: (Mesh, Attribute, DracoArray) => Unit): Self = StObject.set(x, "GetAttributeFloatForAllPoints", js.Any.fromFunction3(value))
    
    inline def setGetAttributeId(value: (PointCloud, Double) => Double): Self = StObject.set(x, "GetAttributeId", js.Any.fromFunction2(value))
    
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
