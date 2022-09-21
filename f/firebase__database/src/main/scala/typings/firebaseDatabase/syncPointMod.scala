package typings.firebaseDatabase

import typings.firebaseDatabase.anon.Events
import typings.firebaseDatabase.eventMod.Event
import typings.firebaseDatabase.eventRegistrationMod.EventRegistration
import typings.firebaseDatabase.eventRegistrationMod.QueryContext
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.operationMod.Operation
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.referenceMod.ReferenceConstructor
import typings.firebaseDatabase.viewMod.View
import typings.firebaseDatabase.writeTreeMod.WriteTreeRef
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncPointMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/SyncPoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/SyncPoint", "SyncPoint")
  @js.native
  open class SyncPoint () extends StObject {
    
    /**
      * The Views being tracked at this location in the tree, stored as a map where the key is a
      * queryId and the value is the View for that query.
      *
      * NOTE: This list will be quite small (usually 1, but perhaps 2 or 3; any more is an odd use case).
      */
    val views: Map[String, View] = js.native
  }
  
  inline def syncPointAddEventRegistration(
    syncPoint: SyncPoint,
    query: QueryContext,
    eventRegistration: EventRegistration,
    writesCache: WriteTreeRef,
    serverCache: Null,
    serverCacheComplete: Boolean
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointAddEventRegistration")(syncPoint.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], writesCache.asInstanceOf[js.Any], serverCache.asInstanceOf[js.Any], serverCacheComplete.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncPointAddEventRegistration(
    syncPoint: SyncPoint,
    query: QueryContext,
    eventRegistration: EventRegistration,
    writesCache: WriteTreeRef,
    serverCache: Node,
    serverCacheComplete: Boolean
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointAddEventRegistration")(syncPoint.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], writesCache.asInstanceOf[js.Any], serverCache.asInstanceOf[js.Any], serverCacheComplete.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncPointApplyOperation(syncPoint: SyncPoint, operation: Operation, writesCache: WriteTreeRef): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointApplyOperation")(syncPoint.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], writesCache.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncPointApplyOperation(
    syncPoint: SyncPoint,
    operation: Operation,
    writesCache: WriteTreeRef,
    optCompleteServerCache: Node
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointApplyOperation")(syncPoint.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], writesCache.asInstanceOf[js.Any], optCompleteServerCache.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncPointGetCompleteServerCache(syncPoint: SyncPoint, path: Path): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointGetCompleteServerCache")(syncPoint.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def syncPointGetCompleteView(syncPoint: SyncPoint): View | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("syncPointGetCompleteView")(syncPoint.asInstanceOf[js.Any]).asInstanceOf[View | Null]
  
  inline def syncPointGetQueryViews(syncPoint: SyncPoint): js.Array[View] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncPointGetQueryViews")(syncPoint.asInstanceOf[js.Any]).asInstanceOf[js.Array[View]]
  
  inline def syncPointGetView(
    syncPoint: SyncPoint,
    query: QueryContext,
    writesCache: WriteTreeRef,
    serverCache: Null,
    serverCacheComplete: Boolean
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointGetView")(syncPoint.asInstanceOf[js.Any], query.asInstanceOf[js.Any], writesCache.asInstanceOf[js.Any], serverCache.asInstanceOf[js.Any], serverCacheComplete.asInstanceOf[js.Any])).asInstanceOf[View]
  inline def syncPointGetView(
    syncPoint: SyncPoint,
    query: QueryContext,
    writesCache: WriteTreeRef,
    serverCache: Node,
    serverCacheComplete: Boolean
  ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointGetView")(syncPoint.asInstanceOf[js.Any], query.asInstanceOf[js.Any], writesCache.asInstanceOf[js.Any], serverCache.asInstanceOf[js.Any], serverCacheComplete.asInstanceOf[js.Any])).asInstanceOf[View]
  
  inline def syncPointHasCompleteView(syncPoint: SyncPoint): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("syncPointHasCompleteView")(syncPoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def syncPointIsEmpty(syncPoint: SyncPoint): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("syncPointIsEmpty")(syncPoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def syncPointRemoveEventRegistration(syncPoint: SyncPoint, query: QueryContext): Events = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointRemoveEventRegistration")(syncPoint.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Events]
  inline def syncPointRemoveEventRegistration(syncPoint: SyncPoint, query: QueryContext, eventRegistration: Null, cancelError: js.Error): Events = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointRemoveEventRegistration")(syncPoint.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], cancelError.asInstanceOf[js.Any])).asInstanceOf[Events]
  inline def syncPointRemoveEventRegistration(syncPoint: SyncPoint, query: QueryContext, eventRegistration: EventRegistration): Events = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointRemoveEventRegistration")(syncPoint.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any])).asInstanceOf[Events]
  inline def syncPointRemoveEventRegistration(
    syncPoint: SyncPoint,
    query: QueryContext,
    eventRegistration: EventRegistration,
    cancelError: js.Error
  ): Events = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointRemoveEventRegistration")(syncPoint.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], cancelError.asInstanceOf[js.Any])).asInstanceOf[Events]
  
  inline def syncPointSetReferenceConstructor(`val`: ReferenceConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncPointSetReferenceConstructor")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def syncPointViewExistsForQuery(syncPoint: SyncPoint, query: QueryContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointViewExistsForQuery")(syncPoint.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def syncPointViewForQuery(syncPoint: SyncPoint, query: QueryContext): View | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("syncPointViewForQuery")(syncPoint.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[View | Null]
}
