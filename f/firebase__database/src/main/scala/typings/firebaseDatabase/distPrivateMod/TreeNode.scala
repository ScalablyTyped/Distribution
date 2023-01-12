package typings.firebaseDatabase.distPrivateMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node in a Tree.
  */
trait TreeNode[T] extends StObject {
  
  var childCount: Double
  
  var children: Record[String, TreeNode[T]]
  
  var value: js.UndefOr[T] = js.undefined
}
object TreeNode {
  
  inline def apply[T](childCount: Double, children: Record[String, TreeNode[T]]): TreeNode[T] = {
    val __obj = js.Dynamic.literal(childCount = childCount.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeNode[?], T] (val x: Self & TreeNode[T]) extends AnyVal {
    
    inline def setChildCount(value: Double): Self = StObject.set(x, "childCount", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Record[String, TreeNode[T]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
