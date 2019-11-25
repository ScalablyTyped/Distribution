package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ContentItem extends js.Object {
  /** Content data to inspect or redact. */
  var data: js.UndefOr[String] = js.undefined
  /** Structured content for inspection. */
  var table: js.UndefOr[GooglePrivacyDlpV2beta1Table] = js.undefined
  /**
    * Type of the content, as defined in Content-Type HTTP header.
    * Supported types are: all "text" types, octet streams, PNG images,
    * JPEG images.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** String data to inspect or redact. */
  var value: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1ContentItem {
  @scala.inline
  def apply(
    data: String = null,
    table: GooglePrivacyDlpV2beta1Table = null,
    `type`: String = null,
    value: String = null
  ): GooglePrivacyDlpV2beta1ContentItem = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ContentItem]
  }
}

