package typings.gapiDotTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetectedSourceLanguage extends js.Object {
  var detectedSourceLanguage: String
  var translatedText: String
}

object Anon_DetectedSourceLanguage {
  @scala.inline
  def apply(detectedSourceLanguage: String, translatedText: String): Anon_DetectedSourceLanguage = {
    val __obj = js.Dynamic.literal(detectedSourceLanguage = detectedSourceLanguage, translatedText = translatedText)
  
    __obj.asInstanceOf[Anon_DetectedSourceLanguage]
  }
}

