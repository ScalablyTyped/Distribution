package typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyncState extends js.Object

@JSImport("@firebase/firestore/dist/src/core/view_snapshot", "SyncState")
@js.native
object SyncState extends js.Object {
  @js.native
  sealed trait Local extends SyncState
  
  @js.native
  sealed trait Synced extends SyncState
  
  /* 0 */ val Local: typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.SyncState.Local with Double = js.native
  /* 1 */ val Synced: typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.SyncState.Synced with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyncState with Double] = js.native
}

