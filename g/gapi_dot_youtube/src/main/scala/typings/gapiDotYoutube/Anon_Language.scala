package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language extends js.Object {
  /**
    * The language associated with the value.
    */
  var language: String
  /**
    * The property value for a specified language.
    */
  var value: String
}

object Anon_Language {
  @scala.inline
  def apply(language: String, value: String): Anon_Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Language]
  }
}

