package typings.googleTranslateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguage extends js.Object {
  var language: AnonDidYouMean
  var text: AnonAutoCorrected
}

object AnonLanguage {
  @scala.inline
  def apply(language: AnonDidYouMean, text: AnonAutoCorrected): AnonLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguage]
  }
}

