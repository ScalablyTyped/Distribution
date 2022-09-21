package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The element-level status about a particular origin-destination pairing
  * returned by the <code>DistanceMatrixService</code> upon completion of a
  * distance matrix request. These values are specified as strings, for
  * example, <code>'OK'</code>.
  */
@JSGlobal("google.maps.DistanceMatrixElementStatus")
@js.native
object DistanceMatrixElementStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.DistanceMatrixElementStatus & String] = js.native
  
  /* "NOT_FOUND" */ val NOT_FOUND: typings.googleMaps.google.maps.DistanceMatrixElementStatus.NOT_FOUND & String = js.native
  
  /* "OK" */ val OK: typings.googleMaps.google.maps.DistanceMatrixElementStatus.OK & String = js.native
  
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typings.googleMaps.google.maps.DistanceMatrixElementStatus.ZERO_RESULTS & String = js.native
}
