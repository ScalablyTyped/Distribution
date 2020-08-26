package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1OperationConfig extends js.Object {
  /** Max number of findings per file, Datastore entity, or database row. */
  var maxItemFindings: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1OperationConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1OperationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1OperationConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1OperationConfigOps[Self <: GooglePrivacyDlpV2beta1OperationConfig] (val x: Self) extends AnyVal {
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
    def setMaxItemFindings(value: String): Self = this.set("maxItemFindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItemFindings: Self = this.set("maxItemFindings", js.undefined)
  }
  
}

