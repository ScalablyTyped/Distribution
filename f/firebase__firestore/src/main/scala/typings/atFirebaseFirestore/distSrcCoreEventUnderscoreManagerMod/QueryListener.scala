package typings.atFirebaseFirestore.distSrcCoreEventUnderscoreManagerMod

import typings.atFirebaseFirestore.distSrcCoreQueryMod.Query
import typings.atFirebaseFirestore.distSrcCoreTypesMod.OnlineState
import typings.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ViewSnapshot
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/event_manager", "QueryListener")
@js.native
class QueryListener protected () extends js.Object {
  def this(query: Query, queryObserver: Observer[ViewSnapshot]) = this()
  def this(query: Query, queryObserver: Observer[ViewSnapshot], options: ListenOptions) = this()
  var onlineState: js.Any = js.native
  var options: js.Any = js.native
  val query: Query = js.native
  var queryObserver: js.Any = js.native
  var raiseInitialEvent: js.Any = js.native
  /**
    * Initial snapshots (e.g. from cache) may not be propagated to the wrapped
    * observer. This flag is set to true once we've actually raised an event.
    */
  var raisedInitialEvent: js.Any = js.native
  var shouldRaiseEvent: js.Any = js.native
  var shouldRaiseInitialEvent: js.Any = js.native
  var snap: js.Any = js.native
  /** Returns whether a snapshot was raised. */
  def applyOnlineStateChange(onlineState: OnlineState): Boolean = js.native
  def onError(error: Error): Unit = js.native
  /**
    * Applies the new ViewSnapshot to this listener, raising a user-facing event
    * if applicable (depending on what changed, whether the user has opted into
    * metadata-only changes, etc.). Returns true if a user-facing event was
    * indeed raised.
    */
  def onViewSnapshot(snap: ViewSnapshot): Boolean = js.native
}

