package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutomaticViewportMode extends StObject
@JSGlobal("google.maps.journeySharing.AutomaticViewportMode")
@js.native
object AutomaticViewportMode extends StObject {
  
  /**
    * Automatically adjust the viewport to fit markers and any visible
    * anticipated route polylines. This is the default.
    */
  @js.native
  sealed trait FIT_ANTICIPATED_ROUTE
    extends StObject
       with AutomaticViewportMode
  
  /**
    * Do not automatically adjust the viewport.
    */
  @js.native
  sealed trait NONE
    extends StObject
       with AutomaticViewportMode
}
