package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Table extends js.Object {
  var headers: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.native
  var rows: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Row]] = js.native
}

object GooglePrivacyDlpV2beta1Table {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Table]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1TableOps[Self <: GooglePrivacyDlpV2beta1Table] (val x: Self) extends AnyVal {
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
    def setHeadersVarargs(value: GooglePrivacyDlpV2beta1FieldId*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[GooglePrivacyDlpV2beta1FieldId]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setRowsVarargs(value: GooglePrivacyDlpV2beta1Row*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[GooglePrivacyDlpV2beta1Row]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

