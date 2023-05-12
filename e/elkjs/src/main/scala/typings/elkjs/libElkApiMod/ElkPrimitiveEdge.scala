package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkPrimitiveEdge
  extends StObject
     with ElkEdge {
  
  var bendPoints: js.UndefOr[js.Array[ElkPoint]] = js.undefined
  
  var source: String
  
  var sourcePoint: js.UndefOr[ElkPoint] = js.undefined
  
  var sourcePort: js.UndefOr[String] = js.undefined
  
  var target: String
  
  var targetPoint: js.UndefOr[ElkPoint] = js.undefined
  
  var targetPort: js.UndefOr[String] = js.undefined
}
object ElkPrimitiveEdge {
  
  inline def apply(id: String, source: String, target: String): ElkPrimitiveEdge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElkPrimitiveEdge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkPrimitiveEdge] (val x: Self) extends AnyVal {
    
    inline def setBendPoints(value: js.Array[ElkPoint]): Self = StObject.set(x, "bendPoints", value.asInstanceOf[js.Any])
    
    inline def setBendPointsUndefined: Self = StObject.set(x, "bendPoints", js.undefined)
    
    inline def setBendPointsVarargs(value: ElkPoint*): Self = StObject.set(x, "bendPoints", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourcePoint(value: ElkPoint): Self = StObject.set(x, "sourcePoint", value.asInstanceOf[js.Any])
    
    inline def setSourcePointUndefined: Self = StObject.set(x, "sourcePoint", js.undefined)
    
    inline def setSourcePort(value: String): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    inline def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetPoint(value: ElkPoint): Self = StObject.set(x, "targetPoint", value.asInstanceOf[js.Any])
    
    inline def setTargetPointUndefined: Self = StObject.set(x, "targetPoint", js.undefined)
    
    inline def setTargetPort(value: String): Self = StObject.set(x, "targetPort", value.asInstanceOf[js.Any])
    
    inline def setTargetPortUndefined: Self = StObject.set(x, "targetPort", js.undefined)
  }
}
