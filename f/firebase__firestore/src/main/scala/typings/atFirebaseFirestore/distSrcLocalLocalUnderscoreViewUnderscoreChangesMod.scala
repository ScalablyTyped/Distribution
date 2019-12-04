package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ViewSnapshot
import typings.atFirebaseFirestore.distSrcLocalLocalUnderscoreViewUnderscoreChangesMod.LocalViewChanges
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/local_view_changes", JSImport.Namespace)
@js.native
object distSrcLocalLocalUnderscoreViewUnderscoreChangesMod extends js.Object {
  @js.native
  class LocalViewChanges protected () extends js.Object {
    def this(targetId: TargetId, fromCache: Boolean, addedKeys: DocumentKeySet, removedKeys: DocumentKeySet) = this()
    val addedKeys: DocumentKeySet = js.native
    val fromCache: Boolean = js.native
    val removedKeys: DocumentKeySet = js.native
    val targetId: TargetId = js.native
  }
  
  /* static members */
  @js.native
  object LocalViewChanges extends js.Object {
    def fromSnapshot(targetId: TargetId, viewSnapshot: ViewSnapshot): LocalViewChanges = js.native
  }
  
}

