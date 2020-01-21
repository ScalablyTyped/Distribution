package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.geocode
  - typings.googleMaps.googleMapsStrings.address
  - typings.googleMaps.googleMapsStrings.establishment
  - typings.googleMaps.googleMapsStrings.LeftparenthesisregionsRightparenthesis
  - typings.googleMaps.googleMapsStrings.LeftparenthesiscitiesRightparenthesis
*/
trait PlaceAutocompleteType extends js.Object

object PlaceAutocompleteType {
  @scala.inline
  def LeftparenthesiscitiesRightparenthesis: typings.googleMaps.googleMapsStrings.LeftparenthesiscitiesRightparenthesis = this.cast("(cities)")
  @scala.inline
  def LeftparenthesisregionsRightparenthesis: typings.googleMaps.googleMapsStrings.LeftparenthesisregionsRightparenthesis = this.cast("(regions)")
  @scala.inline
  def address: typings.googleMaps.googleMapsStrings.address = this.cast("address")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def establishment: typings.googleMaps.googleMapsStrings.establishment = this.cast("establishment")
  @scala.inline
  def geocode: typings.googleMaps.googleMapsStrings.geocode = this.cast("geocode")
}

