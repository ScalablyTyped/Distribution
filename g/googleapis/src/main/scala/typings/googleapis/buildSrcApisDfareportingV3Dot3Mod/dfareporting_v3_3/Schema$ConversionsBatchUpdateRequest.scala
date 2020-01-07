package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update Conversions Request.
  */
@js.native
trait Schema$ConversionsBatchUpdateRequest extends js.Object {
  /**
    * The set of conversions to update.
    */
  var conversions: js.UndefOr[js.Array[Schema$Conversion]] = js.native
  /**
    * Describes how encryptedUserId is encrypted. This is a required field if
    * encryptedUserId is used.
    */
  var encryptionInfo: js.UndefOr[Schema$EncryptionInfo] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchUpdateRequest&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ConversionsBatchUpdateRequest {
  @scala.inline
  def apply(
    conversions: js.Array[Schema$Conversion] = null,
    encryptionInfo: Schema$EncryptionInfo = null,
    kind: String = null
  ): Schema$ConversionsBatchUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (conversions != null) __obj.updateDynamic("conversions")(conversions.asInstanceOf[js.Any])
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConversionsBatchUpdateRequest]
  }
}

