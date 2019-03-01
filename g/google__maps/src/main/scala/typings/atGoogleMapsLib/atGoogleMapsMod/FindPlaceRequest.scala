package typings
package atGoogleMapsLib.atGoogleMapsMod

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
      atGoogleMapsLib.atGoogleMapsLibStrings.icon | atGoogleMapsLib.atGoogleMapsLibStrings.geometry | atGoogleMapsLib.atGoogleMapsLibStrings.plus_code | atGoogleMapsLib.atGoogleMapsLibStrings.name | atGoogleMapsLib.atGoogleMapsLibStrings.opening_hours | atGoogleMapsLib.atGoogleMapsLibStrings.photos | atGoogleMapsLib.atGoogleMapsLibStrings.place_id | atGoogleMapsLib.atGoogleMapsLibStrings.scope | atGoogleMapsLib.atGoogleMapsLibStrings.alt_ids | atGoogleMapsLib.atGoogleMapsLibStrings.price_level | atGoogleMapsLib.atGoogleMapsLibStrings.rating | atGoogleMapsLib.atGoogleMapsLibStrings.types | atGoogleMapsLib.atGoogleMapsLibStrings.vicinity | atGoogleMapsLib.atGoogleMapsLibStrings.formatted_address | atGoogleMapsLib.atGoogleMapsLibStrings.permanently_closed
    ]
  ] = js.undefined
  /** The text input specifying which place to search for (for example, a name, address, or phone number). */
  var input: java.lang.String
  /** The type of input. This can be one of either `textquery` or `phonenumber`. */
  var inputtype: atGoogleMapsLib.atGoogleMapsLibStrings.textquery | atGoogleMapsLib.atGoogleMapsLibStrings.phonenumber
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Searches are also biased to the selected language; results in the selected language may be given a higher ranking
    */
  var language: js.UndefOr[Language] = js.undefined
  /**
    * Prefer results in a specified area, by specifying either a radius plus lat/lng, or two lat/lng pairs representing
    * the points of a rectangle. If this parameter is not specified, the API uses IP address biasing by default.
    */
  var locationbias: js.UndefOr[java.lang.String] = js.undefined
}

object FindPlaceRequest {
  @scala.inline
  def apply(
    input: java.lang.String,
    inputtype: atGoogleMapsLib.atGoogleMapsLibStrings.textquery | atGoogleMapsLib.atGoogleMapsLibStrings.phonenumber,
    fields: js.Array[
      atGoogleMapsLib.atGoogleMapsLibStrings.icon | atGoogleMapsLib.atGoogleMapsLibStrings.geometry | atGoogleMapsLib.atGoogleMapsLibStrings.plus_code | atGoogleMapsLib.atGoogleMapsLibStrings.name | atGoogleMapsLib.atGoogleMapsLibStrings.opening_hours | atGoogleMapsLib.atGoogleMapsLibStrings.photos | atGoogleMapsLib.atGoogleMapsLibStrings.place_id | atGoogleMapsLib.atGoogleMapsLibStrings.scope | atGoogleMapsLib.atGoogleMapsLibStrings.alt_ids | atGoogleMapsLib.atGoogleMapsLibStrings.price_level | atGoogleMapsLib.atGoogleMapsLibStrings.rating | atGoogleMapsLib.atGoogleMapsLibStrings.types | atGoogleMapsLib.atGoogleMapsLibStrings.vicinity | atGoogleMapsLib.atGoogleMapsLibStrings.formatted_address | atGoogleMapsLib.atGoogleMapsLibStrings.permanently_closed
    ] = null,
    language: Language = null,
    locationbias: java.lang.String = null
  ): FindPlaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("inputtype")(inputtype.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locationbias != null) __obj.updateDynamic("locationbias")(locationbias)
    __obj.asInstanceOf[FindPlaceRequest]
  }
}

