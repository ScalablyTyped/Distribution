package typings.googleDashTranslateDashApi.googleDashTranslateDashApiMod

import typings.googleDashTranslateDashApi.Anon_Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateResult extends js.Object {
  var from: Anon_Language
  var raw: String
  var text: String
}

object TranslateResult {
  @scala.inline
  def apply(from: Anon_Language, raw: String, text: String): TranslateResult = {
    val __obj = js.Dynamic.literal(from = from, raw = raw, text = text)
  
    __obj.asInstanceOf[TranslateResult]
  }
}

