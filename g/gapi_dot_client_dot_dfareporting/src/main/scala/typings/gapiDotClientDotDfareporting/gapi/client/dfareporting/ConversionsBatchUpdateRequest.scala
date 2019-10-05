package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsBatchUpdateRequest extends js.Object {
  /** The set of conversions to update. */
  var conversions: js.UndefOr[js.Array[Conversion]] = js.undefined
  /** Describes how encryptedUserId is encrypted. This is a required field if encryptedUserId is used. */
  var encryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchUpdateRequest". */
  var kind: js.UndefOr[String] = js.undefined
}

object ConversionsBatchUpdateRequest {
  @scala.inline
  def apply(
    conversions: js.Array[Conversion] = null,
    encryptionInfo: EncryptionInfo = null,
    kind: String = null
  ): ConversionsBatchUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (conversions != null) __obj.updateDynamic("conversions")(conversions)
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ConversionsBatchUpdateRequest]
  }
}

