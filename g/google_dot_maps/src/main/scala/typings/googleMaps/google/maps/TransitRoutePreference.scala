package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransitRoutePreference extends StObject
@JSGlobal("google.maps.TransitRoutePreference")
@js.native
object TransitRoutePreference extends StObject {
  
  /**
    * Specifies that the calculated route should prefer a limited number of
    * transfers.
    */
  @js.native
  sealed trait FEWER_TRANSFERS
    extends StObject
       with TransitRoutePreference
  
  /**
    * Specifies that the calculated route should prefer limited amounts of
    * walking.
    */
  @js.native
  sealed trait LESS_WALKING
    extends StObject
       with TransitRoutePreference
}
