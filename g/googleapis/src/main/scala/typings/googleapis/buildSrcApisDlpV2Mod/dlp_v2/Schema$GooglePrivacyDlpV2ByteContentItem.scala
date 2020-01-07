package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for bytes to inspect or redact.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ByteContentItem extends js.Object {
  /**
    * Content data to inspect or redact.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The type of data stored in the bytes string. Default will be TEXT_UTF8.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2ByteContentItem {
  @scala.inline
  def apply(data: String = null, `type`: String = null): Schema$GooglePrivacyDlpV2ByteContentItem = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ByteContentItem]
  }
}

