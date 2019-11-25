package typings.atGoogleMaps.atGoogleMapsMod

import typings.atGoogleMaps.atGoogleMapsStrings.alt_ids
import typings.atGoogleMaps.atGoogleMapsStrings.formatted_address
import typings.atGoogleMaps.atGoogleMapsStrings.geometry
import typings.atGoogleMaps.atGoogleMapsStrings.icon
import typings.atGoogleMaps.atGoogleMapsStrings.name
import typings.atGoogleMaps.atGoogleMapsStrings.opening_hours
import typings.atGoogleMaps.atGoogleMapsStrings.permanently_closed
import typings.atGoogleMaps.atGoogleMapsStrings.phonenumber
import typings.atGoogleMaps.atGoogleMapsStrings.photos
import typings.atGoogleMaps.atGoogleMapsStrings.place_id
import typings.atGoogleMaps.atGoogleMapsStrings.plus_code
import typings.atGoogleMaps.atGoogleMapsStrings.price_level
import typings.atGoogleMaps.atGoogleMapsStrings.rating
import typings.atGoogleMaps.atGoogleMapsStrings.scope
import typings.atGoogleMaps.atGoogleMapsStrings.textquery
import typings.atGoogleMaps.atGoogleMapsStrings.types
import typings.atGoogleMaps.atGoogleMapsStrings.vicinity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindPlaceRequest extends js.Object {
  /**
    * The fields specifying the types of place data to return.
    *
    * **Note:** If you omit the fields parameter from a Find Place request, only the place_id for the result will be returned.
    */
  var fields: js.UndefOr[
    js.Array[
      icon | geometry | plus_code | name | opening_hours | photos | place_id | scope | alt_ids | price_level | rating | types | vicinity | formatted_address | permanently_closed
    ]
  ] = js.undefined
  /** The text input specifying which place to search for (for example, a name, address, or phone number). */
  var input: String
  /** The type of input. This can be one of either `textquery` or `phonenumber`. */
  var inputtype: textquery | phonenumber
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Searches are also biased to the selected language; results in the selected language may be given a higher ranking
    */
  var language: js.UndefOr[Language] = js.undefined
  /**
    * Prefer results in a specified area, by specifying either a radius plus lat/lng, or two lat/lng pairs representing
    * the points of a rectangle. If this parameter is not specified, the API uses IP address biasing by default.
    */
  var locationbias: js.UndefOr[String] = js.undefined
}

object FindPlaceRequest {
  @scala.inline
  def apply(
    input: String,
    inputtype: textquery | phonenumber,
    fields: js.Array[
      icon | geometry | plus_code | name | opening_hours | photos | place_id | scope | alt_ids | price_level | rating | types | vicinity | formatted_address | permanently_closed
    ] = null,
    language: Language = null,
    locationbias: String = null
  ): FindPlaceRequest = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputtype = inputtype.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locationbias != null) __obj.updateDynamic("locationbias")(locationbias.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceRequest]
  }
}

