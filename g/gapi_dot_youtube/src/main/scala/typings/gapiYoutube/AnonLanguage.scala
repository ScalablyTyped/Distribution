package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLanguage extends js.Object {
  /**
    * The language associated with the value.
    */
  var language: String
  /**
    * The property value for a specified language.
    */
  var value: String
}

object AnonLanguage {
  @scala.inline
  def apply(language: String, value: String): AnonLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLanguage]
  }
}

