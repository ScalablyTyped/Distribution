package typings.googleDashTranslateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language extends js.Object {
  var language: Anon_DidYouMean
  var text: Anon_AutoCorrected
}

object Anon_Language {
  @scala.inline
  def apply(language: Anon_DidYouMean, text: Anon_AutoCorrected): Anon_Language = {
    val __obj = js.Dynamic.literal(language = language, text = text)
  
    __obj.asInstanceOf[Anon_Language]
  }
}

