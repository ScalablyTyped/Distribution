package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodeGroup extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
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

