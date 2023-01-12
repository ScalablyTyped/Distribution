package typings.firebaseDatabase

import typings.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreSparseSnapshotTreeMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/SparseSnapshotTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newSparseSnapshotTree(): SparseSnapshotTree = ^.asInstanceOf[js.Dynamic].applyDynamic("newSparseSnapshotTree")().asInstanceOf[SparseSnapshotTree]
  
  inline def sparseSnapshotTreeFind(sparseSnapshotTree: SparseSnapshotTree, path: Path): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSnapshotTreeFind")(sparseSnapshotTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def sparseSnapshotTreeForEachChild(
    sparseSnapshotTree: SparseSnapshotTree,
    func: js.Function2[/* a */ String, /* b */ SparseSnapshotTree, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSnapshotTreeForEachChild")(sparseSnapshotTree.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sparseSnapshotTreeForEachTree(
    sparseSnapshotTree: SparseSnapshotTree,
    prefixPath: Path,
    func: js.Function2[/* a */ Path, /* b */ Node, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSnapshotTreeForEachTree")(sparseSnapshotTree.asInstanceOf[js.Any], prefixPath.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sparseSnapshotTreeForget(sparseSnapshotTree: SparseSnapshotTree, path: Path): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSnapshotTreeForget")(sparseSnapshotTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sparseSnapshotTreeRemember(sparseSnapshotTree: SparseSnapshotTree, path: Path, data: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSnapshotTreeRemember")(sparseSnapshotTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait SparseSnapshotTree extends StObject {
    
    val children: Map[String, SparseSnapshotTree]
    
    var value: Node | Null
  }
  object SparseSnapshotTree {
    
    inline def apply(children: Map[String, SparseSnapshotTree]): SparseSnapshotTree = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[SparseSnapshotTree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SparseSnapshotTree] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Map[String, SparseSnapshotTree]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Node): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
}
