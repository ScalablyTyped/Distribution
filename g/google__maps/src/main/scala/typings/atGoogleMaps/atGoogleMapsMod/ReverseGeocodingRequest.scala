package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReverseGeocodingRequest extends js.Object {
  /**
    * The language in which to return results.
    *  - Google often updates the supported languages, so this list may not be exhaustive.
    *  - If `language` is not supplied, the geocoder attempts to use the preferred language as specified in the
    *    `Accept-Language` header, or the native language of the domain from which the request is sent.
    *  - The geocoder does its best to provide a street address that is readable for both the user and locals.
    *    To achieve that goal, it returns street addresses in the local language, transliterated to a script readable by the user
    *    if necessary, observing the preferred language. All other addresses are returned in the preferred language.
    *    Address components are all returned in the same language, which is chosen from the first component.
    *  - If a name is not available in the preferred language, the geocoder uses the closest match.
    */
  var language: js.UndefOr[Language] = js.undefined
  /** The latitude and longitude values specifying the location for which you wish to obtain the closest, human-readable address. */
  var latlng: js.UndefOr[LatLng] = js.undefined
  /**
    * A filter of one or more location types, separated by a pipe (`|`).
    * If the parameter contains multiple location types, the API returns all addresses that match any of the types.
    * A note about processing: The `location_type` parameter does not restrict the search to the specified location type(s).
    * Rather, the `location_type` acts as a post-search filter: the API fetches all results for the specified `latlng`,
    * then discards those results that do not match the specified location type(s).
    * Note: This parameter is available only for requests that include an API key or a client ID.
    */
  var location_type: js.UndefOr[ReverseGeocodingLocationType] = js.undefined
  /**
    * The place ID of the place for which you wish to obtain the human-readable address.
    * The place ID is a unique identifier that can be used with other Google APIs.
    * For example, you can use the `placeID` returned by the Roads API to get the address for a snapped point.
    * The place ID may only be specified if the request includes an API key or a Google Maps APIs Premium Plan client ID.
    */
  var place_id: js.UndefOr[String] = js.undefined
  /**
    * A filter of one or more address types, separated by a pipe (`|`).
    * If the parameter contains multiple address types, the API returns all addresses that match any of the types.
    * A note about processing: The `result_type` parameter does not restrict the search to the specified address type(s).
    * Rather, the `result_type` acts as a post-search filter: the API fetches all results for the specified `latlng`,
    * then discards those results that do not match the specified address type(s).
    * Note: This parameter is available only for requests that include an API key or a client ID.
    */
  var result_type: js.UndefOr[AddressType] = js.undefined
}

object ReverseGeocodingRequest {
  @scala.inline
  def apply(
    language: Language = null,
    latlng: LatLng = null,
    location_type: ReverseGeocodingLocationType = null,
    place_id: String = null,
    result_type: AddressType = null
  ): ReverseGeocodingRequest = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (latlng != null) __obj.updateDynamic("latlng")(latlng.asInstanceOf[js.Any])
    if (location_type != null) __obj.updateDynamic("location_type")(location_type)
    if (place_id != null) __obj.updateDynamic("place_id")(place_id)
    if (result_type != null) __obj.updateDynamic("result_type")(result_type)
    __obj.asInstanceOf[ReverseGeocodingRequest]
  }
}

