package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjCustomContent extends StObject {
  
  var domNodes: js.Array[Any]
  
  var html: String
}
object ObjCustomContent {
  
  inline def apply(domNodes: js.Array[Any], html: String): ObjCustomContent = {
    val __obj = js.Dynamic.literal(domNodes = domNodes.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjCustomContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjCustomContent] (val x: Self) extends AnyVal {
    
    inline def setDomNodes(value: js.Array[Any]): Self = StObject.set(x, "domNodes", value.asInstanceOf[js.Any])
    
    inline def setDomNodesVarargs(value: Any*): Self = StObject.set(x, "domNodes", js.Array(value*))
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
