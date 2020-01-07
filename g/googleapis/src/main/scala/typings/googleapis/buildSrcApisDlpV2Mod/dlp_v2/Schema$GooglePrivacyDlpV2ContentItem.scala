package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container structure for the content to inspect.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ContentItem extends js.Object {
  /**
    * Content data to inspect or redact. Replaces `type` and `data`.
    */
  var byteItem: js.UndefOr[Schema$GooglePrivacyDlpV2ByteContentItem] = js.native
  /**
    * Structured content for inspection. See
    * https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to
    * learn more.
    */
  var table: js.UndefOr[Schema$GooglePrivacyDlpV2Table] = js.native
  /**
    * String data to inspect or redact.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2ContentItem {
  @scala.inline
  def apply(
    byteItem: Schema$GooglePrivacyDlpV2ByteContentItem = null,
    table: Schema$GooglePrivacyDlpV2Table = null,
    value: String = null
  ): Schema$GooglePrivacyDlpV2ContentItem = {
    val __obj = js.Dynamic.literal()
    if (byteItem != null) __obj.updateDynamic("byteItem")(byteItem.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ContentItem]
  }
}

