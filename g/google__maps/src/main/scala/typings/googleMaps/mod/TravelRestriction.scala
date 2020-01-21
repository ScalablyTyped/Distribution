package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.tolls
  - typings.googleMaps.googleMapsStrings.highways
  - typings.googleMaps.googleMapsStrings.ferries
  - typings.googleMaps.googleMapsStrings.indoor
*/
trait TravelRestriction extends js.Object

object TravelRestriction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ferries: typings.googleMaps.googleMapsStrings.ferries = this.cast("ferries")
  @scala.inline
  def highways: typings.googleMaps.googleMapsStrings.highways = this.cast("highways")
  @scala.inline
  def indoor: typings.googleMaps.googleMapsStrings.indoor = this.cast("indoor")
  @scala.inline
  def tolls: typings.googleMaps.googleMapsStrings.tolls = this.cast("tolls")
}

