package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Row extends js.Object {
  var values: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.undefined
}

object GooglePrivacyDlpV2beta1Row {
  @scala.inline
  def apply(values: js.Array[GooglePrivacyDlpV2beta1Value] = null): GooglePrivacyDlpV2beta1Row = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Row]
  }
}

