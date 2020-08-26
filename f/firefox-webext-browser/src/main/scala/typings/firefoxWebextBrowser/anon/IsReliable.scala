package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsReliable extends js.Object {
  /** CLD detected language reliability */
  var isReliable: Boolean = js.native
  /** array of detectedLanguage */
  var languages: js.Array[Language] = js.native
}

object IsReliable {
  @scala.inline
  def apply(isReliable: Boolean, languages: js.Array[Language]): IsReliable = {
    val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReliable]
  }
  @scala.inline
  implicit class IsReliableOps[Self <: IsReliable] (val x: Self) extends AnyVal {
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
    def setIsReliable(value: Boolean): Self = this.set("isReliable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguagesVarargs(value: Language*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[Language]): Self = this.set("languages", value.asInstanceOf[js.Any])
  }
  
}

