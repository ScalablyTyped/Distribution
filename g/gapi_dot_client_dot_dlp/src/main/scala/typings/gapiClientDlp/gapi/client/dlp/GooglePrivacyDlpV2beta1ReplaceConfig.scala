package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1ReplaceConfig extends js.Object {
  /**
    * Type of information to replace. Only one ReplaceConfig per info_type
    * should be provided. If ReplaceConfig does not have an info_type, the DLP
    * API matches it against all info_types that are found but not specified in
    * another ReplaceConfig.
    */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.native
  /** Content replacing sensitive information of given type. Max 256 chars. */
  var replaceWith: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1ReplaceConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1ReplaceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ReplaceConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ReplaceConfigOps[Self <: GooglePrivacyDlpV2beta1ReplaceConfig] (val x: Self) extends AnyVal {
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
    def setInfoType(value: GooglePrivacyDlpV2beta1InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
    @scala.inline
    def setReplaceWith(value: String): Self = this.set("replaceWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceWith: Self = this.set("replaceWith", js.undefined)
  }
  
}

