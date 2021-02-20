package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorNetwork extends StObject {
  
  val regions: js.UndefOr[js.Array[VectorRegion]] = js.native
  
  val segments: js.Array[VectorSegment] = js.native
  
  val vertices: js.Array[VectorVertex] = js.native
}
object VectorNetwork {
  
  @scala.inline
  def apply(segments: js.Array[VectorSegment], vertices: js.Array[VectorVertex]): VectorNetwork = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorNetwork]
  }
  
  @scala.inline
  implicit class VectorNetworkMutableBuilder[Self <: VectorNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegions(value: js.Array[VectorRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: VectorRegion*): Self = StObject.set(x, "regions", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[VectorSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsVarargs(value: VectorSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[VectorVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: VectorVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
