package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Table extends js.Object {
  var headers: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.undefined
  var rows: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Row]] = js.undefined
}

object GooglePrivacyDlpV2beta1Table {
  @scala.inline
  def apply(
    headers: js.Array[GooglePrivacyDlpV2beta1FieldId] = null,
    rows: js.Array[GooglePrivacyDlpV2beta1Row] = null
  ): GooglePrivacyDlpV2beta1Table = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Table]
  }
}

