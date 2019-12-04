package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreSnapChildrenNodeMod.ChildrenNode
import typings.atFirebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.atFirebaseDatabase.distSrcCoreSnapIndexesKeyIndexMod.KeyIndex
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/indexes/KeyIndex", JSImport.Namespace)
@js.native
object distSrcCoreSnapIndexesKeyIndexMod extends js.Object {
  @js.native
  class KeyIndex () extends Index {
    /**
      * @param {*} indexValue
      * @param {string} name
      * @return {!NamedNode}
      */
    def makePost(indexValue: String, name: String): NamedNode = js.native
  }
  
  val KEY_INDEX: KeyIndex = js.native
  /* static members */
  @js.native
  object KeyIndex extends js.Object {
    var __EMPTY_NODE: ChildrenNode = js.native
  }
  
}

