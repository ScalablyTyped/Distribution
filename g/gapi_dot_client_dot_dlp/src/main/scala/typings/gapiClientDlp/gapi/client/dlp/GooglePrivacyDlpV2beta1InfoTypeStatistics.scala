package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InfoTypeStatistics extends js.Object {
  /** Number of findings for this info type. */
  var count: js.UndefOr[String] = js.native
  /** The type of finding this stat is for. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.native
}

object GooglePrivacyDlpV2beta1InfoTypeStatistics {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InfoTypeStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoTypeStatistics]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InfoTypeStatisticsOps[Self <: GooglePrivacyDlpV2beta1InfoTypeStatistics] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2beta1InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
  }
  
}

