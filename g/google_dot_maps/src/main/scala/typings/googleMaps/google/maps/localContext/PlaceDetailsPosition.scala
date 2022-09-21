package typings.googleMaps.google.maps.localContext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaceDetailsPosition extends StObject
/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Display positions for the place details.
  */
@JSGlobal("google.maps.localContext.PlaceDetailsPosition")
@js.native
object PlaceDetailsPosition extends StObject {
  
  /**
    * Place details is displayed inline with the map at the end of the line.
    * (In a left-to-right language this means that the place details is to the
    * right of the map.)
    */
  @js.native
  sealed trait INLINE_END
    extends StObject
       with PlaceDetailsPosition
  
  /**
    * Place details is displayed inline with the map at the start of the line.
    * (In a left-to-right language this means that the place details is to the
    * left of the map.)
    */
  @js.native
  sealed trait INLINE_START
    extends StObject
       with PlaceDetailsPosition
}
