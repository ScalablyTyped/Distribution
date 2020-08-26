package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1FileSet extends js.Object {
  /**
    * The url, in the format `gs://<bucket>/<path>`. Trailing wildcard in the
    * path is allowed.
    */
  var url: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1FileSet {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1FileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1FileSet]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1FileSetOps[Self <: GooglePrivacyDlpV2beta1FileSet] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

