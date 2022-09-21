package typings.firebaseDatabase.internalMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SyncPoint represents a single location in a SyncTree with 1 or more event registrations, meaning we need to
  * maintain 1 or more Views at this location to cache server data and raise appropriate events for server changes
  * and user writes (set, transaction, update).
  *
  * It's responsible for:
  *  - Maintaining the set of 1 or more views necessary at this location (a SyncPoint with 0 views should be removed).
  *  - Proxying user / server operations to the views as appropriate (i.e. applyServerOverwrite,
  *    applyUserOverwrite, etc.)
  */
trait SyncPoint extends StObject {
  
  /**
    * The Views being tracked at this location in the tree, stored as a map where the key is a
    * queryId and the value is the View for that query.
    *
    * NOTE: This list will be quite small (usually 1, but perhaps 2 or 3; any more is an odd use case).
    */
  val views: Map[String, View]
}
object SyncPoint {
  
  inline def apply(views: Map[String, View]): SyncPoint = {
    val __obj = js.Dynamic.literal(views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncPoint]
  }
  
  extension [Self <: SyncPoint](x: Self) {
    
    inline def setViews(value: Map[String, View]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
