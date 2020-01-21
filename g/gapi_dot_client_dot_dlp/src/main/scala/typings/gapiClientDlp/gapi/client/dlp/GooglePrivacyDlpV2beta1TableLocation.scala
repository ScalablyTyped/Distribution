package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1TableLocation extends js.Object {
  /** The zero-based index of the row where the finding is located. */
  var rowIndex: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1TableLocation {
  @scala.inline
  def apply(rowIndex: String = null): GooglePrivacyDlpV2beta1TableLocation = {
    val __obj = js.Dynamic.literal()
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1TableLocation]
  }
}

