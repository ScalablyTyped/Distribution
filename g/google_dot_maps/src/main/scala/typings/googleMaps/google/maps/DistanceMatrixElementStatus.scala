package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DistanceMatrixElementStatus extends StObject
/**
  * The element-level status about a particular origin-destination pairing
  * returned by the <code>DistanceMatrixService</code> upon completion of a
  * distance matrix request. These values are specified as strings, for
  * example, <code>'OK'</code>.
  */
@JSGlobal("google.maps.DistanceMatrixElementStatus")
@js.native
object DistanceMatrixElementStatus extends StObject {
  
  /**
    * The origin and/or destination of this pairing could not be geocoded.
    */
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with DistanceMatrixElementStatus
  
  /**
    * The response contains a valid result.
    */
  @js.native
  sealed trait OK
    extends StObject
       with DistanceMatrixElementStatus
  
  /**
    * No route could be found between the origin and destination.
    */
  @js.native
  sealed trait ZERO_RESULTS
    extends StObject
       with DistanceMatrixElementStatus
}
