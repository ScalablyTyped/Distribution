package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1NumericalStatsConfig extends js.Object {
  /**
    * Field to compute numerical stats on. Supported types are
    * integer, float, date, datetime, timestamp, time.
    */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
}

object GooglePrivacyDlpV2beta1NumericalStatsConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1NumericalStatsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1NumericalStatsConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1NumericalStatsConfigOps[Self <: GooglePrivacyDlpV2beta1NumericalStatsConfig] (val x: Self) extends AnyVal {
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
    def setField(value: GooglePrivacyDlpV2beta1FieldId): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
  
}

