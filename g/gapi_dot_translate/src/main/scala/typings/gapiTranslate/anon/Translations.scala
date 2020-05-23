package typings.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translations extends js.Object {
  var translations: js.Array[DetectedSourceLanguage]
}

object Translations {
  @scala.inline
  def apply(translations: js.Array[DetectedSourceLanguage]): Translations = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translations]
  }
}

