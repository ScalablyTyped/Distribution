package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CloudStorageOptions extends js.Object {
  var fileSet: js.UndefOr[GooglePrivacyDlpV2beta1FileSet] = js.native
}

object GooglePrivacyDlpV2beta1CloudStorageOptions {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CloudStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CloudStorageOptions]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CloudStorageOptionsOps[Self <: GooglePrivacyDlpV2beta1CloudStorageOptions] (val x: Self) extends AnyVal {
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
    def setFileSet(value: GooglePrivacyDlpV2beta1FileSet): Self = this.set("fileSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSet: Self = this.set("fileSet", js.undefined)
  }
  
}

