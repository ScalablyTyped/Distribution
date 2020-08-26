package typings.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translations extends js.Object {
  var translations: js.Array[DetectedSourceLanguage] = js.native
}

object Translations {
  @scala.inline
  def apply(translations: js.Array[DetectedSourceLanguage]): Translations = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translations]
  }
  @scala.inline
  implicit class TranslationsOps[Self <: Translations] (val x: Self) extends AnyVal {
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
    def setTranslationsVarargs(value: DetectedSourceLanguage*): Self = this.set("translations", js.Array(value :_*))
    @scala.inline
    def setTranslations(value: js.Array[DetectedSourceLanguage]): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
  
}

