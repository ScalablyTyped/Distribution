package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Postal Code List Response
  */
@js.native
trait Schema$PostalCodesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#postalCodesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Postal code collection.
    */
  var postalCodes: js.UndefOr[js.Array[Schema$PostalCode]] = js.native
}

object Schema$PostalCodesListResponse {
  @scala.inline
  def apply(kind: String = null, postalCodes: js.Array[Schema$PostalCode] = null): Schema$PostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (postalCodes != null) __obj.updateDynamic("postalCodes")(postalCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PostalCodesListResponse]
  }
}

