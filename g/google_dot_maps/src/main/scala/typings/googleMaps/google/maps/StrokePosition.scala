package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StrokePosition extends StObject
@JSGlobal("google.maps.StrokePosition")
@js.native
object StrokePosition extends StObject {
  
  /**
    * The stroke is centered on the polygon&#39;s path, with half the stroke
    * inside the polygon and half the stroke outside the polygon.
    */
  @js.native
  sealed trait CENTER
    extends StObject
       with StrokePosition
  
  /**
    * The stroke lies inside the polygon.
    */
  @js.native
  sealed trait INSIDE
    extends StObject
       with StrokePosition
  
  /**
    * The stroke lies outside the polygon.
    */
  @js.native
  sealed trait OUTSIDE
    extends StObject
       with StrokePosition
}
