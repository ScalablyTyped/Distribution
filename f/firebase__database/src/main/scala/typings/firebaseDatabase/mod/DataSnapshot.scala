package typings.firebaseDatabase.mod

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database", "DataSnapshot")
@js.native
class DataSnapshot protected ()
  extends typings.firebaseDatabase.dataSnapshotMod.DataSnapshot {
  /**
    * @param {!Node} node_ A SnapshotNode to wrap.
    * @param {!Reference} ref_ The ref of the location this snapshot came from.
    * @param {!Index} index_ The iteration order for this snapshot
    */
  def this(node_ : Node, ref_ : typings.firebaseDatabase.referenceMod.Reference, index_ : Index) = this()
}
