package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ListInfoTypesResponse extends js.Object {
  /** Set of sensitive info types belonging to a category. */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeDescription]] = js.undefined
}

object GooglePrivacyDlpV2beta1ListInfoTypesResponse {
  @scala.inline
  def apply(infoTypes: js.Array[GooglePrivacyDlpV2beta1InfoTypeDescription] = null): GooglePrivacyDlpV2beta1ListInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ListInfoTypesResponse]
  }
}

