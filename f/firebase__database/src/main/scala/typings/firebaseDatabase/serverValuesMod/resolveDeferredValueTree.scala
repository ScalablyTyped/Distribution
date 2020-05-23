package typings.firebaseDatabase.serverValuesMod

import typings.firebaseDatabase.miscMod.Indexable
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.syncTreeMod.SyncTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/ServerValues", "resolveDeferredValueTree")
@js.native
object resolveDeferredValueTree extends js.Object {
  def apply(path: Path, node: Node, syncTree: SyncTree, serverValues: Indexable): Node = js.native
}

