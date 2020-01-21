package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.ROOFTOP
  - typings.googleMaps.googleMapsStrings.RANGE_INTERPOLATED
  - typings.googleMaps.googleMapsStrings.GEOMETRIC_CENTER
  - typings.googleMaps.googleMapsStrings.APPROXIMATE
*/
trait ReverseGeocodingLocationType extends js.Object

object ReverseGeocodingLocationType {
  @scala.inline
  def APPROXIMATE: typings.googleMaps.googleMapsStrings.APPROXIMATE = this.cast("APPROXIMATE")
  @scala.inline
  def GEOMETRIC_CENTER: typings.googleMaps.googleMapsStrings.GEOMETRIC_CENTER = this.cast("GEOMETRIC_CENTER")
  @scala.inline
  def RANGE_INTERPOLATED: typings.googleMaps.googleMapsStrings.RANGE_INTERPOLATED = this.cast("RANGE_INTERPOLATED")
  @scala.inline
  def ROOFTOP: typings.googleMaps.googleMapsStrings.ROOFTOP = this.cast("ROOFTOP")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

