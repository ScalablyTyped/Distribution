package typings.docxTemplates.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNode extends StObject {
  
  var _children: js.Array[Node]
  
  var _ifName: js.UndefOr[String] = js.undefined
  
  var _parent: js.UndefOr[Node] = js.undefined
}
object BaseNode {
  
  inline def apply(_children: js.Array[Node]): BaseNode = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
  
  extension [Self <: BaseNode](x: Self) {
    
    inline def set_children(value: js.Array[Node]): Self = StObject.set(x, "_children", value.asInstanceOf[js.Any])
    
    inline def set_childrenVarargs(value: Node*): Self = StObject.set(x, "_children", js.Array(value :_*))
    
    inline def set_ifName(value: String): Self = StObject.set(x, "_ifName", value.asInstanceOf[js.Any])
    
    inline def set_ifNameUndefined: Self = StObject.set(x, "_ifName", js.undefined)
    
    inline def set_parent(value: Node): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    inline def set_parentUndefined: Self = StObject.set(x, "_parent", js.undefined)
  }
}
