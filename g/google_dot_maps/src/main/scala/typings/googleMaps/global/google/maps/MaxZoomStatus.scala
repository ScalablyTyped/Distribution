package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status returned by the <code>MaxZoomService</code> on the completion of
  * a call to <code>getMaxZoomAtLatLng()</code>. Specify these by value, or by
  * using the constant&#39;s name. For example, <code>'OK'</code> or
  * <code>google.maps.MaxZoomStatus.OK</code>.
  */
@JSGlobal("google.maps.MaxZoomStatus")
@js.native
object MaxZoomStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.MaxZoomStatus & String] = js.native
  
  /* "ERROR" */ val ERROR: typings.googleMaps.google.maps.MaxZoomStatus.ERROR & String = js.native
  
  /* "OK" */ val OK: typings.googleMaps.google.maps.MaxZoomStatus.OK & String = js.native
}
