package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1ReplaceValueConfig extends js.Object {
  /** Value to replace it with. */
  var newValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
}

object GooglePrivacyDlpV2beta1ReplaceValueConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1ReplaceValueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ReplaceValueConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ReplaceValueConfigOps[Self <: GooglePrivacyDlpV2beta1ReplaceValueConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewValue(value: GooglePrivacyDlpV2beta1Value): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
  }
  
}

