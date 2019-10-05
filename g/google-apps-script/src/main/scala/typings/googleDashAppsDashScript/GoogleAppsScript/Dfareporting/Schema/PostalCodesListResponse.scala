package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.undefined
}

object PostalCodesListResponse {
  @scala.inline
  def apply(kind: String = null, postalCodes: js.Array[PostalCode] = null): PostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (postalCodes != null) __obj.updateDynamic("postalCodes")(postalCodes)
    __obj.asInstanceOf[PostalCodesListResponse]
  }
}

