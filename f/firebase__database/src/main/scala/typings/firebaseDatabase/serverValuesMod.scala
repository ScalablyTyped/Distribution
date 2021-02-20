package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.miscMod.Indexable
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.syncTreeMod.SyncTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverValuesMod {
  
  @JSImport("@firebase/database/dist/src/core/util/ServerValues", "generateWithValues")
  @js.native
  def generateWithValues(values: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/ServerValues", "resolveDeferredLeafValue")
  @js.native
  def resolveDeferredLeafValue(value: String, existingVal: ValueProvider, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  @JSImport("@firebase/database/dist/src/core/util/ServerValues", "resolveDeferredLeafValue")
  @js.native
  def resolveDeferredLeafValue(
    value: StringDictionary[js.Any],
    existingVal: ValueProvider,
    serverValues: StringDictionary[js.Any]
  ): String | Double | Boolean = js.native
  @JSImport("@firebase/database/dist/src/core/util/ServerValues", "resolveDeferredLeafValue")
  @js.native
  def resolveDeferredLeafValue(value: Boolean, existingVal: ValueProvider, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  @JSImport("@firebase/database/dist/src/core/util/ServerValues", "resolveDeferredLeafValue")
  @js.native
  def resolveDeferredLeafValue(value: Double, existingVal: ValueProvider, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/ServerValues", "resolveDeferredValueSnapshot")
  @js.native
  def resolveDeferredValueSnapshot(node: Node, existing: Node, serverValues: Indexable): Node = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/ServerValues", "resolveDeferredValueTree")
  @js.native
  def resolveDeferredValueTree(path: Path, node: Node, syncTree: SyncTree, serverValues: Indexable): Node = js.native
  
  @js.native
  trait ValueProvider extends StObject {
    
    def getImmediateChild(childName: String): ValueProvider = js.native
    
    def node(): Node = js.native
  }
  object ValueProvider {
    
    @scala.inline
    def apply(getImmediateChild: String => ValueProvider, node: () => Node): ValueProvider = {
      val __obj = js.Dynamic.literal(getImmediateChild = js.Any.fromFunction1(getImmediateChild), node = js.Any.fromFunction0(node))
      __obj.asInstanceOf[ValueProvider]
    }
    
    @scala.inline
    implicit class ValueProviderMutableBuilder[Self <: ValueProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetImmediateChild(value: String => ValueProvider): Self = StObject.set(x, "getImmediateChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNode(value: () => Node): Self = StObject.set(x, "node", js.Any.fromFunction0(value))
    }
  }
}
