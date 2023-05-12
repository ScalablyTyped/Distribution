package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Animation extends StObject
@JSGlobal("google.maps.Animation")
@js.native
object Animation extends StObject {
  
  /**
    * Marker bounces until animation is stopped by calling {@link
    * google.maps.Marker.setAnimation} with <code>null</code>.
    */
  @js.native
  sealed trait BOUNCE
    extends StObject
       with Animation
  
  /**
    * Marker drops from the top of the map to its final location. Animation
    * will cease once the marker comes to rest and {@link
    * google.maps.Marker.getAnimation} will return <code>null</code>. This type
    * of animation is usually specified during creation of the marker.
    */
  @js.native
  sealed trait DROP
    extends StObject
       with Animation
}
