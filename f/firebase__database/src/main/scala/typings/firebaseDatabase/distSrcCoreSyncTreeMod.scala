package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.distSrcApiReferenceMod.ReferenceConstructor
import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distSrcCoreSyncPointMod.SyncPoint
import typings.firebaseDatabase.distSrcCoreUtilImmutableTreeMod.ImmutableTree
import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.firebaseDatabase.distSrcCoreViewEventMod.Event
import typings.firebaseDatabase.distSrcCoreViewEventRegistrationMod.EventRegistration
import typings.firebaseDatabase.distSrcCoreViewEventRegistrationMod.QueryContext
import typings.firebaseDatabase.distSrcCoreWriteTreeMod.WriteTree
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreSyncTreeMod {
  
  @JSImport("@firebase/database/dist/src/core/SyncTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/SyncTree", "SyncTree")
  @js.native
  open class SyncTree protected () extends StObject {
    /**
      * @param listenProvider_ - Used by SyncTree to start / stop listening
      *   to server data.
      */
    def this(listenProvider_ : ListenProvider) = this()
    
    var listenProvider_ : ListenProvider = js.native
    
    /**
      * A tree of all pending user writes (user-initiated set()'s, transaction()'s, update()'s, etc.).
      */
    var pendingWriteTree_ : WriteTree = js.native
    
    val queryToTagMap: Map[String, Double] = js.native
    
    /**
      * Tree of SyncPoints.  There's a SyncPoint at any location that has 1 or more views.
      */
    var syncPointTree_ : ImmutableTree[SyncPoint] = js.native
    
    val tagToQueryMap: Map[Double, String] = js.native
  }
  
  inline def resetSyncTreeTag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSyncTreeTag")().asInstanceOf[Unit]
  
  inline def syncTreeAckUserWrite(syncTree: SyncTree, writeId: Double): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeAckUserWrite")(syncTree.asInstanceOf[js.Any], writeId.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncTreeAckUserWrite(syncTree: SyncTree, writeId: Double, revert: Boolean): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeAckUserWrite")(syncTree.asInstanceOf[js.Any], writeId.asInstanceOf[js.Any], revert.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeAddEventRegistration(syncTree: SyncTree, query: QueryContext, eventRegistration: EventRegistration): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeAddEventRegistration")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncTreeAddEventRegistration(
    syncTree: SyncTree,
    query: QueryContext,
    eventRegistration: EventRegistration,
    skipSetupListener: Boolean
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeAddEventRegistration")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], skipSetupListener.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeApplyListenComplete(syncTree: SyncTree, path: Path): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeApplyListenComplete")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeApplyServerMerge(syncTree: SyncTree, path: Path, changedChildren: StringDictionary[Node]): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeApplyServerMerge")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], changedChildren.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeApplyServerOverwrite(syncTree: SyncTree, path: Path, newData: Node): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeApplyServerOverwrite")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeApplyTaggedListenComplete(syncTree: SyncTree, path: Path, tag: Double): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeApplyTaggedListenComplete")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeApplyTaggedQueryMerge(syncTree: SyncTree, path: Path, changedChildren: StringDictionary[Node], tag: Double): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeApplyTaggedQueryMerge")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], changedChildren.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeApplyTaggedQueryOverwrite(syncTree: SyncTree, path: Path, snap: Node, tag: Double): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeApplyTaggedQueryOverwrite")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], snap.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeApplyUserMerge(syncTree: SyncTree, path: Path, changedChildren: StringDictionary[Node], writeId: Double): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeApplyUserMerge")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], changedChildren.asInstanceOf[js.Any], writeId.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeApplyUserOverwrite(syncTree: SyncTree, path: Path, newData: Node, writeId: Double): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeApplyUserOverwrite")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], newData.asInstanceOf[js.Any], writeId.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncTreeApplyUserOverwrite(syncTree: SyncTree, path: Path, newData: Node, writeId: Double, visible: Boolean): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeApplyUserOverwrite")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], newData.asInstanceOf[js.Any], writeId.asInstanceOf[js.Any], visible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeCalcCompleteEventCache(syncTree: SyncTree, path: Path): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeCalcCompleteEventCache")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def syncTreeCalcCompleteEventCache(syncTree: SyncTree, path: Path, writeIdsToExclude: js.Array[Double]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeCalcCompleteEventCache")(syncTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def syncTreeGetServerValue(syncTree: SyncTree, query: QueryContext): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeGetServerValue")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def syncTreeRemoveEventRegistration(syncTree: SyncTree, query: QueryContext): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeRemoveEventRegistration")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncTreeRemoveEventRegistration(syncTree: SyncTree, query: QueryContext, eventRegistration: Null, cancelError: js.Error): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeRemoveEventRegistration")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], cancelError.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncTreeRemoveEventRegistration(
    syncTree: SyncTree,
    query: QueryContext,
    eventRegistration: Null,
    cancelError: js.Error,
    skipListenerDedup: Boolean
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeRemoveEventRegistration")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], cancelError.asInstanceOf[js.Any], skipListenerDedup.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncTreeRemoveEventRegistration(
    syncTree: SyncTree,
    query: QueryContext,
    eventRegistration: Null,
    cancelError: Unit,
    skipListenerDedup: Boolean
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeRemoveEventRegistration")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], cancelError.asInstanceOf[js.Any], skipListenerDedup.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncTreeRemoveEventRegistration(syncTree: SyncTree, query: QueryContext, eventRegistration: EventRegistration): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeRemoveEventRegistration")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncTreeRemoveEventRegistration(
    syncTree: SyncTree,
    query: QueryContext,
    eventRegistration: EventRegistration,
    cancelError: js.Error
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeRemoveEventRegistration")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], cancelError.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncTreeRemoveEventRegistration(
    syncTree: SyncTree,
    query: QueryContext,
    eventRegistration: EventRegistration,
    cancelError: js.Error,
    skipListenerDedup: Boolean
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeRemoveEventRegistration")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], cancelError.asInstanceOf[js.Any], skipListenerDedup.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def syncTreeRemoveEventRegistration(
    syncTree: SyncTree,
    query: QueryContext,
    eventRegistration: EventRegistration,
    cancelError: Unit,
    skipListenerDedup: Boolean
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeRemoveEventRegistration")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any], cancelError.asInstanceOf[js.Any], skipListenerDedup.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  inline def syncTreeSetReferenceConstructor(`val`: ReferenceConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeSetReferenceConstructor")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def syncTreeTagForQuery(syncTree: SyncTree, query: QueryContext): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTreeTagForQuery")(syncTree.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  @js.native
  trait ListenProvider extends StObject {
    
    def startListening(
      query: QueryContext,
      tag: Double,
      hashFn: js.Function0[String],
      onComplete: js.Function2[/* a */ String, /* b */ js.UndefOr[Any], js.Array[Event]]
    ): js.Array[Event] = js.native
    def startListening(
      query: QueryContext,
      tag: Null,
      hashFn: js.Function0[String],
      onComplete: js.Function2[/* a */ String, /* b */ js.UndefOr[Any], js.Array[Event]]
    ): js.Array[Event] = js.native
    
    def stopListening(a: QueryContext): Unit = js.native
    def stopListening(a: QueryContext, b: Double): Unit = js.native
  }
}
