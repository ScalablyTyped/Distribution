package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.sparseSnapshotTreeMod.SparseSnapshotTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/ServerValues", JSImport.Namespace)
@js.native
object serverValuesMod extends js.Object {
  def generateWithValues(values: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def resolveDeferredValue(value: String, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  def resolveDeferredValue(value: StringDictionary[js.Any], serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  def resolveDeferredValue(value: Boolean, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  def resolveDeferredValue(value: Double, serverValues: StringDictionary[js.Any]): String | Double | Boolean = js.native
  def resolveDeferredValueSnapshot(node: Node, serverValues: js.Object): Node = js.native
  def resolveDeferredValueTree(tree: SparseSnapshotTree, serverValues: js.Object): SparseSnapshotTree = js.native
}

