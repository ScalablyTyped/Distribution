package typings.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguages extends js.Object {
  var languages: js.Array[AnonLanguage]
}

object AnonLanguages {
  @scala.inline
  def apply(languages: js.Array[AnonLanguage]): AnonLanguages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguages]
  }
}

