package typings.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Languages extends js.Object {
  var languages: js.Array[Language] = js.native
}

object Languages {
  @scala.inline
  def apply(languages: js.Array[Language]): Languages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Languages]
  }
  @scala.inline
  implicit class LanguagesOps[Self <: Languages] (val x: Self) extends AnyVal {
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
    def setLanguagesVarargs(value: Language*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[Language]): Self = this.set("languages", value.asInstanceOf[js.Any])
  }
  
}

