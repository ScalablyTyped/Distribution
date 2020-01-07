package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structured content to inspect. Up to 50,000 `Value`s per request allowed.
  * See https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
  * learn more.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Table extends js.Object {
  var headers: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2FieldId]] = js.native
  var rows: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Row]] = js.native
}

object Schema$GooglePrivacyDlpV2Table {
  @scala.inline
  def apply(
    headers: js.Array[Schema$GooglePrivacyDlpV2FieldId] = null,
    rows: js.Array[Schema$GooglePrivacyDlpV2Row] = null
  ): Schema$GooglePrivacyDlpV2Table = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Table]
  }
}

