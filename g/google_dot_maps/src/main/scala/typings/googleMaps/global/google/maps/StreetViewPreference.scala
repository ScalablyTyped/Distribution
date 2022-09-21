package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that bias a search result towards returning a Street View panorama
  * that is nearest to the request location, or a panorama that is considered
  * most likely to be what the user wants to see. Specify these by value, or by
  * using the constant&#39;s name. For example, <code>'best'</code> or
  * <code>google.maps.StreetViewPreference.BEST</code>.
  */
@JSGlobal("google.maps.StreetViewPreference")
@js.native
object StreetViewPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.StreetViewPreference & String] = js.native
  
  /* "best" */ val BEST: typings.googleMaps.google.maps.StreetViewPreference.BEST & String = js.native
  
  /* "nearest" */ val NEAREST: typings.googleMaps.google.maps.StreetViewPreference.NEAREST & String = js.native
}
