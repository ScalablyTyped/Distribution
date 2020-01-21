package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#postalCodesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Postal code collection. */
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.undefined
}

object PostalCodesListResponse {
  @scala.inline
  def apply(kind: String = null, postalCodes: js.Array[PostalCode] = null): PostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (postalCodes != null) __obj.updateDynamic("postalCodes")(postalCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalCodesListResponse]
  }
}

