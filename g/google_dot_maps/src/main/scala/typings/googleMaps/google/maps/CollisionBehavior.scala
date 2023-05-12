package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CollisionBehavior extends StObject
@JSGlobal("google.maps.CollisionBehavior")
@js.native
object CollisionBehavior extends StObject {
  
  /**
    * Display the marker only if it does not overlap with other markers. If two
    * markers of this type would overlap, the one with the higher zIndex is
    * shown. If they have the same zIndex, the one with the lower vertical
    * screen position is shown.
    */
  @js.native
  sealed trait OPTIONAL_AND_HIDES_LOWER_PRIORITY
    extends StObject
       with CollisionBehavior
  
  /**
    * Always display the marker regardless of collision. This is the default
    * behavior.
    */
  @js.native
  sealed trait REQUIRED
    extends StObject
       with CollisionBehavior
  
  /**
    * Always display the marker regardless of collision, and hide any
    * OPTIONAL_AND_HIDES_LOWER_PRIORITY markers or labels that would overlap
    * with the marker.
    */
  @js.native
  sealed trait REQUIRED_AND_HIDES_OPTIONAL
    extends StObject
       with CollisionBehavior
}
