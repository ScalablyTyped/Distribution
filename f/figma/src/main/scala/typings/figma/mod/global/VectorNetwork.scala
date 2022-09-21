package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorNetwork extends StObject {
  
  val regions: js.UndefOr[js.Array[VectorRegion]] = js.undefined
  
  val segments: js.Array[VectorSegment]
  
  val vertices: js.Array[VectorVertex]
}
object VectorNetwork {
  
  inline def apply(segments: js.Array[VectorSegment], vertices: js.Array[VectorVertex]): VectorNetwork = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorNetwork]
  }
  
  extension [Self <: VectorNetwork](x: Self) {
    
    inline def setRegions(value: js.Array[VectorRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: VectorRegion*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setSegments(value: js.Array[VectorSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: VectorSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setVertices(value: js.Array[VectorVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: VectorVertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
