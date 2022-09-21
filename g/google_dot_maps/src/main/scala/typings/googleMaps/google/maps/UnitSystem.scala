package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnitSystem extends StObject
/**
  * The valid unit systems that can be specified in a <i><code><a
  * href="#DirectionsRequest">DirectionsRequest</a></code></i>.
  */
@JSGlobal("google.maps.UnitSystem")
@js.native
object UnitSystem extends StObject {
  
  /**
    * Specifies that distances in the <code>DirectionsResult</code> should be
    * expressed in imperial units.
    */
  @js.native
  sealed trait IMPERIAL
    extends StObject
       with UnitSystem
  
  /**
    * Specifies that distances in the <code>DirectionsResult</code> should be
    * expressed in metric units.
    */
  @js.native
  sealed trait METRIC
    extends StObject
       with UnitSystem
}
