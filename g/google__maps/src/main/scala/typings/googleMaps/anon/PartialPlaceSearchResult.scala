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
@js.native
trait PartialPlaceSearchResult extends js.Object {
  var alt_ids: js.UndefOr[js.Array[AlternativePlaceId]] = js.native
  var formatted_address: js.UndefOr[String] = js.native
  var geometry: js.UndefOr[AddressGeometry] = js.native
  var icon: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var opening_hours: js.UndefOr[OpeningHours] = js.native
  var permanently_closed: js.UndefOr[Boolean] = js.native
  var photos: js.UndefOr[js.Array[PlacePhoto]] = js.native
  var place_id: js.UndefOr[String] = js.native
  var plus_code: js.UndefOr[PlusCode] = js.native
  var price_level: js.UndefOr[Double] = js.native
  var rating: js.UndefOr[Double] = js.native
  var scope: js.UndefOr[PlaceIdScope] = js.native
  var types: js.UndefOr[js.Array[PlaceType1 | PlaceType2]] = js.native
  var vicinity: js.UndefOr[String] = js.native
}

object PartialPlaceSearchResult {
  @scala.inline
  def apply(): PartialPlaceSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPlaceSearchResult]
  }
  @scala.inline
  implicit class PartialPlaceSearchResultOps[Self <: PartialPlaceSearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlt_idsVarargs(value: AlternativePlaceId*): Self = this.set("alt_ids", js.Array(value :_*))
    @scala.inline
    def setAlt_ids(value: js.Array[AlternativePlaceId]): Self = this.set("alt_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt_ids: Self = this.set("alt_ids", js.undefined)
    @scala.inline
    def setFormatted_address(value: String): Self = this.set("formatted_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatted_address: Self = this.set("formatted_address", js.undefined)
    @scala.inline
    def setGeometry(value: AddressGeometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpening_hours(value: OpeningHours): Self = this.set("opening_hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpening_hours: Self = this.set("opening_hours", js.undefined)
    @scala.inline
    def setPermanently_closed(value: Boolean): Self = this.set("permanently_closed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermanently_closed: Self = this.set("permanently_closed", js.undefined)
    @scala.inline
    def setPhotosVarargs(value: PlacePhoto*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[PlacePhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
    @scala.inline
    def setPlace_id(value: String): Self = this.set("place_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlace_id: Self = this.set("place_id", js.undefined)
    @scala.inline
    def setPlus_code(value: PlusCode): Self = this.set("plus_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlus_code: Self = this.set("plus_code", js.undefined)
    @scala.inline
    def setPrice_level(value: Double): Self = this.set("price_level", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice_level: Self = this.set("price_level", js.undefined)
    @scala.inline
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    @scala.inline
    def setScope(value: PlaceIdScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setTypesVarargs(value: (PlaceType1 | PlaceType2)*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[PlaceType1 | PlaceType2]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setVicinity(value: String): Self = this.set("vicinity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVicinity: Self = this.set("vicinity", js.undefined)
  }
  
}

