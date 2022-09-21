package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the type of location returned from a geocode. Specify these by
  * value, or by using the constant&#39;s name. For example,
  * <code>'ROOFTOP'</code> or
  * <code>google.maps.GeocoderLocationType.ROOFTOP</code>.
  */
@JSGlobal("google.maps.GeocoderLocationType")
@js.native
object GeocoderLocationType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.GeocoderLocationType & String] = js.native
  
  /* "APPROXIMATE" */ val APPROXIMATE: typings.googleMaps.google.maps.GeocoderLocationType.APPROXIMATE & String = js.native
  
  /* "GEOMETRIC_CENTER" */ val GEOMETRIC_CENTER: typings.googleMaps.google.maps.GeocoderLocationType.GEOMETRIC_CENTER & String = js.native
  
  /* "RANGE_INTERPOLATED" */ val RANGE_INTERPOLATED: typings.googleMaps.google.maps.GeocoderLocationType.RANGE_INTERPOLATED & String = js.native
  
  /* "ROOFTOP" */ val ROOFTOP: typings.googleMaps.google.maps.GeocoderLocationType.ROOFTOP & String = js.native
}
