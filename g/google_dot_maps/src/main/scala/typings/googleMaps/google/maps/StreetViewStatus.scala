package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreetViewStatus extends StObject
/**
  * The status returned by the <code>StreetViewService</code> on completion of
  * a Street View request. These can be specified by value, or by using the
  * constant&#39;s name. For example, <code>'OK'</code> or
  * <code>google.maps.StreetViewStatus.OK</code>.
  */
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
