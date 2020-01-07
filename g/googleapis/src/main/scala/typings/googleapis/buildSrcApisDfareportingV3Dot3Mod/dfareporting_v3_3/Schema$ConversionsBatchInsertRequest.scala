package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insert Conversions Request.
  */
@js.native
trait Schema$ConversionsBatchInsertRequest extends js.Object {
  /**
    * The set of conversions to insert.
    */
  var conversions: js.UndefOr[js.Array[Schema$Conversion]] = js.native
  /**
    * Describes how encryptedUserId or encryptedUserIdCandidates[] is
    * encrypted. This is a required field if encryptedUserId or
    * encryptedUserIdCandidates[] is used.
    */
  var encryptionInfo: js.UndefOr[Schema$EncryptionInfo] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchInsertRequest&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ConversionsBatchInsertRequest {
  @scala.inline
  def apply(
    conversions: js.Array[Schema$Conversion] = null,
    encryptionInfo: Schema$EncryptionInfo = null,
    kind: String = null
  ): Schema$ConversionsBatchInsertRequest = {
    val __obj = js.Dynamic.literal()
    if (conversions != null) __obj.updateDynamic("conversions")(conversions.asInstanceOf[js.Any])
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConversionsBatchInsertRequest]
  }
}

