package typings.atFirebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.atFirebaseDatabase.distSrcCoreSparseSnapshotTreeMod.SparseSnapshotTree
import typings.atFirebaseDatabase.distSrcCoreSyncTreeMod.SyncTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/ServerValues", JSImport.Namespace)
@js.native
object distSrcCoreUtilServerValuesMod extends js.Object {
  def generateWithValues(values: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def resolveDeferredValue(value: String, existing: Node, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  def resolveDeferredValue(value: StringDictionary[js.Any], existing: Node, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  def resolveDeferredValue(value: Boolean, existing: Node, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  def resolveDeferredValue(value: Double, existing: Node, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  def resolveDeferredValueSnapshot(node: Node, existing: Node, serverValues: js.Object): Node = js.native
  def resolveDeferredValueTree(tree: SparseSnapshotTree, syncTree: SyncTree, serverValues: js.Object): SparseSnapshotTree = js.native
}

