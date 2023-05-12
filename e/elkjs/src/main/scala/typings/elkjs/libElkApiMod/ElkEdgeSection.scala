package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkEdgeSection
  extends StObject
     with ElkGraphElement {
  
  var bendPoints: js.UndefOr[js.Array[ElkPoint]] = js.undefined
  
  var endPoint: ElkPoint
  
  @JSName("id")
  var id_ElkEdgeSection: String
  
  var incomingSections: js.UndefOr[js.Array[String]] = js.undefined
  
  var incomingShape: js.UndefOr[String] = js.undefined
  
  var outgoingSections: js.UndefOr[js.Array[String]] = js.undefined
  
  var outgoingShape: js.UndefOr[String] = js.undefined
  
  var startPoint: ElkPoint
}
object ElkEdgeSection {
  
  inline def apply(endPoint: ElkPoint, id: String, startPoint: ElkPoint): ElkEdgeSection = {
    val __obj = js.Dynamic.literal(endPoint = endPoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startPoint = startPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElkEdgeSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkEdgeSection] (val x: Self) extends AnyVal {
    
    inline def setBendPoints(value: js.Array[ElkPoint]): Self = StObject.set(x, "bendPoints", value.asInstanceOf[js.Any])
    
    inline def setBendPointsUndefined: Self = StObject.set(x, "bendPoints", js.undefined)
    
    inline def setBendPointsVarargs(value: ElkPoint*): Self = StObject.set(x, "bendPoints", js.Array(value*))
    
    inline def setEndPoint(value: ElkPoint): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIncomingSections(value: js.Array[String]): Self = StObject.set(x, "incomingSections", value.asInstanceOf[js.Any])
    
    inline def setIncomingSectionsUndefined: Self = StObject.set(x, "incomingSections", js.undefined)
    
    inline def setIncomingSectionsVarargs(value: String*): Self = StObject.set(x, "incomingSections", js.Array(value*))
    
    inline def setIncomingShape(value: String): Self = StObject.set(x, "incomingShape", value.asInstanceOf[js.Any])
    
    inline def setIncomingShapeUndefined: Self = StObject.set(x, "incomingShape", js.undefined)
    
    inline def setOutgoingSections(value: js.Array[String]): Self = StObject.set(x, "outgoingSections", value.asInstanceOf[js.Any])
    
    inline def setOutgoingSectionsUndefined: Self = StObject.set(x, "outgoingSections", js.undefined)
    
    inline def setOutgoingSectionsVarargs(value: String*): Self = StObject.set(x, "outgoingSections", js.Array(value*))
    
    inline def setOutgoingShape(value: String): Self = StObject.set(x, "outgoingShape", value.asInstanceOf[js.Any])
    
    inline def setOutgoingShapeUndefined: Self = StObject.set(x, "outgoingShape", js.undefined)
    
    inline def setStartPoint(value: ElkPoint): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
  }
}
