package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A light-weight tree, traversable by path.  Nodes can have both values and children.
  * Nodes are not enumerated (by forEachChild) unless they have a value or non-empty
  * children.
  */
trait Tree[T] extends StObject {
  
  val name: String
  
  var node: TreeNode[T]
  
  val parent: Tree[T] | Null
}
object Tree {
  
  inline def apply[T](name: String, node: TreeNode[T]): Tree[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parent = null)
    __obj.asInstanceOf[Tree[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tree[?], T] (val x: Self & Tree[T]) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode(value: TreeNode[T]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Tree[T]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
  }
}
