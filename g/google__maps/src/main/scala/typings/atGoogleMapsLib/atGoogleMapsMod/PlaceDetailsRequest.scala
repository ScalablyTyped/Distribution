package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceDetailsRequest extends js.Object {
  /**
    * One or more fields, specifying the types of place data to return, separated by a comma.
    *
    * **Warning: If you do not specify at least one field with a request, or if you omit the **fields**
    * parameter from a request, ALL possible fields will be returned, and you will be billed accordingly.
    * This applies only to Place Details requests.
    */
  var fields: js.UndefOr[js.Array[PlaceDetailsRequestField]] = js.undefined
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Note that some fields may not be available in the requested language.
    * Note that we often update supported languages so this list may not be exhaustive.
    */
  var language: js.UndefOr[Language] = js.undefined
  /** A textual identifier that uniquely identifies a place, returned from a Place Search. */
  var placeid: java.lang.String
  /**
    * The region code, specified as a ccTLD (country code top-level domain) two-character value.
    * Most ccTLD codes are identical to ISO 3166-1 codes, with some exceptions.
    * This parameter will only influence, not fully restrict, results.
    * If more relevant results exist outside of the specified region, they may be included.
    * When this parameter is used, the country name is omitted from the resulting `formatted_address`
    * for results in the specified region.
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A random string which identifies an autocomplete session for billing purposes.
    * Use this for Place Details requests that are called following an autocomplete request in the same user session
    */
  var sessiontoken: js.UndefOr[java.lang.String] = js.undefined
}

object PlaceDetailsRequest {
  @scala.inline
  def apply(
    placeid: java.lang.String,
    fields: js.Array[PlaceDetailsRequestField] = null,
    language: Language = null,
    region: java.lang.String = null,
    sessiontoken: java.lang.String = null
  ): PlaceDetailsRequest = {
    val __obj = js.Dynamic.literal(placeid = placeid)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (language != null) __obj.updateDynamic("language")(language)
    if (region != null) __obj.updateDynamic("region")(region)
    if (sessiontoken != null) __obj.updateDynamic("sessiontoken")(sessiontoken)
    __obj.asInstanceOf[PlaceDetailsRequest]
  }
}

