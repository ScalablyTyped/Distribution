package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A view represents a specific location and query that has 1 or more event registrations.
  *
  * It does several things:
  *  - Maintains the list of event registrations for this location/query.
  *  - Maintains a cache of the data visible for this location/query.
  *  - Applies new operations (via applyOperation), updates the cache, and based on the event
  *    registrations returns the set of events to be raised.
  */
@js.native
trait View extends StObject {
  
  var eventGenerator_ : EventGenerator = js.native
  
  var eventRegistrations_ : js.Array[EventRegistration] = js.native
  
  var processor_ : ViewProcessor = js.native
  
  def query: QueryContext = js.native
  
  /* private */ var query_ : Any = js.native
  
  var viewCache_ : ViewCache = js.native
}
