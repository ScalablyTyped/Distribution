package typings.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetectedSourceLanguage extends js.Object {
  var detectedSourceLanguage: String
  var translatedText: String
}

object AnonDetectedSourceLanguage {
  @scala.inline
  def apply(detectedSourceLanguage: String, translatedText: String): AnonDetectedSourceLanguage = {
    val __obj = js.Dynamic.literal(detectedSourceLanguage = detectedSourceLanguage.asInstanceOf[js.Any], translatedText = translatedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetectedSourceLanguage]
  }
}

