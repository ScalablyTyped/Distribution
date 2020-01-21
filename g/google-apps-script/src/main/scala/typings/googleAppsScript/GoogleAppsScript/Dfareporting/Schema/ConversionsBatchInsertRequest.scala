package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsBatchInsertRequest extends js.Object {
  var conversions: js.UndefOr[js.Array[Conversion]] = js.undefined
  var encryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
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

