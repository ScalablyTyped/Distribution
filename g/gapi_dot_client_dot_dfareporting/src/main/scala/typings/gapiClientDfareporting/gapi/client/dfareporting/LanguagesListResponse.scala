package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguagesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#languagesListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Language collection. */
  var languages: js.UndefOr[js.Array[Language]] = js.native
}

object LanguagesListResponse {
  @scala.inline
  def apply(): LanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguagesListResponse]
  }
  @scala.inline
  implicit class LanguagesListResponseOps[Self <: LanguagesListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLanguagesVarargs(value: Language*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[Language]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
  }
  
}

