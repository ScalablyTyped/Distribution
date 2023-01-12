package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distSrcCoreSyncTreeMod.SyncTree
import typings.firebaseDatabase.distSrcCoreUtilMiscMod.Indexable
import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreUtilServerValuesMod {
  
  @JSImport("@firebase/database/dist/src/core/util/ServerValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateWithValues(values: StringDictionary[Any]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateWithValues")(values.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def resolveDeferredLeafValue(value: String, existingVal: ValueProvider, serverValues: StringDictionary[Any]): String | Double | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDeferredLeafValue")(value.asInstanceOf[js.Any], existingVal.asInstanceOf[js.Any], serverValues.asInstanceOf[js.Any])).asInstanceOf[String | Double | Boolean]
  inline def resolveDeferredLeafValue(value: StringDictionary[Any], existingVal: ValueProvider, serverValues: StringDictionary[Any]): String | Double | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDeferredLeafValue")(value.asInstanceOf[js.Any], existingVal.asInstanceOf[js.Any], serverValues.asInstanceOf[js.Any])).asInstanceOf[String | Double | Boolean]
  inline def resolveDeferredLeafValue(value: Boolean, existingVal: ValueProvider, serverValues: StringDictionary[Any]): String | Double | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDeferredLeafValue")(value.asInstanceOf[js.Any], existingVal.asInstanceOf[js.Any], serverValues.asInstanceOf[js.Any])).asInstanceOf[String | Double | Boolean]
  inline def resolveDeferredLeafValue(value: Double, existingVal: ValueProvider, serverValues: StringDictionary[Any]): String | Double | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDeferredLeafValue")(value.asInstanceOf[js.Any], existingVal.asInstanceOf[js.Any], serverValues.asInstanceOf[js.Any])).asInstanceOf[String | Double | Boolean]
  
  inline def resolveDeferredValueSnapshot(node: Node, existing: Node, serverValues: Indexable): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDeferredValueSnapshot")(node.asInstanceOf[js.Any], existing.asInstanceOf[js.Any], serverValues.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def resolveDeferredValueTree(path: Path, node: Node, syncTree: SyncTree, serverValues: Indexable): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDeferredValueTree")(path.asInstanceOf[js.Any], node.asInstanceOf[js.Any], syncTree.asInstanceOf[js.Any], serverValues.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  trait ValueProvider extends StObject {
    
    def getImmediateChild(childName: String): ValueProvider
    
    def node(): Node
  }
  object ValueProvider {
    
    inline def apply(getImmediateChild: String => ValueProvider, node: () => Node): ValueProvider = {
      val __obj = js.Dynamic.literal(getImmediateChild = js.Any.fromFunction1(getImmediateChild), node = js.Any.fromFunction0(node))
      __obj.asInstanceOf[ValueProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueProvider] (val x: Self) extends AnyVal {
      
      inline def setGetImmediateChild(value: String => ValueProvider): Self = StObject.set(x, "getImmediateChild", js.Any.fromFunction1(value))
      
      inline def setNode(value: () => Node): Self = StObject.set(x, "node", js.Any.fromFunction0(value))
    }
  }
}
