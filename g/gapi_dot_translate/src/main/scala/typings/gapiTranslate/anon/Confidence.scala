package typings.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Confidence extends js.Object {
  var confidence: Double
  var language: String
}

object Confidence {
  @scala.inline
  def apply(confidence: Double, language: String): Confidence = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confidence]
  }
}

