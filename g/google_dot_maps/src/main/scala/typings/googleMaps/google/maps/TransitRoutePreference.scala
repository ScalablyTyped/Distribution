package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransitRoutePreference extends StObject
/**
  * The valid transit route type that can be specified in a <i><code><a
  * href="#TransitOptions">TransitOptions</a></code></i>. Specify these by
  * value, or by using the constant&#39;s name. For example,
  * <code>'LESS_WALKING'</code> or
  * <code>google.maps.TransitRoutePreference.LESS_WALKING</code>.
  */
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
