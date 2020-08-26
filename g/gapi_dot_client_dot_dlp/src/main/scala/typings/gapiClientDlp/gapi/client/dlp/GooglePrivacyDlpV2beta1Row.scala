package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Row extends js.Object {
  var values: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.native
}

object GooglePrivacyDlpV2beta1Row {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Row]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1RowOps[Self <: GooglePrivacyDlpV2beta1Row] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: GooglePrivacyDlpV2beta1Value*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[GooglePrivacyDlpV2beta1Value]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

