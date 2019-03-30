package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.undefined
}

object PostalCodesListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, postalCodes: js.Array[PostalCode] = null): PostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (postalCodes != null) __obj.updateDynamic("postalCodes")(postalCodes)
    __obj.asInstanceOf[PostalCodesListResponse]
  }
}

