package typings.googleMaps.anon

import typings.googleMaps.mod.AddressGeometry
import typings.googleMaps.mod.AlternativePlaceId
import typings.googleMaps.mod.OpeningHours
import typings.googleMaps.mod.PlaceIdScope
import typings.googleMaps.mod.PlacePhoto
import typings.googleMaps.mod.PlaceType1
import typings.googleMaps.mod.PlaceType2
import typings.googleMaps.mod.PlusCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google/maps.@google/maps.PlaceSearchResult> */
trait PartialPlaceSearchResult extends js.Object {
  var alt_ids: js.UndefOr[js.Array[AlternativePlaceId]] = js.undefined
  var formatted_address: js.UndefOr[String] = js.undefined
  var geometry: js.UndefOr[AddressGeometry] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opening_hours: js.UndefOr[OpeningHours] = js.undefined
  var permanently_closed: js.UndefOr[Boolean] = js.undefined
  var photos: js.UndefOr[js.Array[PlacePhoto]] = js.undefined
  var place_id: js.UndefOr[String] = js.undefined
  var plus_code: js.UndefOr[PlusCode] = js.undefined
  var price_level: js.UndefOr[Double] = js.undefined
  var rating: js.UndefOr[Double] = js.undefined
  var scope: js.UndefOr[PlaceIdScope] = js.undefined
  var types: js.UndefOr[js.Array[PlaceType1 | PlaceType2]] = js.undefined
  var vicinity: js.UndefOr[String] = js.undefined
}

object PartialPlaceSearchResult {
  @scala.inline
  def apply(
    alt_ids: js.Array[AlternativePlaceId] = null,
    formatted_address: String = null,
    geometry: AddressGeometry = null,
    icon: String = null,
    name: String = null,
    opening_hours: OpeningHours = null,
    permanently_closed: js.UndefOr[Boolean] = js.undefined,
    photos: js.Array[PlacePhoto] = null,
    place_id: String = null,
    plus_code: PlusCode = null,
    price_level: js.UndefOr[Double] = js.undefined,
    rating: js.UndefOr[Double] = js.undefined,
    scope: PlaceIdScope = null,
    types: js.Array[PlaceType1 | PlaceType2] = null,
    vicinity: String = null
  ): PartialPlaceSearchResult = {
    val __obj = js.Dynamic.literal()
    if (alt_ids != null) __obj.updateDynamic("alt_ids")(alt_ids.asInstanceOf[js.Any])
    if (formatted_address != null) __obj.updateDynamic("formatted_address")(formatted_address.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opening_hours != null) __obj.updateDynamic("opening_hours")(opening_hours.asInstanceOf[js.Any])
    if (!js.isUndefined(permanently_closed)) __obj.updateDynamic("permanently_closed")(permanently_closed.get.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (place_id != null) __obj.updateDynamic("place_id")(place_id.asInstanceOf[js.Any])
    if (plus_code != null) __obj.updateDynamic("plus_code")(plus_code.asInstanceOf[js.Any])
    if (!js.isUndefined(price_level)) __obj.updateDynamic("price_level")(price_level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rating)) __obj.updateDynamic("rating")(rating.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (vicinity != null) __obj.updateDynamic("vicinity")(vicinity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPlaceSearchResult]
  }
}

