package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreUtilTreeMod {
  
  @JSImport("@firebase/database/dist/src/core/util/Tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/Tree", "Tree")
  @js.native
  /**
    * @param name - Optional name of the node.
    * @param parent - Optional parent node.
    * @param node - Optional node to wrap.
    */
  open class Tree[T] () extends StObject {
    def this(name: String) = this()
    def this(name: String, parent: Tree[T]) = this()
    def this(name: Unit, parent: Tree[T]) = this()
    def this(name: String, parent: Null, node: TreeNode[T]) = this()
    def this(name: String, parent: Unit, node: TreeNode[T]) = this()
    def this(name: String, parent: Tree[T], node: TreeNode[T]) = this()
    def this(name: Unit, parent: Null, node: TreeNode[T]) = this()
    def this(name: Unit, parent: Unit, node: TreeNode[T]) = this()
    def this(name: Unit, parent: Tree[T], node: TreeNode[T]) = this()
    
    val name: String = js.native
    
    var node: TreeNode[T] = js.native
    
    val parent: Tree[T] | Null = js.native
  }
  
  inline def treeForEachAncestor[T](tree: Tree[T], action: js.Function1[/* tree */ Tree[T], Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("treeForEachAncestor")(tree.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def treeForEachAncestor[T](tree: Tree[T], action: js.Function1[/* tree */ Tree[T], Any], includeSelf: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("treeForEachAncestor")(tree.asInstanceOf[js.Any], action.asInstanceOf[js.Any], includeSelf.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def treeForEachChild[T](tree: Tree[T], action: js.Function1[/* tree */ Tree[T], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treeForEachChild")(tree.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def treeForEachDescendant[T](tree: Tree[T], action: js.Function1[/* tree */ Tree[T], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treeForEachDescendant")(tree.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def treeForEachDescendant[T](tree: Tree[T], action: js.Function1[/* tree */ Tree[T], Unit], includeSelf: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treeForEachDescendant")(tree.asInstanceOf[js.Any], action.asInstanceOf[js.Any], includeSelf.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def treeForEachDescendant[T](
    tree: Tree[T],
    action: js.Function1[/* tree */ Tree[T], Unit],
    includeSelf: Boolean,
    childrenFirst: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treeForEachDescendant")(tree.asInstanceOf[js.Any], action.asInstanceOf[js.Any], includeSelf.asInstanceOf[js.Any], childrenFirst.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def treeForEachDescendant[T](
    tree: Tree[T],
    action: js.Function1[/* tree */ Tree[T], Unit],
    includeSelf: Unit,
    childrenFirst: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treeForEachDescendant")(tree.asInstanceOf[js.Any], action.asInstanceOf[js.Any], includeSelf.asInstanceOf[js.Any], childrenFirst.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def treeForEachImmediateDescendantWithValue[T](tree: Tree[T], action: js.Function1[/* tree */ Tree[T], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treeForEachImmediateDescendantWithValue")(tree.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def treeGetPath[T](tree: Tree[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("treeGetPath")(tree.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def treeGetValue[T](tree: Tree[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeGetValue")(tree.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def treeHasChildren[T](tree: Tree[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("treeHasChildren")(tree.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def treeIsEmpty[T](tree: Tree[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("treeIsEmpty")(tree.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def treeSetValue[T](tree: Tree[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("treeSetValue")(tree.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def treeSetValue[T](tree: Tree[T], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treeSetValue")(tree.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def treeSubTree[T](tree: Tree[T], pathObj: String): Tree[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeSubTree")(tree.asInstanceOf[js.Any], pathObj.asInstanceOf[js.Any])).asInstanceOf[Tree[T]]
  inline def treeSubTree[T](tree: Tree[T], pathObj: Path): Tree[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeSubTree")(tree.asInstanceOf[js.Any], pathObj.asInstanceOf[js.Any])).asInstanceOf[Tree[T]]
  
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
    
    extension [Self <: TreeNode[?], T](x: Self & TreeNode[T]) {
      
      inline def setChildCount(value: Double): Self = StObject.set(x, "childCount", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: Record[String, TreeNode[T]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
