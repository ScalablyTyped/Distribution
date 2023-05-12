package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Oldest acceptable age in milliseconds for client metadata before the client
  * is considered inactive and its associated data is garbage collected.
  */
/**
  * An IndexedDB-backed instance of Persistence. Data is stored persistently
  * across sessions.
  *
  * On Web only, the Firestore SDKs support shared access to its persistence
  * layer. This allows multiple browser tabs to read and write to IndexedDb and
  * to synchronize state even without network connectivity. Shared access is
  * currently optional and not enabled unless all clients invoke
  * `enablePersistence()` with `{synchronizeTabs:true}`.
  *
  * In multi-tab mode, if multiple clients are active at the same time, the SDK
  * will designate one client as the “primary client”. An effort is made to pick
  * a visible, network-connected and active client, and this client is
  * responsible for letting other clients know about its presence. The primary
  * client writes a unique client-generated identifier (the client ID) to
  * IndexedDb’s “owner” store every 4 seconds. If the primary client fails to
  * update this entry, another client can acquire the lease and take over as
  * primary.
  *
  * Some persistence operations in the SDK are designated as primary-client only
  * operations. This includes the acknowledgment of mutations and all updates of
  * remote documents. The effects of these operations are written to persistence
  * and then broadcast to other tabs via LocalStorage (see
  * `WebStorageSharedClientState`), which then refresh their state from
  * persistence.
  *
  * Similarly, the primary client listens to notifications sent by secondary
  * clients to discover persistence changes written by secondary clients, such as
  * the addition of new mutations and query targets.
  *
  * If multi-tab is not enabled and another tab already obtained the primary
  * lease, IndexedDbPersistence enters a failed state and all subsequent
  * operations will automatically fail.
  *
  * Additionally, there is an optimization so that when a tab is closed, the
  * primary lease is released immediately (this is especially important to make
  * sure that a refreshed tab is able to immediately re-acquire the primary
  * lease). Unfortunately, IndexedDB cannot be reliably used in window.unload
  * since it is an asynchronous API. So in addition to attempting to give up the
  * lease, the leaseholder writes its client ID to a "zombiedClient" entry in
  * LocalStorage which acts as an indicator that another tab should go ahead and
  * take the primary lease immediately regardless of the current lease timestamp.
  *
  * TODO(b/114226234): Remove `synchronizeTabs` section when multi-tab is no
  * longer optional.
  */
@js.native
trait Jo extends StObject {
  
  @JSName("$s")
  var $s: Boolean = js.native
  
  /**
    * Obtains or extends the new primary lease for the local client. This
    * method does not verify that the client is eligible for this lease.
    */ def Ai(t: Any): Any = js.native
  
  /**
    * Record client as zombied (a client that had its tab closed). Zombied
    * clients are ignored during primary tab selection.
    */ def Ci(): Unit = js.native
  
  /**
    * Returns whether a client is "zombied" based on its LocalStorage entry.
    * Clients become zombied when their tab closes without running all of the
    * cleanup logic in `shutdown()`.
    */ def Di(t: Any): Boolean = js.native
  
  /** Checks the primary lease and removes it if we are the current primary. */ def Ei(t: Any): Any = js.native
  
  var Fs: fo = js.native
  
  def Ii(t: Any): Any = js.native
  
  var Ls: Er = js.native
  
  /**
    * Returns the IDs of the clients that are currently active. If multi-tab
    * is not supported, returns an array that only contains the local client's
    * ID.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */ def Mi(): js.Promise[Any] = js.native
  
  def Ni(): Unit = js.native
  
  /**
    * Verifies that the current tab is the primary leaseholder or alternatively
    * that the leaseholder has opted into multi-tab synchronization.
    */
  def Oi(t: Any): Any = js.native
  
  var Os: t | Null = js.native
  
  /**
    * If the garbage collection threshold has passed, prunes the
    * RemoteDocumentChanges and the ClientMetadata store based on the last update
    * time of all clients.
    */ def Pi(): js.Promise[Unit] = js.native
  
  /** Checks whether `client` is the local client. */ def Ri(t: Any): Boolean = js.native
  
  def Si(t: Any): String = js.native
  
  /**
    * Evaluate the state of all active clients and determine whether the local
    * client is or can act as the holder of the primary lease. Returns whether
    * the client is eligible for the lease, but does not actually acquire it.
    * May return 'false' even if there is no active leaseholder and another
    * (foreground) client should become leaseholder instead.
    */ def Ti(t: Any): Any = js.native
  
  /**
    * Returns clients that are not zombied and have an updateTime within the
    * provided threshold.
    */ def Vi(t: Any, e: Any): Any = js.native
  
  var _i: Any = js.native
  
  /** The client metadata refresh task. */
  var ai: Any = js.native
  
  var allowTabSynchronization: Any = js.native
  
  /** Verifies that `updateTimeMs` is within `maxAgeMs`. */ def bi(t: Any, e: Any): Boolean = js.native
  
  /** Our 'visibilitychange' listener if registered. */
  var ci: js.Function0[Unit] | Null = js.native
  
  var clientId: Any = js.native
  
  var di: bt = js.native
  
  var document: Any = js.native
  
  var fi: String = js.native
  
  def getBundleCache(): Er = js.native
  
  def getDocumentOverlayCache(t: Any): vr = js.native
  
  def getIndexManager(t: Any): Jr = js.native
  
  def getMutationQueue(t: Any, e: Any): oo = js.native
  
  def getRemoteDocumentCache(): vo = js.native
  
  def getTargetCache(): fo = js.native
  
  /**
    * Attaches a window.unload handler that will synchronously write our
    * clientId to a "zombie client id" location in LocalStorage. This can be used
    * by tabs trying to acquire the primary lease to determine that the lease
    * is no longer valid even if the timestamp is recent. This is particularly
    * important for the refresh case (so the tab correctly re-acquires the
    * primary lease). LocalStorage is used for this rather than IndexedDb because
    * it is a synchronous API and so can be used reliably from  an unload
    * handler.
    */ def gi(): Unit = js.native
  
  /** The last time we garbage collected the client metadata object store. */
  var hi: Double = js.native
  
  var ii: Any = js.native
  
  var inForeground: Boolean = js.native
  
  var isPrimary: Boolean = js.native
  
  /** Removes the zombied client entry if it exists. */ def ki(): Unit = js.native
  
  /** A listener to notify on primary state changes. */
  def li(t: Any): js.Promise[Unit] = js.native
  
  def mi(): Unit = js.native
  
  var networkEnabled: Boolean = js.native
  
  var oi: Double = js.native
  
  var persistenceKey: Any = js.native
  
  /**
    * Registers a listener that gets called when the primary state of the
    * instance changes. Upon registering, this listener is invoked immediately
    * with the current primary state.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */ def pi(t: Any): Any = js.native
  
  var referenceDelegate: Eo = js.native
  
  var remoteDocumentCache: vo = js.native
  
  var ri: Any = js.native
  
  def runTransaction(t: Any, e: Any, n: Any): js.Promise[Any] = js.native
  
  var serializer: ar = js.native
  
  /**
    * Registers a listener that gets called when the database receives a
    * version change event indicating that it has deleted.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */ def setDatabaseDeletedListener(t: Any): Unit = js.native
  
  /**
    * Adjusts the current network state in the client's metadata, potentially
    * affecting the primary lease.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */ def setNetworkEnabled(t: Any): Unit = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
  
  var si: Any = js.native
  
  /**
    * Attempt to start IndexedDb persistence.
    *
    * @returns Whether persistence was enabled.
    */ def start(): js.Promise[Unit] = js.native
  
  def started: Boolean = js.native
  
  /** Our window.unload handler, if registered. */
  var ui: js.Function0[Unit] | Null = js.native
  
  def vi(t: Any): Any = js.native
  
  /**
    * Updates the client metadata in IndexedDb and attempts to either obtain or
    * extend the primary lease for the local client. Asynchronously notifies the
    * primary state listener if the client either newly obtained or released its
    * primary lease.
    */ def wi(): js.Promise[Unit] = js.native
  
  var window: Any = js.native
  
  def xi(): Unit = js.native
  
  /**
    * Schedules a recurring timer to update the client metadata and to either
    * extend or acquire the primary lease if the client is eligible.
    */ def yi(): Unit = js.native
}
