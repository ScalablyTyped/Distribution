package typings.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguage extends js.Object {
  var language: String
  var name: String
}

object AnonLanguage {
  @scala.inline
  def apply(language: String, name: String): AnonLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguage]
  }
}

