package typings.firebaseDatabase

import typings.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.NamedNode
import typings.firebaseDatabase.distNodeEsmSrcCoreUtilSortedMapMod.SortedMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreSnapChildSetMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/snap/childSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildChildSet[K, V](childList: js.Array[NamedNode], cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double]): SortedMap[K, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildChildSet")(childList.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[SortedMap[K, V]]
  inline def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: js.Function1[/* a */ NamedNode, K]
  ): SortedMap[K, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildChildSet")(childList.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], keyFn.asInstanceOf[js.Any])).asInstanceOf[SortedMap[K, V]]
  inline def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: js.Function1[/* a */ NamedNode, K],
    mapSortFn: js.Function2[/* a */ K, /* b */ K, Double]
  ): SortedMap[K, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildChildSet")(childList.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], keyFn.asInstanceOf[js.Any], mapSortFn.asInstanceOf[js.Any])).asInstanceOf[SortedMap[K, V]]
  inline def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: Unit,
    mapSortFn: js.Function2[/* a */ K, /* b */ K, Double]
  ): SortedMap[K, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildChildSet")(childList.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any], keyFn.asInstanceOf[js.Any], mapSortFn.asInstanceOf[js.Any])).asInstanceOf[SortedMap[K, V]]
}
