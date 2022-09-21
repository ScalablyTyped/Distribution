package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status returned by the <code>StreetViewService</code> on completion of
  * a Street View request. These can be specified by value, or by using the
  * constant&#39;s name. For example, <code>'OK'</code> or
  * <code>google.maps.StreetViewStatus.OK</code>.
  */
@JSGlobal("google.maps.StreetViewStatus")
@js.native
object StreetViewStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.StreetViewStatus & String] = js.native
  
  /* "OK" */ val OK: typings.googleMaps.google.maps.StreetViewStatus.OK & String = js.native
  
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googleMaps.google.maps.StreetViewStatus.UNKNOWN_ERROR & String = js.native
  
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typings.googleMaps.google.maps.StreetViewStatus.ZERO_RESULTS & String = js.native
}
