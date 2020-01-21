package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.OK
  - typings.googleMaps.googleMapsStrings.ZERO_RESULTS
*/
trait GeocodedWaypointStatus extends js.Object

object GeocodedWaypointStatus {
  @scala.inline
  def OK: typings.googleMaps.googleMapsStrings.OK = this.cast("OK")
  @scala.inline
  def ZERO_RESULTS: typings.googleMaps.googleMapsStrings.ZERO_RESULTS = this.cast("ZERO_RESULTS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

