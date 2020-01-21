package typings.googleTranslateApi.mod

import typings.googleTranslateApi.AnonLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateResult extends js.Object {
  var from: AnonLanguage
  var raw: String
  var text: String
}

object TranslateResult {
  @scala.inline
  def apply(from: AnonLanguage, raw: String, text: String): TranslateResult = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TranslateResult]
  }
}

