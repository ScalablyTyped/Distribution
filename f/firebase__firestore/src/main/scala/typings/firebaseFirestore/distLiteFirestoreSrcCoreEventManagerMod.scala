package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.OnlineState
import typings.firebaseFirestore.distLiteFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.distLiteFirestoreSrcUtilMiscMod.EventHandler
import typings.firebaseFirestore.distLiteFirestoreSrcUtilObjMapMod.ObjectMap
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcCoreEventManagerMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/event_manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/event_manager", "EventManagerImpl")
  @js.native
  open class EventManagerImpl ()
    extends StObject
       with EventManager {
    
    var onlineState: OnlineState = js.native
    
    var queries: ObjectMap[Query, QueryListenersInfo] = js.native
    
    var snapshotsInSyncListeners: Set[Observer[Unit]] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/core/event_manager", "QueryListener")
  @js.native
  open class QueryListener protected () extends StObject {
    def this(query: Query, queryObserver: Observer[ViewSnapshot]) = this()
    def this(query: Query, queryObserver: Observer[ViewSnapshot], options: ListenOptions) = this()
    
    /** Returns whether a snapshot was raised. */
    def applyOnlineStateChange(onlineState: OnlineState): Boolean = js.native
    
    def onError(error: FirestoreError): Unit = js.native
    
    /**
      * Applies the new ViewSnapshot to this listener, raising a user-facing event
      * if applicable (depending on what changed, whether the user has opted into
      * metadata-only changes, etc.). Returns true if a user-facing event was
      * indeed raised.
      */
    def onViewSnapshot(snap: ViewSnapshot): Boolean = js.native
    
    /* private */ var onlineState: Any = js.native
    
    /* private */ var options: Any = js.native
    
    val query: Query = js.native
    
    /* private */ var queryObserver: Any = js.native
    
    /* private */ var raiseInitialEvent: Any = js.native
    
    /**
      * Initial snapshots (e.g. from cache) may not be propagated to the wrapped
      * observer. This flag is set to true once we've actually raised an event.
      */
    /* private */ var raisedInitialEvent: Any = js.native
    
    /* private */ var shouldRaiseEvent: Any = js.native
    
    /* private */ var shouldRaiseInitialEvent: Any = js.native
    
    /* private */ var snap: Any = js.native
  }
  
  inline def addSnapshotsInSyncListener(eventManager: EventManager, observer: Observer[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSnapshotsInSyncListener")(eventManager.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eventManagerListen(eventManager: EventManager, listener: QueryListener): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventManagerListen")(eventManager.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def eventManagerOnOnlineStateChange(eventManager: EventManager, onlineState: OnlineState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventManagerOnOnlineStateChange")(eventManager.asInstanceOf[js.Any], onlineState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eventManagerOnWatchChange(eventManager: EventManager, viewSnaps: js.Array[ViewSnapshot]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventManagerOnWatchChange")(eventManager.asInstanceOf[js.Any], viewSnaps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eventManagerOnWatchError(eventManager: EventManager, query: Query, error: FirestoreError): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eventManagerOnWatchError")(eventManager.asInstanceOf[js.Any], query.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eventManagerUnlisten(eventManager: EventManager, listener: QueryListener): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventManagerUnlisten")(eventManager.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def newEventManager(): EventManager = ^.asInstanceOf[js.Dynamic].applyDynamic("newEventManager")().asInstanceOf[EventManager]
  
  inline def removeSnapshotsInSyncListener(eventManager: EventManager, observer: Observer[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSnapshotsInSyncListener")(eventManager.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait EventManager extends StObject {
    
    var onListen: js.UndefOr[js.Function1[/* query */ Query, js.Promise[ViewSnapshot]]] = js.undefined
    
    var onUnlisten: js.UndefOr[js.Function1[/* query */ Query, js.Promise[Unit]]] = js.undefined
  }
  object EventManager {
    
    inline def apply(): EventManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventManager]
    }
    
    extension [Self <: EventManager](x: Self) {
      
      inline def setOnListen(value: /* query */ Query => js.Promise[ViewSnapshot]): Self = StObject.set(x, "onListen", js.Any.fromFunction1(value))
      
      inline def setOnListenUndefined: Self = StObject.set(x, "onListen", js.undefined)
      
      inline def setOnUnlisten(value: /* query */ Query => js.Promise[Unit]): Self = StObject.set(x, "onUnlisten", js.Any.fromFunction1(value))
      
      inline def setOnUnlistenUndefined: Self = StObject.set(x, "onUnlisten", js.undefined)
    }
  }
  
  trait ListenOptions extends StObject {
    
    /** Raise events even when only the metadata changes */
    val includeMetadataChanges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Wait for a sync with the server when online, but still raise events while
      * offline.
      */
    val waitForSyncWhenOnline: js.UndefOr[Boolean] = js.undefined
  }
  object ListenOptions {
    
    inline def apply(): ListenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenOptions]
    }
    
    extension [Self <: ListenOptions](x: Self) {
      
      inline def setIncludeMetadataChanges(value: Boolean): Self = StObject.set(x, "includeMetadataChanges", value.asInstanceOf[js.Any])
      
      inline def setIncludeMetadataChangesUndefined: Self = StObject.set(x, "includeMetadataChanges", js.undefined)
      
      inline def setWaitForSyncWhenOnline(value: Boolean): Self = StObject.set(x, "waitForSyncWhenOnline", value.asInstanceOf[js.Any])
      
      inline def setWaitForSyncWhenOnlineUndefined: Self = StObject.set(x, "waitForSyncWhenOnline", js.undefined)
    }
  }
  
  trait Observer[T] extends StObject {
    
    def error(value: FirestoreError): Unit
    @JSName("error")
    var error_Original: EventHandler[FirestoreError]
    
    def next(value: T): Unit
    @JSName("next")
    var next_Original: EventHandler[T]
  }
  object Observer {
    
    inline def apply[T](error: FirestoreError => Unit, next: T => Unit): Observer[T] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[T]]
    }
    
    extension [Self <: Observer[?], T](x: Self & Observer[T]) {
      
      inline def setError(value: FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Holds the listeners and the last received ViewSnapshot for a query being
    * tracked by EventManager.
    */
  trait QueryListenersInfo extends StObject {
    
    var listeners: js.Array[QueryListener]
    
    var viewSnap: js.UndefOr[ViewSnapshot] = js.undefined
  }
  object QueryListenersInfo {
    
    inline def apply(listeners: js.Array[QueryListener]): QueryListenersInfo = {
      val __obj = js.Dynamic.literal(listeners = listeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryListenersInfo]
    }
    
    extension [Self <: QueryListenersInfo](x: Self) {
      
      inline def setListeners(value: js.Array[QueryListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersVarargs(value: QueryListener*): Self = StObject.set(x, "listeners", js.Array(value*))
      
      inline def setViewSnap(value: ViewSnapshot): Self = StObject.set(x, "viewSnap", value.asInstanceOf[js.Any])
      
      inline def setViewSnapUndefined: Self = StObject.set(x, "viewSnap", js.undefined)
    }
  }
}
