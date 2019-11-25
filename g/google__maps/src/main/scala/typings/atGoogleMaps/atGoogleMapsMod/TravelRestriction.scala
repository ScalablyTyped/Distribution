package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.tolls
  - typings.atGoogleMaps.atGoogleMapsStrings.highways
  - typings.atGoogleMaps.atGoogleMapsStrings.ferries
  - typings.atGoogleMaps.atGoogleMapsStrings.indoor
*/
trait TravelRestriction extends js.Object

object TravelRestriction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ferries: typings.atGoogleMaps.atGoogleMapsStrings.ferries = this.cast("ferries")
  @scala.inline
  def highways: typings.atGoogleMaps.atGoogleMapsStrings.highways = this.cast("highways")
  @scala.inline
  def indoor: typings.atGoogleMaps.atGoogleMapsStrings.indoor = this.cast("indoor")
  @scala.inline
  def tolls: typings.atGoogleMaps.atGoogleMapsStrings.tolls = this.cast("tolls")
}

