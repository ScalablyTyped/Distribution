package typings.googleTranslateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  var language: DidYouMean
  var text: AutoCorrected
}

object Language {
  @scala.inline
  def apply(language: DidYouMean, text: AutoCorrected): Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
}

