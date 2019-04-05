package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsBatchUpdateRequest extends js.Object {
  var conversions: js.UndefOr[js.Array[Conversion]] = js.undefined
  var encryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ConversionsBatchUpdateRequest {
  @scala.inline
  def apply(
    conversions: js.Array[Conversion] = null,
    encryptionInfo: EncryptionInfo = null,
    kind: java.lang.String = null
  ): ConversionsBatchUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (conversions != null) __obj.updateDynamic("conversions")(conversions)
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ConversionsBatchUpdateRequest]
  }
}

