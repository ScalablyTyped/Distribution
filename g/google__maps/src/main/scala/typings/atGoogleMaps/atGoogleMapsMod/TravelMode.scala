package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.driving
  - typings.atGoogleMaps.atGoogleMapsStrings.walking
  - typings.atGoogleMaps.atGoogleMapsStrings.bicycling
  - typings.atGoogleMaps.atGoogleMapsStrings.transit
*/
trait TravelMode extends js.Object

object TravelMode {
  @scala.inline
  def bicycling: typings.atGoogleMaps.atGoogleMapsStrings.bicycling = this.cast("bicycling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def driving: typings.atGoogleMaps.atGoogleMapsStrings.driving = this.cast("driving")
  @scala.inline
  def transit: typings.atGoogleMaps.atGoogleMapsStrings.transit = this.cast("transit")
  @scala.inline
  def walking: typings.atGoogleMaps.atGoogleMapsStrings.walking = this.cast("walking")
}

