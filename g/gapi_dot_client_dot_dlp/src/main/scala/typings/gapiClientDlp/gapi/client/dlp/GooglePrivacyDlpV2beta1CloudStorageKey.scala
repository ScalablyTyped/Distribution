package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CloudStorageKey extends js.Object {
  /** Path to the file. */
  var filePath: js.UndefOr[String] = js.native
  /** Byte offset of the referenced data in the file. */
  var startOffset: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1CloudStorageKey {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CloudStorageKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CloudStorageKey]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CloudStorageKeyOps[Self <: GooglePrivacyDlpV2beta1CloudStorageKey] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    @scala.inline
    def setStartOffset(value: String): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
  }
  
}

