package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.driving
  - typings.googleMaps.googleMapsStrings.walking
  - typings.googleMaps.googleMapsStrings.bicycling
  - typings.googleMaps.googleMapsStrings.transit
*/
trait TravelMode extends js.Object

object TravelMode {
  @scala.inline
  def bicycling: typings.googleMaps.googleMapsStrings.bicycling = this.cast("bicycling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def driving: typings.googleMaps.googleMapsStrings.driving = this.cast("driving")
  @scala.inline
  def transit: typings.googleMaps.googleMapsStrings.transit = this.cast("transit")
  @scala.inline
  def walking: typings.googleMaps.googleMapsStrings.walking = this.cast("walking")
}

