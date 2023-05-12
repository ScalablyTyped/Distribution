package typings.googleMaps.google.maps.localContext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaceDetailsLayoutMode extends StObject
@JSGlobal("google.maps.localContext.PlaceDetailsLayoutMode")
@js.native
object PlaceDetailsLayoutMode extends StObject {
  
  /**
    * Place details is displayed in an {@link google.maps.InfoWindow}.
    */
  @js.native
  sealed trait INFO_WINDOW
    extends StObject
       with PlaceDetailsLayoutMode
  
  /**
    * Place details is displayed in a sheet.
    */
  @js.native
  sealed trait SHEET
    extends StObject
       with PlaceDetailsLayoutMode
}
