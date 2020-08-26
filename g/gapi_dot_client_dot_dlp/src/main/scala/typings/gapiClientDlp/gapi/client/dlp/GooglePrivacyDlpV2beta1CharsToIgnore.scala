package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CharsToIgnore extends js.Object {
  var charactersToSkip: js.UndefOr[String] = js.native
  var commonCharactersToIgnore: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1CharsToIgnore {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CharsToIgnore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CharsToIgnore]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CharsToIgnoreOps[Self <: GooglePrivacyDlpV2beta1CharsToIgnore] (val x: Self) extends AnyVal {
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
    def setCharactersToSkip(value: String): Self = this.set("charactersToSkip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharactersToSkip: Self = this.set("charactersToSkip", js.undefined)
    @scala.inline
    def setCommonCharactersToIgnore(value: String): Self = this.set("commonCharactersToIgnore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonCharactersToIgnore: Self = this.set("commonCharactersToIgnore", js.undefined)
  }
  
}

