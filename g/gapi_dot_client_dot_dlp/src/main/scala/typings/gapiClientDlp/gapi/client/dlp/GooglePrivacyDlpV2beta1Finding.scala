package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Finding extends js.Object {
  /** Timestamp when finding was detected. */
  var createTime: js.UndefOr[String] = js.native
  /** The specific type of info the string might be. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.native
  /** Estimate of how likely it is that the info_type is correct. */
  var likelihood: js.UndefOr[String] = js.native
  /** Location of the info found. */
  var location: js.UndefOr[GooglePrivacyDlpV2beta1Location] = js.native
  /** The specific string that may be potentially sensitive info. */
  var quote: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1Finding {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Finding]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1FindingOps[Self <: GooglePrivacyDlpV2beta1Finding] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2beta1InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
    @scala.inline
    def setLikelihood(value: String): Self = this.set("likelihood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLikelihood: Self = this.set("likelihood", js.undefined)
    @scala.inline
    def setLocation(value: GooglePrivacyDlpV2beta1Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
  }
  
}

