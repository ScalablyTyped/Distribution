package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodeRange extends js.Object {
  var postalCodeRangeBegin: js.UndefOr[String] = js.undefined
  var postalCodeRangeEnd: js.UndefOr[String] = js.undefined
}

object PostalCodeRange {
  @scala.inline
  def apply(postalCodeRangeBegin: String = null, postalCodeRangeEnd: String = null): PostalCodeRange = {
    val __obj = js.Dynamic.literal()
    if (postalCodeRangeBegin != null) __obj.updateDynamic("postalCodeRangeBegin")(postalCodeRangeBegin)
    if (postalCodeRangeEnd != null) __obj.updateDynamic("postalCodeRangeEnd")(postalCodeRangeEnd)
    __obj.asInstanceOf[PostalCodeRange]
  }
}

