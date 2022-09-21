package typings.googleMaps.google.maps.localContext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaceChooserPosition extends StObject
/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Display positions for the place chooser.
  */
@JSGlobal("google.maps.localContext.PlaceChooserPosition")
@js.native
object PlaceChooserPosition extends StObject {
  
  /**
    * Place chooser is displayed on a line below the map extending to the end
    * of the container.
    */
  @js.native
  sealed trait BLOCK_END
    extends StObject
       with PlaceChooserPosition
  
  /**
    * Place chooser is displayed inline with the map at the end of the line.
    * (In a left-to-right language this means that the place chooser is to the
    * right of the map.)
    */
  @js.native
  sealed trait INLINE_END
    extends StObject
       with PlaceChooserPosition
  
  /**
    * Place chooser is displayed inline with the map at the start of the line.
    * (In a left-to-right language this means that the place chooser is to the
    * left of the map.)
    */
  @js.native
  sealed trait INLINE_START
    extends StObject
       with PlaceChooserPosition
}
