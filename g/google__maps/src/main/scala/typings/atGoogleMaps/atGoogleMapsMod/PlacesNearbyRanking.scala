package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.prominence
  - typings.atGoogleMaps.atGoogleMapsStrings.distance
*/
trait PlacesNearbyRanking extends js.Object

object PlacesNearbyRanking {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def distance: typings.atGoogleMaps.atGoogleMapsStrings.distance = this.cast("distance")
  @scala.inline
  def prominence: typings.atGoogleMaps.atGoogleMapsStrings.prominence = this.cast("prominence")
}

