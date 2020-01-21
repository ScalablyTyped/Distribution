package typings.firebaseFirestore.specsSpecTestRunnerMod

import typings.firebaseFirestore.firebaseFirestoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecStep extends js.Object {
  /** Listens to a SnapshotsInSync event. */
  var addSnapshotsInSyncListener: js.UndefOr[`true`] = js.undefined
  /** Changes the metadata state of a client instance. */
  var applyClientState: js.UndefOr[SpecClientState] = js.undefined
  /** Change to a new active user (specified by uid or null for anonymous). */
  var changeUser: js.UndefOr[String | Null] = js.undefined
  /** Clears the persistent storage in IndexedDB. */
  var clearPersistence: js.UndefOr[`true`] = js.undefined
  /** The index of the local client for multi-client spec tests. */
  var clientIndex: js.UndefOr[Double] = js.undefined
  /**
    * Process all events currently enqueued in the AsyncQueue.
    */
  var drainQueue: js.UndefOr[`true`] = js.undefined
  /** Enable or disable RemoteStore's network connection. */
  var enableNetwork: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional list of expected events.
    * If not provided, the test will fail if the step causes events to be raised.
    */
  var expectedSnapshotEvents: js.UndefOr[js.Array[SnapshotEvent]] = js.undefined
  /**
    * Optional expected number of onSnapshotsInSync callbacks to be called.
    * If not provided, the test will fail if the step causes events to be raised.
    */
  var expectedSnapshotsInSyncEvents: js.UndefOr[Double] = js.undefined
  /**
    * Optional dictionary of expected states.
    */
  var expectedState: js.UndefOr[StateExpectation] = js.undefined
  /** Fail a write */
  var failWrite: js.UndefOr[SpecWriteFailure] = js.undefined
  /** Unlistens from a SnapshotsInSync event. */
  var removeSnapshotsInSyncListener: js.UndefOr[`true`] = js.undefined
  /**
    * Restarts the SyncEngine from scratch, except re-uses persistence and auth
    * components. This allows you to queue writes, get documents into cache,
    * etc. and then simulate an app restart.
    */
  var restart: js.UndefOr[`true`] = js.undefined
  /**
    * Run a queued timer task (without waiting for the delay to expire). See
    * TimerId enum definition for possible values).
    */
  var runTimer: js.UndefOr[String] = js.undefined
  /** Shut down the client and close it network connection. */
  var shutdown: js.UndefOr[`true`] = js.undefined
  /** Perform a user initiated delete */
  var userDelete: js.UndefOr[SpecUserDelete] = js.undefined
  /** Listen to a new query (must be unique) */
  var userListen: js.UndefOr[SpecUserListen] = js.undefined
  /** Perform a user initiated patch */
  var userPatch: js.UndefOr[SpecUserPatch] = js.undefined
  /** Perform a user initiated set */
  var userSet: js.UndefOr[SpecUserSet] = js.undefined
  /** Unlisten from a query (must be listened to) */
  var userUnlisten: js.UndefOr[SpecUserUnlisten] = js.undefined
  /** Ack for a query in the watch stream */
  var watchAck: js.UndefOr[SpecWatchAck] = js.undefined
  /** Marks the query results as current */
  var watchCurrent: js.UndefOr[SpecWatchCurrent] = js.undefined
  /** Document update in the watch stream */
  var watchEntity: js.UndefOr[SpecWatchEntity] = js.undefined
  /** Existence filter in the watch stream */
  var watchFilter: js.UndefOr[SpecWatchFilter] = js.undefined
  /** Ack for remove or rejection of a query in the watch stream */
  var watchRemove: js.UndefOr[SpecWatchRemove] = js.undefined
  /** Reset the results of a query */
  var watchReset: js.UndefOr[SpecWatchReset] = js.undefined
  /** Snapshot ("NO_CHANGE") event in the watch stream. */
  var watchSnapshot: js.UndefOr[SpecWatchSnapshot] = js.undefined
  /** A step that the watch stream restarts. */
  var watchStreamClose: js.UndefOr[SpecWatchStreamClose] = js.undefined
  /** Ack the last write */
  var writeAck: js.UndefOr[SpecWriteAck] = js.undefined
}

object SpecStep {
  @scala.inline
  def apply(
    addSnapshotsInSyncListener: `true` = null,
    applyClientState: SpecClientState = null,
    changeUser: String = null,
    clearPersistence: `true` = null,
    clientIndex: Int | Double = null,
    drainQueue: `true` = null,
    enableNetwork: js.UndefOr[Boolean] = js.undefined,
    expectedSnapshotEvents: js.Array[SnapshotEvent] = null,
    expectedSnapshotsInSyncEvents: Int | Double = null,
    expectedState: StateExpectation = null,
    failWrite: SpecWriteFailure = null,
    removeSnapshotsInSyncListener: `true` = null,
    restart: `true` = null,
    runTimer: String = null,
    shutdown: `true` = null,
    userDelete: SpecUserDelete = null,
    userListen: SpecUserListen = null,
    userPatch: SpecUserPatch = null,
    userSet: SpecUserSet = null,
    userUnlisten: SpecUserUnlisten = null,
    watchAck: SpecWatchAck = null,
    watchCurrent: SpecWatchCurrent = null,
    watchEntity: SpecWatchEntity = null,
    watchFilter: SpecWatchFilter = null,
    watchRemove: SpecWatchRemove = null,
    watchReset: SpecWatchReset = null,
    watchSnapshot: SpecWatchSnapshot = null,
    watchStreamClose: SpecWatchStreamClose = null,
    writeAck: SpecWriteAck = null
  ): SpecStep = {
    val __obj = js.Dynamic.literal()
    if (addSnapshotsInSyncListener != null) __obj.updateDynamic("addSnapshotsInSyncListener")(addSnapshotsInSyncListener.asInstanceOf[js.Any])
    if (applyClientState != null) __obj.updateDynamic("applyClientState")(applyClientState.asInstanceOf[js.Any])
    if (changeUser != null) __obj.updateDynamic("changeUser")(changeUser.asInstanceOf[js.Any])
    if (clearPersistence != null) __obj.updateDynamic("clearPersistence")(clearPersistence.asInstanceOf[js.Any])
    if (clientIndex != null) __obj.updateDynamic("clientIndex")(clientIndex.asInstanceOf[js.Any])
    if (drainQueue != null) __obj.updateDynamic("drainQueue")(drainQueue.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNetwork)) __obj.updateDynamic("enableNetwork")(enableNetwork.asInstanceOf[js.Any])
    if (expectedSnapshotEvents != null) __obj.updateDynamic("expectedSnapshotEvents")(expectedSnapshotEvents.asInstanceOf[js.Any])
    if (expectedSnapshotsInSyncEvents != null) __obj.updateDynamic("expectedSnapshotsInSyncEvents")(expectedSnapshotsInSyncEvents.asInstanceOf[js.Any])
    if (expectedState != null) __obj.updateDynamic("expectedState")(expectedState.asInstanceOf[js.Any])
    if (failWrite != null) __obj.updateDynamic("failWrite")(failWrite.asInstanceOf[js.Any])
    if (removeSnapshotsInSyncListener != null) __obj.updateDynamic("removeSnapshotsInSyncListener")(removeSnapshotsInSyncListener.asInstanceOf[js.Any])
    if (restart != null) __obj.updateDynamic("restart")(restart.asInstanceOf[js.Any])
    if (runTimer != null) __obj.updateDynamic("runTimer")(runTimer.asInstanceOf[js.Any])
    if (shutdown != null) __obj.updateDynamic("shutdown")(shutdown.asInstanceOf[js.Any])
    if (userDelete != null) __obj.updateDynamic("userDelete")(userDelete.asInstanceOf[js.Any])
    if (userListen != null) __obj.updateDynamic("userListen")(userListen.asInstanceOf[js.Any])
    if (userPatch != null) __obj.updateDynamic("userPatch")(userPatch.asInstanceOf[js.Any])
    if (userSet != null) __obj.updateDynamic("userSet")(userSet.asInstanceOf[js.Any])
    if (userUnlisten != null) __obj.updateDynamic("userUnlisten")(userUnlisten.asInstanceOf[js.Any])
    if (watchAck != null) __obj.updateDynamic("watchAck")(watchAck.asInstanceOf[js.Any])
    if (watchCurrent != null) __obj.updateDynamic("watchCurrent")(watchCurrent.asInstanceOf[js.Any])
    if (watchEntity != null) __obj.updateDynamic("watchEntity")(watchEntity.asInstanceOf[js.Any])
    if (watchFilter != null) __obj.updateDynamic("watchFilter")(watchFilter.asInstanceOf[js.Any])
    if (watchRemove != null) __obj.updateDynamic("watchRemove")(watchRemove.asInstanceOf[js.Any])
    if (watchReset != null) __obj.updateDynamic("watchReset")(watchReset.asInstanceOf[js.Any])
    if (watchSnapshot != null) __obj.updateDynamic("watchSnapshot")(watchSnapshot.asInstanceOf[js.Any])
    if (watchStreamClose != null) __obj.updateDynamic("watchStreamClose")(watchStreamClose.asInstanceOf[js.Any])
    if (writeAck != null) __obj.updateDynamic("writeAck")(writeAck.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecStep]
  }
}

