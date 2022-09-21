package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexBufferReader extends StObject {
  
  def enumGeoms(filter: Any, callback: GeometryCallback): Unit
  
  def enumGeomsForObject(dbId: Double, callback: GeometryCallback): Unit
  
  def enumGeomsForVisibleLayer(layerIdsVisible: js.Array[Double], callback: GeometryCallback): Unit
}
object VertexBufferReader {
  
  inline def apply(
    enumGeoms: (Any, GeometryCallback) => Unit,
    enumGeomsForObject: (Double, GeometryCallback) => Unit,
    enumGeomsForVisibleLayer: (js.Array[Double], GeometryCallback) => Unit
  ): VertexBufferReader = {
    val __obj = js.Dynamic.literal(enumGeoms = js.Any.fromFunction2(enumGeoms), enumGeomsForObject = js.Any.fromFunction2(enumGeomsForObject), enumGeomsForVisibleLayer = js.Any.fromFunction2(enumGeomsForVisibleLayer))
    __obj.asInstanceOf[VertexBufferReader]
  }
  
  extension [Self <: VertexBufferReader](x: Self) {
    
    inline def setEnumGeoms(value: (Any, GeometryCallback) => Unit): Self = StObject.set(x, "enumGeoms", js.Any.fromFunction2(value))
    
    inline def setEnumGeomsForObject(value: (Double, GeometryCallback) => Unit): Self = StObject.set(x, "enumGeomsForObject", js.Any.fromFunction2(value))
    
    inline def setEnumGeomsForVisibleLayer(value: (js.Array[Double], GeometryCallback) => Unit): Self = StObject.set(x, "enumGeomsForVisibleLayer", js.Any.fromFunction2(value))
  }
}
