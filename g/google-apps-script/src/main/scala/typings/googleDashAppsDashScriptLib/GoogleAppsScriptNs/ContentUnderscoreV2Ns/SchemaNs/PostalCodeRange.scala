package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodeRange extends js.Object {
  var postalCodeRangeBegin: js.UndefOr[java.lang.String] = js.undefined
  var postalCodeRangeEnd: js.UndefOr[java.lang.String] = js.undefined
}

object PostalCodeRange {
  @scala.inline
  def apply(postalCodeRangeBegin: java.lang.String = null, postalCodeRangeEnd: java.lang.String = null): PostalCodeRange = {
    val __obj = js.Dynamic.literal()
    if (postalCodeRangeBegin != null) __obj.updateDynamic("postalCodeRangeBegin")(postalCodeRangeBegin)
    if (postalCodeRangeEnd != null) __obj.updateDynamic("postalCodeRangeEnd")(postalCodeRangeEnd)
    __obj.asInstanceOf[PostalCodeRange]
  }
}

