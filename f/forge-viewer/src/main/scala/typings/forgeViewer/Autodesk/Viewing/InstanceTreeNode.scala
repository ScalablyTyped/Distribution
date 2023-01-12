package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTreeNode extends StObject {
  
  var children: js.Array[InstanceTreeNode]
  
  var dbId: Double
  
  var fragments: js.Array[Double]
  
  var name: String
}
object InstanceTreeNode {
  
  inline def apply(children: js.Array[InstanceTreeNode], dbId: Double, fragments: js.Array[Double], name: String): InstanceTreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dbId = dbId.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceTreeNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceTreeNode] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[InstanceTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: InstanceTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDbId(value: Double): Self = StObject.set(x, "dbId", value.asInstanceOf[js.Any])
    
    inline def setFragments(value: js.Array[Double]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    inline def setFragmentsVarargs(value: Double*): Self = StObject.set(x, "fragments", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
