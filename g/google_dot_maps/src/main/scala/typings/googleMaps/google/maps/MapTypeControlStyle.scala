package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapTypeControlStyle extends StObject
@JSGlobal("google.maps.MapTypeControlStyle")
@js.native
object MapTypeControlStyle extends StObject {
  
  /**
    * Uses the default map type control. When the <code>DEFAULT</code> control
    * is shown, it will vary according to window size and other factors. The
    * <code>DEFAULT</code> control may change in future versions of the API.
    */
  @js.native
  sealed trait DEFAULT
    extends StObject
       with MapTypeControlStyle
  
  /**
    * A dropdown menu for the screen realestate conscious.
    */
  @js.native
  sealed trait DROPDOWN_MENU
    extends StObject
       with MapTypeControlStyle
  
  /**
    * The standard horizontal radio buttons bar.
    */
  @js.native
  sealed trait HORIZONTAL_BAR
    extends StObject
       with MapTypeControlStyle
}
