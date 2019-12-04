package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.NamedNode
import typings.atFirebaseDatabase.distSrcCoreUtilSortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/childSet", JSImport.Namespace)
@js.native
object distSrcCoreSnapChildSetMod extends js.Object {
  def buildChildSet[K, V](childList: js.Array[NamedNode], cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double]): SortedMap[K, V] = js.native
  def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: js.Function1[/* a */ NamedNode, K]
  ): SortedMap[K, V] = js.native
  def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: js.Function1[/* a */ NamedNode, K],
    mapSortFn: js.Function2[/* a */ K, /* b */ K, Double]
  ): SortedMap[K, V] = js.native
}

