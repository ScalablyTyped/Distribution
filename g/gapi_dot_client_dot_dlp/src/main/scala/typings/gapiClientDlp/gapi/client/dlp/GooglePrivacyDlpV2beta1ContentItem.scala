package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1ContentItem extends js.Object {
  /** Content data to inspect or redact. */
  var data: js.UndefOr[String] = js.native
  /** Structured content for inspection. */
  var table: js.UndefOr[GooglePrivacyDlpV2beta1Table] = js.native
  /**
    * Type of the content, as defined in Content-Type HTTP header.
    * Supported types are: all "text" types, octet streams, PNG images,
    * JPEG images.
    */
  var `type`: js.UndefOr[String] = js.native
  /** String data to inspect or redact. */
  var value: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1ContentItem {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1ContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ContentItem]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ContentItemOps[Self <: GooglePrivacyDlpV2beta1ContentItem] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setTable(value: GooglePrivacyDlpV2beta1Table): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

