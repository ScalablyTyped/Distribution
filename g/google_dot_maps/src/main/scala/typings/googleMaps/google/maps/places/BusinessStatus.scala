package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BusinessStatus extends StObject
/**
  * The operational status of the Place, if it is a business, returned in a
  * PlaceResult (indicates whether the place is operational, or closed either
  * temporarily or permanently). Specify these by value, or the constant&#39;s
  * name (example: <code>&#39;OPERATIONAL&#39;</code> or
  * <code>google.maps.places.BusinessStatus.OPERATIONAL</code>).
  */
@JSGlobal("google.maps.places.BusinessStatus")
@js.native
object BusinessStatus extends StObject {
  
  /**
    * The business is closed permanently.
    */
  @js.native
  sealed trait CLOSED_PERMANENTLY
    extends StObject
       with BusinessStatus
  
  /**
    * The business is closed temporarily.
    */
  @js.native
  sealed trait CLOSED_TEMPORARILY
    extends StObject
       with BusinessStatus
  
  /**
    * The business is operating normally.
    */
  @js.native
  sealed trait OPERATIONAL
    extends StObject
       with BusinessStatus
}
