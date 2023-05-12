package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkExtendedEdge
  extends StObject
     with ElkEdge {
  
  var sections: js.UndefOr[js.Array[ElkEdgeSection]] = js.undefined
  
  var sources: js.Array[String]
  
  var targets: js.Array[String]
}
object ElkExtendedEdge {
  
  inline def apply(id: String, sources: js.Array[String], targets: js.Array[String]): ElkExtendedEdge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElkExtendedEdge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkExtendedEdge] (val x: Self) extends AnyVal {
    
    inline def setSections(value: js.Array[ElkEdgeSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: ElkEdgeSection*): Self = StObject.set(x, "sections", js.Array(value*))
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
