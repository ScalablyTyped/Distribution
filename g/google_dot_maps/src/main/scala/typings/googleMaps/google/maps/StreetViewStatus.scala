package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreetViewStatus extends StObject
@JSGlobal("google.maps.StreetViewStatus")
@js.native
object StreetViewStatus extends StObject {
  
  /**
    * The request was successful.
    */
  @js.native
  sealed trait OK
    extends StObject
       with StreetViewStatus
  
  /**
    * The request could not be successfully processed, yet the exact reason for
    * failure is unknown.
    */
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with StreetViewStatus
  
  /**
    * There are no panoramas found that match the search criteria.
    */
  @js.native
  sealed trait ZERO_RESULTS
    extends StObject
       with StreetViewStatus
}
