package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of a finding within a document.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DocumentLocation extends js.Object {
  /**
    * Offset of the line, from the beginning of the file, where the finding is
    * located.
    */
  var fileOffset: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2DocumentLocation {
  @scala.inline
  def apply(fileOffset: String = null): Schema$GooglePrivacyDlpV2DocumentLocation = {
    val __obj = js.Dynamic.literal()
    if (fileOffset != null) __obj.updateDynamic("fileOffset")(fileOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DocumentLocation]
  }
}

