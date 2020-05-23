package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.eventMod.Event
import typings.firebaseDatabase.eventRegistrationMod.EventRegistration
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.queryMod.Query
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/SyncTree", JSImport.Namespace)
@js.native
object syncTreeMod extends js.Object {
  @js.native
  trait ListenProvider extends js.Object {
    def startListening(
      query: Query,
      tag: Double,
      hashFn: js.Function0[String],
      onComplete: js.Function2[/* a */ String, /* b */ js.UndefOr[js.Any], js.Array[Event]]
    ): js.Array[Event] = js.native
    def startListening(
      query: Query,
      tag: Null,
      hashFn: js.Function0[String],
      onComplete: js.Function2[/* a */ String, /* b */ js.UndefOr[js.Any], js.Array[Event]]
    ): js.Array[Event] = js.native
    def stopListening(a: Query): Unit = js.native
    def stopListening(a: Query, b: Double): Unit = js.native
  }
  
  @js.native
  class SyncTree protected () extends js.Object {
    /**
      * @param {!ListenProvider} listenProvider_ Used by SyncTree to start / stop listening
      *   to server data.
      */
    def this(listenProvider_ : ListenProvider) = this()
    /**
      * Recursive helper for applyOperationToSyncPoints_
      */
    var applyOperationDescendantsHelper_ : js.Any = js.native
    /**
      * Recursive helper for applyOperationToSyncPoints_
      */
    var applyOperationHelper_ : js.Any = js.native
    /**
      * A helper method that visits all descendant and ancestor SyncPoints, applying the operation.
      *
      * NOTES:
      * - Descendant SyncPoints will be visited first (since we raise events depth-first).
      *
      * - We call applyOperation() on each SyncPoint passing three things:
      *   1. A version of the Operation that has been made relative to the SyncPoint location.
      *   2. A WriteTreeRef of any writes we have cached at the SyncPoint location.
      *   3. A snapshot Node with cached server data, if we have it.
      *
      * - We concatenate all of the events returned by each SyncPoint and return the result.
      */
    var applyOperationToSyncPoints_ : js.Any = js.native
    /**
      * A helper method to apply tagged operations
      */
    var applyTaggedOperation_ : js.Any = js.native
    /**
      * This collapses multiple unfiltered views into a single view, since we only need a single
      * listener for them.
      */
    var collectDistinctViewsForSubTree_ : js.Any = js.native
    var createListenerForView_ : js.Any = js.native
    var listenProvider_ : js.Any = js.native
    /**
      * A tree of all pending user writes (user-initiated set()'s, transaction()'s, update()'s, etc.).
      */
    var pendingWriteTree_ : js.Any = js.native
    /**
      * Return the query associated with the given tag, if we have one
      */
    var queryKeyForTag_ : js.Any = js.native
    val queryToTagMap: js.Any = js.native
    var removeTags_ : js.Any = js.native
    /**
      * For a given new listen, manage the de-duplication of outstanding subscriptions.
      *
      * @return This method can return events to support synchronous data sources
      */
    var setupListener_ : js.Any = js.native
    /**
      * Tree of SyncPoints.  There's a SyncPoint at any location that has 1 or more views.
      */
    var syncPointTree_ : js.Any = js.native
    /**
      * Return the tag associated with the given query.
      */
    var tagForQuery_ : js.Any = js.native
    val tagToQueryMap: js.Any = js.native
    /**
      * Acknowledge a pending user write that was previously registered with applyUserOverwrite() or applyUserMerge().
      *
      * @param revert True if the given write failed and needs to be reverted
      * @return Events to raise.
      */
    def ackUserWrite(writeId: Double): js.Array[Event] = js.native
    def ackUserWrite(writeId: Double, revert: Boolean): js.Array[Event] = js.native
    /**
      * Add an event callback for the specified query.
      *
      * @return Events to raise.
      */
    def addEventRegistration(query: Query, eventRegistration: EventRegistration): js.Array[Event] = js.native
    /**
      * Apply a listen complete for a query
      *
      * @return Events to raise.
      */
    def applyListenComplete(path: Path): js.Array[Event] = js.native
    /**
      * Apply new server data to be merged in at the specified path.
      *
      * @return Events to raise.
      */
    def applyServerMerge(path: Path, changedChildren: StringDictionary[Node]): js.Array[Event] = js.native
    /**
      * Apply new server data for the specified path..
      *
      * @return Events to raise.
      */
    def applyServerOverwrite(path: Path, newData: Node): js.Array[Event] = js.native
    /**
      * Apply a listen complete for a tagged query
      *
      * @return Events to raise.
      */
    def applyTaggedListenComplete(path: Path, tag: Double): js.Array[Event] = js.native
    /**
      * Apply server data to be merged in for the specified tagged query.
      *
      * @return Events to raise.
      */
    def applyTaggedQueryMerge(path: Path, changedChildren: StringDictionary[Node], tag: Double): js.Array[Event] = js.native
    /**
      * Apply new server data for the specified tagged query.
      *
      * @return Events to raise.
      */
    def applyTaggedQueryOverwrite(path: Path, snap: Node, tag: Double): js.Array[Event] = js.native
    /**
      * Apply the data from a user-generated update() call
      *
      * @return Events to raise.
      */
    def applyUserMerge(path: Path, changedChildren: StringDictionary[Node], writeId: Double): js.Array[Event] = js.native
    /**
      * Apply the data changes for a user-generated set() or transaction() call.
      *
      * @return Events to raise.
      */
    def applyUserOverwrite(path: Path, newData: Node, writeId: Double): js.Array[Event] = js.native
    def applyUserOverwrite(path: Path, newData: Node, writeId: Double, visible: Boolean): js.Array[Event] = js.native
    /**
      * Returns a complete cache, if we have one, of the data at a particular path. If the location does not have a
      * listener above it, we will get a false "null". This shouldn't be a problem because transactions will always
      * have a listener above, and atomic operations would correctly show a jitter of <increment value> ->
      *     <incremented total> as the write is applied locally and then acknowledged at the server.
      *
      * Note: this method will *include* hidden writes from transaction with applyLocally set to false.
      *
      * @param path The path to the data we want
      * @param writeIdsToExclude A specific set to be excluded
      */
    def calcCompleteEventCache(path: Path): Node = js.native
    def calcCompleteEventCache(path: Path, writeIdsToExclude: js.Array[Double]): Node = js.native
    def removeEventRegistration(query: Query): js.Array[Event] = js.native
    def removeEventRegistration(query: Query, eventRegistration: Null, cancelError: Error): js.Array[Event] = js.native
    /**
      * Remove event callback(s).
      *
      * If query is the default query, we'll check all queries for the specified eventRegistration.
      * If eventRegistration is null, we'll remove all callbacks for the specified query/queries.
      *
      * @param eventRegistration If null, all callbacks are removed.
      * @param cancelError If a cancelError is provided, appropriate cancel events will be returned.
      * @return Cancel events, if cancelError was provided.
      */
    def removeEventRegistration(query: Query, eventRegistration: EventRegistration): js.Array[Event] = js.native
    def removeEventRegistration(query: Query, eventRegistration: EventRegistration, cancelError: Error): js.Array[Event] = js.native
  }
  
  /* static members */
  @js.native
  object SyncTree extends js.Object {
    /**
      * Static accessor for query tags.
      */
    var getNextQueryTag_ : js.Any = js.native
    /**
      * Given a query, computes a "queryKey" suitable for use in our queryToTagMap_.
      */
    var makeQueryKey_ : js.Any = js.native
    /**
      * Static tracker for next query tag.
      */
    var nextQueryTag_ : js.Any = js.native
    /**
      * Given a queryKey (created by makeQueryKey), parse it back into a path and queryId.
      */
    var parseQueryKey_ : js.Any = js.native
    /**
      * Normalizes a query to a query we send the server for listening
      *
      * @return The normalized query
      */
    var queryForListening_ : js.Any = js.native
  }
  
}

