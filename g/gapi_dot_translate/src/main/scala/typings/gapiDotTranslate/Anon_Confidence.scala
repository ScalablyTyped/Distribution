package typings.gapiDotTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Confidence extends js.Object {
  var confidence: Double
  var language: String
}

object Anon_Confidence {
  @scala.inline
  def apply(confidence: Double, language: String): Anon_Confidence = {
    val __obj = js.Dynamic.literal(confidence = confidence, language = language)
  
    __obj.asInstanceOf[Anon_Confidence]
  }
}

