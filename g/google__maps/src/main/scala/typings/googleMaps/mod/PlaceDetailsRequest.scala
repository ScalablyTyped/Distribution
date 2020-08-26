package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceDetailsRequest extends js.Object {
  /**
    * One or more fields, specifying the types of place data to return, separated by a comma.
    *
    * **Warning: If you do not specify at least one field with a request, or if you omit the **fields**
    * parameter from a request, ALL possible fields will be returned, and you will be billed accordingly.
    * This applies only to Place Details requests.
    */
  var fields: js.UndefOr[js.Array[PlaceDetailsRequestField]] = js.native
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Note that some fields may not be available in the requested language.
    * Note that we often update supported languages so this list may not be exhaustive.
    */
  var language: js.UndefOr[Language] = js.native
  /** A textual identifier that uniquely identifies a place, returned from a Place Search. */
  var placeid: String = js.native
  /**
    * The region code, specified as a ccTLD (country code top-level domain) two-character value.
    * Most ccTLD codes are identical to ISO 3166-1 codes, with some exceptions.
    * This parameter will only influence, not fully restrict, results.
    * If more relevant results exist outside of the specified region, they may be included.
    * When this parameter is used, the country name is omitted from the resulting `formatted_address`
    * for results in the specified region.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * A random string which identifies an autocomplete session for billing purposes.
    * Use this for Place Details requests that are called following an autocomplete request in the same user session
    */
  var sessiontoken: js.UndefOr[String] = js.native
}

object PlaceDetailsRequest {
  @scala.inline
  def apply(placeid: String): PlaceDetailsRequest = {
    val __obj = js.Dynamic.literal(placeid = placeid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceDetailsRequest]
  }
  @scala.inline
  implicit class PlaceDetailsRequestOps[Self <: PlaceDetailsRequest] (val x: Self) extends AnyVal {
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
    def setPlaceid(value: String): Self = this.set("placeid", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldsVarargs(value: PlaceDetailsRequestField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[PlaceDetailsRequestField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSessiontoken(value: String): Self = this.set("sessiontoken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessiontoken: Self = this.set("sessiontoken", js.undefined)
  }
  
}

