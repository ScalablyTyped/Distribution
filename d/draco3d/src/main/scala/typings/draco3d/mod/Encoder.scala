package typings.draco3d.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
