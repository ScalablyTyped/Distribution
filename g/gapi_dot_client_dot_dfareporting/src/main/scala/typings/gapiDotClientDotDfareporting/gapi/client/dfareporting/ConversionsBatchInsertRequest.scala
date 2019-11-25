package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsBatchInsertRequest extends js.Object {
  /** The set of conversions to insert. */
  var conversions: js.UndefOr[js.Array[Conversion]] = js.undefined
  /**
    * Describes how encryptedUserId or encryptedUserIdCandidates[] is encrypted. This is a required field if encryptedUserId or encryptedUserIdCandidates[]
    * is used.
    */
  var encryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchInsertRequest". */
  var kind: js.UndefOr[String] = js.undefined
}

object ConversionsBatchInsertRequest {
  @scala.inline
  def apply(
    conversions: js.Array[Conversion] = null,
    encryptionInfo: EncryptionInfo = null,
    kind: String = null
  ): ConversionsBatchInsertRequest = {
    val __obj = js.Dynamic.literal()
    if (conversions != null) __obj.updateDynamic("conversions")(conversions.asInstanceOf[js.Any])
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionsBatchInsertRequest]
  }
}

