package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ReplaceValueConfig extends js.Object {
  /** Value to replace it with. */
  var newValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
}

object GooglePrivacyDlpV2beta1ReplaceValueConfig {
  @scala.inline
  def apply(newValue: GooglePrivacyDlpV2beta1Value = null): GooglePrivacyDlpV2beta1ReplaceValueConfig = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ReplaceValueConfig]
  }
}

