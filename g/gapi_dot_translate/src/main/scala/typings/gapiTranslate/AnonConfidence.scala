package typings.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfidence extends js.Object {
  var confidence: Double
  var language: String
}

object AnonConfidence {
  @scala.inline
  def apply(confidence: Double, language: String): AnonConfidence = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfidence]
  }
}

