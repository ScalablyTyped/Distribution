package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.prominence
  - typings.googleMaps.googleMapsStrings.distance
*/
trait PlacesNearbyRanking extends js.Object

object PlacesNearbyRanking {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def distance: typings.googleMaps.googleMapsStrings.distance = this.cast("distance")
  @scala.inline
  def prominence: typings.googleMaps.googleMapsStrings.prominence = this.cast("prominence")
}

