package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaxZoomStatus extends StObject
@JSGlobal("google.maps.MaxZoomStatus")
@js.native
object MaxZoomStatus extends StObject {
  
  /**
    * An unknown error occurred.
    */
  @js.native
  sealed trait ERROR
    extends StObject
       with MaxZoomStatus
  
  /**
    * The response contains a valid <code>MaxZoomResult</code>.
    */
  @js.native
  sealed trait OK
    extends StObject
       with MaxZoomStatus
}
