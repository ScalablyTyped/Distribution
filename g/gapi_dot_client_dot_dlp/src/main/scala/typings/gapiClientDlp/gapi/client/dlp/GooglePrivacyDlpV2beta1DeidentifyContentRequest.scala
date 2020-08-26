package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1DeidentifyContentRequest extends js.Object {
  /** Configuration for the de-identification of the list of content items. */
  var deidentifyConfig: js.UndefOr[GooglePrivacyDlpV2beta1DeidentifyConfig] = js.native
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.native
  /**
    * The list of items to inspect. Up to 100 are allowed per request.
    * All items will be treated as text/&#42;.
    */
  var items: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ContentItem]] = js.native
}

object GooglePrivacyDlpV2beta1DeidentifyContentRequest {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1DeidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DeidentifyContentRequest]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1DeidentifyContentRequestOps[Self <: GooglePrivacyDlpV2beta1DeidentifyContentRequest] (val x: Self) extends AnyVal {
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
    def setDeidentifyConfig(value: GooglePrivacyDlpV2beta1DeidentifyConfig): Self = this.set("deidentifyConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeidentifyConfig: Self = this.set("deidentifyConfig", js.undefined)
    @scala.inline
    def setInspectConfig(value: GooglePrivacyDlpV2beta1InspectConfig): Self = this.set("inspectConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInspectConfig: Self = this.set("inspectConfig", js.undefined)
    @scala.inline
    def setItemsVarargs(value: GooglePrivacyDlpV2beta1ContentItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[GooglePrivacyDlpV2beta1ContentItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

