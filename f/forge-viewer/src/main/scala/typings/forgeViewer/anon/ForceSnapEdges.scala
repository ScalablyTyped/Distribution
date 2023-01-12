package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceSnapEdges extends StObject {
  
  var forceSnapEdges: js.UndefOr[Boolean] = js.undefined
  
  var forceSnapVertices: js.UndefOr[Boolean] = js.undefined
  
  var markupMode: js.UndefOr[Boolean] = js.undefined
  
  var renderSnappedGeometry: js.UndefOr[Boolean] = js.undefined
  
  var renderSnappedTopology: js.UndefOr[Boolean] = js.undefined
  
  var toolName: js.UndefOr[String] = js.undefined
}
object ForceSnapEdges {
  
  inline def apply(): ForceSnapEdges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceSnapEdges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForceSnapEdges] (val x: Self) extends AnyVal {
    
    inline def setForceSnapEdges(value: Boolean): Self = StObject.set(x, "forceSnapEdges", value.asInstanceOf[js.Any])
    
    inline def setForceSnapEdgesUndefined: Self = StObject.set(x, "forceSnapEdges", js.undefined)
    
    inline def setForceSnapVertices(value: Boolean): Self = StObject.set(x, "forceSnapVertices", value.asInstanceOf[js.Any])
    
    inline def setForceSnapVerticesUndefined: Self = StObject.set(x, "forceSnapVertices", js.undefined)
    
    inline def setMarkupMode(value: Boolean): Self = StObject.set(x, "markupMode", value.asInstanceOf[js.Any])
    
    inline def setMarkupModeUndefined: Self = StObject.set(x, "markupMode", js.undefined)
    
    inline def setRenderSnappedGeometry(value: Boolean): Self = StObject.set(x, "renderSnappedGeometry", value.asInstanceOf[js.Any])
    
    inline def setRenderSnappedGeometryUndefined: Self = StObject.set(x, "renderSnappedGeometry", js.undefined)
    
    inline def setRenderSnappedTopology(value: Boolean): Self = StObject.set(x, "renderSnappedTopology", value.asInstanceOf[js.Any])
    
    inline def setRenderSnappedTopologyUndefined: Self = StObject.set(x, "renderSnappedTopology", js.undefined)
    
    inline def setToolName(value: String): Self = StObject.set(x, "toolName", value.asInstanceOf[js.Any])
    
    inline def setToolNameUndefined: Self = StObject.set(x, "toolName", js.undefined)
  }
}
