package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodeGroup extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var postalCodeRanges: js.UndefOr[js.Array[PostalCodeRange]] = js.undefined
}

object PostalCodeGroup {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    name: java.lang.String = null,
    postalCodeRanges: js.Array[PostalCodeRange] = null
  ): PostalCodeGroup = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (name != null) __obj.updateDynamic("name")(name)
    if (postalCodeRanges != null) __obj.updateDynamic("postalCodeRanges")(postalCodeRanges)
    __obj.asInstanceOf[PostalCodeGroup]
  }
}

