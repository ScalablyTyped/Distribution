package typings.firebaseDatabase.distPrivateMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SyncTree is the central class for managing event callback registration, data caching, views
  * (query processing), and event generation.  There are typically two SyncTree instances for
  * each Repo, one for the normal Firebase data, and one for the .info data.
  *
  * It has a number of responsibilities, including:
  *  - Tracking all user event callbacks (registered via addEventRegistration() and removeEventRegistration()).
  *  - Applying and caching data changes for user set(), transaction(), and update() calls
  *    (applyUserOverwrite(), applyUserMerge()).
  *  - Applying and caching data changes for server data changes (applyServerOverwrite(),
  *    applyServerMerge()).
  *  - Generating user-facing events for server and user changes (all of the apply* methods
  *    return the set of events that need to be raised as a result).
  *  - Maintaining the appropriate set of server listens to ensure we are always subscribed
  *    to the correct set of paths and queries to satisfy the current set of user event
  *    callbacks (listens are started/stopped using the provided listenProvider).
  *
  * NOTE: Although SyncTree tracks event callbacks and calculates events to raise, the actual
  * events are returned to the caller rather than raised synchronously.
  *
  */
trait SyncTree extends StObject {
  
  var listenProvider_ : ListenProvider
  
  /**
    * A tree of all pending user writes (user-initiated set()'s, transaction()'s, update()'s, etc.).
    */
  var pendingWriteTree_ : WriteTree
  
  val queryToTagMap: Map[String, Double]
  
  /**
    * Tree of SyncPoints.  There's a SyncPoint at any location that has 1 or more views.
    */
  var syncPointTree_ : ImmutableTree[SyncPoint]
  
  val tagToQueryMap: Map[Double, String]
}
object SyncTree {
  
  inline def apply(
    listenProvider_ : ListenProvider,
    pendingWriteTree_ : WriteTree,
    queryToTagMap: Map[String, Double],
    syncPointTree_ : ImmutableTree[SyncPoint],
    tagToQueryMap: Map[Double, String]
  ): SyncTree = {
    val __obj = js.Dynamic.literal(listenProvider_ = listenProvider_.asInstanceOf[js.Any], pendingWriteTree_ = pendingWriteTree_.asInstanceOf[js.Any], queryToTagMap = queryToTagMap.asInstanceOf[js.Any], syncPointTree_ = syncPointTree_.asInstanceOf[js.Any], tagToQueryMap = tagToQueryMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncTree]
  }
  
  extension [Self <: SyncTree](x: Self) {
    
    inline def setListenProvider_(value: ListenProvider): Self = StObject.set(x, "listenProvider_", value.asInstanceOf[js.Any])
    
    inline def setPendingWriteTree_(value: WriteTree): Self = StObject.set(x, "pendingWriteTree_", value.asInstanceOf[js.Any])
    
    inline def setQueryToTagMap(value: Map[String, Double]): Self = StObject.set(x, "queryToTagMap", value.asInstanceOf[js.Any])
    
    inline def setSyncPointTree_(value: ImmutableTree[SyncPoint]): Self = StObject.set(x, "syncPointTree_", value.asInstanceOf[js.Any])
    
    inline def setTagToQueryMap(value: Map[Double, String]): Self = StObject.set(x, "tagToQueryMap", value.asInstanceOf[js.Any])
  }
}
