package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodeGroup extends js.Object {
  /** The CLDR territory code of the country the postal code group applies to. Required. */
  var country: js.UndefOr[String] = js.undefined
  /** The name of the postal code group, referred to in headers. Required. */
  var name: js.UndefOr[String] = js.undefined
  /** A range of postal codes. Required. */
  var postalCodeRanges: js.UndefOr[js.Array[PostalCodeRange]] = js.undefined
}

object PostalCodeGroup {
  @scala.inline
  def apply(country: String = null, name: String = null, postalCodeRanges: js.Array[PostalCodeRange] = null): PostalCodeGroup = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (postalCodeRanges != null) __obj.updateDynamic("postalCodeRanges")(postalCodeRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalCodeGroup]
  }
}

