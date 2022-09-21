package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaxZoomStatus extends StObject
/**
  * The status returned by the <code>MaxZoomService</code> on the completion of
  * a call to <code>getMaxZoomAtLatLng()</code>. Specify these by value, or by
  * using the constant&#39;s name. For example, <code>'OK'</code> or
  * <code>google.maps.MaxZoomStatus.OK</code>.
  */
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
