package typings.gapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslationsListResponse extends js.Object {
  /** Translations contains list of translation results of given text */
  var translations: js.UndefOr[js.Array[TranslationsResource]] = js.native
}

object TranslationsListResponse {
  @scala.inline
  def apply(): TranslationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslationsListResponse]
  }
  @scala.inline
  implicit class TranslationsListResponseOps[Self <: TranslationsListResponse] (val x: Self) extends AnyVal {
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
    def setTranslationsVarargs(value: TranslationsResource*): Self = this.set("translations", js.Array(value :_*))
    @scala.inline
    def setTranslations(value: js.Array[TranslationsResource]): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

