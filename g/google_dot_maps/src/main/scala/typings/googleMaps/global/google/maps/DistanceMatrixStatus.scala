package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level status about the request in general returned by the
  * <code>DistanceMatrixService</code> upon completion of a distance matrix
  * request. Specify these by value, or by using the constant&#39;s name. For
  * example, <code>'OK'</code> or
  * <code>google.maps.DistanceMatrixStatus.OK</code>.
  */
@JSGlobal("google.maps.DistanceMatrixStatus")
@js.native
object DistanceMatrixStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.DistanceMatrixStatus & String] = js.native
  
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googleMaps.google.maps.DistanceMatrixStatus.INVALID_REQUEST & String = js.native
  
  /* "MAX_DIMENSIONS_EXCEEDED" */ val MAX_DIMENSIONS_EXCEEDED: typings.googleMaps.google.maps.DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED & String = js.native
  
  /* "MAX_ELEMENTS_EXCEEDED" */ val MAX_ELEMENTS_EXCEEDED: typings.googleMaps.google.maps.DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED & String = js.native
  
  /* "OK" */ val OK: typings.googleMaps.google.maps.DistanceMatrixStatus.OK & String = js.native
  
  /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typings.googleMaps.google.maps.DistanceMatrixStatus.OVER_QUERY_LIMIT & String = js.native
  
  /* "REQUEST_DENIED" */ val REQUEST_DENIED: typings.googleMaps.google.maps.DistanceMatrixStatus.REQUEST_DENIED & String = js.native
  
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googleMaps.google.maps.DistanceMatrixStatus.UNKNOWN_ERROR & String = js.native
}
