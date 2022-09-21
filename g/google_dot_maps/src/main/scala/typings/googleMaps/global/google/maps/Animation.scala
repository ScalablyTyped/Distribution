package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Animations that can be played on a marker. Use the {@link
  * google.maps.Marker.setAnimation} method on Marker or the {@link
  * google.maps.MarkerOptions.animation} option to play an animation.
  */
@JSGlobal("google.maps.Animation")
@js.native
object Animation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.googleMaps.google.maps.Animation & Double] = js.native
  
  /* 0.0 */ val BOUNCE: typings.googleMaps.google.maps.Animation.BOUNCE & Double = js.native
  
  /* 1.0 */ val DROP: typings.googleMaps.google.maps.Animation.DROP & Double = js.native
}
