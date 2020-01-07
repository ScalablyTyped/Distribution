package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of a finding within a table.
  */
@js.native
trait Schema$GooglePrivacyDlpV2TableLocation extends js.Object {
  /**
    * The zero-based index of the row where the finding is located.
    */
  var rowIndex: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2TableLocation {
  @scala.inline
  def apply(rowIndex: String = null): Schema$GooglePrivacyDlpV2TableLocation = {
    val __obj = js.Dynamic.literal()
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2TableLocation]
  }
}

