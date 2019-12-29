package typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyncState with Double] = js.native
  /* 0 */ @js.native
  object Local extends TopLevel[Local with Double]
  
  /* 1 */ @js.native
  object Synced extends TopLevel[Synced with Double]
  
}

