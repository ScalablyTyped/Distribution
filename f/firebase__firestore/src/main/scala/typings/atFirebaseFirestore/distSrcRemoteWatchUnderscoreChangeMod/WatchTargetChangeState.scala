package typings.atFirebaseFirestore.distSrcRemoteWatchUnderscoreChangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WatchTargetChangeState extends js.Object

@JSImport("@firebase/firestore/dist/src/remote/watch_change", "WatchTargetChangeState")
@js.native
object WatchTargetChangeState extends js.Object {
  @js.native
  sealed trait Added extends WatchTargetChangeState
  
  @js.native
  sealed trait Current extends WatchTargetChangeState
  
  @js.native
  sealed trait NoChange extends WatchTargetChangeState
  
  @js.native
  sealed trait Removed extends WatchTargetChangeState
  
  @js.native
  sealed trait Reset extends WatchTargetChangeState
  
  /* 1 */ val Added: typings.atFirebaseFirestore.distSrcRemoteWatchUnderscoreChangeMod.WatchTargetChangeState.Added with Double = js.native
  /* 3 */ val Current: typings.atFirebaseFirestore.distSrcRemoteWatchUnderscoreChangeMod.WatchTargetChangeState.Current with Double = js.native
  /* 0 */ val NoChange: typings.atFirebaseFirestore.distSrcRemoteWatchUnderscoreChangeMod.WatchTargetChangeState.NoChange with Double = js.native
  /* 2 */ val Removed: typings.atFirebaseFirestore.distSrcRemoteWatchUnderscoreChangeMod.WatchTargetChangeState.Removed with Double = js.native
  /* 4 */ val Reset: typings.atFirebaseFirestore.distSrcRemoteWatchUnderscoreChangeMod.WatchTargetChangeState.Reset with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchTargetChangeState with Double] = js.native
}

