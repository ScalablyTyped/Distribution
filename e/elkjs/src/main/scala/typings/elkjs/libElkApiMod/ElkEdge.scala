package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkEdge
  extends StObject
     with ElkGraphElement {
  
  @JSName("id")
  var id_ElkEdge: String
  
  var junctionPoints: js.UndefOr[js.Array[ElkPoint]] = js.undefined
}
object ElkEdge {
  
  inline def apply(id: String): ElkEdge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElkEdge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkEdge] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJunctionPoints(value: js.Array[ElkPoint]): Self = StObject.set(x, "junctionPoints", value.asInstanceOf[js.Any])
    
    inline def setJunctionPointsUndefined: Self = StObject.set(x, "junctionPoints", js.undefined)
    
    inline def setJunctionPointsVarargs(value: ElkPoint*): Self = StObject.set(x, "junctionPoints", js.Array(value*))
  }
}
