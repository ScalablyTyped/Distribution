package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1TableLocation extends js.Object {
  /** The zero-based index of the row where the finding is located. */
  var rowIndex: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1TableLocation {
  @scala.inline
  def apply(rowIndex: java.lang.String = null): GooglePrivacyDlpV2beta1TableLocation = {
    val __obj = js.Dynamic.literal()
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1TableLocation]
  }
}

