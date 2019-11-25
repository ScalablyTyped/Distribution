package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.geocode
  - typings.atGoogleMaps.atGoogleMapsStrings.address
  - typings.atGoogleMaps.atGoogleMapsStrings.establishment
  - typings.atGoogleMaps.atGoogleMapsStrings.`(regions)`
  - typings.atGoogleMaps.atGoogleMapsStrings.`(cities)`
*/
trait PlaceAutocompleteType extends js.Object

object PlaceAutocompleteType {
  @scala.inline
  def `(cities)`: typings.atGoogleMaps.atGoogleMapsStrings.`(cities)` = this.cast("(cities)")
  @scala.inline
  def `(regions)`: typings.atGoogleMaps.atGoogleMapsStrings.`(regions)` = this.cast("(regions)")
  @scala.inline
  def address: typings.atGoogleMaps.atGoogleMapsStrings.address = this.cast("address")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def establishment: typings.atGoogleMaps.atGoogleMapsStrings.establishment = this.cast("establishment")
  @scala.inline
  def geocode: typings.atGoogleMaps.atGoogleMapsStrings.geocode = this.cast("geocode")
}

