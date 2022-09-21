package typings.firebaseFirestore.testUnitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.firebaseFirestoreBooleans.`false`
import typings.firebaseFirestore.firebaseFirestoreBooleans.`true`
import typings.firebaseFirestore.firestoreSrcApiIndexConfigurationMod.IndexConfiguration
import typings.firebaseFirestore.firestoreSrcCoreTypesMod.TargetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecStep extends StObject {
  
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
  
  /**
    * Optional expected number of waitForPendingWrite callbacks to be called.
    * If not provided, the test will fail if the step causes events to be raised.
    */
  var expectedWaitForPendingWritesEvents: js.UndefOr[Double] = js.undefined
  
  /** Fails the listed database actions. */
  var failDatabase: js.UndefOr[`false` | js.Array[PersistenceAction]] = js.undefined
  
  /** Fail a write */
  var failWrite: js.UndefOr[SpecWriteFailure] = js.undefined
  
  /** Loads a bundle from a string. */
  var loadBundle: js.UndefOr[String] = js.undefined
  
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
  
  /**
    * Set Index Configuration
    */
  var setIndexConfiguration: js.UndefOr[String | IndexConfiguration] = js.undefined
  
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
  
  /** Add a new `waitForPendingWrites` listener. */
  var waitForPendingWrites: js.UndefOr[`true`] = js.undefined
  
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
  
  inline def apply(): SpecStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecStep]
  }
  
  extension [Self <: SpecStep](x: Self) {
    
    inline def setAddSnapshotsInSyncListener(value: `true`): Self = StObject.set(x, "addSnapshotsInSyncListener", value.asInstanceOf[js.Any])
    
    inline def setAddSnapshotsInSyncListenerUndefined: Self = StObject.set(x, "addSnapshotsInSyncListener", js.undefined)
    
    inline def setApplyClientState(value: SpecClientState): Self = StObject.set(x, "applyClientState", value.asInstanceOf[js.Any])
    
    inline def setApplyClientStateUndefined: Self = StObject.set(x, "applyClientState", js.undefined)
    
    inline def setChangeUser(value: String): Self = StObject.set(x, "changeUser", value.asInstanceOf[js.Any])
    
    inline def setChangeUserNull: Self = StObject.set(x, "changeUser", null)
    
    inline def setChangeUserUndefined: Self = StObject.set(x, "changeUser", js.undefined)
    
    inline def setClearPersistence(value: `true`): Self = StObject.set(x, "clearPersistence", value.asInstanceOf[js.Any])
    
    inline def setClearPersistenceUndefined: Self = StObject.set(x, "clearPersistence", js.undefined)
    
    inline def setClientIndex(value: Double): Self = StObject.set(x, "clientIndex", value.asInstanceOf[js.Any])
    
    inline def setClientIndexUndefined: Self = StObject.set(x, "clientIndex", js.undefined)
    
    inline def setDrainQueue(value: `true`): Self = StObject.set(x, "drainQueue", value.asInstanceOf[js.Any])
    
    inline def setDrainQueueUndefined: Self = StObject.set(x, "drainQueue", js.undefined)
    
    inline def setEnableNetwork(value: Boolean): Self = StObject.set(x, "enableNetwork", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkUndefined: Self = StObject.set(x, "enableNetwork", js.undefined)
    
    inline def setExpectedSnapshotEvents(value: js.Array[SnapshotEvent]): Self = StObject.set(x, "expectedSnapshotEvents", value.asInstanceOf[js.Any])
    
    inline def setExpectedSnapshotEventsUndefined: Self = StObject.set(x, "expectedSnapshotEvents", js.undefined)
    
    inline def setExpectedSnapshotEventsVarargs(value: SnapshotEvent*): Self = StObject.set(x, "expectedSnapshotEvents", js.Array(value*))
    
    inline def setExpectedSnapshotsInSyncEvents(value: Double): Self = StObject.set(x, "expectedSnapshotsInSyncEvents", value.asInstanceOf[js.Any])
    
    inline def setExpectedSnapshotsInSyncEventsUndefined: Self = StObject.set(x, "expectedSnapshotsInSyncEvents", js.undefined)
    
    inline def setExpectedState(value: StateExpectation): Self = StObject.set(x, "expectedState", value.asInstanceOf[js.Any])
    
    inline def setExpectedStateUndefined: Self = StObject.set(x, "expectedState", js.undefined)
    
    inline def setExpectedWaitForPendingWritesEvents(value: Double): Self = StObject.set(x, "expectedWaitForPendingWritesEvents", value.asInstanceOf[js.Any])
    
    inline def setExpectedWaitForPendingWritesEventsUndefined: Self = StObject.set(x, "expectedWaitForPendingWritesEvents", js.undefined)
    
    inline def setFailDatabase(value: `false` | js.Array[PersistenceAction]): Self = StObject.set(x, "failDatabase", value.asInstanceOf[js.Any])
    
    inline def setFailDatabaseUndefined: Self = StObject.set(x, "failDatabase", js.undefined)
    
    inline def setFailDatabaseVarargs(value: PersistenceAction*): Self = StObject.set(x, "failDatabase", js.Array(value*))
    
    inline def setFailWrite(value: SpecWriteFailure): Self = StObject.set(x, "failWrite", value.asInstanceOf[js.Any])
    
    inline def setFailWriteUndefined: Self = StObject.set(x, "failWrite", js.undefined)
    
    inline def setLoadBundle(value: String): Self = StObject.set(x, "loadBundle", value.asInstanceOf[js.Any])
    
    inline def setLoadBundleUndefined: Self = StObject.set(x, "loadBundle", js.undefined)
    
    inline def setRemoveSnapshotsInSyncListener(value: `true`): Self = StObject.set(x, "removeSnapshotsInSyncListener", value.asInstanceOf[js.Any])
    
    inline def setRemoveSnapshotsInSyncListenerUndefined: Self = StObject.set(x, "removeSnapshotsInSyncListener", js.undefined)
    
    inline def setRestart(value: `true`): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    
    inline def setRunTimer(value: String): Self = StObject.set(x, "runTimer", value.asInstanceOf[js.Any])
    
    inline def setRunTimerUndefined: Self = StObject.set(x, "runTimer", js.undefined)
    
    inline def setSetIndexConfiguration(value: String | IndexConfiguration): Self = StObject.set(x, "setIndexConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSetIndexConfigurationUndefined: Self = StObject.set(x, "setIndexConfiguration", js.undefined)
    
    inline def setShutdown(value: `true`): Self = StObject.set(x, "shutdown", value.asInstanceOf[js.Any])
    
    inline def setShutdownUndefined: Self = StObject.set(x, "shutdown", js.undefined)
    
    inline def setUserDelete(value: SpecUserDelete): Self = StObject.set(x, "userDelete", value.asInstanceOf[js.Any])
    
    inline def setUserDeleteUndefined: Self = StObject.set(x, "userDelete", js.undefined)
    
    inline def setUserListen(value: SpecUserListen): Self = StObject.set(x, "userListen", value.asInstanceOf[js.Any])
    
    inline def setUserListenUndefined: Self = StObject.set(x, "userListen", js.undefined)
    
    inline def setUserPatch(value: SpecUserPatch): Self = StObject.set(x, "userPatch", value.asInstanceOf[js.Any])
    
    inline def setUserPatchUndefined: Self = StObject.set(x, "userPatch", js.undefined)
    
    inline def setUserSet(value: SpecUserSet): Self = StObject.set(x, "userSet", value.asInstanceOf[js.Any])
    
    inline def setUserSetUndefined: Self = StObject.set(x, "userSet", js.undefined)
    
    inline def setUserUnlisten(value: SpecUserUnlisten): Self = StObject.set(x, "userUnlisten", value.asInstanceOf[js.Any])
    
    inline def setUserUnlistenUndefined: Self = StObject.set(x, "userUnlisten", js.undefined)
    
    inline def setWaitForPendingWrites(value: `true`): Self = StObject.set(x, "waitForPendingWrites", value.asInstanceOf[js.Any])
    
    inline def setWaitForPendingWritesUndefined: Self = StObject.set(x, "waitForPendingWrites", js.undefined)
    
    inline def setWatchAck(value: SpecWatchAck): Self = StObject.set(x, "watchAck", value.asInstanceOf[js.Any])
    
    inline def setWatchAckUndefined: Self = StObject.set(x, "watchAck", js.undefined)
    
    inline def setWatchAckVarargs(value: TargetId*): Self = StObject.set(x, "watchAck", js.Array(value*))
    
    inline def setWatchCurrent(value: SpecWatchCurrent): Self = StObject.set(x, "watchCurrent", value.asInstanceOf[js.Any])
    
    inline def setWatchCurrentUndefined: Self = StObject.set(x, "watchCurrent", js.undefined)
    
    inline def setWatchEntity(value: SpecWatchEntity): Self = StObject.set(x, "watchEntity", value.asInstanceOf[js.Any])
    
    inline def setWatchEntityUndefined: Self = StObject.set(x, "watchEntity", js.undefined)
    
    inline def setWatchFilter(value: SpecWatchFilter): Self = StObject.set(x, "watchFilter", value.asInstanceOf[js.Any])
    
    inline def setWatchFilterUndefined: Self = StObject.set(x, "watchFilter", js.undefined)
    
    inline def setWatchRemove(value: SpecWatchRemove): Self = StObject.set(x, "watchRemove", value.asInstanceOf[js.Any])
    
    inline def setWatchRemoveUndefined: Self = StObject.set(x, "watchRemove", js.undefined)
    
    inline def setWatchReset(value: SpecWatchReset): Self = StObject.set(x, "watchReset", value.asInstanceOf[js.Any])
    
    inline def setWatchResetUndefined: Self = StObject.set(x, "watchReset", js.undefined)
    
    inline def setWatchResetVarargs(value: TargetId*): Self = StObject.set(x, "watchReset", js.Array(value*))
    
    inline def setWatchSnapshot(value: SpecWatchSnapshot): Self = StObject.set(x, "watchSnapshot", value.asInstanceOf[js.Any])
    
    inline def setWatchSnapshotUndefined: Self = StObject.set(x, "watchSnapshot", js.undefined)
    
    inline def setWatchStreamClose(value: SpecWatchStreamClose): Self = StObject.set(x, "watchStreamClose", value.asInstanceOf[js.Any])
    
    inline def setWatchStreamCloseUndefined: Self = StObject.set(x, "watchStreamClose", js.undefined)
    
    inline def setWriteAck(value: SpecWriteAck): Self = StObject.set(x, "writeAck", value.asInstanceOf[js.Any])
    
    inline def setWriteAckUndefined: Self = StObject.set(x, "writeAck", js.undefined)
  }
}
